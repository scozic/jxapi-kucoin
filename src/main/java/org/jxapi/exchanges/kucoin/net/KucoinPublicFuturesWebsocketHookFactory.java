package org.jxapi.exchanges.kucoin.net;

import java.util.concurrent.ExecutionException;

import org.jxapi.exchange.Exchange;
import org.jxapi.exchanges.kucoin.gen.KucoinExchange;
import org.jxapi.exchanges.kucoin.gen.futuresmarketdata.KucoinFuturesMarketDataApi;
import org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataApplyConnectTokenPublicResponse;
import org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataApplyConnectTokenPublicResponseData;
import org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataApplyConnectTokenPublicResponseDataInstanceServers;
import org.jxapi.netutils.rest.RestResponse;
import org.jxapi.netutils.websocket.WebsocketException;
import org.jxapi.netutils.websocket.WebsocketHook;
import org.jxapi.netutils.websocket.WebsocketHookFactory;
import org.jxapi.util.CollectionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KucoinPublicFuturesWebsocketHookFactory implements WebsocketHookFactory {
	
	private static final Logger log = LoggerFactory.getLogger(KucoinPublicFuturesWebsocketHookFactory.class);

	@Override
	public WebsocketHook createWebsocketHook(Exchange exchange) {
		return new KucoinWebsocketHook(() -> requestToken(((KucoinExchange) exchange).getFuturesMarketDataApi()), false);
	}
	
	private KucoinWebsocketTokenInfo requestToken(KucoinFuturesMarketDataApi api) throws WebsocketException {
		RestResponse<KucoinFuturesMarketDataApplyConnectTokenPublicResponse> restResponse;
		try {
			restResponse = api.applyConnectTokenPublic().get();
		} catch (InterruptedException | ExecutionException e) {
			throw new WebsocketException("Interrupted while fetching connect token", e);
		}
		if (!restResponse.isOk()) {
			throw new WebsocketException("Error while fetching token, got response:" + restResponse, restResponse.getException());
		}
		KucoinFuturesMarketDataApplyConnectTokenPublicResponse response = restResponse.getResponse();
		if (log.isDebugEnabled())
			log.debug("POST ApplyConnectTokenPublic < " + restResponse);
		KucoinWebsocketTokenInfo info = new KucoinWebsocketTokenInfo();
		KucoinFuturesMarketDataApplyConnectTokenPublicResponseData data = response.getData();
		info.setToken(data.getToken());
		if (CollectionUtil.isEmpty(data.getInstanceServers()))
			throw new WebsocketException("Error in ApplyConnectTokenPublic response:0 instance servers provided:" + response);
		KucoinFuturesMarketDataApplyConnectTokenPublicResponseDataInstanceServers serverInstance = data.getInstanceServers().get(0);
		info.setEndpoint(serverInstance.getEndpoint());
		info.setPingInterval(serverInstance.getPingInterval());
		info.setPingTimeout(serverInstance.getPingTimeout());
		return info;
	}

}

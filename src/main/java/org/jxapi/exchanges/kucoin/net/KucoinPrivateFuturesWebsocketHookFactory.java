package org.jxapi.exchanges.kucoin.net;

import java.util.concurrent.ExecutionException;

import org.jxapi.exchange.Exchange;
import org.jxapi.exchanges.kucoin.gen.KucoinExchange;
import org.jxapi.exchanges.kucoin.gen.futurestrading.KucoinFuturesTradingApi;
import org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingApplyConnectTokenPrivateResponse;
import org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingApplyConnectTokenPrivateResponseData;
import org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingApplyConnectTokenPrivateResponseDataInstanceServers;
import org.jxapi.netutils.rest.RestResponse;
import org.jxapi.netutils.websocket.WebsocketException;
import org.jxapi.netutils.websocket.WebsocketHook;
import org.jxapi.netutils.websocket.WebsocketHookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KucoinPrivateFuturesWebsocketHookFactory implements WebsocketHookFactory {
	
	private static final Logger log = LoggerFactory.getLogger(KucoinPrivateFuturesWebsocketHookFactory.class);

	@Override
	public WebsocketHook createWebsocketHook(Exchange exchange) {
		return new KucoinWebsocketHook(() -> requestToken(((KucoinExchange) exchange).getFuturesTradingApi()), true);
	}
	
	private KucoinWebsocketTokenInfo requestToken(KucoinFuturesTradingApi api) throws WebsocketException {
		RestResponse<KucoinFuturesTradingApplyConnectTokenPrivateResponse> restResponse;
		try {
			restResponse = api.applyConnectTokenPrivate().get();
		} catch (InterruptedException | ExecutionException e) {
			throw new WebsocketException("Interrupted while fetching connect token", e);
		}
		if (!restResponse.isOk()) {
			throw new WebsocketException("Error while fetching token, got response:" + restResponse, restResponse.getException());
		}
		KucoinFuturesTradingApplyConnectTokenPrivateResponse response = restResponse.getResponse();
		if (log.isDebugEnabled())
			log.debug("POST ApplyConnectTokenPublic < " + restResponse);
		KucoinWebsocketTokenInfo info = new KucoinWebsocketTokenInfo();
		KucoinFuturesTradingApplyConnectTokenPrivateResponseData data = response.getData();
		info.setToken(data.getToken());
		if (data.getInstanceServers().size() <= 0)
			throw new WebsocketException("Error in ApplyConnectTokenPublic response:0 instance servers provided:" + response);
		KucoinFuturesTradingApplyConnectTokenPrivateResponseDataInstanceServers serverInstance = data.getInstanceServers().get(0);
		info.setEndpoint(serverInstance.getEndpoint());
		info.setPingInterval(serverInstance.getPingInterval());
		info.setPingTimeout(serverInstance.getPingTimeout());
		return info;
	}

}

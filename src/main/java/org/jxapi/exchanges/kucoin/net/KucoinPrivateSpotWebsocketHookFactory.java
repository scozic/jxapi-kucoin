package org.jxapi.exchanges.kucoin.net;

import java.util.concurrent.ExecutionException;

import org.jxapi.exchange.Exchange;
import org.jxapi.exchanges.kucoin.gen.KucoinExchange;
import org.jxapi.exchanges.kucoin.gen.spottrading.KucoinSpotTradingApi;
import org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingGetPrivateTokenSpotMarginResponse;
import org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingGetPrivateTokenSpotMarginResponseData;
import org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingGetPrivateTokenSpotMarginResponseDataInstanceServers;
import org.jxapi.netutils.rest.RestResponse;
import org.jxapi.netutils.websocket.WebsocketException;
import org.jxapi.netutils.websocket.WebsocketHook;
import org.jxapi.netutils.websocket.WebsocketHookFactory;
import org.jxapi.util.CollectionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KucoinPrivateSpotWebsocketHookFactory implements WebsocketHookFactory {
	
	private static final Logger log = LoggerFactory.getLogger(KucoinPrivateSpotWebsocketHookFactory.class);

	@Override
	public WebsocketHook createWebsocketHook(Exchange exchange) {
		return new KucoinWebsocketHook(() -> requestToken(((KucoinExchange) exchange).getSpotTradingApi()), true);
	}
	
	private KucoinWebsocketTokenInfo requestToken(KucoinSpotTradingApi api) throws WebsocketException {
		RestResponse<KucoinSpotTradingGetPrivateTokenSpotMarginResponse> restResponse;
		try {
			restResponse = api.getPrivateTokenSpotMargin().get();
		} catch (InterruptedException | ExecutionException e) {
			throw new WebsocketException("Interrupted while fetching connect token", e);
		}
		if (!restResponse.isOk()) {
			throw new WebsocketException("Error while fetching token, got response:" + restResponse, restResponse.getException());
		}
		KucoinSpotTradingGetPrivateTokenSpotMarginResponse response = restResponse.getResponse();
		log.debug("POST ApplyConnectTokenPublic < {}", restResponse);
		KucoinWebsocketTokenInfo info = new KucoinWebsocketTokenInfo();
		KucoinSpotTradingGetPrivateTokenSpotMarginResponseData data = response.getData();
		info.setToken(data.getToken());
		if (CollectionUtil.isEmpty(data.getInstanceServers())) {
			throw new WebsocketException("Error in ApplyConnectTokenPublic response:0 instance servers provided:" + response);
		}
		KucoinSpotTradingGetPrivateTokenSpotMarginResponseDataInstanceServers serverInstance = data.getInstanceServers().get(0);
		info.setEndpoint(serverInstance.getEndpoint());
		info.setPingInterval(serverInstance.getPingInterval());
		info.setPingTimeout(serverInstance.getPingTimeout());
		return info;
	}

}

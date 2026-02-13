package org.jxapi.exchanges.kucoin.net;

import org.apache.commons.lang3.RandomUtils;
import org.jxapi.netutils.websocket.WebsocketException;
import org.jxapi.netutils.websocket.WebsocketHook;
import org.jxapi.netutils.websocket.WebsocketClient;
import org.jxapi.netutils.websocket.multiplexing.WSMTMFUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KucoinWebsocketHook implements WebsocketHook {
	
	private static final Logger log = LoggerFactory.getLogger(KucoinWebsocketHook.class);
	
	private static final long RECONNECT_DELAY = 2000L;
	private static final String HEARTBEAT_REQUEST_TEMPLATE = "{\"id\":\"%d\", \"type\":\"ping\"}";
	private static final String SUBSCRIBE_REQUEST_TEMPLATE = "{\"id\": %d, \"type\": \"subscribe\", \"topic\": \"%s\", \"privateChannel\": %s, \"response\": false}";
	private static final String UNSUBSCRIBE_REQUEST_TEMPLATE = "{\"id\": %d, \"type\": \"unsubscribe\", \"topic\": \"%s\", \"privateChannel\": false, \"response\": false}";
	
	private static final int genRandIntSeed() {
		return Math.abs(RandomUtils.nextInt()) % 10000;
	}
	
	private int requestIdCounter = genRandIntSeed();
	private final KucoinWebsocketListenKeyApi listenKeyApi;
	private final String privateChannel;
	private int connectionIdCounter = genRandIntSeed();
	private int connectionId = 1;
	private WebsocketClient websocketClient;
	
	public KucoinWebsocketHook(KucoinWebsocketListenKeyApi listenKeyApi, boolean privateChannel) {
		this.listenKeyApi = listenKeyApi;
		this.privateChannel = "" + privateChannel;
	}
	
	@Override
	public void init(WebsocketClient websocketClient) {
		this.websocketClient = websocketClient;
		websocketClient.addSystemMessageHandler("ping", WSMTMFUtil.value("type", "pong"), m -> handlePongMessage(websocketClient, m));
		websocketClient.addSystemMessageHandler("error", WSMTMFUtil.value("type", "error"), m -> handleErrorMessage(websocketClient, m));
		websocketClient.setReconnectDelay(RECONNECT_DELAY);
	}

	@Override
	public void beforeConnect() throws WebsocketException {
		KucoinWebsocketTokenInfo tokenInfo = listenKeyApi.requestToken();
		this.connectionId = generateConnectionId();
		websocketClient.setHeartBeatInterval(tokenInfo.getPingInterval());
		websocketClient.setNoHeartBeatResponseTimeout(tokenInfo.getPingTimeout());
		websocketClient.setUrl(tokenInfo.getEndpoint() + String.format("?token=%s&connectId=%d", tokenInfo.getToken(), this.connectionId));
	}

	private void handleErrorMessage(WebsocketClient websocketClient, String m) {
		String errMsg = "Received error message on websocket " + websocketClient.getUrl();
		log.error(errMsg);
		websocketClient.notifyError(new WebsocketException(errMsg));
		
	}

	@Override
	public String getHeartBeatMessage() {
		return String.format(HEARTBEAT_REQUEST_TEMPLATE, generateRequestId());
	}

	@Override
	public String getSubscribeRequestMessage(String topic) {
		return String.format(SUBSCRIBE_REQUEST_TEMPLATE, generateRequestId(), topic, privateChannel) ;
	}

	@Override
	public String getUnSubscribeRequestMessage(String topic) {
		return String.format(UNSUBSCRIBE_REQUEST_TEMPLATE, generateRequestId(), topic);
	}
	
	private int generateRequestId() {
		return Math.abs(requestIdCounter++);
	}
	
	private int generateConnectionId() {
		return Math.abs(connectionIdCounter++);
	}
	
	private void handlePongMessage(WebsocketClient websocketClient, String m) {
		log.debug("Received 'pong' message:{}", m);
		websocketClient.hearbeatReceived();
	}



}

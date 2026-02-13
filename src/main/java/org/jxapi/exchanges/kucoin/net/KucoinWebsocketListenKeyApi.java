package org.jxapi.exchanges.kucoin.net;

import org.jxapi.netutils.websocket.WebsocketException;

/**
 * Interface for API to retrieve token for applying websocket connection. See <a href="https://docs.kucoin.com/#apply-connect-token">Kucoin API</a>.
 */
public interface KucoinWebsocketListenKeyApi {

	KucoinWebsocketTokenInfo requestToken() throws WebsocketException;
}

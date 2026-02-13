package org.jxapi.exchanges.kucoin.net;

import org.jxapi.exchanges.kucoin.gen.KucoinProperties;

public class KucoinFuturesPrivateHttpRequestInterceptorFactory extends AbstractKucoinPrivateHttpRequestInterceptorFactory {
	
	public KucoinFuturesPrivateHttpRequestInterceptorFactory() {
		super(KucoinProperties.FUTURES_API_KEY.getName(), 
			  KucoinProperties.FUTURES_API_SECRET.getName(), 
			  KucoinProperties.FUTURES_API_PASSPHRASE.getName());
	}

}

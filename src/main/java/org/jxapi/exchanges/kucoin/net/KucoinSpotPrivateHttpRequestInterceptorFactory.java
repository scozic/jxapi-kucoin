package org.jxapi.exchanges.kucoin.net;

import org.jxapi.exchanges.kucoin.gen.KucoinProperties;

public class KucoinSpotPrivateHttpRequestInterceptorFactory extends AbstractKucoinPrivateHttpRequestInterceptorFactory {

	public static final String API_KEY_PROPERTY = "apiKey";
	public static final String API_SECRET_PROPERTY = "apiSecret";
	public static final String API_PASSPHRASE_PROPERTY = "apiPassphrase";
	
	public KucoinSpotPrivateHttpRequestInterceptorFactory() {
		super(KucoinProperties.API_KEY.getName(), 
		      KucoinProperties.API_SECRET.getName(), 
			  KucoinProperties.API_PASSPHRASE.getName());
	}
}

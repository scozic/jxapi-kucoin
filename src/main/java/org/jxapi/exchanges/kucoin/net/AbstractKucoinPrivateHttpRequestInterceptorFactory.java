package org.jxapi.exchanges.kucoin.net;

import java.util.Properties;

import org.jxapi.exchange.Exchange;
import org.jxapi.netutils.rest.HttpRequestInterceptor;
import org.jxapi.netutils.rest.HttpRequestInterceptorFactory;

public class AbstractKucoinPrivateHttpRequestInterceptorFactory implements HttpRequestInterceptorFactory {
	
	protected final String apiKeyProperty;
	protected final String apiSecretProperty;
	protected final String apiPassphraseProperty;
	
	public AbstractKucoinPrivateHttpRequestInterceptorFactory(String apiKeyProperty, String apiSecretProperty, String apiPassphraseProperty) {
		this.apiKeyProperty = apiKeyProperty;
		this.apiSecretProperty = apiSecretProperty;
		this.apiPassphraseProperty = apiPassphraseProperty;
	}

	@Override
	public HttpRequestInterceptor createInterceptor(Exchange exchangeApi) {
		Properties properties = exchangeApi.getProperties();
		String apiKey = properties.getProperty(apiKeyProperty);
		String apiSecret =properties.getProperty(apiSecretProperty);
		String apiPassphrase = properties.getProperty(apiPassphraseProperty);
		return new KucoinPrivateHttpRequestInterceptor(apiKey, apiPassphrase, apiSecret);
	}

}

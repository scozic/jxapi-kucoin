package org.jxapi.exchanges.kucoin.net;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

import org.jxapi.netutils.rest.HttpRequest;
import org.jxapi.netutils.rest.HttpRequestInterceptor;

public class KucoinPrivateHttpRequestInterceptor implements HttpRequestInterceptor {
	
	private final String apiKey;
	private final String apiPassphrase;
	private final HmacUtils hmacUtils;

	public KucoinPrivateHttpRequestInterceptor(String apiKey, String apiPassphrase, String apiSecret) {
		this.apiKey = apiKey;
		this.apiPassphrase = apiPassphrase;
		this.hmacUtils = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, apiSecret);
	}
	
	@Override
	public void intercept(HttpRequest request) {
		request.setHeader(apiPassphrase, apiKey);
		
		if (apiKey == null) {
			throw new IllegalStateException("Missing apiKey");
		}
		request.setHeader("KC-API-KEY", apiKey);
		long timestamp = System.currentTimeMillis();
		String timestampStr = "" + timestamp;
		request.setHeader("KC-API-TIMESTAMP", timestampStr);
		// Remark: ugly, but needed to workaround a bug in Kucoin API that does not accept %2C in URL in place of ',' in query string
		String url = request.getUrl().replace("%2C", ",");
		request.setUrl(url);
		int requestPathOff = url.indexOf("/api/");
		if (requestPathOff < 0)
			throw new IllegalArgumentException("Request URL:" + url + " is missing expected '/api/' subpart");
		String requestPath = url.substring(requestPathOff);
		
		
		String body = request.getBody();
		String strToSign = timestampStr + request.getHttpMethod().name() + requestPath + (body != null? body: "");
		String signature = digest(strToSign);
		
		request.setHeader("KC-API-SIGN", signature);
		request.setHeader("KC-API-PASSPHRASE", digest(apiPassphrase));
		request.setHeader("KC-API-KEY-VERSION", "2");
		// request.setHeader("User-Agent", "KuCoin-Java-SDK:2");
		request.setHeader("Content-Type", "application/json");
		
	}
	
	private String digest(String toDigest) {
		if (hmacUtils == null)
			throw new IllegalStateException("Api secret not set");
		return Base64.encodeBase64String(hmacUtils.hmac(toDigest));
	}
}

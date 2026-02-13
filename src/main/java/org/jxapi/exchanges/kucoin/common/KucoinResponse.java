package org.jxapi.exchanges.kucoin.common;

/**
 * Common interface implemented by most response objects for Kucoin API REST requests.
 */
public interface KucoinResponse {

	  /**
	   * @return System error code description, provided in error response when code is not '0', see <a href="https://docs.kucoin.com/#request">API</a>
	   */
	  default String getMsg() {return null;};
	  
	  /**
	   * @return System error code, see <a href="https://docs.kucoin.com/#request">API</a>
	   */
	  String getCode();
}

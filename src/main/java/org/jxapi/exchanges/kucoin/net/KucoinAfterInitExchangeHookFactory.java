package org.jxapi.exchanges.kucoin.net;

import org.jxapi.exchange.ExchangeHook;
import org.jxapi.exchange.ExchangeHookFactory;
import org.jxapi.exchanges.kucoin.gen.KucoinExchange;

/**
 * Factory for creating an ExchangeHook that configures rate limits
 */
public class KucoinAfterInitExchangeHookFactory implements ExchangeHookFactory {

  @Override
  public ExchangeHook createExchangeHook() {
    return e -> KucoinRateLimitsUtil.configureRateLimits((KucoinExchange) e);
  }

}

package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.Properties;

import org.jxapi.exchange.ExchangeObserver;
import org.jxapi.exchanges.kucoin.gen.KucoinExchange;
import org.jxapi.exchanges.kucoin.gen.KucoinExchangeImpl;
import org.jxapi.exchanges.kucoin.gen.spottrading.KucoinSpotTradingApi;
import org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingGetTradeHistoryRequest;
import org.jxapi.netutils.rest.pagination.PaginationUtil;
import org.jxapi.util.DemoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetrieveAllAnnouncementPages {

  private static final Logger log = LoggerFactory.getLogger(RetrieveAllAnnouncementPages.class);
  
  public static final int PAGE_SIZE = 20;
  
  private String symbol = "KCS-USDT";
  
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }
  
  /**
   * Creates a sample value for the request field of type KucoinSpotTradingGetFilledListRequest using sample value(s) defined in the field descriptor.
   * 
   * @param properties the configuration properties to use for the sample value generation.
   */
  private KucoinSpotTradingGetTradeHistoryRequest createInitialRequest() {
    return KucoinSpotTradingGetTradeHistoryRequest.builder()
        .limit(PAGE_SIZE)
        .symbol(getSymbol())
        .build();
  }

  public void run() {
    try {
      ExchangeObserver apiObserver = DemoUtil::logRestApiEvent;
      Properties properties = DemoUtil.loadDemoExchangeProperties(KucoinExchange.ID);
      KucoinExchange exchange = new KucoinExchangeImpl("test-" + KucoinExchange.ID, properties);
      KucoinSpotTradingApi api = exchange.getSpotTradingApi();
      exchange.subscribeObserver(apiObserver);
      KucoinSpotTradingGetTradeHistoryRequest request = createInitialRequest();
      log.info("Retrieving all order execution pages for symbol: {}, initial request:{}", getSymbol(), request);
      DemoUtil.checkResponse(PaginationUtil.fetchAllPages(api.getTradeHistory(request)));
      exchange.unsubscribeObserver(apiObserver);
      exchange.dispose();
    } catch (Exception e) {
      log.error("Error executing spot orders", e);
    }
  }

  public static void main(String[] args) {
    try {
      RetrieveAllAnnouncementPages retriever = new RetrieveAllAnnouncementPages();
      retriever.run();
      System.exit(0);
    } catch (Throwable t) {
      log.error("Error retrieving all order execution pages", t);
      System.exit(-1);
    }
    
  }
}

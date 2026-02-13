package org.jxapi.exchanges.kucoin.common.pagination;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.commons.lang3.StringUtils;
import org.jxapi.exchange.ExchangeObserver;
import org.jxapi.exchanges.kucoin.gen.KucoinConstants;
import org.jxapi.exchanges.kucoin.gen.KucoinExchange;
import org.jxapi.exchanges.kucoin.gen.KucoinExchangeImpl;
import org.jxapi.exchanges.kucoin.gen.spottrading.KucoinSpotTradingApi;
import org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotPlaceOrderRequest;
import org.jxapi.util.DemoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExecuteSpotOrdersMain {
  
  private static final Logger log = LoggerFactory.getLogger(ExecuteSpotOrdersMain.class); 
  
  private int nbOrders = 50;
  private String symbol = "KCS-USDT";

  public void run() {
    try {
      ExchangeObserver apiObserver = DemoUtil::logRestApiEvent;
      Properties properties = DemoUtil.loadDemoExchangeProperties(KucoinExchange.ID);
      KucoinExchange exchange = new KucoinExchangeImpl("test-" + KucoinExchange.ID, properties);
      KucoinSpotTradingApi api = exchange.getSpotTradingApi();
      exchange.subscribeObserver(apiObserver);
      for (int i = 0; i < nbOrders; i++) {
        executeOrder(api, i);
      }
      exchange.unsubscribeObserver(apiObserver);
      exchange.dispose();
    } catch (Exception e) {
      log.error("Error executing spot orders", e);
    }
  }
  
  private KucoinSpotPlaceOrderRequest createOrder(int index) {
    String side = index % 2 == 0 ? KucoinConstants.OrderSide.BUY : KucoinConstants.OrderSide.SELL;
    String clOrdId = String.format("%s_%s_%s_%s",
        Character.toUpperCase(side.charAt(0)),
        symbol,
        new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date()),
        StringUtils.leftPad("" + index, 4, '0'));
    return KucoinSpotPlaceOrderRequest
        .builder()
        .symbol(symbol)
        .side(side)
        .clientOid(clOrdId)
        .tradeType("TRADE")
        .size(new BigDecimal("0.1"))
        .timeInForce("GTC")
        .type("market")
        .build();
  }
  
  private void executeOrder(KucoinSpotTradingApi api, int index) throws InterruptedException, ExecutionException {
    KucoinSpotPlaceOrderRequest order = createOrder(index);
    log.info("Placing order {}/{}: {}", (index + 1), nbOrders, order);
    DemoUtil.checkResponse(api.placeOrder(order));
  }

  public String getSymbol() {
    return symbol;
  }



  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }



  public int getNbOrders() {
    return nbOrders;
  }



  public void setNbOrders(int nbOrders) {
    this.nbOrders = nbOrders;
  }

  public static void main(String[] args) {
    try {
      ExecuteSpotOrdersMain main = new ExecuteSpotOrdersMain();
      if (args.length > 0) {
        try {
          main.setNbOrders(Integer.parseInt(args[0]));
        } catch (NumberFormatException e) {
          log.error("Invalid number of orders specified, using default: " + main.getNbOrders(), e);
        }
      }
      if (args.length > 1) {
        main.setSymbol(args[1]);
      }
      main.run();
    } catch (Throwable t) {
      log.error("Exception raised from main()", t);
      System.exit(-1);
    }
    
  }
}

package org.jxapi.exchanges.kucoin.demo;

import java.math.BigDecimal;
import java.util.concurrent.ExecutionException;

import org.jxapi.exchanges.kucoin.gen.KucoinExchange;
import org.jxapi.exchanges.kucoin.gen.KucoinExchangeImpl;
import org.jxapi.exchanges.kucoin.gen.spottrading.KucoinSpotTradingApi;
import org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotPlaceOrderRequest;
import org.jxapi.util.DemoUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Tests insertion of multiple orders, cancelling them once insertion ACK is
 * received. This snippet is useful to check rate limits are correctly enforced.
 * {@link #SYMBOL}, {@link #PRICE}, {@link #SIZE} fields values should be tuned
 * to select a valid symbol tradable on spot, a valid price BELOW current last
 * price so orders do not hit.
 */
public class KucoinSpotTradingPlaceMultipleOrdersAndCancelThemUponInsertion {
  private static final Logger log = LoggerFactory.getLogger(KucoinSpotTradingPlaceMultipleOrdersAndCancelThemUponInsertion.class);
  
  /**
   * Sample value for <i>clientOid</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String CLIENTOID = "testKCOrderID";
  
  /**
   * Sample value for <i>side</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String SIDE = "buy";
  
  /**
   * Sample value for <i>symbol</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String SYMBOL = "VRA-USDT";
  
  /**
   * Sample value for <i>type</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String TYPE = "limit";
  
  /**
   * Sample value for <i>remark</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String REMARK = "Default remark";
  
  /**
   * Sample value for <i>stop</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String STOP = null;
  
  /**
   * Sample value for <i>stopPrice</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final BigDecimal STOPPRICE = null;
  
  /**
   * Sample value for <i>stp</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String STP = "CN";
  
  /**
   * Sample value for <i>tradeType</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String TRADETYPE = "TRADE";
  
  /**
   * Sample value for <i>price</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final BigDecimal PRICE = new BigDecimal("0.004");;
  
  /**
   * Sample value for <i>size</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final BigDecimal SIZE = new BigDecimal("100.0");;
  
  /**
   * Sample value for <i>timeInForce</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String TIMEINFORCE = "GTC";
  
  /**
   * Sample value for <i>cancelAfter</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final Long CANCELAFTER = 120L;
  
  /**
   * Sample value for <i>postOnly</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final Boolean POSTONLY = false;
  
  /**
   * Sample value for <i>hidden</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final Boolean HIDDEN = false;
  
  /**
   * Sample value for <i>iceberg</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final Boolean ICEBERG = false;
  
  /**
   * Sample value for <i>visibleSize</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String VISIBLESIZE = null;
  
  /**
   * Sample value for <i>funds</i> parameter of <i>PlaceNewOrder</i> API
   */
  public static final String FUNDS = "22.333";
  
  public static void main(String[] args) {
    try {
      long startTime = System.currentTimeMillis();
      int NB_ORDERS = 10;
      KucoinExchange exchange = new KucoinExchangeImpl("test-kucoin", DemoUtil.loadDemoExchangeProperties(KucoinExchange.ID));
      KucoinSpotTradingApi api = exchange.getSpotTradingApi();
      for (int i = 0; i < NB_ORDERS; i++) {
    	  String clientOid = CLIENTOID + "_" + i;
    	  insertOrder(api, clientOid);
    	  //cancelOrder(api, id);
    	  
      }
      Thread.sleep(30000L);
      long duration = System.currentTimeMillis() - startTime;
      log.info("Done inserting and deleting " + NB_ORDERS + " orders in:" + duration + "ms");
      System.exit(0);
    } catch (Throwable t) {
      log.error("Exception raised from main()", t);
      System.exit(-1);
    }
  }
  
  private static void insertOrder(KucoinSpotTradingApi api, String id) throws InterruptedException, ExecutionException {
	  KucoinSpotPlaceOrderRequest request = new KucoinSpotPlaceOrderRequest();
      request.setClientOid(id);
      request.setSide(SIDE);
      request.setSymbol(SYMBOL);
      request.setType(TYPE);
      request.setRemark(REMARK);
      request.setStop(STOP);
      request.setStopPrice(STOPPRICE);
      request.setStp(STP);
      request.setTradeType(TRADETYPE);
      request.setPrice(PRICE);
      request.setSize(SIZE);
      request.setTimeInForce(TIMEINFORCE);
      request.setCancelAfter(CANCELAFTER);
      request.setPostOnly(POSTONLY);
      request.setHidden(HIDDEN);
      request.setIceberg(ICEBERG);
      request.setVisibleSize(VISIBLESIZE);
      request.setFunds(FUNDS);
      log.info("Calling 'org.jxapi.exchanges.kucoin.gen.spottrading.KucoinSpotTradingApi.placeNewOrder() API with request:" + request);
      api.placeOrder(request).thenAccept(response -> {
    	  if (!response.isOk()) {
    		  log.error("Failed to insert order with id:" + id + ": response:" + response, response.getException());
    	  }
        	  
          log.info("Insert Response for ordr with id:" + id + ":" + response);  
          cancelOrder(api, response.getResponse().getData().getOrderId());
      });
  }
  
  private static void cancelOrder(KucoinSpotTradingApi api, String id) {
      log.info("Calling 'org.jxapi.exchanges.kucoin.gen.spottrading.KucoinSpotTradingApi.cancelOrder() API with id:" + id);
      api.cancelOrderByOrderId(id).thenAccept(response -> {
    	  if (!response.isOk())
        	  throw new RuntimeException("Failed to cancel order with id:" + id + ": response:" + response, response.getException());
          log.info("Response:" + response);
      });
  }
}

package org.jxapi.exchanges.kucoin.common.kline;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.jxapi.exchanges.kucoin.common.kline.pojo.KucoinKline;
import org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataGetKLinesResponse;
import org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.deserializers.KucoinFuturesMarketDataGetKLinesResponseDeserializer;
import org.jxapi.exchanges.kucoin.gen.spotmarketdata.pojo.KucoinSpotMarketDataGetKlinesResponse;
import org.jxapi.exchanges.kucoin.gen.spotmarketdata.pojo.deserializers.KucoinSpotMarketDataGetKlinesResponseDeserializer;

/**
 * Unit test for {@link KucoinKlineUtil}.
 */
public class KucoinKlineUtilTest {
  
  private static final String KUCOIN_GET_K_LINE_SPOT_RESPONSE = "{\n"
      + "  \"code\" : \"200000\",\n"
      + "  \"data\" : [ [ 1745528400, 93390.9, 93415.6, 93462.4, 93352.8, 1.22887629, 114785.451855937 ], [ 1745528340, 93458.7, 93396.5, 93458.8, 93388, 3.08646888, 288378.978887998 ]]\n"
      + "}";
  
  private static final String KUCOIN_GET_K_LINE_FUTURES_RESPONSE = "{\n"
      + "  \"code\" : \"200000\",\n"
      + "  \"data\" : [ [ \"1742371200000\", \"83208.38\", \"84892.28\", \"83207.88\", \"84748.41\", \"0\" ], "
      + "[ \"1742400000000\", \"84748.38\", \"87003.04\", \"83598.97\", \"86876.1\", \"0\" ]]\n"
      + "}";

  @Test
  public void testCreateKline() {
    // Test the createKline method
    KucoinKline kline = KucoinKlineUtil.createKline("1745528400", "93390.9", "93415.6", "93462.4", "93352.8",
        "1.22887629", "114785.451855937");

    Assert.assertEquals(Long.valueOf(1745528400L), kline.getTime());
    Assert.assertEquals(new BigDecimal("93390.9"), kline.getOpen());
    Assert.assertEquals(new BigDecimal("93415.6"), kline.getClose());
    Assert.assertEquals(new BigDecimal("93462.4"), kline.getHigh());
    Assert.assertEquals(new BigDecimal("93352.8"), kline.getLow());
    Assert.assertEquals(new BigDecimal("1.22887629"), kline.getVolume());
    Assert.assertEquals(new BigDecimal("114785.451855937"), kline.getTurnover());
  }
  
  @Test
  public void testCreateKlineListFromSpotMsgData() {
    KucoinSpotMarketDataGetKlinesResponse kucoinKlineResponse = new KucoinSpotMarketDataGetKlinesResponseDeserializer().deserialize(KUCOIN_GET_K_LINE_SPOT_RESPONSE);
    List<KucoinKline> klineList = KucoinKlineUtil.createKlineListFromSpotMsgData(kucoinKlineResponse.getData());
    Assert.assertNotNull(klineList);
    Assert.assertEquals(2, klineList.size());
    
    Assert.assertEquals(Long.valueOf(1745528400L), klineList.get(0).getTime());
    Assert.assertEquals(new BigDecimal("93390.9"), klineList.get(0).getOpen());
    Assert.assertEquals(new BigDecimal("93415.6"), klineList.get(0).getClose());
    Assert.assertEquals(new BigDecimal("93462.4"), klineList.get(0).getHigh());
    Assert.assertEquals(new BigDecimal("93352.8"), klineList.get(0).getLow());
    Assert.assertEquals(new BigDecimal("1.22887629"), klineList.get(0).getVolume());
    Assert.assertEquals(new BigDecimal("114785.451855937"), klineList.get(0).getTurnover());
    
    Assert.assertEquals(Long.valueOf(1745528340L), klineList.get(1).getTime());
    Assert.assertEquals(new BigDecimal("93458.7"), klineList.get(1).getOpen());
    Assert.assertEquals(new BigDecimal("93396.5"), klineList.get(1).getClose());
    Assert.assertEquals(new BigDecimal("93458.8"), klineList.get(1).getHigh());
    Assert.assertEquals(new BigDecimal("93388"), klineList.get(1).getLow());
    Assert.assertEquals(new BigDecimal("3.08646888"), klineList.get(1).getVolume());
    Assert.assertEquals(new BigDecimal("288378.978887998"), klineList.get(1).getTurnover());
    
  }
  
  @Test
  public void testCreateKlineListFromFuturesMsgData() {
    KucoinFuturesMarketDataGetKLinesResponse kucoinKlineResponse = new KucoinFuturesMarketDataGetKLinesResponseDeserializer().deserialize(KUCOIN_GET_K_LINE_FUTURES_RESPONSE);
    List<KucoinKline> klineList = KucoinKlineUtil.createKlineListFromFuturesMsgData(kucoinKlineResponse.getData());
    Assert.assertNotNull(klineList);
    Assert.assertEquals(2, klineList.size());
    Assert.assertEquals(Long.valueOf(1742371200000L), klineList.get(0).getTime());
    Assert.assertEquals(new BigDecimal("83208.38"), klineList.get(0).getOpen());
    Assert.assertEquals(new BigDecimal("84748.41"), klineList.get(0).getClose());
    Assert.assertEquals(new BigDecimal("84892.28"), klineList.get(0).getHigh());
    Assert.assertEquals(new BigDecimal("83207.88"), klineList.get(0).getLow());
    Assert.assertEquals(new BigDecimal("0"), klineList.get(0).getVolume());
    Assert.assertEquals(new BigDecimal("0"), klineList.get(0).getTurnover());
    Assert.assertEquals(Long.valueOf(1742400000000L), klineList.get(1).getTime());
    Assert.assertEquals(new BigDecimal("84748.38"), klineList.get(1).getOpen());
    Assert.assertEquals(new BigDecimal("86876.1"), klineList.get(1).getClose());
    Assert.assertEquals(new BigDecimal("87003.04"), klineList.get(1).getHigh());
    Assert.assertEquals(new BigDecimal("83598.97"), klineList.get(1).getLow());
    Assert.assertEquals(new BigDecimal("0"), klineList.get(1).getVolume());
    Assert.assertEquals(new BigDecimal("0"), klineList.get(1).getTurnover());
  }

}

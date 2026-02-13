package org.jxapi.exchanges.kucoin.common.kline;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import org.jxapi.exchanges.kucoin.common.kline.pojo.KucoinKline;
import org.jxapi.netutils.deserialization.json.field.BigDecimalJsonFieldDeserializer;
import org.jxapi.netutils.deserialization.json.field.LongJsonFieldDeserializer;

/**
 * Utility class for creating KucoinKline objects.
 */
public class KucoinKlineUtil {
  
  private KucoinKlineUtil() {
    // Prevent instantiation
  }
  
  public static KucoinKline createKline(
      String time, 
      String open, 
      String close, 
      String high, 
      String low, 
      String volume,
      String turnover) {
    return createKline(
        LongJsonFieldDeserializer.getInstance().deserialize(time),
        BigDecimalJsonFieldDeserializer.getInstance().deserialize(open),
        BigDecimalJsonFieldDeserializer.getInstance().deserialize(close),
        BigDecimalJsonFieldDeserializer.getInstance().deserialize(high),
        BigDecimalJsonFieldDeserializer.getInstance().deserialize(low),
        BigDecimalJsonFieldDeserializer.getInstance().deserialize(volume),
        BigDecimalJsonFieldDeserializer.getInstance().deserialize(turnover));
  }

  public static KucoinKline createKline(
      long time, 
      BigDecimal open, 
      BigDecimal close, 
      BigDecimal high, 
      BigDecimal low, 
      BigDecimal volume,
      BigDecimal turnover) {
    KucoinKline kline = new KucoinKline();
    kline.setTime(time);
    kline.setOpen(open);
    kline.setClose(close);
    kline.setHigh(high);
    kline.setLow(low);
    kline.setVolume(volume);
    kline.setTurnover(turnover);
    return kline;
  }
  
  public static List<KucoinKline> createKlineListFromSpotMsgData(List<List<String>> msgData) {
    return msgData.stream()
                  .map(data -> createKline(data.get(0), data.get(1), data.get(2), data.get(3), data.get(4), data.get(5), data.get(6)))
                  .collect(Collectors.toList());
  }
  
  public static List<KucoinKline> createKlineListFromFuturesMsgData(List<List<String>> msgData) {
    return msgData.stream()
                  .map(data -> createKline(data.get(0), data.get(1), data.get(4), data.get(2), data.get(3), data.get(5), "0"))
                  .collect(Collectors.toList());
  }

}

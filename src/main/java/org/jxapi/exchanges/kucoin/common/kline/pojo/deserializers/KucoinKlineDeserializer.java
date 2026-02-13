package org.jxapi.exchanges.kucoin.common.kline.pojo.deserializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import javax.annotation.processing.Generated;

import org.jxapi.exchanges.kucoin.common.kline.pojo.KucoinKline;
import org.jxapi.netutils.deserialization.json.AbstractJsonMessageDeserializer;
import static org.jxapi.util.JsonUtil.readNextBigDecimal;
import static org.jxapi.util.JsonUtil.readNextLong;
import static org.jxapi.util.JsonUtil.skipNextValue;

/**
 * Parses incoming JSON messages into org.jxapi.exchanges.kucoin.gen.spotmarketdata.pojo.KucoinKline instances
 * @see KucoinKline
 */
@Generated("org.jxapi.generator.java.exchange.api.pojo.JsonMessageDeserializerGenerator")
public class KucoinKlineDeserializer extends AbstractJsonMessageDeserializer<KucoinKline> {
  
  @Override
  public KucoinKline deserialize(JsonParser parser) throws IOException {
    KucoinKline msg = new KucoinKline();
    while(parser.nextToken() != JsonToken.END_OBJECT) {
      switch(parser.currentName()) {
      case "time":
        msg.setTime(readNextLong(parser));
      break;
      case "open":
        msg.setOpen(readNextBigDecimal(parser));
      break;
      case "close":
        msg.setClose(readNextBigDecimal(parser));
      break;
      case "high":
        msg.setHigh(readNextBigDecimal(parser));
      break;
      case "low":
        msg.setLow(readNextBigDecimal(parser));
      break;
      case "volume":
        msg.setVolume(readNextBigDecimal(parser));
      break;
      case "turnover":
        msg.setTurnover(readNextBigDecimal(parser));
      break;
      default:
        skipNextValue(parser);
      }
    }
    
     return msg;
  }
}

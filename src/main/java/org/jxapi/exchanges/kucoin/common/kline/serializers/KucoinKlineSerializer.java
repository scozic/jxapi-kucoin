package org.jxapi.exchanges.kucoin.common.kline.serializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import javax.annotation.processing.Generated;

import org.jxapi.exchanges.kucoin.common.kline.pojo.KucoinKline;
import org.jxapi.util.EncodingUtil;

/**
 * Jackson JSON Serializer for org.jxapi.exchanges.kucoin.gen.spotmarketdata.pojo.KucoinKline
 * @see KucoinKline
 */
@Generated("org.jxapi.generator.java.exchange.api.pojo.JsonPojoSerializerGenerator")
public class KucoinKlineSerializer extends StdSerializer<KucoinKline> {
  public KucoinKlineSerializer() {
    super(KucoinKline.class);
  }
  
  @Override
  public void serialize(KucoinKline value, JsonGenerator gen, SerializerProvider provider) throws IOException {
    gen.writeStartObject();
    if (value.getTime() != null){
      gen.writeNumberField("time", value.getTime());
    }
    if (value.getOpen() != null){
      gen.writeStringField("open", EncodingUtil.bigDecimalToString(value.getOpen()));
    }
    if (value.getClose() != null){
      gen.writeStringField("close", EncodingUtil.bigDecimalToString(value.getClose()));
    }
    if (value.getHigh() != null){
      gen.writeStringField("high", EncodingUtil.bigDecimalToString(value.getHigh()));
    }
    if (value.getLow() != null){
      gen.writeStringField("low", EncodingUtil.bigDecimalToString(value.getLow()));
    }
    if (value.getVolume() != null){
      gen.writeStringField("volume", EncodingUtil.bigDecimalToString(value.getVolume()));
    }
    if (value.getTurnover() != null){
      gen.writeStringField("turnover", EncodingUtil.bigDecimalToString(value.getTurnover()));
    }
    gen.writeEndObject();
  }
}

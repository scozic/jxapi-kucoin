package org.jxapi.exchanges.kucoin.common.kline.pojo;

import java.math.BigDecimal;
import java.util.Objects;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import javax.annotation.processing.Generated;

import org.jxapi.exchanges.kucoin.common.kline.serializers.KucoinKlineSerializer;
import org.jxapi.util.CompareUtil;
import org.jxapi.util.EncodingUtil;
import org.jxapi.util.Pojo;

/**
 * Trade history detail<br>
 * 
 * Remark: This class has been initialized using <code>org.jxapi.generator.java.exchange.api.pojo.PojoGenerator</code>
 */
@JsonSerialize(using = KucoinKlineSerializer.class)
public class KucoinKline implements Pojo<KucoinKline> {
  
  private static final long serialVersionUID = 1318700245799904575L;
  
  /**
   * @return A new builder to build {@link KucoinKline} objects
   */
  public static Builder builder() {
    return new Builder();
  }
  
  private Long time;
  private BigDecimal open;
  private BigDecimal close;
  private BigDecimal high;
  private BigDecimal low;
  private BigDecimal volume;
  private BigDecimal turnover;
  
  /**
   * @return Start time of the candle cycle
   */
  public Long getTime() {
    return time;
  }
  
  /**
   * @param time Start time of the candle cycle
   */
  public void setTime(Long time) {
    this.time = time;
  }
  
  /**
   * @return Opening price
   */
  public BigDecimal getOpen() {
    return open;
  }
  
  /**
   * @param open Opening price
   */
  public void setOpen(BigDecimal open) {
    this.open = open;
  }
  
  /**
   * @return Closing price
   */
  public BigDecimal getClose() {
    return close;
  }
  
  /**
   * @param close Closing price
   */
  public void setClose(BigDecimal close) {
    this.close = close;
  }
  
  /**
   * @return Highest price
   */
  public BigDecimal getHigh() {
    return high;
  }
  
  /**
   * @param high Highest price
   */
  public void setHigh(BigDecimal high) {
    this.high = high;
  }
  
  /**
   * @return Lowest price
   */
  public BigDecimal getLow() {
    return low;
  }
  
  /**
   * @param low Lowest price
   */
  public void setLow(BigDecimal low) {
    this.low = low;
  }
  
  /**
   * @return Transaction volume(One-sided transaction volume)
   */
  public BigDecimal getVolume() {
    return volume;
  }
  
  /**
   * @param volume Transaction volume(One-sided transaction volume)
   */
  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }
  
  /**
   * @return Transaction amount(One-sided transaction amount)
   */
  public BigDecimal getTurnover() {
    return turnover;
  }
  
  /**
   * @param turnover Transaction amount(One-sided transaction amount)
   */
  public void setTurnover(BigDecimal turnover) {
    this.turnover = turnover;
  }
  
  @Override
  public boolean equals(Object other) {
    if (other == null)
      return false;
    if (!getClass().equals(other.getClass()))
      return false;
    KucoinKline o = (KucoinKline) other;
    return Objects.equals(time, o.time)
            && Objects.equals(open, o.open)
            && Objects.equals(close, o.close)
            && Objects.equals(high, o.high)
            && Objects.equals(low, o.low)
            && Objects.equals(volume, o.volume)
            && Objects.equals(turnover, o.turnover);
  }
  
  @Override
  public int compareTo(KucoinKline other) {
    if (other == null) {
      return 1;
    }
    int res = 0;
    res = CompareUtil.compare(this.time, other.time);
    if (res != 0) {
      return res;
    }
    res = CompareUtil.compare(this.open, other.open);
    if (res != 0) {
      return res;
    }
    res = CompareUtil.compare(this.close, other.close);
    if (res != 0) {
      return res;
    }
    res = CompareUtil.compare(this.high, other.high);
    if (res != 0) {
      return res;
    }
    res = CompareUtil.compare(this.low, other.low);
    if (res != 0) {
      return res;
    }
    res = CompareUtil.compare(this.volume, other.volume);
    if (res != 0) {
      return res;
    }
    res = CompareUtil.compare(this.turnover, other.turnover);
    return res;
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(time, open, close, high, low, volume, turnover);
  }
  
  @Override
  public KucoinKline deepClone() {
    KucoinKline clone = new KucoinKline();
    clone.time = this.time;
    clone.open = this.open;
    clone.close = this.close;
    clone.high = this.high;
    clone.low = this.low;
    clone.volume = this.volume;
    clone.turnover = this.turnover;
    return clone;
  }
  
  @Override
  public String toString() {
    return EncodingUtil.pojoToString(this);
  }
  
  /**
   * Builder for {@link KucoinKline}
   */
  @Generated("org.jxapi.generator.java.JavaTypeGenerator")
  public static class Builder {
    
    private Long time;
    private BigDecimal open;
    private BigDecimal close;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal volume;
    private BigDecimal turnover;
    
    /**
     * Will set the value of <code>time</code> field in the builder
     * @param time Start time of the candle cycle
     * @return Builder instance
     * @see #setTime(Long)
     */
    public Builder time(Long time)  {
      this.time = time;
      return this;
    }
    
    /**
     * Will set the value of <code>open</code> field in the builder
     * @param open Opening price
     * @return Builder instance
     * @see #setOpen(BigDecimal)
     */
    public Builder open(BigDecimal open)  {
      this.open = open;
      return this;
    }
    
    /**
     * Will set the value of <code>close</code> field in the builder
     * @param close Closing price
     * @return Builder instance
     * @see #setClose(BigDecimal)
     */
    public Builder close(BigDecimal close)  {
      this.close = close;
      return this;
    }
    
    /**
     * Will set the value of <code>high</code> field in the builder
     * @param high Highest price
     * @return Builder instance
     * @see #setHigh(BigDecimal)
     */
    public Builder high(BigDecimal high)  {
      this.high = high;
      return this;
    }
    
    /**
     * Will set the value of <code>low</code> field in the builder
     * @param low Lowest price
     * @return Builder instance
     * @see #setLow(BigDecimal)
     */
    public Builder low(BigDecimal low)  {
      this.low = low;
      return this;
    }
    
    /**
     * Will set the value of <code>volume</code> field in the builder
     * @param volume Transaction volume(One-sided transaction volume)
     * @return Builder instance
     * @see #setVolume(BigDecimal)
     */
    public Builder volume(BigDecimal volume)  {
      this.volume = volume;
      return this;
    }
    
    /**
     * Will set the value of <code>turnover</code> field in the builder
     * @param turnover Transaction amount(One-sided transaction amount)
     * @return Builder instance
     * @see #setTurnover(BigDecimal)
     */
    public Builder turnover(BigDecimal turnover)  {
      this.turnover = turnover;
      return this;
    }
    
    /**
     * @return a new instance of KucoinKline using the values set in this builder
     */
    public KucoinKline build() {
      KucoinKline res = new KucoinKline();
      res.time = this.time;
      res.open = this.open;
      res.close = this.close;
      res.high = this.high;
      res.low = this.low;
      res.volume = this.volume;
      res.turnover = this.turnover;
      return res;
    }
  }
}

package org.jxapi.exchanges.kucoin.common;

import java.math.BigDecimal;
import java.util.List;

/**
 * Common interface for Kucoin Order Book data
 */
public interface KucoinOrderBook {
 
  /**
   * @return Sequence number
   */
  public Long getSequence();
  
  /**
   * Either {@link #getTime()} or {@link #getTs()} should be overridden.
   * @return Timestamp
   * 
   */
  default Long getTime() {return getTs();}
  
  default Long getTs() {throw new UnsupportedOperationException("getTs() is not supported by this implementation. Either getTime() or getTs() should be overridden.");}
  
  /**
   * @return Bids (2 values: price, size)
   * 
   */
  List<List<BigDecimal>> getBids();
  
  /**
   * @return Asks (2 values: price, size)
   * 
   */
  List<List<BigDecimal>> getAsks();
  
}

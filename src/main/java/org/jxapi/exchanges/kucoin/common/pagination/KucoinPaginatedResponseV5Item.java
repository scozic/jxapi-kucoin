package org.jxapi.exchanges.kucoin.common.pagination;

public interface KucoinPaginatedResponseV5Item {

  /**
   * Returns the unique identifier for the item in the paginated response.
   * @return the unique identifier of the item
   */
  String getLastId();
  
}

package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.List;

/**
 * Interface for Kucoin paginated responses that use offset and forward parameters. This is a page of response items.
 */
public interface KucoinPaginatedResponseV3Page {

  /** 
   * @return <code>true</code> if there are more pages available, <code>false</code> otherwise.
   */
  Boolean isHasMore();
  
  /**
   * @return List of items in the current page.
   */
  List<? extends KucoinPaginatedResponseV3Item> getDataList();
}

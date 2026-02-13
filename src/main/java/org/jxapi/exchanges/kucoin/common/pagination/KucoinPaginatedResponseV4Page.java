package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.List;

/**
 * Interface for Kucoin paginated responses 'V4' page object containing
 * hasMore property and list of items implementing {@link KucoinPaginatedResponseV4Item}.
 * @see KucoinPaginatedResponseV4
 * @see KucoinPaginatedResponseV4Item
 */
public interface KucoinPaginatedResponseV4Page {

  /** 
   * @return <code>true</code> if there are more pages available, <code>false</code> otherwise.
   */
  Boolean isHasMore();
  
  /**
   * @return List of items in the current page.
   */
  List<? extends KucoinPaginatedResponseV4Item> getDataList();
}

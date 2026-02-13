package org.jxapi.exchanges.kucoin.common.pagination;

import org.jxapi.netutils.rest.pagination.PaginatedRestRequest;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;

public interface KucoinPaginatedRequestV4 extends PaginatedRestRequest {

  /**
   * @return Current request page. Default is 1
   */
  Integer getPageId();
  /**
   * @param pageId Current request page. Default is 1
   */
  void setPageId(Integer pageId);

  /**
   * @return Number of results per request. Default 50, max 100.
   */
  Integer getLimit();
  
  /**
   * @param limit Number of results per request. Default 50, max 100.
   */
  void setLimit(Integer limit);

  @Override
  default void setNextPage(PaginatedRestResponse lastPage) {
    if (lastPage == null) {
      throw new IllegalArgumentException("Last page cannot be null");
    }
    KucoinPaginatedResponseData lastPageData = ((KucoinPaginatedResponse) lastPage).getData();
    if (lastPageData == null) {
      throw new IllegalArgumentException("Last page data cannot be null");
    }

    setPageId(lastPageData.getCurrentPage() + 1);
    setLimit(lastPageData.getPageSize());
  }
}

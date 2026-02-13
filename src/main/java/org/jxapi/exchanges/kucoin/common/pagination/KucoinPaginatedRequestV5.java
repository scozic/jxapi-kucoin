package org.jxapi.exchanges.kucoin.common.pagination;

import org.jxapi.netutils.rest.RestResponse;
import org.jxapi.netutils.rest.pagination.PaginatedRestRequest;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;

public interface KucoinPaginatedRequestV5 extends PaginatedRestRequest {

  /**
   * @return Current request page. Default is 1
   */
  Integer getPage();
  /**
   * @param pageId Current request page. Default is 1
   */
  void setPage(Integer pageId);

  /**
   * @return Number of results per request. Default 50, max 100.
   */
  Integer getPageSize();
  
  /**
   * @param pageSize Number of results per request. Default 50, max 100.
   */
  void setPageSize(Integer pageSize);

  @Override
  default void setNextPage(PaginatedRestResponse lastPage) {
    if (lastPage == null) {
      throw new IllegalArgumentException("Last page cannot be null");
    }
    KucoinPaginatedRequestV5 request = (KucoinPaginatedRequestV5) (((RestResponse<?>) lastPage).getHttpResponse().getRequest());
    setPage(request.getPage() + 1);
    setPageSize(request.getPageSize());
  }
}

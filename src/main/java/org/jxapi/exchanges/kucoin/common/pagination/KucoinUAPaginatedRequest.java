package org.jxapi.exchanges.kucoin.common.pagination;

import org.jxapi.netutils.rest.pagination.PaginatedRestRequest;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;

public interface KucoinUAPaginatedRequest extends PaginatedRestRequest {

  /**
   * @return Current request page. Default is 1
   */
  Integer getPageNumber();
  /**
   * @param currentPage Current request page. Default is 1
   */
  public void setPageNumber(Integer currentPage);
  
  /**
   * @return Number of results per request. Minimum is 1, maximum is 100, default is 10.
   */
  public Integer getPageSize();
  
  /**
   * @param pageSize Number of results per request. Minimum is 1, maximum is 100, default is 10.
   */
  public void setPageSize(Integer pageSize);
  
  @Override
  default void setNextPage(PaginatedRestResponse lastPage) {
    if (lastPage == null) {
      throw new IllegalArgumentException("Last page cannot be null");
    }
    KucoinUAPaginatedResponseData lastPageData = ((KucoinUAPaginatedResponse) lastPage).getData();
    if (lastPageData == null) {
      throw new IllegalArgumentException("Last page data cannot be null");
    }
    
    setPageNumber(lastPageData.getPageNumber() + 1);
    setPageSize(lastPageData.getPageSize());
  }
}

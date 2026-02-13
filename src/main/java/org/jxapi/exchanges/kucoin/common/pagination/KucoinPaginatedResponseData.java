package org.jxapi.exchanges.kucoin.common.pagination;

/**
 * Interface for paginated response data in Kucoin API. Endpoints support
 * pagination are expected to carry object of this type in their response 'data'
 * field.
 */
public interface KucoinPaginatedResponseData {

  /**
   * @return Current page number
   */
  Integer getCurrentPage();
  
  /**
   * @param currentPage Current page number
   */
  void setCurrentPage(Integer currentPage);
  
  /**
   * @return Number of items per page
   */
  Integer getPageSize();
  
  /**
   * @param pageSize Number of items per page
   */
  void setPageSize(Integer pageSize);
  
  /**
   * @return Total number of items
   */
  Integer getTotalNum();
  
  /**
   * @param totalNum Total number of items
   */
  void setTotalNum(Integer totalNum);
  
  /**
   * @return Total number of pages
   */
  Integer getTotalPage();
  
  /**
   * @param totalPage Total number of pages
   */
  void setTotalPage(Integer totalPage);
}

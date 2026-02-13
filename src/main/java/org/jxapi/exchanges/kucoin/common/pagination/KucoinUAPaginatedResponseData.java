package org.jxapi.exchanges.kucoin.common.pagination;

public interface KucoinUAPaginatedResponseData {
  
  /**
   * @return Current page number
   */
  Integer getPageNumber();
  
  /**
   * @param currentPage Current page number
   */
  void setPageNumber(Integer currentPage);
  
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
  Integer getTotalNumber();
  
  /**
   * @param totalNum Total number of items
   */
  void setTotalNumber(Integer totalNum);
  
  /**
   * @return Total number of pages
   */
  Integer getTotalPage();
  
  /**
   * @param totalPage Total number of pages
   */
  void setTotalPage(Integer totalPage);

}

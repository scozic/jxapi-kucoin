package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.List;

import org.jxapi.netutils.rest.pagination.PaginatedRestRequest;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;
import org.jxapi.util.CollectionUtil;

public interface KucoinPaginatedRequestV7 extends PaginatedRestRequest {

  /**
   * @return Last ID from the previous page, used for pagination.
   */
  Long getLastId();
  
  /**
   * @param lastId Last ID from the previous page, used for pagination.
   */
  public void setLastId(Long lastId);
  
  @Override
  default void setNextPage(PaginatedRestResponse lastPage) {
    if (lastPage == null) {
      throw new IllegalArgumentException("Last page cannot be null");
    }
    KucoinPaginatedResponseV7Page  page = ((KucoinPaginatedResponseV7) lastPage).getData();
    if (page == null) {
      throw new IllegalArgumentException("Last page cannot be null");
    }
    List<? extends KucoinPaginatedResponseV7Item> p = ((KucoinPaginatedResponseV7) lastPage).getData().getItems();
    if (CollectionUtil.isEmpty(p)) {
      throw new IllegalArgumentException("Last page data items cannot be null or empty");
    }
    setLastId(p.get(p.size() - 1).getId());
  }
}

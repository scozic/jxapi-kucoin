package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.List;

import org.jxapi.netutils.rest.pagination.PaginatedRestRequest;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;
import org.jxapi.util.CollectionUtil;

/**
 * Interface for Kucoin paginated requests that use a last ID for
 * pagination. This interface extends the {@link PaginatedRestRequest} interface and
 * adds methods to handle pagination using the last ID from the previous page.
 * <p>
 * Most endpoints in Kucoin API that support pagination use {@link KucoinPaginatedRequest} with <code>currentPage</code> and <code>pageSize</code> parameters,
 * but some endpoints require a different approach using a last ID from the previous page. For instance, the Account "Get Account Ledgers - trade_hf" endpoint.
 */
public interface KucoinPaginatedRequestV2 extends PaginatedRestRequest {

  /**
   * @return Last ID from the previous page, used for pagination.
   */
  String getLastId();
  
  /**
   * @param lastId Last ID from the previous page, used for pagination.
   */
  public void setLastId(String lastId);
  
  @Override
  default void setNextPage(PaginatedRestResponse lastPage) {
    if (lastPage == null) {
      throw new IllegalArgumentException("Last page cannot be null");
    }
    List<? extends KucoinPaginatedResponseV2Item> p = ((KucoinPaginatedResponseV2) lastPage).getData();
    if (CollectionUtil.isEmpty(p)) {
      throw new IllegalArgumentException("Last page data cannot be null or empty");
    }
    setLastId(p.get(p.size() - 1).getId());
  }
}

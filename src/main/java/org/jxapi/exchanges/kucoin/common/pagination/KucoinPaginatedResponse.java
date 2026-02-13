package org.jxapi.exchanges.kucoin.common.pagination;

import org.jxapi.exchanges.kucoin.common.KucoinResponse;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;

public interface KucoinPaginatedResponse extends KucoinResponse, PaginatedRestResponse {

  KucoinPaginatedResponseData getData();
 
  /**
   * Checks if there is a next page available in the response.
   *
   * @return {@code true} if there is a next page, {@code false} otherwise
   */
  @Override
  default boolean hasNextPage() {
    KucoinPaginatedResponseData data = getData();
    return data != null && data.getCurrentPage() < data.getTotalPage();
  }
}

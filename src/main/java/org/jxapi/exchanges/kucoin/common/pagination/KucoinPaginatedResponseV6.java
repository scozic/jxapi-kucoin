package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.List;

import org.jxapi.exchanges.kucoin.common.KucoinResponse;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;
import org.jxapi.util.CollectionUtil;

/**
 * Responses of such endpoints expose 'data' field that is a list of items forming a page of data.
 * This list being empty means that there are no more pages to fetch.
 * <p>
 * There is no additional metadata about pagination in the response.
 * The next page is fetched by incrementing the 'page' parameter in the previous request.
 */
public interface KucoinPaginatedResponseV6 extends KucoinResponse, PaginatedRestResponse {

  List<?> getData();

  /**
   * Checks if there is a next page available in the response.
   *
   * @return {@code true} if there is a next page, {@code false} otherwise
   */
  @Override
  default boolean hasNextPage() {
    return !CollectionUtil.isEmpty(getData());
  }
}

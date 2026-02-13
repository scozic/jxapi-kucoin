package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.List;

import org.jxapi.exchanges.kucoin.common.KucoinResponse;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;
import org.jxapi.util.CollectionUtil;

/**
 * Responses of such endpoints 'data' field a list of items that implement {@link KucoinPaginatedResponseV5Item}.
 *
 */
public interface KucoinPaginatedResponseV5 extends KucoinResponse, PaginatedRestResponse {

  List<? extends KucoinPaginatedResponseV5Item> getData();

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

package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.List;

import org.jxapi.exchanges.kucoin.common.KucoinResponse;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;
import org.jxapi.util.CollectionUtil;

/**
 * Interface for Kucoin paginated responses using 'V2' pagination style (see {@link KucoinPaginatedRequestV2}).
 * <p>
 * Responses of such endpoints contain a list of items that implement {@link KucoinPaginatedResponseV2Item}.
 * 
 */
public interface KucoinPaginatedResponseV2 extends KucoinResponse, PaginatedRestResponse {

  List<? extends KucoinPaginatedResponseV2Item> getData();
 
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

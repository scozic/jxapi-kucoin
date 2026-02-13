package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.Optional;

import org.jxapi.exchanges.kucoin.common.KucoinResponse;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;

/**
 * Interface for Kucoin paginated responses using 'V4' 
 * <p>
 * Responses of such endpoints contain a page of items that implement
 * {@link KucoinPaginatedResponseV4Item}.
 */
public interface KucoinPaginatedResponseV4 extends KucoinResponse, PaginatedRestResponse {
 
  /**
   * Checks if there is a next page available in the response.
   *
   * @return {@code true} if there is a next page, {@code false} otherwise
   */
  @Override
  default boolean hasNextPage() {
    return getData() != null && Optional.ofNullable(getData().isHasMore()).orElse(Boolean.FALSE).booleanValue();
  }

  /**
   * @return Page of items in the current response.
   */
  KucoinPaginatedResponseV4Page getData();
}

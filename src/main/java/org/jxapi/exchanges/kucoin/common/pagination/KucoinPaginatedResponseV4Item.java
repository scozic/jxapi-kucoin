package org.jxapi.exchanges.kucoin.common.pagination;

/**
 * Interface for items in Kucoin paginated responses using 'V4' pagination
 *  response style. These items contain an id used as offset for pagination.
 * The id of last item in the page should be used in request to fetch next page.
 * <p>
 * This interface is used in conjunction with {@link KucoinPaginatedResponseV4}
 * and {@link KucoinPaginatedResponseV4Page}.
 */
public interface KucoinPaginatedResponseV4Item {

  /**
   * @return ID for the item, the ID of last item in the page should be used in request to fetch next page.
   */
  Long getId();
}

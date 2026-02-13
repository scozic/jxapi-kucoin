package org.jxapi.exchanges.kucoin.common.pagination;

/**
 * Interface for items in Kucoin paginated responses using 'V3' pagination
 * style. These items contain an offset used for pagination.
 * <p>
 * This interface is used in conjunction with {@link KucoinPaginatedResponseV3}
 * and {@link KucoinPaginatedResponseV3Page}.
 */
public interface KucoinPaginatedResponseV3Item {

  /**
   * @return Offset for the item, the offset of last item in the page should be used in request to fetch next page.
   */
  Long getOffset();
}

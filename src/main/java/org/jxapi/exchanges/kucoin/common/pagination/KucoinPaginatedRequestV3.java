package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.List;
import java.util.Optional;

import org.jxapi.netutils.rest.pagination.PaginatedRestRequest;
import org.jxapi.netutils.rest.pagination.PaginatedRestResponse;
import org.jxapi.util.CollectionUtil;

/**
 * Interface for Kucoin paginated requests that use offset and forward parameters.
 * This interface extends the {@link PaginatedRestRequest} interface and adds methods to handle pagination using offset, forward direction, and max count.
 */
public interface KucoinPaginatedRequestV3 extends PaginatedRestRequest {

  /**
   * @return Offset for pagination, used to specify the starting point for the
   *         next page of results.
   */
  Long getOffset();
  
  /**
   * @param offset Offset for pagination, used to specify the starting point for
   *               the next page of results.
   */
  void setOffset(Long offset);
  
  /**
   * @return Boolean indicating the direction of pagination. If true, it indicates
   *         forward pagination; if false, it indicates backward pagination.
   */
  Boolean isForward();
  
  /**
   * @param forward Boolean indicating the direction of pagination. If true, it
   *                indicates forward pagination; if false, it indicates backward
   *                pagination.
   */
  void setForward(Boolean forward);
  
  /**
   * @return Maximum number of items to return in a single page.
   */
  Integer getMaxCount();
  
  /**
   * @param maxCount Maximum number of items to return in a single page.
   */
  void setMaxCount(Integer maxCount);
  
  @Override
  default void setNextPage(PaginatedRestResponse lastPage) {
    if (lastPage == null) {
      throw new IllegalArgumentException("Last page cannot be null");
    }
    KucoinPaginatedResponseV3Page p = ((KucoinPaginatedResponseV3) lastPage).getData();
    if (p == null) {
      throw new IllegalArgumentException("Last page data cannot be null");
    }
    if(!Optional.ofNullable(p.isHasMore()).orElse(Boolean.FALSE).booleanValue()) {
      throw new IllegalArgumentException("Last page data has no more pages");
    }
    List<? extends KucoinPaginatedResponseV3Item> dataList = p.getDataList();
    if (CollectionUtil.isEmpty(dataList)) {
      throw new IllegalArgumentException("Last page data cannot be null or empty");
    }
    KucoinPaginatedResponseV3Item lastItem = dataList.get(dataList.size() - 1);
    setOffset(lastItem.getOffset());
  }
  
  
}

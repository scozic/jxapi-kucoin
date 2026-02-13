package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.List;

public interface KucoinPaginatedResponseV7Page {

  List<? extends KucoinPaginatedResponseV7Item> getItems();

}

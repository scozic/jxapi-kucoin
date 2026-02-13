package org.jxapi.exchanges.kucoin.common.pagination;

import org.junit.Assert;
import org.junit.Test;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountLedgersFuturesResponse;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountLedgerFuturesPage;

/**
 * Unit test class for {@link KucoinPaginatedResponseV3}.
 */
public class KucoinPaginatedResponseV3Test {

  @Test
  public void testHasNextPage() {
    KucoinAccountGetAccountLedgersFuturesResponse response = new KucoinAccountGetAccountLedgersFuturesResponse();
    KucoinAccountLedgerFuturesPage page = new KucoinAccountLedgerFuturesPage();
    response.setData(page);
    Assert.assertFalse(response.hasNextPage());
    page.setHasMore(false);
    Assert.assertFalse(response.hasNextPage());
    page.setHasMore(true);
    Assert.assertTrue(response.hasNextPage());
  }

}

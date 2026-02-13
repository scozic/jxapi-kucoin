package org.jxapi.exchanges.kucoin.common.pagination;

import org.junit.Assert;
import org.junit.Test;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountLedgerTradeHfResponse;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountLedger;

/**
 * Unit test class for {@link KucoinPaginatedResponseV2}.
 */
public class KucoinPaginatedResponseV2Test {

  @Test
  public void testHasNextPage_NullData() {
    KucoinAccountGetAccountLedgerTradeHfResponse response = new KucoinAccountGetAccountLedgerTradeHfResponse();
    Assert.assertFalse(response.hasNextPage());
  }
  
  @Test
  public void testHasNextPage_NonEmptyData() {
    KucoinAccountGetAccountLedgerTradeHfResponse response = KucoinAccountGetAccountLedgerTradeHfResponse.builder()
        .addToData(KucoinAccountLedger.builder().id("12345").build())
        .build();
    Assert.assertTrue(response.hasNextPage());
  }

}

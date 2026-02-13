package org.jxapi.exchanges.kucoin.common.pagination;

import org.junit.Assert;
import org.junit.Test;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountLedgerTradeHfRequest;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountLedgerTradeHfResponse;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountLedger;

/**
 * Unit test class for {@link KucoinPaginatedRequestV2}.
 */
public class KucoinPaginatedRequestV2Test {
  
  @Test
  public void testSetNextPage() {
    KucoinAccountGetAccountLedgerTradeHfRequest request = new KucoinAccountGetAccountLedgerTradeHfRequest();
    KucoinAccountGetAccountLedgerTradeHfResponse response = KucoinAccountGetAccountLedgerTradeHfResponse.builder()
        .addToData(KucoinAccountLedger.builder().id("12345").build())
        .build();
    request.setNextPage(response);
    Assert.assertEquals("12345", request.getLastId());
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSetNextPage_NullLastPage() {
    KucoinAccountGetAccountLedgerTradeHfRequest request = new KucoinAccountGetAccountLedgerTradeHfRequest();
    request.setNextPage(null);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSetNextPage_EmptyResponse() {
    KucoinAccountGetAccountLedgerTradeHfRequest request = new KucoinAccountGetAccountLedgerTradeHfRequest();
    KucoinAccountGetAccountLedgerTradeHfResponse response = KucoinAccountGetAccountLedgerTradeHfResponse.builder()
        .build();
    request.setNextPage(response);
  }
}

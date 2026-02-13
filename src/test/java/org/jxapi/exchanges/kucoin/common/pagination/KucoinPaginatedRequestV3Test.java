package org.jxapi.exchanges.kucoin.common.pagination;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountLedgerFutures;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountLedgerFuturesPage;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountLedgersFuturesRequest;
import org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountLedgersFuturesResponse;

/**
 * Unit test class for {@link KucoinPaginatedRequestV3}.
 */
public class KucoinPaginatedRequestV3Test {

  @Test
  public void testSetNextPage() {
    KucoinPaginatedRequestV3 request = new KucoinAccountGetAccountLedgersFuturesRequest();
    Long off = 12345L;
    KucoinAccountGetAccountLedgersFuturesResponse response = new KucoinAccountGetAccountLedgersFuturesResponse();
    KucoinAccountLedgerFuturesPage page = KucoinAccountLedgerFuturesPage.builder()
        .hasMore(true)
        .addToDataList(KucoinAccountLedgerFutures.builder().offset(off).build())
        .build();
    response.setData(page);
    
    request.setNextPage(response);
    
    Assert.assertEquals(off, request.getOffset());
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSetNextPage_NullResponse() {
    KucoinPaginatedRequestV3 request = new KucoinAccountGetAccountLedgersFuturesRequest();
    request.setNextPage(null);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSetNextPage_NullResponsePage() {
    KucoinPaginatedRequestV3 request = new KucoinAccountGetAccountLedgersFuturesRequest();
    KucoinAccountGetAccountLedgersFuturesResponse response = new KucoinAccountGetAccountLedgersFuturesResponse();
    request.setNextPage(response);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSetNextPage_NullHasMoreInResponsePage() {
    KucoinPaginatedRequestV3 request = new KucoinAccountGetAccountLedgersFuturesRequest();
    KucoinAccountGetAccountLedgersFuturesResponse response = new KucoinAccountGetAccountLedgersFuturesResponse();
    response.setData(KucoinAccountLedgerFuturesPage.builder().build());
    request.setNextPage(response);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSetNextPage_FalseHasMoreInResponsePage() {
    KucoinPaginatedRequestV3 request = new KucoinAccountGetAccountLedgersFuturesRequest();
    KucoinAccountGetAccountLedgersFuturesResponse response = new KucoinAccountGetAccountLedgersFuturesResponse();
    response.setData(KucoinAccountLedgerFuturesPage.builder()
        .hasMore(false)
        .build());
    request.setNextPage(response);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSetNextPage_NullDataListInResponsePage() {
    KucoinPaginatedRequestV3 request = new KucoinAccountGetAccountLedgersFuturesRequest();
    KucoinAccountGetAccountLedgersFuturesResponse response = new KucoinAccountGetAccountLedgersFuturesResponse();
    response.setData(KucoinAccountLedgerFuturesPage.builder()
        .hasMore(true)
        .build());
    request.setNextPage(response);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testSetNextPage_EmptyDataListInResponsePage() {
    KucoinPaginatedRequestV3 request = new KucoinAccountGetAccountLedgersFuturesRequest();
    KucoinAccountGetAccountLedgersFuturesResponse response = new KucoinAccountGetAccountLedgersFuturesResponse();
    response.setData(KucoinAccountLedgerFuturesPage.builder()
        .hasMore(true)
        .dataList(List.of())
        .build());
    request.setNextPage(response);
  }

}

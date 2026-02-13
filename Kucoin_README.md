# Kucoin API Java wrapper

Kucoin Spot and futures API
<!-- BEGIN TABLE OF CONTENTS -->
  - [Kucoin API Java wrapper](#kucoin-api-java-wrapper)
      - [Quick start](#quick-start)
      - [Properties](#properties)
      - [Constants](#constants)
    - [API Groups](#api-groups)
      - [Account](#account)
        - [REST endpoints](#rest-endpoints)
      - [Affiliate](#affiliate)
        - [REST endpoints](#rest-endpoints)
      - [Convert](#convert)
        - [REST endpoints](#rest-endpoints)
      - [CopyTrading](#copytrading)
        - [REST endpoints](#rest-endpoints)
      - [Earn](#earn)
        - [REST endpoints](#rest-endpoints)
      - [Funding](#funding)
        - [REST endpoints](#rest-endpoints)
      - [FuturesMarketData](#futuresmarketdata)
        - [REST endpoints](#rest-endpoints)
        - [Websocket endpoints](#websocket-endpoints)
      - [FuturesTrading](#futurestrading)
        - [REST endpoints](#rest-endpoints)
        - [Websocket endpoints](#websocket-endpoints)
      - [Margin](#margin)
        - [REST endpoints](#rest-endpoints)
        - [Websocket endpoints](#websocket-endpoints)
      - [SpotMarketData](#spotmarketdata)
        - [REST endpoints](#rest-endpoints)
        - [Websocket endpoints](#websocket-endpoints)
      - [SpotTrading](#spottrading)
        - [REST endpoints](#rest-endpoints)
        - [Websocket endpoints](#websocket-endpoints)
      - [UAMarketData](#uamarketdata)
        - [REST endpoints](#rest-endpoints)
      - [VipLending](#viplending)
        - [REST endpoints](#rest-endpoints)
    - [Demo snippets](#demo-snippets)
      - [Endpoint demo snippets](#endpoint-demo-snippets)
        - [Account REST endpoints demo snippets:](#account-rest-endpoints-demo-snippets)
        - [Affiliate REST endpoints demo snippets:](#affiliate-rest-endpoints-demo-snippets)
        - [Convert REST endpoints demo snippets:](#convert-rest-endpoints-demo-snippets)
        - [CopyTrading REST endpoints demo snippets:](#copytrading-rest-endpoints-demo-snippets)
        - [Earn REST endpoints demo snippets:](#earn-rest-endpoints-demo-snippets)
        - [Funding REST endpoints demo snippets:](#funding-rest-endpoints-demo-snippets)
        - [FuturesMarketData REST endpoints demo snippets:](#futuresmarketdata-rest-endpoints-demo-snippets)
        - [FuturesMarketData Websocket endpoints demo snippets](#futuresmarketdata-websocket-endpoints-demo-snippets)
        - [FuturesTrading REST endpoints demo snippets:](#futurestrading-rest-endpoints-demo-snippets)
        - [FuturesTrading Websocket endpoints demo snippets](#futurestrading-websocket-endpoints-demo-snippets)
        - [Margin REST endpoints demo snippets:](#margin-rest-endpoints-demo-snippets)
        - [Margin Websocket endpoints demo snippets](#margin-websocket-endpoints-demo-snippets)
        - [SpotMarketData REST endpoints demo snippets:](#spotmarketdata-rest-endpoints-demo-snippets)
        - [SpotMarketData Websocket endpoints demo snippets](#spotmarketdata-websocket-endpoints-demo-snippets)
        - [SpotTrading REST endpoints demo snippets:](#spottrading-rest-endpoints-demo-snippets)
        - [SpotTrading Websocket endpoints demo snippets](#spottrading-websocket-endpoints-demo-snippets)
        - [UAMarketData REST endpoints demo snippets:](#uamarketdata-rest-endpoints-demo-snippets)
        - [VipLending REST endpoints demo snippets:](#viplending-rest-endpoints-demo-snippets)

<!-- END TABLE OF CONTENTS -->
See <a href="https://www.kucoin.com/docs">reference documentation</a>
### Quick start

This wrapper offers Java interfaces for using Kucoin API
Add maven dependency to your project, then you can use the wrapper by instantiating <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange.html">KucoinExchange</a> in your code:
``` java
import org.jxapi.exchanges.kucoin.gen.KucoinExchange;
import org.jxapi.exchanges.kucoin.gen.KucoinExchangeImpl;

public void call() {
  Properties properties = new Properties();
  // Set relevant configuration properties (see documentation) in 'props'
  KucoinExchange   exchange = new KucoinExchangeImpl(properties);
  // Access API groups and their endpoints through 'exchange' methods.
}
```
You may have a look at <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountAddSubAccountDemo.java">KucoinAccountAddSubAccountDemo</a> class for full usage example

### Properties

<table>
  <caption>Configuration properties</caption>
  <tr>
    <th>Name</th>
    <th>Type</th>
    <th>description</th>
    <th>Default value</th>
  </tr>
  <tr>
    <td>apiKey</td>
    <td>STRING</td>
    <td>Kucoin spot trading API Key</td>
    <td></td>
  </tr>
  <tr>
    <td>apiSecret</td>
    <td>STRING</td>
    <td>Kucoin spot trading API secret</td>
    <td></td>
  </tr>
  <tr>
    <td>apiPassphrase</td>
    <td>STRING</td>
    <td>Kucoin spot trading API passphrase</td>
    <td></td>
  </tr>
  <tr>
    <td>futuresApiKey</td>
    <td>STRING</td>
    <td>Kucoin futures trading API Key</td>
    <td></td>
  </tr>
  <tr>
    <td>futuresApiSecret</td>
    <td>STRING</td>
    <td>Kucoin futures trading API secret</td>
    <td></td>
  </tr>
  <tr>
    <td>futuresApiPassphrase</td>
    <td>STRING</td>
    <td>Kucoin futures trading API passphrase</td>
    <td></td>
  </tr>
  <tr>
    <td>vipLevel</td>
    <td>STRING</td>
    <td>Kucoin VIP level of this account, used to configure REST endpoint rate limits as according to <a href="https://www.kucoin.com/docs/basic-info/request-rate-limit/rest-api">REST rate limit 2.0</a>
    <p>
    Should be one of:
    <ul>
      <li><i>VIP1</i></li>
      <li><i>VIP2</i></li>
      <li><i>VIP3</i></li>
      <li><i>VIP4</i></li>
      <li><i>VIP5</i></li>
      <li><i>VIP6</i></li>
      <li><i>VIP7</i></li>
      <li><i>VIP8</i></li>
      <li><i>VIP9</i></li>
      <li><i>VIP10</i></li>
      <li><i>VIP11</i></li>
      <li><i>VIP12</i></li>
    </ul>
    Default is <i>VIP0</i>.</td>
    <td>VIP0</td>
  </tr>
</table>
Some demo configuration properties are available to tune common request parameters used in demo snippets, as <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/KucoinDemoProperties.java">KucoinDemoProperties</a> class.
 These properties are used to configure default values for request parameters used in demo snippets.

In order to run demo snippets, you can uncomment and set properties values in __demo-Kucoin.properties__ properties file you create from .dist template in src/test/resources folder.


### Constants

Some useful constants are defined in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinConstants.html">KucoinConstants</a>

## API Groups
APIs are available using the following interfaces accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange.html">KucoinExchange</a> interface

### Account
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html">KucoinAccountApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinAccountApi().html">KucoinExchange#getKucoinAccountApi()</a>

Kucoin account and sub-account related APIs

#### REST endpoints

<table>
  <caption>Kucoin Account REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#addSubAccount(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountAddSubAccountRequest)">addSubAccount</a></td>
    <td>This endpoint can be used to create sub-accounts. <p><i>This interface is only for cancellation requests. The cancellation result needs to be obtained by querying the order status or subscribing to websocket. It is recommended that you DO NOT cancel the order until receiving the Open message, otherwise the order cannot be cancelled successfully.</i></p>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/sub-account/add-subaccount">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#addSubAccountFuturesPermission(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountAddSubAccountFuturesPermissionRequest)">addSubAccountFuturesPermission</a></td>
    <td>This endpoint can be used to add sub-accounts Futures permission.  Before using this endpoints, you need to ensure that the master account apikey has Futures permissions and the Futures function has been activated.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/sub-account/add-subaccount-futures-permission">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#addSubAccountMarginPermission(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountAddSubAccountMarginPermissionRequest)">addSubAccountMarginPermission</a></td>
    <td>This endpoint can be used to add sub-accounts Margin permission.  Before using this endpoints, you need to ensure that the master account apikey has Margin permissions and the Margin function has been activated.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/sub-account/add-subaccount-margin-permission">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#getAccountDetailSpotMarginTradeHf(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountDetailSpotMarginTradeHfRequest)">getAccountDetailSpotMarginTradeHf</a></td>
    <td>Information for a single account. Use this endpoint when you know the accountId.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/account-funding/get-account-detail-spot">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#getAccountLedgersFutures(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountLedgersFuturesRequest)">getAccountLedgersFutures</a></td>
    <td>Get Account Ledgers - Futures This API endpoint returns all transfer (in and out) records in futures account and supports multi-coin queries. The query results are sorted in descending order by createdAt and id. If there are open positions, the status of the first page returned will be Pending, indicating the realised profit and loss in the current 8-hour settlement period. Please specify the minimum offset number of the current page into the offset field to turn the page.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/account-funding/get-account-ledgers-futures">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#getAccountLedgerMarginHf(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountLedgerMarginHfRequest)">getAccountLedgerMarginHf</a></td>
    <td>Get Account Ledgers - trade_hf This API endpoint returns all transfer (in and out) records in high-frequency trading account and supports multi-coin queries. The query results are sorted in descending order by createdAt and id.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/account-funding/get-account-ledgers-marginhf">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#getAccountLedgersSpotMargin(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountLedgersSpotMarginRequest)">getAccountLedgersSpotMargin</a></td>
    <td>Get Account Ledgers - Spot/Margin</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/account-funding/get-account-ledgers-spot-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#getAccountLedgerTradeHf(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountLedgerTradeHfRequest)">getAccountLedgerTradeHf</a></td>
    <td>Get Account Ledgers - trade_hf This API endpoint returns all transfer (in and out) records in high-frequency trading account and supports multi-coin queries. The query results are sorted in descending order by createdAt and id.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/account-funding/get-account-ledgers-tradehf">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#getAccountListSpotMarginTradeHf(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAccountListSpotMarginTradeHfRequest)">getAccountListSpotMarginTradeHf</a></td>
    <td>Get a list of accounts. Please deposit funds to the main account firstly, then transfer the funds to the trade account via Inner Transfer before transaction.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/account-funding/get-account-list-spot">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#getAccountSummaryInfo()">getAccountSummaryInfo</a></td>
    <td>This endpoint can be used to obtain account summary information.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/account-funding/get-account-summary-info">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#getAllSubAccountsInfo(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetAllSubAccountsInfoRequest)">getAllSubAccountsInfo</a></td>
    <td>This endpoint can be used to get paginated sub-account information. Pagination is required.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/sub-account/get-subaccount-list-summary-info">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#getSubAccountDetailBalance(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetSubAccountDetailBalanceRequest)">getSubAccountDetailBalance</a></td>
    <td>This endpoint returns the account info of a sub-user specified by the subUserId.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/sub-account/get-subaccount-detail-balance">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/account/KucoinAccountApi.html#getSubAccountListSpotBalance(org.jxapi.exchanges.kucoin.gen.account.pojo.KucoinAccountGetSubAccountListSpotBalanceRequest)">getSubAccountListSpotBalance</a></td>
    <td>This endpoint returns the account info of all sub-users.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/sub-account/get-subaccount-list-spot-balance-v2">link</a></td>
  </tr>
</table>
### Affiliate
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/affiliate/KucoinAffiliateApi.html">KucoinAffiliateApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinAffiliateApi().html">KucoinExchange#getKucoinAffiliateApi()</a>

The KuCoin Partner Program, where users can earn commissions by referring new users to KuCoin through a unique referral link.


#### REST endpoints

<table>
  <caption>Kucoin Affiliate REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/affiliate/KucoinAffiliateApi.html#getCommission(org.jxapi.exchanges.kucoin.gen.affiliate.pojo.KucoinAffiliateGetCommissionRequest)">getCommission</a></td>
    <td>Get affiliate commission information.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3474057e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/affiliate/KucoinAffiliateApi.html#getInvited(org.jxapi.exchanges.kucoin.gen.affiliate.pojo.KucoinAffiliateGetInvitedRequest)">getInvited</a></td>
    <td>To obtain affiliate user invited information.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3474055e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/affiliate/KucoinAffiliateApi.html#getTradeHistory(org.jxapi.exchanges.kucoin.gen.affiliate.pojo.KucoinAffiliateGetTradeHistoryRequest)">getTradeHistory</a></td>
    <td>This endpoint allows you to obtain trade history information for an invitee.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3474062e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/affiliate/KucoinAffiliateApi.html#getTransaction(org.jxapi.exchanges.kucoin.gen.affiliate.pojo.KucoinAffiliateGetTransactionRequest)">getTransaction</a></td>
    <td>This endpoint allows users to retrieve transaction information by time.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3474738e0">link</a></td>
  </tr>
</table>
### Convert
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html">KucoinConvertApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinConvertApi().html">KucoinExchange#getKucoinConvertApi()</a>

Kucoin convert (currency swapi) API, see <a href="https://www.kucoin.com/docs-new/rest/convert/introduction">Convert API Documentation</a>

#### REST endpoints

<table>
  <caption>Kucoin Convert REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#addConvertLimitOrder(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertAddConvertLimitOrderRequest)">addConvertLimitOrder</a></td>
    <td>Place Convert Limit Order</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/add-convert-limit-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#addConvertOrder(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertAddConvertOrderRequest)">addConvertOrder</a></td>
    <td>The trade endpoint is used to accept a quote and execute a trade.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/add-convert-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#cancelConvertLimitOrder(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertCancelConvertLimitOrderRequest)">cancelConvertLimitOrder</a></td>
    <td>Cancel convert limit order</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/cancel-convert-limit-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#getConvertCurrencies(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertGetConvertCurrenciesRequest)">getConvertCurrencies</a></td>
    <td>Get all convert currencies.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/get-convert-currencies">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#getConvertLimitOrderDetail(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertGetConvertLimitOrderDetailRequest)">getConvertLimitOrderDetail</a></td>
    <td>Query convert limit order detail</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/get-convert-limit-order-detail">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#getConvertLimitOrders(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertGetConvertLimitOrdersRequest)">getConvertLimitOrders</a></td>
    <td>Query Active and Historical Convert Limit Orders</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/get-convert-limit-orders">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#getConvertLimitQuote(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertGetConvertLimitQuoteRequest)">getConvertLimitQuote</a></td>
    <td>Query the protection price threshold for limit orders for convert, user's order price must be ≥ the protection price</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/get-convert-limit-quote">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#getConvertOrderDetail(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertGetConvertOrderDetailRequest)">getConvertOrderDetail</a></td>
    <td>Query convert market order details</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/get-convert-order-detail">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#getConvertOrderHistory(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertGetConvertOrderHistoryRequest)">getConvertOrderHistory</a></td>
    <td>Query convert market order history</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/get-convert-order-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#getConvertQuote(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertGetConvertQuoteRequest)">getConvertQuote</a></td>
    <td>Request a quote to convert stablecoins and other base currencies.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/get-convert-quote">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/convert/KucoinConvertApi.html#getConvertSymbol(org.jxapi.exchanges.kucoin.gen.convert.pojo.KucoinConvertGetConvertSymbolRequest)">getConvertSymbol</a></td>
    <td>Get all convert trade symbol.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/convert/get-Coconvert-symbol">link</a></td>
  </tr>
</table>
### CopyTrading
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html">KucoinCopyTradingApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinCopyTradingApi().html">KucoinExchange#getKucoinCopyTradingApi()</a>

Kucoin Copy Trading API

#### REST endpoints

<table>
  <caption>Kucoin CopyTrading REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#addIsolatedMargin(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingAddIsolatedMarginRequest)">addIsolatedMargin</a></td>
    <td>Add isolated margin manually.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/add-isolated-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#addOrder(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingAddOrderRequest)">addOrder</a></td>
    <td>You can place two types of orders: limit and market. Orders can only be placed if your account has sufficient funds. Once an order is placed, your funds will be put on hold for the duration of the order. The amount of funds on hold depends on the order type and parameters specified. <br/>Please be noted that the system would hold the fees from the orders entered the orderbook in advance. Read Get Fills to learn more.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/add-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#addOrderTest(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingAddOrderRequest)">addOrderTest</a></td>
    <td>You can place two types of orders: limit and market. Orders can only be placed if your account has sufficient funds. Once an order is placed, your funds will be put on hold for the duration of the order. The amount of funds on hold depends on the order type and parameters specified. <br/>Please be noted that the system would hold the fees from the orders entered the orderbook in advance. Read Get Fills to learn more.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/add-order-test">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#addTPSLOrder(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingAddTPSLOrderRequest)">addTPSLOrder</a></td>
    <td>Add a Take Profit and Stop Loss order.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/add-take-profit-and-stop-loss-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#cancelOrderByClientOid(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingCancelOrderByClientOidRequest)">cancelOrderByClientOid</a></td>
    <td>Cancel an order by clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/cancel-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#cancelOrderByOrderId(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingCancelOrderByOrderIdRequest)">cancelOrderByOrderId</a></td>
    <td>Cancel an order.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/cancel-order-by-orderid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#getCrossMarginRequirement(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingGetCrossMarginRequirementRequest)">getCrossMarginRequirement</a></td>
    <td>This endpoint supports querying the cross margin requirements of a symbol by position value.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3475555e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#getMaxOpenSize(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingGetMaxOpenSizeRequest)">getMaxOpenSize</a></td>
    <td>Get the maximum open position size for a contract.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/get-max-open-size">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#getMaxWithdrawMargin(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingGetMaxWithdrawMarginRequest)">getMaxWithdrawMargin</a></td>
    <td>Query the maximum amount of margin that can be withdrawn from a current position.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/get-max-withdraw-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#modifyCrossMarginLeverage(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingModifyCrossMarginLeverageRequest)">modifyCrossMarginLeverage</a></td>
    <td>This interface can modify the current symbol’s cross-margin leverage multiple.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3475554e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#modifyIsolatedMarginAutoDepositStatus(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingModifyIsolatedMarginAutoDepositStatusRequest)">modifyIsolatedMarginAutoDepositStatus</a></td>
    <td>Modify the auto-deposit margin status for a specific trading symbol in isolated margin mode.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/modify-isolated-margin-auto-deposit-status">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#modifyIsolatedMarginRiskLimit(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingModifyIsolatedMarginRiskLimitRequest)">modifyIsolatedMarginRiskLimit</a></td>
    <td>Modify the risk limit for an isolated margin position.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/modify-isolated-margin-risk-limit">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#removeIsolatedMargin(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingRemoveIsolatedMarginRequest)">removeIsolatedMargin</a></td>
    <td>Remove Isolated Margin Manually.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/copy-trading/remove-isolated-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#switchMarginMode(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingSwitchMarginModeRequest)">switchMarginMode</a></td>
    <td>Modify the margin mode of the current symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3475552e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/copytrading/KucoinCopyTradingApi.html#switchPositionMode(org.jxapi.exchanges.kucoin.gen.copytrading.pojo.KucoinCopyTradingSwitchPositionModeRequest)">switchPositionMode</a></td>
    <td>This endpoint is used to toggle between one-way mode and hedge mode for the position mode, which applies to all futures trading pairs.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3475556e0">link</a></td>
  </tr>
</table>
### Earn
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html">KucoinEarnApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinEarnApi().html">KucoinExchange#getKucoinEarnApi()</a>

Kucoin Earn related APIs

#### REST endpoints

<table>
  <caption>Kucoin Earn REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#getAccountHolding(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnGetAccountHoldingRequest)">getAccountHolding</a></td>
    <td>This endpoint allows you to retrieve information about your currently held assets.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/earn/get-account-holding">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#getDualInvestmentProducts(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnGetDualInvestmentProductsRequest)">getDualInvestmentProducts</a></td>
    <td>Retrieves available dual investment products.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3474370e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#getEarnRedeemPreviewByHoldingId(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnGetEarnRedeemPreviewByHoldingIdRequest)">getEarnRedeemPreviewByHoldingId</a></td>
    <td>This endpoint retrieves redemption preview information by holding ID. If the current holding is fully redeemed or in the process of being redeemed, it indicates that the holding does not exist.
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/earn/general/get-earn-redeem-preview-by-holding-id">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#getEthStakingProducts(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnGetEthStakingProductsRequest)">getEthStakingProducts</a></td>
    <td>Retrieves available ETH staking products. Returns an empty list if no products are available.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/earn/get-eth-staking-products">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#getKcsStakingProducts(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnGetKcsStakingProductsRequest)">getKcsStakingProducts</a></td>
    <td>Retrieves available KCS staking products. Returns an empty list if no products are available.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/earn/get-kcs-staking-products">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#getPromotionProducts(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnGetPromotionProductsRequest)">getPromotionProducts</a></td>
    <td>This endpoint allows you to obtain available limited-duration products. If no products are available, an empty list is returned.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/earn/get-promotion-products">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#getSavingProducts(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnGetSavingProductsRequest)">getSavingProducts</a></td>
    <td>This endpoint allows you to retrieve a list of available savings products. If no products are available, an empty list is returned.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/earn/get-savings-products">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#getStakingProducts(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnGetStakingProductsRequest)">getStakingProducts</a></td>
    <td>This endpoint allows you to retrieve available staking products. If no products are available, an empty list is returned.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/earn/get-staking-products">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#getStructuredProductOrders(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnGetStructuredProductOrdersRequest)">getStructuredProductOrders</a></td>
    <td>This endpoint allows you to query your structured product orders.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3474371e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#purchaseStructuredProduct(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnPurchaseStructuredProductRequest)">purchaseStructuredProduct</a></td>
    <td>Allows you to subscribe to Struct-Earn products.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3474372e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#redeem(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnRedeemRequest)">redeem</a></td>
    <td>This endpoint allows initiating redemption by holding ID. If the current holding is fully redeemed or in the process of being redeemed, it indicates that the holding does not exist.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/earn/redeem">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/earn/KucoinEarnApi.html#subscribeToEarnFixedIncomeProducts(org.jxapi.exchanges.kucoin.gen.earn.pojo.KucoinEarnSubscribeToEarnFixedIncomeProductsRequest)">subscribeToEarnFixedIncomeProducts</a></td>
    <td>Subscribe to Earn (Fixed Income Products). If the subscription fails, it returns the corresponding error code.
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/earn/general/subscribe-to-earn-fixed-income-products">link</a></td>
  </tr>
</table>
### Funding
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html">KucoinFundingApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinFundingApi().html">KucoinExchange#getKucoinFundingApi()</a>

Kucoin funding related APIs. Includes overview, deposit, withdrawal, transfer and trade fees APIs.

#### REST endpoints

<table>
  <caption>Kucoin Funding REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#addDepositAddressV3(org.jxapi.exchanges.kucoin.gen.funding.pojo.KucoinFundingAddDepositAddressV3Request)">addDepositAddressV3</a></td>
    <td>Request via this endpoint to create a deposit address for a currency you intend to deposit.
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/funding/deposit/create-deposit-address-v3-">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#applyWithdrawV3(org.jxapi.exchanges.kucoin.gen.funding.pojo.KucoinFundingApplyWithdrawV3Request)">applyWithdrawV3</a></td>
    <td><strong>TIP</strong>: On the WEB end, you can open the switch of specified favorite addresses for withdrawal, and when it is turned on, it will verify whether  your withdrawal address(including chain) is a favorite address(it is case sensitive); if it fails validation, it will respond with the  error message {"msg":"Already set withdraw whitelist, this address is not favorite address","code":"260325"}.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/withdrawals/withdraw-v3">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#cancelWithdrawal(java.lang.String)">cancelWithdrawal</a></td>
    <td><strong>TIP</strong>: On the WEB end, you can open the switch of specified favorite addresses for withdrawal, and when it is turned on, it will verify whether  your withdrawal address(including chain) is a favorite address(it is case sensitive); if it fails validation, it will respond with the  error message {"msg":"Already set withdraw whitelist, this address is not favorite address","code":"260325"}.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/withdrawals/cancel-withdrawal">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#flexTransfer(org.jxapi.exchanges.kucoin.gen.funding.pojo.KucoinFundingFlexTransferRequest)">flexTransfer</a></td>
    <td>Use this endpoint to perform Flex Transfer.<br> <ul>
      <li> 1 - The API Key needs to have universal transfer permission when calling.
      <li> 2 - Support internal transfer, do not support transfers between sub-accounts.
      <li> 3 - Support transfer between master and sub accounts (only applicable to master account APIKey).
      <li> 4 - MARGIN_V2 only supports internal transfers between MARGIN and does not support transfers between master and sub accounts.
      <li> 5 - ISOLATED_V2 only supports internal transfers between ISOLATED and does not support transfers between master and sub accounts.
    </ul>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/transfer/flex-transfer">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getAccountDetailCrossMargin(org.jxapi.exchanges.kucoin.gen.funding.pojo.KucoinFundingGetAccountDetailCrossMarginRequest)">getAccountDetailCrossMargin</a></td>
    <td>Information for a single account. Use this endpoint when you know the accountId.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/account-funding/get-account-cross-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getAccountDetailIsolatedMargin(org.jxapi.exchanges.kucoin.gen.funding.pojo.KucoinFundingGetAccountDetailIsolatedMarginRequest)">getAccountDetailIsolatedMargin</a></td>
    <td>Information for a single account. Use this endpoint when you know the accountId.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/account-funding/get-account-isolated-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getAccountDetailsFutures(java.lang.String)">getAccountDetailsFutures</a></td>
    <td>Get account overview.<br/>See <a href="https://docs.kucoin.com/futures/#get-account-overview">API</a>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/account-funding/get-account-futures">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getActualFeeFutures(java.lang.String)">getActualFeeFutures</a></td>
    <td>This interface is for the actual fee rate of the futures trading pair.  The fee rate of your sub-account is the same as that of the master account.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/trade-fee/get-actual-fee-futures">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getActualFeeSpotMarginTradeHf(java.lang.String)">getActualFeeSpotMarginTradeHf</a></td>
    <td>This interface is for the actual fee rate of the trading pair.  You can inquire about fee rates of 10 trading pairs each time at most.  The fee rate of your sub-account is the same as that of the master account.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/trade-fee/get-actual-fee-spot-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getAllSubAccountBalanceFutures(java.lang.String)">getAllSubAccountBalanceFutures</a></td>
    <td>Get account overview.<br/>See <a href="https://docs.kucoin.com/futures/#get-account-overview">API</a>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/sub-account/get-subaccount-list-futures-balance-v2">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getBasicFeeSpotMargin(java.lang.String)">getBasicFeeSpotMargin</a></td>
    <td>This interface is for the basic fee rate of users
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/trade-fee/get-basic-fee-spot-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getDepositAddressV3(org.jxapi.exchanges.kucoin.gen.funding.pojo.KucoinFundingGetDepositAddressV3Request)">getDepositAddressV3</a></td>
    <td>Get a deposit address for the currency you intend to deposit. If the returned data is null, you may need to  <a href="https://www.kucoin.com/docs/rest/funding/deposit/create-deposit-address-v3-">Create Deposit Address first</a>. <strong>Notice</strong> This interface has been abandoned. Please use the v3 interface to apply for a deposit address.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/deposit/get-deposit-address-v3">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getDepositHistory(org.jxapi.exchanges.kucoin.gen.funding.pojo.KucoinFundingGetDepositHistoryRequest)">getDepositHistory</a></td>
    <td>Request via this endpoint to get deposit list Items are paginated and sorted to show the latest first.  See the <a href="https://www.kucoin.com/docs/basic-info/connection-method/pager/introduction">Pagination</a> section for retrieving additional entries after the first page.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/deposit/get-deposit-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getWithdrawalsList(org.jxapi.exchanges.kucoin.gen.funding.pojo.KucoinFundingGetWithdrawalsListRequest)">getWithdrawalsList</a></td>
    <td>Request via this endpoint to get deposit list. Items are paginated See the <a href="https://www.kucoin.com/docs/basic-info/connection-method/pager/introduction">Pagination</a> section for retrieving additional entries after the first page.
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/funding/withdrawals/get-withdrawals-list">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/funding/KucoinFundingApi.html#getWithdrawalsQuotas(org.jxapi.exchanges.kucoin.gen.funding.pojo.KucoinFundingGetWithdrawalsQuotasRequest)">getWithdrawalsQuotas</a></td>
    <td>Request via this endpoint to get withdrawal quotas. The response includes the available withdrawal amount, remaining amount available to withdraw the current day, minimum withdrawal amount, 24-hour total withdrawal limit, equivalent to BTC, fees for internal withdrawal, the estimated BTC amount (based on the daily fiat limit) that can be withdrawn within the current day, and whether the withdraw function is enabled or not. See the <a href="https://www.kucoin.com/docs/basic-info/connection-method/pager/introduction">Pagination</a> section for retrieving additional entries after the first page.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/account-info/withdrawals/get-withdrawal-quotas">link</a></td>
  </tr>
</table>
### FuturesMarketData
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html">KucoinFuturesMarketDataApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinFuturesMarketDataApi().html">KucoinExchange#getKucoinFuturesMarketDataApi()</a>

Kucoin Futures market data API

#### REST endpoints

<table>
  <caption>Kucoin FuturesMarketData REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#applyConnectTokenPublic()">applyConnectTokenPublic</a></td>
    <td>You need to apply for one of the two tokens below to create a websocket connection.</td>
    <td><a href="https://www.kucoin.com/docs-new/websocket-api/base-info/get-public-token-futures">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#get24hStats()">get24hStats</a></td>
    <td>Get 24-hour platform futures trading volume</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-24hr-stats">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getSymbolsList()">getSymbolsList</a></td>
    <td>Submit request to get the info of all open futures contracts.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-all-symbols">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getAllTickers()">getAllTickers</a></td>
    <td>The real-time ticker includes the last traded price, the last traded size, transaction ID, the side of liquidity taker, the best bid price and size, the best ask price and size as well as the transaction time of the orders. These messages can also be obtained through Websocket. The Sequence Number is used to judge whether the messages pushed by Websocket is continuous.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-all-tickers">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getCurrentFundingRate(org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataGetCurrentFundingRateRequest)">getCurrentFundingRate</a></td>
    <td>Get the current funding rate for a symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/funding-fees/get-current-funding-rate">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getFullOrderBook(java.lang.String)">getFullOrderBook</a></td>
    <td>Get a snapshot of aggregated open orders for a symbol.<br> Level 2 order book includes all bids and asks (aggregated by price).  This level returns only one aggregated size for each price (as if there was only one single order for that price).<br> This API will return data with full depth.<br> It is generally used by professional traders because it uses more server resources and traffic, and we have strict access frequency control.<br> To maintain up-to-date Order Book, please use Websocket incremental feed after retrieving the Level 2 snapshot.<br> In the returned data, the sell side is sorted low to high by price and the buy side is sorted high to low by price.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-full-orderbook">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getInterestRateIndex(org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataGetInterestRateIndexRequest)">getInterestRateIndex</a></td>
    <td>Check interest rate list.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-interest-rate-index">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getKLines(org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataGetKLinesRequest)">getKLines</a></td>
    <td><strong>Explanation</strong><br> <ul> <li>The granularity (granularity parameter of K-line) represents the number of minutes, the available granularity scope is:  1,5,15,30,60,120,240,480,720,1440,10080. Requests beyond the above range will be rejected. <li>The maximum size per request is 500. If the specified start/end time and the time granularity exceeds the maximum size  allowed for a single request, the system will only return 500 pieces of data for your request.  If you want to get fine-grained data in a larger time range, you will need to specify the time ranges and make multiple requests for multiple times. <li>If you’ve specified only the start time in your request, the system will return 500 pieces of data from the specified start time to the current time of the system;  If only the end time is specified, the system will return 500 pieces of data closest to the end time; If neither the start time nor the end time is specified,  the system will return the 500 pieces of data closest to the current time of the system. </ul>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-klines">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getMarkPrice(org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataGetMarkPriceRequest)">getMarkPrice</a></td>
    <td>Get current mark price of the contract.<br> <strong>Explanation</strong><br> <ul> <li>Mark price is used to calculate unrealized profit and loss, and is used as a reference for liquidation price.</li> <li>Index price is used to calculate the mark price, which is the weighted average of the last traded price of the top exchanges.</li> </ul></td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-mark-price">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getPartOrderBook100(java.lang.String)">getPartOrderBook100</a></td>
    <td>This interface can obtain the order data of the specified contract.<br> The buy and sell orders on the order book are aggregated according to the price, and only one  pending order volume aggregated according to the price is returned under each price.<br> This interface will only return part of the order data, level2_20 means to return 20 pieces of  data for each buy and sell, and level_100 means to return 100 pieces of data for each buy and sell.  It is recommended that you use this interface, because the response speed is faster and the  traffic consumption is small.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-part-orderbook">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getPartOrderBook20(java.lang.String)">getPartOrderBook20</a></td>
    <td>This interface can obtain the order data of the specified contract.<br> The buy and sell orders on the order book are aggregated according to the price, and only one  pending order volume aggregated according to the price is returned under each price.<br> This interface will only return part of the order data, level2_20 means to return 20 pieces of  data for each buy and sell, and level_100 means to return 100 pieces of data for each buy and sell.  It is recommended that you use this interface, because the response speed is faster and the  traffic consumption is small.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-part-orderbook">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getPremiumIndex(org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataGetPremiumIndexRequest)">getPremiumIndex</a></td>
    <td>Get index list.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-premium-index">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getPrivateFundingHistory(org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataGetPrivateFundingHistoryRequest)">getPrivateFundingHistory</a></td>
    <td>Query the funding rate at each settlement time point within a certain time range of the corresponding contract.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/funding-fees/get-private-funding-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getPublicFundingHistory(org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataGetPublicFundingHistoryRequest)">getPublicFundingHistory</a></td>
    <td>Query the funding rate at each settlement time point within a certain time range of the corresponding contract.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/funding-fees/get-public-funding-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getServerTime()">getServerTime</a></td>
    <td>Get the API server time. This is the Unix timestamp.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-server-time">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getServiceStatus()">getServiceStatus</a></td>
    <td>Get the service status.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-service-status">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getSpotIndexPrice(org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataGetSpotIndexPriceRequest)">getSpotIndexPrice</a></td>
    <td>Get index list.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-spot-index-price">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getSymbol(java.lang.String)">getSymbol</a></td>
    <td>Submit request to get the info of a specific futures open contract.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-symbol">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getTicker(java.lang.String)">getTicker</a></td>
    <td>The real-time ticker includes the last traded price, the last traded size, transaction ID, the side of liquidity taker, the best bid price and size, the best ask price and size as well as the transaction time of the orders. These messages can also be obtained through Websocket. The Sequence Number is used to judge whether the messages pushed by Websocket is continuous.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-ticker">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#getTransactionHistory(java.lang.String)">getTransactionHistory</a></td>
    <td>List the last 100 trades for a symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/market-data/get-trade-history">link</a></td>
  </tr>
</table>

#### Websocket endpoints

<table>
  <caption>Kucoin FuturesMarketData websocket endpoints</caption>
  <tr>
    <th>Subscription method</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#subscribeFundingFeeSettlement(java.lang.String)">subscribeFundingFeeSettlement</a></td>
    <td>Subscribe this topic to get Funding Fee Settlement.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470084w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#subscribeInstrument(java.lang.String)">subscribeInstrument</a></td>
    <td>Subscribe to this topic to get the market data of the contract.</td>
    <td><a href="https://www.kucoin.com/docs/websocket/futures-trading/public-channels/contract-market-data">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#subscribeKlines(org.jxapi.exchanges.kucoin.gen.futuresmarketdata.pojo.KucoinFuturesMarketDataKlinesRequest)">subscribeKlines</a></td>
    <td>Subscribe to this topic to get K-Line data. If there is no change in the market, data will not be pushed. The 'type' in the topic is to get the kline granuarity and can have following values: 1min, 3min, 5min, 15min, 30min, 1hour, 2hour, 4hour, 8hour, 12hour, 1day, 1week, 1month
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470086w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#subscribeOrderBookIncrement(java.lang.String)">subscribeOrderBookIncrement</a></td>
    <td>The system will return the increment change orderbook data(All depth). If there is no change in the market, data will not be pushed.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470082w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#subscribeOrderbookLevel5(java.lang.String)">subscribeOrderbookLevel5</a></td>
    <td>The system will return the 5 best ask/bid orders data. If there is no change in the market, data will not be pushed.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470083w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#subscribeOrderbookLevel50(java.lang.String)">subscribeOrderbookLevel50</a></td>
    <td>The system will return the 50 best ask/bid orders data. If there is no change in the market, data will not be pushed.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470097w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#subscribeSymbolSnapshot(java.lang.String)">subscribeSymbolSnapshot</a></td>
    <td>Subscribe this topic to get the statistics event of a symbol intervally, including 24h transaction volume,price change, etc.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470089w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#subscribeTickerV1(java.lang.String)">subscribeTickerV1</a></td>
    <td>Subscribe this topic to get the realtime push of BBO changes. The ticker channel provides real-time price updates whenever a match happens. If multiple orders are matched at the same time, only the last matching event will be pushed. It is not recommended to use this topic any more. For real-time ticker information, please subscribe /contractMarket/tickerV2:{symbol}.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470081w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#subscribeTickerV2(java.lang.String)">subscribeTickerV2</a></td>
    <td>Subscribe to this topic to get the real-time push of BBO changes. After subscription, when there are changes in the order book, the system will push the real-time ticker symbol information to you. It is recommended to use the new topic for timely information. Returned for every 100 milliseconds at most.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470080w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/KucoinFuturesMarketDataApi.html#subscribeTrade(java.lang.String)">subscribeTrade</a></td>
    <td>For each order executed, the system will send you the match messages in the format as following.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470084w0">link</a></td>
  </tr>
</table>
### FuturesTrading
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html">KucoinFuturesTradingApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinFuturesTradingApi().html">KucoinExchange#getKucoinFuturesTradingApi()</a>

Kucoin Futures trading API

#### REST endpoints

<table>
  <caption>Kucoin FuturesTrading REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#addIsolatedMargin(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingAddIsolatedMarginRequest)">addIsolatedMargin</a></td>
    <td>Add isolated margin manually.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/add-isolated-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#addOrder(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesAddOrderRequest)">addOrder</a></td>
    <td>You can place two types of orders: limit and market. Orders can only be placed if your account has sufficient funds. Once an order is placed, your funds will be put on hold for the duration of the order. The amount of funds on hold depends on the order type and parameters specified. <br/>Please be noted that the system would hold the fees from the orders entered the orderbook in advance. Read Get Fills to learn more.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/orders/add-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#addOrderTest(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesAddOrderRequest)">addOrderTest</a></td>
    <td>You can place two types of orders: limit and market. Orders can only be placed if your account has sufficient funds. Once an order is placed, your funds will be put on hold for the duration of the order. The amount of funds on hold depends on the order type and parameters specified. <br/>Please be noted that the system would hold the fees from the orders entered the orderbook in advance. Read Get Fills to learn more.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/orders/add-order-test">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#applyConnectTokenPrivate()">applyConnectTokenPrivate</a></td>
    <td>For private channels and messages (e.g. account balance notice), please make a request as follows after authorization to obtain the server list and authorized token.
    </td>
    <td><a href="https://www.kucoin.com/docs/websocket/basic-info/apply-connect-token/private-channels-authentication-request-required-">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#batchCancelOrders(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingBatchCancelOrdersRequest)">batchCancelOrders</a></td>
    <td>Using this endpoint, orders can be canceled in batches.<br> Supports batch cancellation of orders by orderId or clientOid. When orderIdsList and clientOidsList are used at the same time, orderIdsList shall prevail. A maximum of 10 orders can be canceled at a time.<br> When using orderId to cancel order, the response will return the orderId.<br> When using clientOid to cancel order, the response will return the clientOid.<br> etc.), then an error response will indicate the reason in the message field.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470241e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#cancelAllOrders(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingCancelAllOrdersRequest)">cancelAllOrders</a></td>
    <td>Using this endpoint, all open orders (excluding stop orders) can be canceled in batches. The response is a list of orderIDs of the canceled orders.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/orders/cancel-all-orders">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#cancelOrderByClientOid(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingCancelOrderByClientOidRequest)">cancelOrderByClientOid</a></td>
    <td>Cancel an order (including a stop order).<br> You will receive success message once the system has received the cancellation request. The cancellation request will be processed by matching engine in sequence. To know if the request has been processed, you may check the order status or update message from the pushes.<br> Response the ID created by the client (clientOid).<br> If the order can not be canceled (already filled or previously canceled, etc), then an error response will indicate the reason in the message field.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/orders/cancel-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#cancelOrderByOrderId(java.lang.String)">cancelOrderByOrderId</a></td>
    <td>Cancel an order (including a stop order).<br/> You will receive a success message once the system has received the cancellation request. The cancellation request will be processed by the matching engine in sequence. To know if the request has been processed, you may check the order status or update message from the pushes.<br/>The order ID is the server-assigned order ID, not the specified clientOid.<br/>If the order cannot be canceled (already filled or previously canceled, etc.), then an error response will indicate the reason in the message field.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/orders/cancel-order-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getOpenOrderValue(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetOpenOrderValueRequest)">getOpenOrderValue</a></td>
    <td>Query the total number and value of all your active orders for a symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/est/futures-trading/orders/get-open-order-value">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getCrossMarginLeverage(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetCrossMarginLeverageRequest)">getCrossMarginLeverage</a></td>
    <td>Query the current symbol's cross-margin leverage multiple.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/get-cross-margin-leverage">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getTradeHistory(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetTradeHistoryRequest)">getTradeHistory</a></td>
    <td>Get a list of recent fills.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/est/futures-trading/orders/get-trade-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getIsolatedMarginRiskLimit(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetIsolatedMarginRiskLimitRequest)">getIsolatedMarginRiskLimit</a></td>
    <td>Obtain risk limit levels for a specific contract.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/get-isolated-margin-risk-limit">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getMarginMode(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetMarginModeRequest)">getMarginMode</a></td>
    <td>Query the margin mode of a symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/get-margin-mode">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getMaxOpenSize(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetMaxOpenSizeRequest)">getMaxOpenSize</a></td>
    <td>Get the maximum open position size for a contract.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/get-max-open-size">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getMaxWithdrawMargin(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetMaxWithdrawMarginRequest)">getMaxWithdrawMargin</a></td>
    <td>Query the maximum amount of margin that can be withdrawn from a current position.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/get-max-withdraw-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getOrderByClientOid(java.lang.String)">getOrderByClientOid</a></td>
    <td>Get a single order by order id (including a stop order), querying it by its client side assigned <strong>clientOid</strong>.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/get-stop-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getOrderByOrderId(java.lang.String)">getOrderByOrderId</a></td>
    <td>Get a single order by order id (including a stop order), querying it by its exchange assigned <strong>orderId</strong>.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/orders/get-order-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getOrderList(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetOrderListRequest)">getOrderList</a></td>
    <td>List your current orders.</td>
    <td><a href="https://www.kucoin.com/docs/rest/futures-trading/orders/get-order-list">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getPositionDetails(java.lang.String)">getPositionDetails</a></td>
    <td>Get the position details of a specified position.<br/>See <a href="https://docs.kucoin.com/futures/#positions">API</a>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/get-position-details">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getPositionList(java.lang.String)">getPositionList</a></td>
    <td>Get the position details of a specified position.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/get-position-list">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getPositionsHistory(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetPositionsHistoryRequest)">getPositionsHistory</a></td>
    <td>Get the history of positions.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/get-positions-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getPrivateFundingHistory(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetPrivateFundingHistoryRequest)">getPrivateFundingHistory</a></td>
    <td>Get private funding history.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/funding-fees/get-private-funding-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getRecentClosedOrders(java.lang.String)">getRecentClosedOrders</a></td>
    <td>Get a list of recent 1000 orders in the last 24 hours.<br/>If you need to get your recent traded order history with low latency, you may query this endpoint.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/orders/get-recent-closed-orders">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getRecentTradeHistory(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetRecentTradeHistoryRequest)">getRecentTradeHistory</a></td>
    <td>Get a list of recent 1000 fills in the last 24 hours.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/est/futures-trading/orders/get-recent-trade-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#getStopOrderList(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingGetStopOrderListRequest)">getStopOrderList</a></td>
    <td>Get the un-triggered stop orders list.</td>
    <td><a href="https://www.kucoin.com/docs/rest/futures-trading/orders/get-untriggered-stop-order-list">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#modifyCrossMarginLeverage(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingModifyCrossMarginLeverageRequest)">modifyCrossMarginLeverage</a></td>
    <td>Modify the current symbol's cross-margin leverage multiple.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/modify-cross-margin-leverage">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#modifyRiskLimitLevel(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingModifyRiskLimitLevelRequest)">modifyRiskLimitLevel</a></td>
    <td>Modify the risk limit level of a position.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/modify-isolated-margin-risk-limit">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#removeIsolatedMargin(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingRemoveIsolatedMarginRequest)">removeIsolatedMargin</a></td>
    <td>Remove margin manually.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/remove-isolated-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#switchMarginMode(org.jxapi.exchanges.kucoin.gen.futurestrading.pojo.KucoinFuturesTradingSwitchMarginModeRequest)">switchMarginMode</a></td>
    <td>Modify the margin mode of a symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/futures-trading/positions/switch-margin-mode">link</a></td>
  </tr>
</table>

#### Websocket endpoints

<table>
  <caption>Kucoin FuturesTrading websocket endpoints</caption>
  <tr>
    <th>Subscription method</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#subscribeAllOrders()">subscribeAllOrders</a></td>
    <td>Orders websocket stream. Use this stream to receive order updates for all symbols.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470090w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#subscribeAllPositions(java.lang.String)">subscribeAllPositions</a></td>
    <td>Position change event websocket stream, for receiving position updates for all symbols.<br/>See <a href="https://www.kucoin.com/docs-new/3470093w0">API</a>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470093w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#subscribeAccountBalanceEvents()">subscribeAccountBalanceEvents</a></td>
    <td>Account Balance Events websocket stream.<br/>You will receive this message when an account balance changes. The message contains the details of the change.<br/>See <a href="https://www.kucoin.com/docs-new/3470092w0">API</a>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470092w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#subscribeCrossMarginLeverage()">subscribeCrossMarginLeverage</a></td>
    <td>Subscribe this topic to get the realtime push of leverage change of Futures that are in cross margin mode.<br/>See <a href="https://www.kucoin.com/docs-new/3470096w0">API</a>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470096w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#subscribeMarginMode()">subscribeMarginMode</a></td>
    <td>Subscribe this topic to get the realtime push of margin mode change event of all symbol.<br/>See <a href="https://www.kucoin.com/docs-new/3470092w0">API</a>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470092w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#subscribeOrders(java.lang.String)">subscribeOrders</a></td>
    <td>Orders websocket stream. Use this stream to subcribe to order updates for one specific symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470090w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#subscribePositions(java.lang.String)">subscribePositions</a></td>
    <td>Position change event websocket stream. Use this stream to receive position updates for one specific symbol.<br/>See <a href="https://www.kucoin.com/docs-new/3470093w0">API</a>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470093w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/futurestrading/KucoinFuturesTradingApi.html#subscribeStopOrders()">subscribeStopOrders</a></td>
    <td>Stop Order Lifecycle Event websocket stream.<br/>See <a href="https://docs.kucoin.com/futures/#stop-order-lifecycle-event">API</a>
    </td>
    <td><a href="https://www.kucoin.com/docs/websocket/futures-trading/private-channels/stop-order-lifecycle-event">link</a></td>
  </tr>
</table>
### Margin
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html">KucoinMarginApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinMarginApi().html">KucoinExchange#getKucoinMarginApi()</a>

Kucoin Margin trading API

#### REST endpoints

<table>
  <caption>Kucoin Margin REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#addMarginOcoOrder(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginAddOcoOrderRequest)">addMarginOcoOrder</a></td>
    <td>Place OCO order to the Margin trading system
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473252e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#addOrder(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginAddOrderRequest)">addOrder</a></td>
    <td>Place order in the Cross-margin or Isolated-margin trading system.  You can place two major types of order: Limit and market.  Orders can only be placed if your account has sufficient funds.  Once an order is placed, your funds will be put on hold for the duration of the order.  The amount of funds on hold depends on the order type and parameters specified.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/orders/add-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#addOrderTest(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginAddOrderRequest)">addOrderTest</a></td>
    <td>Place order in the Cross-margin or Isolated-margin trading system.  You can place two major types of order: Limit and market.  Orders can only be placed if your account has sufficient funds.  Once an order is placed, your funds will be put on hold for the duration of the order.  The amount of funds on hold depends on the order type and parameters specified.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/orders/add-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#addStopOrder(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginAddStopOrderRequest)">addStopOrder</a></td>
    <td>This endpoint allows you to place a stop order to the margin trading system.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473229e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#batchCancelOcoOrder(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginBatchCancelOcoOrderRequest)">batchCancelOcoOrder</a></td>
    <td>This interface allows you to batch cancel OCO (One-Cancels-the-Other) orders.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473255e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#batchCancelStopOrders(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginBatchCancelStopOrdersRequest)">batchCancelStopOrders</a></td>
    <td>Request via this interface to cancel a batch of stop orders.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473233e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#borrow(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginBorrowRepayRequest)">borrow</a></td>
    <td>This API endpoint is used to initiate an application for cross or isolated margin borrowing.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/debit/borrow">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#cancelAllMarginOrdersBySymbol(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginCancelAllMarginOrdersBySymbolRequest)">cancelAllMarginOrdersBySymbol</a></td>
    <td>This interface can cancel all open Margin orders by symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/orders/cancel-all-orders-by-symbol">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#cancelMarginOcoOrderByClientOid(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginCancelMarginOcoOrderByClientOidRequest)">cancelMarginOcoOrderByClientOid</a></td>
    <td>Request via this interface to cancel a stop order via the clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473254e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#cancelMarginStopOrderByClientOid(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginCancelMarginStopOrderByClientOidRequest)">cancelMarginStopOrderByClientOid</a></td>
    <td>This endpoint is used to cancel a stop order by its unique clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/stop-order/cancel-stop-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#cancelMarginStopOrderByOrderId(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginCancelMarginStopOrderByOrderIdRequest)">cancelMarginStopOrderByOrderId</a></td>
    <td>This endpoint is used to request the cancellation of a single stop order that was previously placed.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473231e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#cancelOcoOrderByOrderId(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginCancelOcoOrderByOrderIdRequest)">cancelOcoOrderByOrderId</a></td>
    <td>Requests the cancellation of a single OCO order that was previously placed.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473253e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#cancelOrderByClientOid(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginCancelOrderByClientOidRequest)">cancelOrderByClientOid</a></td>
    <td>This endpoint is used to cancel a margin order by clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/orders/cancel-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#cancelOrderByOrderId(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginCancelOrderByOrderIdRequest)">cancelOrderByOrderId</a></td>
    <td>This endpoint is used to cancel a margin order by orderId.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/orders/cancel-order-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getBorrowHistory(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginBorrowingRepaymentHistoryRequest)">getBorrowHistory</a></td>
    <td>This API endpoint is used to get the borrowing orders for cross and isolated margin accounts
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/debit/get-borrow-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getBorrowInterestRate(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetBorrowInterestRateRequest)">getBorrowInterestRate</a></td>
    <td>Query borrowing interest rates.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3474772e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getClosedOrders(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetClosedOrdersRequest)">getClosedOrders</a></td>
    <td>This interface retrieves all closed margin trading order lists.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/orders/get-closed-orders">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getCrossMarginSymbols(java.lang.String)">getCrossMarginSymbols</a></td>
    <td>This interface can obtain the risk limit and currency configuration of cross margin/isolated margin.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/market-data/get-symbols-cross-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getETFInfo(java.lang.String)">getETFInfo</a></td>
    <td>This interface returns leveraged token information
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/market-data/get-etf-info">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getInterestHistory(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetInterestHistoryRequest)">getInterestHistory</a></td>
    <td>This interface can obtain the risk limit and currency configuration of cross margin/isolated margin.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/debit/get-interest-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getIsolatedMarginAccountDetailV1(java.lang.String)">getIsolatedMarginAccountDetailV1</a></td>
    <td>This API endpoint returns the info on a single isolated margin account of the current user.
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/margin-trading/isolated-margin/get-single-isolated-margin-account-info">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getIsolatedMarginAccountListV1(java.lang.String)">getIsolatedMarginAccountListV1</a></td>
    <td>This API endpoint returns all isolated margin accounts of the current user.
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/margin-trading/isolated-margin/get-isolated-margin-account-info">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getLoanMarket(java.lang.String)">getLoanMarket</a></td>
    <td>This API endpoint is used to get the information about the currencies available for lending.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/credit/get-loan-market">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getLoanMarketInterestRate(java.lang.String)">getLoanMarketInterestRate</a></td>
    <td>This API endpoint is used to get the interest rates of the margin lending market over the past 7 days.
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/margin-trading/lending-market-v3-/get-interest-rates">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getMarginConfig()">getMarginConfig</a></td>
    <td>Request via this endpoint to get the index price of the specified symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/market-data/get-margin-config">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getMarginRiskLimit(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetMarginRiskLimitRequest)">getMarginRiskLimit</a></td>
    <td>This interface can obtain the risk limit and currency configuration of cross margin/isolated margin.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/risk-limit/get-margin-risk-limit">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getMarginStopOrderByClientOid(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetMarginStopOrderByClientOidRequest)">getMarginStopOrderByClientOid</a></td>
    <td>Request via this interface to get stop order information via the clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473251e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getMarginStopOrderByOrderId(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetMarginStopOrderByOrderIdRequest)">getMarginStopOrderByOrderId</a></td>
    <td>Request via this interface to get stop order information via the order ID.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473250e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getMarginStopOrdersList(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetMarginStopOrdersListRequest)">getMarginStopOrdersList</a></td>
    <td>Request via this endpoint to get your current untriggered stop order list.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473234e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getMarkPriceDetail(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetMarkPriceDetailRequest)">getMarkPriceDetail</a></td>
    <td>Request via this endpoint to get the index price of the specified symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/market-data/get-mark-price-detail">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getMarkPriceList()">getMarkPriceList</a></td>
    <td>This endpoint returns the current mark prices for all margin trading pairs.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/market-data/get-mark-price-list">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getOcoOrderByClientOid(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetOcoOrderByClientOidRequest)">getOcoOrderByClientOid</a></td>
    <td>This interface allows you to retrieve OCO order information using the client order ID.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473257e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getOcoOrderByOrderId(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetOcoOrderByOrderIdRequest)">getOcoOrderByOrderId</a></td>
    <td>Requests OCO order information via the order ID.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473256e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getOcoOrderDetailByOrderId(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetOcoOrderDetailByOrderIdRequest)">getOcoOrderDetailByOrderId</a></td>
    <td>This interface allows you to retrieve the details of an OCO (One-Cancels-the-Other) order using its unique order ID.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473258e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getOcoOrderList(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetOcoOrderListRequest)">getOcoOrderList</a></td>
    <td>This endpoint allows you to request your current OCO (One-Cancels-the-Other) order list.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3473259e0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getOpenOrders(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetOpenOrdersRequest)">getOpenOrders</a></td>
    <td>This interface retrieves all active margin trading order lists.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/orders/get-open-orders">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getOrderByClientOid(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetOrderByClientOidRequest)">getOrderByClientOid</a></td>
    <td>This interface retrieves a single margin order by clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/orders/get-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getOrderByOrderId(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetOrderByOrderIdRequest)">getOrderByOrderId</a></td>
    <td>This interface retrieves a single margin order by orderId.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/orders/get-order-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getPurchaseOrders(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetPurchaseOrdersRequest)">getPurchaseOrders</a></td>
    <td>This API endpoint provides pagination query for the subscription orders.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/credit/get-purchase-orders">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getRedeemOrders(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetRedeemOrdersRequest)">getRedeemOrders</a></td>
    <td>This API endpoint provides pagination query for the redemption orders.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/credit/get-redeem-orders">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getRepayHistory(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginBorrowingRepaymentHistoryRequest)">getRepayHistory</a></td>
    <td>This API endpoint is used to get the repayment orders for cross and isolated margin accounts.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/debit/get-repay-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#getSymbolsWithOpenMarginOrder(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginGetSymbolsWithOpenMarginOrderRequest)">getSymbolsWithOpenMarginOrder</a></td>
    <td>This interface can get symbols with open margin orders.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/orders/get-symbols-with-open-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#modifyLeverage(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginModifyLeverageRequest)">modifyLeverage</a></td>
    <td>This endpoint allows modifying the leverage multiplier for cross margin or isolated margin.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/debit/modify-leverage">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#modifyPurchase(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginModifyPurchaseRequest)">modifyPurchase</a></td>
    <td>This API endpoint is used to update the interest rates of subscription orders,  which will take effect at the beginning of the next hour.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/credit/modify-purchase">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#purchase(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginPurchaseRequest)">purchase</a></td>
    <td>Invest credit in the market and earn interest. Please ensure that the funds are in the main (funding) account.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/credit/purchase">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#redeem(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginRedeemRequest)">redeem</a></td>
    <td>Redeem your loan order.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/credit/redeem">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#repay(org.jxapi.exchanges.kucoin.gen.margin.pojo.KucoinMarginBorrowRepayRequest)">repay</a></td>
    <td>This API endpoint is used to initiate an application for the repayment of cross or isolated margin borrowing.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/margin-trading/debit/repay">link</a></td>
  </tr>
</table>

#### Websocket endpoints

<table>
  <caption>Kucoin Margin websocket endpoints</caption>
  <tr>
    <th>Subscription method</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#subscribeCrossMarginPosition()">subscribeCrossMarginPosition</a></td>
    <td>The system will push the change event when the position status changes, Or push the current debt message periodically when there is a liability.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470078w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/margin/KucoinMarginApi.html#subscribeIsolatedMarginPosition(java.lang.String)">subscribeIsolatedMarginPosition</a></td>
    <td>The system will push the change event when the position status changes, Or push the current debt message periodically when there is a liability.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470079w0">link</a></td>
  </tr>
</table>
### SpotMarketData
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html">KucoinSpotMarketDataApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinSpotMarketDataApi().html">KucoinExchange#getKucoinSpotMarketDataApi()</a>

Kucoin spot market data API

#### REST endpoints

<table>
  <caption>Kucoin SpotMarketData REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#get24hrStats(java.lang.String)">get24hrStats</a></td>
    <td>Request via this endpoint to get the statistics of the specified ticker in the last 24 hours.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-24hr-stats">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getAllCurrencies()">getAllCurrencies</a></td>
    <td>Request via this endpoint to get the currency list. <br><strong>TIP</strong>: Not all currencies currently can be used for trading. <p><strong>CURRENCY CODES</strong>: Currency codes will conform to the ISO 4217 standard where possible. Currencies which have or had no representation in ISO 4217 may use a custom code. <table>
      <caption>Common Currency Codes</caption>
      <tr>
        <th>Code</th>
        <th>Description</th>
      </tr>
      <tr>
        <td>BTC</td>
        <td>Bitcoin</td>
      </tr>
      <tr>
        <td>ETH</td>
        <td>Ethereum</td>
      </tr>
      <tr>
        <td>KCS</td>
        <td>Kucoin Shares</td>
      </tr>
    </table>   For a coin, the "currency" is a fixed value and works as the only recognized identity of the coin. As the "name", "fullnane" and "precision" of a coin are modifiable values, when the "name" of a coin is changed, you should use "currency" to get the coin. For example: The "currency" of XRB is "XRB", if the "name" of XRB is changed into "Nano", you should use "XRB" (the currency of XRB) to search the coin.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-all-currencies">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getAllSymbols()">getAllSymbols</a></td>
    <td>Request via this endpoint to get a list of available currency pairs for trading. If you want to get the market information of the trading symbol, please use <i>Get All Tickers</i>.</td>
    <td><a href="https://www.kucoin.com/docs/rest/spot-trading/market-data/get-symbols-list">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getAllTickers()">getAllTickers</a></td>
    <td>Request market tickers for all the trading pairs in the market (including 24h volume). On the rare occasion that we will change the currency name, if you still want the changed symbol name, you can use the symbolName field instead of the symbol field via 'Get all tickers' endpoint.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-all-tickers">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getAnnoucements(org.jxapi.exchanges.kucoin.gen.spotmarketdata.pojo.KucoinSpotMarketDataGetAnnoucementsRequest)">getAnnoucements</a></td>
    <td>This interface can obtain the latest news announcements, and the default page search is for announcements within a month.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-announcements">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getCallAuctionInfo(java.lang.String)">getCallAuctionInfo</a></td>
    <td>Request via this endpoint to get the call auction information of the specified symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-call-auction-info">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getCallAuctionPartOrderbook100(java.lang.String)">getCallAuctionPartOrderbook100</a></td>
    <td>Request via this endpoint to get a list of open orders for a symbol during a call auction (100 levels).
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-call-auction-part-orderbook">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getCallAuctionPartOrderbook20(java.lang.String)">getCallAuctionPartOrderbook20</a></td>
    <td>Request via this endpoint to get a list of open orders for a symbol during a call auction (20 levels).
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-call-auction-part-orderbook">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getClientIpAddress()">getClientIpAddress</a></td>
    <td>Request via this endpoint to get the client's IP address.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-client-ip-address">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getCurrency(org.jxapi.exchanges.kucoin.gen.spotmarketdata.pojo.KucoinSpotMarketDataGetCurrencyRequest)">getCurrency</a></td>
    <td>Request via this endpoint to get the currency details of a specified currency
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-currency">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getFiatPrice(org.jxapi.exchanges.kucoin.gen.spotmarketdata.pojo.KucoinSpotMarketDataGetFiatPriceRequest)">getFiatPrice</a></td>
    <td>Request via this endpoint to get the fiat price of the currencies for the available trading pairs.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-fiat-price">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getFullOrderBook(java.lang.String)">getFullOrderBook</a></td>
    <td>Request via this endpoint to get a list of open orders for a symbol.<br> Level-2 order book includes all bids and asks (aggregated by price), this level returns only one size for each active price (as if there was only a single order for that price).<br> Query via this endpoint and the system will return only 100 pieces of the order book to you (ask and bid data).<br> You are recommended to request via this endpoint as the system reponse would be faster and cosume less traffic.<br> To maintain up-to-date Order Book, please use Websocket incremental feed after retrieving the Level 2 snapshot.<br></td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-full-orderbook">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getKlines(org.jxapi.exchanges.kucoin.gen.spotmarketdata.pojo.KucoinSpotMarketDataGetKlinesRequest)">getKlines</a></td>
    <td>Request via this endpoint to get the trade history of the specified symbol, the returned quantity is the last 100 transaction records.<br> <strong>TIP</strong>:For each query, the system would return at most 1500 pieces of data. To obtain more data, please page the data by time.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-klines">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getMarketList()">getMarketList</a></td>
    <td>Request via this endpoint to get the transaction currency for the entire trading market.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-market-list">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getPartOrderBook100(java.lang.String)">getPartOrderBook100</a></td>
    <td>Request via this endpoint to get a list of open orders for a symbol.<br> Level-2 order book includes all bids and asks (aggregated by price), this level returns only one size for each active price (as if there was only a single order for that price).<br> Query via this endpoint and the system will return only 100 pieces of the order book to you (ask and bid data).<br> You are recommended to request via this endpoint as the system reponse would be faster and cosume less traffic.<br> To maintain up-to-date Order Book, please use Websocket incremental feed after retrieving the Level 2 snapshot.<br></td>
    <td><a href="https://www.kucoin.com/docs/rest/spot-trading/market-data/get-part-order-book-aggregated-">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getPartOrderBook20(java.lang.String)">getPartOrderBook20</a></td>
    <td>Request via this endpoint to get a list of open orders for a symbol.<br> Level-2 order book includes all bids and asks (aggregated by price), this level returns only one size for each active price (as if there was only a single order for that price).<br> Query via this endpoint and the system will return only 20 pieces of the order book to you (ask and bid data).<br> You are recommended to request via this endpoint as the system reponse would be faster and cosume less traffic.<br> To maintain up-to-date Order Book, please use Websocket incremental feed after retrieving the Level 2 snapshot.<br></td>
    <td><a href="https://www.kucoin.com/docs/rest/spot-trading/market-data/get-part-order-book-aggregated-">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getPublicTokenSpotMargin()">getPublicTokenSpotMargin</a></td>
    <td>You need to apply for one of the two tokens below to create a websocket connection.</td>
    <td><a href="https://www.kucoin.com/docs-new/websocket-api/base-info/get-public-token-spot-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getServerTime()">getServerTime</a></td>
    <td>Get the server time.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-server-time">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getServiceStatus()">getServiceStatus</a></td>
    <td>Get the service status</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-service-status">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getSymbol(java.lang.String)">getSymbol</a></td>
    <td>Request via this endpoint to get detail currency pairs for trading. If you want to get the market information of the trading symbol, please use Get All Tickers.</td>
    <td><a href="https://www.kucoin.com/docs/rest/spot-trading/market-data/get-symbol-detail">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getTicker(java.lang.String)">getTicker</a></td>
    <td>Request via this endpoint to get Level 1 Market Data. The returned value includes the best bid price and size, the best ask price and size as well as the last traded price and the last traded size.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/market-data/get-ticker">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#getTradeHistory(org.jxapi.exchanges.kucoin.gen.spotmarketdata.pojo.KucoinSpotMarketDataGetTradeHistoryRequest)">getTradeHistory</a></td>
    <td>Request via this endpoint to get the trade history of the specified symbol, the returned quantity is the last 100 transaction records.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/spot/rest/market-data/get-trade-histories">link</a></td>
  </tr>
</table>

#### Websocket endpoints

<table>
  <caption>Kucoin SpotMarketData websocket endpoints</caption>
  <tr>
    <th>Subscription method</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeAllSymbolsTickerStream()">subscribeAllSymbolsTickerStream</a></td>
    <td>Subscribe to this topic to get the push of all market symbols BBO change. Push frequency: once every 100ms.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470064w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeCallAuctionData(java.lang.String)">subscribeCallAuctionData</a></td>
    <td>Get call auction data, This endpoint will return the following information for the specified symbol during the call auction phase: estimated transaction price, estimated transaction quantity, bid price range, and ask price range.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470138w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeCallAuctionOrderbookLevel50(java.lang.String)">subscribeCallAuctionOrderbookLevel50</a></td>
    <td>The system will return the call auction 50 best ask/bid orders data.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470137w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeKlines(org.jxapi.exchanges.kucoin.gen.spotmarketdata.pojo.KucoinSpotMarketDataKlinesRequest)">subscribeKlines</a></td>
    <td>Subscribe to this topic to get K-Line data.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470071w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeMarginIndexPrice(java.lang.String)">subscribeMarginIndexPrice</a></td>
    <td>Subscribe to get snapshot data for a single symbol.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470076w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeMarginMarkPrice(java.lang.String)">subscribeMarginMarkPrice</a></td>
    <td>Subscribe to this topic to get the mark price for margin trading.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470077w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeMarketSnapshot(java.lang.String)">subscribeMarketSnapshot</a></td>
    <td>Subscribe to get snapshot data for a single symbol.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470066w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeOrderBookIncrement(java.lang.String)">subscribeOrderBookIncrement</a></td>
    <td>The system will return the increment change orderbook data (All depth).</td>
    <td><a href="https://www.kucoin.com/docs-new/3470068w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeOrderBookLevel1(java.lang.String)">subscribeOrderBookLevel1</a></td>
    <td>The system will return the 1 best ask/bid orders data.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470067w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeOrderBookLevel5(java.lang.String)">subscribeOrderBookLevel5</a></td>
    <td>The system will return the 5 best ask/bid orders data.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470069w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeOrderBookLevel50(java.lang.String)">subscribeOrderBookLevel50</a></td>
    <td>The system will return the 50 best ask/bid orders data.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470070w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeSymbolSnapshot(java.lang.String)">subscribeSymbolSnapshot</a></td>
    <td>Subscribe to get snapshot data for a single symbol.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470065w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeTicker(java.lang.String)">subscribeTicker</a></td>
    <td>24hr rolling window ticker statistics for a single symbol. These are NOT the statistics of the UTC day, but a 24hr rolling window for the previous 24hrs.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470063w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spotmarketdata/KucoinSpotMarketDataApi.html#subscribeTrade(java.lang.String)">subscribeTrade</a></td>
    <td>Subscribe to this topic to get the matching event data flow of Level 3.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470072w0">link</a></td>
  </tr>
</table>
### SpotTrading
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html">KucoinSpotTradingApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinSpotTradingApi().html">KucoinExchange#getKucoinSpotTradingApi()</a>

Kucoin spot trading API

#### REST endpoints

<table>
  <caption>Kucoin SpotTrading REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#addOrder(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotAddOrderRequest)">addOrder</a></td>
    <td>You can place two types of orders: limit and market. Orders can only be placed if your account has sufficient funds.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/add-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#batchCancelOcoOrders(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotCancelAllOrdersRequest)">batchCancelOcoOrders</a></td>
    <td>This interface can batch cancel OCO orders through orderIds.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/batch-cancel-oco-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#batchCancelStopOrders(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotCancelAllOrdersRequest)">batchCancelStopOrders</a></td>
    <td>Request via this interface to cancel a batch of stop orders.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/batch-cancel-stop-orders">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#cancelAllOrders()">cancelAllOrders</a></td>
    <td>Request via this endpoint to cancel all open orders. The response is a list of ids of the canceled orders.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/cancel-all-orders">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#cancelOcoOrderByClientOid(java.lang.String)">cancelOcoOrderByClientOid</a></td>
    <td>Request via this interface to cancel an order via the clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/cancel-oco-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#cancelOcoOrderByOrderId(java.lang.String)">cancelOcoOrderByOrderId</a></td>
    <td>Request via this interface to cancel a stop order via the clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/cancel-oco-order-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#cancelOrderByClientOid(java.lang.String)">cancelOrderByClientOid</a></td>
    <td>Request via this interface to cancel an order via the clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/cancel-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#cancelOrderByClientOidSync(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingCancelOrderByClientOidSyncRequest)">cancelOrderByClientOidSync</a></td>
    <td>Request via this interface to cancel an order via the clientOid synchronously.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/cancel-order-by-clientoid-sync">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#cancelOrderByOrderId(java.lang.String)">cancelOrderByOrderId</a></td>
    <td>Request via this endpoint to cancel a single order previously placed. <p> <strong>TIP</strong>:<i> This interface is only for cancellation requests.  The cancellation result needs to be obtained by querying the order status or  subscribing to websocket. It is recommended that you DO NOT cancel the order  until receiving the Open message, otherwise the order cannot be cancelled successfully.</i>
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/cancel-order-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#cancelOrderByOrderIdSync(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingCancelOrderByOrderIdSyncRequest)">cancelOrderByOrderIdSync</a></td>
    <td>Request via this interface to cancel an order via the orderId synchronously.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/cancel-order-by-orderld-sync">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#cancelStopOrderByClientOid(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotCancelOrderByClientOidRequest)">cancelStopOrderByClientOid</a></td>
    <td>Request via this interface to cancel an order via the clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/cancel-stop-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#cancelStopOrderByOrderId(java.lang.String)">cancelStopOrderByOrderId</a></td>
    <td>Request via this endpoint to cancel a single stop order previously placed. You will receive cancelledOrderIds field once the system has received the cancellation request.  The cancellation request will be processed by the matching engine in sequence. To know if the request is processed (successfully or not),  you may check the order status or the update message from the pushes.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/cancel-stop-order-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getOcoOrderByClientOid(java.lang.String)">getOcoOrderByClientOid</a></td>
    <td>Request via this interface to get an OCO order by clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/get-oco-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getOcoOrderByOrderId(java.lang.String)">getOcoOrderByOrderId</a></td>
    <td>Request via this interface to get a oco order information via the order ID.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/get-oco-order-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getOcoOrderDetailByOrderId(java.lang.String)">getOcoOrderDetailByOrderId</a></td>
    <td>Request via this interface to get a oco order detail via the order ID.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/get-oco-order-detail-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getOcoOrderList(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotGetOrderListRequest)">getOcoOrderList</a></td>
    <td>Request via this endpoint to get your current OCO order list. Items are paginated and sorted to show the latest first.  See the <a href="https://docs.kucoin.com/#pagination">Pagination</a> section for retrieving additional entries after the first page.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/get-oco-order-list">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getOpenOrders(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingGetOpenOrdersRequest)">getOpenOrders</a></td>
    <td>Request via this endpoint to get all active spot trading orders for a user.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/get-open-orders">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getOrderByClientOid(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingGetOrderByClientOidRequest)">getOrderByClientOid</a></td>
    <td>Request via this endpoint to get a single order info by clientOid.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/get-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getOrderByOrderId(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingGetOrderByOrderIdRequest)">getOrderByOrderId</a></td>
    <td>Request via this endpoint to get a single order info by order ID.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/get-order-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getPrivateTokenSpotMargin()">getPrivateTokenSpotMargin</a></td>
    <td>You need to apply for one of the two tokens below to create a websocket connection.</td>
    <td><a href="https://www.kucoin.com/docs-new/websocket-api/base-info/get-private-token-spot-margin">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getStopOrderByClientOid(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingGetStopOrderByClientOidRequest)">getStopOrderByClientOid</a></td>
    <td>Request via this interface to check the information of a single active order via clientOid.  The system will prompt that the order does not exists if the order does not exist or has been settled.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/get-stop-order-by-clientoid">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getStopOrderByOrderId(java.lang.String)">getStopOrderByOrderId</a></td>
    <td>Request via this endpoint to get a single order info by order ID.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/get-stop-order-by-orderld">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getStopOrderList(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotGetOrderListRequest)">getStopOrderList</a></td>
    <td>Request via this endpoint to get your current order list. Items are paginated and sorted to show the latest first. See the <a href="https://docs.kucoin.com/#pagination">Pagination</a> section for retrieving additional entries after the first page.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/get-stop-orders-list">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#getTradeHistory(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotTradingGetTradeHistoryRequest)">getTradeHistory</a></td>
    <td>Request via this endpoint to get the trade history of the specified symbol.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/spot-trading/orders/get-trade-history">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#placeOCOOrder(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotPlaceOCOOrderRequest)">placeOCOOrder</a></td>
    <td>Place a 'One-Cancels-Other' (OCO) order.<br> See <a href="https://www.kucoin.com/blog/everything-you-need-to-know-about-oco-orders-kucoin-tutorial">Everything you Need to Know About OCO Orders: KuCoin Tutorial</a> for more details.
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/spot-trading/oco-order/place-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#placeOrder(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotPlaceOrderRequest)">placeOrder</a></td>
    <td>You can place two types of orders: limit and market. Orders can only be placed if your account has sufficient funds. Once an order is placed, your account funds will be put on hold for the duration of the order. How much and which funds are put on hold depends on the order type and parameters specified. See the Holds details below. **Placing an order will enable price protection. When the price of the limit order is outside the threshold range, the price protection mechanism will be triggered, causing the order to fail.** Please note that the system will freeze the fees from the orders that entered the order book in advance. Read List Fills to learn more. Before placing an order, please read [Get Symbol List](https://docs.kucoin.com/#get-symbols-list) to understand the requirements for the quantity parameters for each trading pair.
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/spot-trading/orders/place-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#placeOrderTest(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotPlaceOrderRequest)">placeOrderTest</a></td>
    <td>Order test endpoint, the request parameters and return parameters of this endpoint are exactly the same as the order endpoint, and can be used to verify whether the signature is correct and other operations. After placing an order, the order will not enter the matching system, and the order cannot be queried.
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/spot-trading/orders/place-order">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#placeStopOrder(org.jxapi.exchanges.kucoin.gen.spottrading.pojo.KucoinSpotPlaceOrderRequest)">placeStopOrder</a></td>
    <td>Place a stop order. The order will be triggered when the market price reaches the stop price,  see <a href="https://www.kucoin.com/docs/rest/spot-trading/stop-order/introduction">Stop Order</a>.<br/> Limitation<br/> The maximum number of untriggered stop orders for a single trading pair in one account is 20.<br/>
    </td>
    <td><a href="https://www.kucoin.com/docs/rest/spot-trading/stop-order/place-order">link</a></td>
  </tr>
</table>

#### Websocket endpoints

<table>
  <caption>Kucoin SpotTrading websocket endpoints</caption>
  <tr>
    <th>Subscription method</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#subscribeBalance()">subscribeBalance</a></td>
    <td>You will receive this message when an account balance changes. The message contains the details of the change.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470075w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#subscribeOrderV1()">subscribeOrderV1</a></td>
    <td>This topic will push all change events of your orders.</td>
    <td><a href="https://www.kucoin.com/docs-new/3470074w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#subscribeOrderV2()">subscribeOrderV2</a></td>
    <td>This topic will push all change events of your orders. Compared with v1, v2 adds an Order Status: "new", there is no difference in push speed.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470073w0">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/spottrading/KucoinSpotTradingApi.html#subscribeStopOrder()">subscribeStopOrder</a></td>
    <td>You will receive this message when a stop order is triggered. The message contains the details of the stop order event.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/3470139w0">link</a></td>
  </tr>
</table>
### UAMarketData
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html">KucoinUAMarketDataApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinUAMarketDataApi().html">KucoinExchange#getKucoinUAMarketDataApi()</a>

Kucoin Unified API  Market Data endpoints

#### REST endpoints

<table>
  <caption>Kucoin UAMarketData REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getAnnouncements(org.jxapi.exchanges.kucoin.gen.uamarketdata.pojo.KucoinUAMarketDataGetAnnouncementsRequest)">getAnnouncements</a></td>
    <td>Get a list of announcements.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-announcements">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getCrossMarginConfig()">getCrossMarginConfig</a></td>
    <td>Request the configure info of the 'spot cross margin' via this endpoint.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-cross-margin-config">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getCurrency(org.jxapi.exchanges.kucoin.gen.uamarketdata.pojo.KucoinUAMarketDataGetCurrencyRequest)">getCurrency</a></td>
    <td>Get the details of a currency.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-currency">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getCurrentFundingRate(java.lang.String)">getCurrentFundingRate</a></td>
    <td>Get current Futures funding fee rate.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-current-funding-rate">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getHistoryFundingRate(org.jxapi.exchanges.kucoin.gen.uamarketdata.pojo.KucoinUAMarketDataGetHistoryFundingRateRequest)">getHistoryFundingRate</a></td>
    <td>Query the Futures funding rate at each settlement time point within a certain time range of the corresponding contract.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-history-funding-rate">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getKlines(org.jxapi.exchanges.kucoin.gen.uamarketdata.pojo.KucoinUAMarketDataGetKlinesRequest)">getKlines</a></td>
    <td>Get the Kline of the symbol. Data are returned in grouped buckets based on requested type.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-klines">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getOrderBook(org.jxapi.exchanges.kucoin.gen.uamarketdata.pojo.KucoinUAMarketDataGetOrderBookRequest)">getOrderBook</a></td>
    <td>Query order book depth information (aggregated by price).</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-orderbook">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getServiceStatus(java.lang.String)">getServiceStatus</a></td>
    <td>Get the service status.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-service-status">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getSymbol(org.jxapi.exchanges.kucoin.gen.uamarketdata.pojo.KucoinUAMarketDataGetSymbolRequest)">getSymbol</a></td>
    <td>Request a list of available currency pairs for trading via this endpoint.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-symbol">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getTicker(org.jxapi.exchanges.kucoin.gen.uamarketdata.pojo.KucoinUAMarketDataGetTickerRequest)">getTicker</a></td>
    <td>Request market tickers for the trading pairs in the market (including 24h volume); takes a snapshot every 2 seconds.</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-ticker">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/uamarketdata/KucoinUAMarketDataApi.html#getTrades(org.jxapi.exchanges.kucoin.gen.uamarketdata.pojo.KucoinUAMarketDataGetTradesRequest)">getTrades</a></td>
    <td>Request via this endpoint to get the latest 100 public trades of the specified symbol</td>
    <td><a href="https://www.kucoin.com/docs-new/rest/ua/get-trades">link</a></td>
  </tr>
</table>
### VipLending
Methods exposed in <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/viplending/KucoinVipLendingApi.html">KucoinVipLendingApi</a> accessible from <a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/KucoinExchange#getKucoinVipLendingApi().html">KucoinExchange#getKucoinVipLendingApi()</a>

KuCoin's VIP Lending offers institutional and VIP users the ability to obtain loans with flexible borrowing leverage and larger borrowing amounts.  Both margin and loaned assets can be utilized for trading, providing enhanced flexibility.  Margin trading allows users to amplify their initial investment by collateralizing a small amount of assets to borrow crypto, enabling them to execute long or short positions to optimize capital use.


#### REST endpoints

<table>
  <caption>Kucoin VipLending REST endpoints</caption>
  <tr>
    <th>Endpoint</th>
    <th>Description</th>
    <th>API Reference</th>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/viplending/KucoinVipLendingApi.html#getAccounts()">getAccounts</a></td>
    <td>Returns a list of accounts participating in OTC lending.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/vip-lending/get-accounts">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/viplending/KucoinVipLendingApi.html#getCollateralRatio()">getCollateralRatio</a></td>
    <td>Retrieve the gradient collateral rate for each currency.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/vip-lending/get-collateral-ratio">link</a></td>
  </tr>
  <tr>
    <td><a href="https://javadoc.io/doc/org.jxapi.exchanges.kucoin/jxapi-kucoin/latest/index.html/org/jxapi/exchanges/kucoin/gen/viplending/KucoinVipLendingApi.html#getLoanInfo()">getLoanInfo</a></td>
    <td>Retrieve information about off-exchange funding and loans.
    </td>
    <td><a href="https://www.kucoin.com/docs-new/rest/vip-lending/get-account-detail">link</a></td>
  </tr>
</table>

## Demo snippets

This wrapper contains demo snippets for the most important endpoints. These snippets are generated in _src/test/java/_ source folder.

Some demo configuration properties are available to tune common request parameters used in snippets, as <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/KucoinDemoProperties.java">KucoinDemoProperties</a> class.
 These properties are used to configure default values for request parameters used in demo snippets.

In order to run demo snippets, you can set properties values in __demo-Kucoin.properties__ properties file in src/test/resources folder.


### Endpoint demo snippets


#### Account REST endpoints demo snippets:

 - __AddSubAccount__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountAddSubAccountDemo.java">KucoinAccountAddSubAccountDemo</a>
 - __AddSubAccountFuturesPermission__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountAddSubAccountFuturesPermissionDemo.java">KucoinAccountAddSubAccountFuturesPermissionDemo</a>
 - __AddSubAccountMarginPermission__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountAddSubAccountMarginPermissionDemo.java">KucoinAccountAddSubAccountMarginPermissionDemo</a>
 - __GetAccountDetailSpotMarginTradeHf__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountGetAccountDetailSpotMarginTradeHfDemo.java">KucoinAccountGetAccountDetailSpotMarginTradeHfDemo</a>
 - __GetAccountLedgersFutures__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountGetAccountLedgersFuturesDemo.java">KucoinAccountGetAccountLedgersFuturesDemo</a>
 - __GetAccountLedgerMarginHf__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountGetAccountLedgerMarginHfDemo.java">KucoinAccountGetAccountLedgerMarginHfDemo</a>
 - __GetAccountLedgersSpotMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountGetAccountLedgersSpotMarginDemo.java">KucoinAccountGetAccountLedgersSpotMarginDemo</a>
 - __GetAccountLedgerTradeHf__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountGetAccountLedgerTradeHfDemo.java">KucoinAccountGetAccountLedgerTradeHfDemo</a>
 - __GetAccountListSpotMarginTradeHf__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountGetAccountListSpotMarginTradeHfDemo.java">KucoinAccountGetAccountListSpotMarginTradeHfDemo</a>
 - __GetAccountSummaryInfo__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountGetAccountSummaryInfoDemo.java">KucoinAccountGetAccountSummaryInfoDemo</a>
 - __GetAllSubAccountsInfo__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountGetAllSubAccountsInfoDemo.java">KucoinAccountGetAllSubAccountsInfoDemo</a>
 - __GetSubAccountDetailBalance__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountGetSubAccountDetailBalanceDemo.java">KucoinAccountGetSubAccountDetailBalanceDemo</a>
 - __GetSubAccountListSpotBalance__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/account/demo/KucoinAccountGetSubAccountListSpotBalanceDemo.java">KucoinAccountGetSubAccountListSpotBalanceDemo</a>

#### Affiliate REST endpoints demo snippets:

 - __GetCommission__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/affiliate/demo/KucoinAffiliateGetCommissionDemo.java">KucoinAffiliateGetCommissionDemo</a>
 - __GetInvited__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/affiliate/demo/KucoinAffiliateGetInvitedDemo.java">KucoinAffiliateGetInvitedDemo</a>
 - __GetTradeHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/affiliate/demo/KucoinAffiliateGetTradeHistoryDemo.java">KucoinAffiliateGetTradeHistoryDemo</a>
 - __GetTransaction__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/affiliate/demo/KucoinAffiliateGetTransactionDemo.java">KucoinAffiliateGetTransactionDemo</a>

#### Convert REST endpoints demo snippets:

 - __AddConvertLimitOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertAddConvertLimitOrderDemo.java">KucoinConvertAddConvertLimitOrderDemo</a>
 - __AddConvertOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertAddConvertOrderDemo.java">KucoinConvertAddConvertOrderDemo</a>
 - __CancelConvertLimitOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertCancelConvertLimitOrderDemo.java">KucoinConvertCancelConvertLimitOrderDemo</a>
 - __GetConvertCurrencies__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertGetConvertCurrenciesDemo.java">KucoinConvertGetConvertCurrenciesDemo</a>
 - __GetConvertLimitOrderDetail__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertGetConvertLimitOrderDetailDemo.java">KucoinConvertGetConvertLimitOrderDetailDemo</a>
 - __GetConvertLimitOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertGetConvertLimitOrdersDemo.java">KucoinConvertGetConvertLimitOrdersDemo</a>
 - __GetConvertLimitQuote__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertGetConvertLimitQuoteDemo.java">KucoinConvertGetConvertLimitQuoteDemo</a>
 - __GetConvertOrderDetail__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertGetConvertOrderDetailDemo.java">KucoinConvertGetConvertOrderDetailDemo</a>
 - __GetConvertOrderHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertGetConvertOrderHistoryDemo.java">KucoinConvertGetConvertOrderHistoryDemo</a>
 - __GetConvertQuote__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertGetConvertQuoteDemo.java">KucoinConvertGetConvertQuoteDemo</a>
 - __GetConvertSymbol__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/convert/demo/KucoinConvertGetConvertSymbolDemo.java">KucoinConvertGetConvertSymbolDemo</a>

#### CopyTrading REST endpoints demo snippets:

 - __AddIsolatedMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingAddIsolatedMarginDemo.java">KucoinCopyTradingAddIsolatedMarginDemo</a>
 - __AddOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingAddOrderDemo.java">KucoinCopyTradingAddOrderDemo</a>
 - __AddOrderTest__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingAddOrderTestDemo.java">KucoinCopyTradingAddOrderTestDemo</a>
 - __AddTPSLOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingAddTPSLOrderDemo.java">KucoinCopyTradingAddTPSLOrderDemo</a>
 - __CancelOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingCancelOrderByClientOidDemo.java">KucoinCopyTradingCancelOrderByClientOidDemo</a>
 - __CancelOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingCancelOrderByOrderIdDemo.java">KucoinCopyTradingCancelOrderByOrderIdDemo</a>
 - __GetCrossMarginRequirement__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingGetCrossMarginRequirementDemo.java">KucoinCopyTradingGetCrossMarginRequirementDemo</a>
 - __GetMaxOpenSize__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingGetMaxOpenSizeDemo.java">KucoinCopyTradingGetMaxOpenSizeDemo</a>
 - __GetMaxWithdrawMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingGetMaxWithdrawMarginDemo.java">KucoinCopyTradingGetMaxWithdrawMarginDemo</a>
 - __ModifyCrossMarginLeverage__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingModifyCrossMarginLeverageDemo.java">KucoinCopyTradingModifyCrossMarginLeverageDemo</a>
 - __ModifyIsolatedMarginAutoDepositStatus__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingModifyIsolatedMarginAutoDepositStatusDemo.java">KucoinCopyTradingModifyIsolatedMarginAutoDepositStatusDemo</a>
 - __ModifyIsolatedMarginRiskLimit__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingModifyIsolatedMarginRiskLimitDemo.java">KucoinCopyTradingModifyIsolatedMarginRiskLimitDemo</a>
 - __RemoveIsolatedMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingRemoveIsolatedMarginDemo.java">KucoinCopyTradingRemoveIsolatedMarginDemo</a>
 - __SwitchMarginMode__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingSwitchMarginModeDemo.java">KucoinCopyTradingSwitchMarginModeDemo</a>
 - __SwitchPositionMode__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/copytrading/demo/KucoinCopyTradingSwitchPositionModeDemo.java">KucoinCopyTradingSwitchPositionModeDemo</a>

#### Earn REST endpoints demo snippets:

 - __GetAccountHolding__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnGetAccountHoldingDemo.java">KucoinEarnGetAccountHoldingDemo</a>
 - __GetDualInvestmentProducts__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnGetDualInvestmentProductsDemo.java">KucoinEarnGetDualInvestmentProductsDemo</a>
 - __GetEarnRedeemPreviewByHoldingId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnGetEarnRedeemPreviewByHoldingIdDemo.java">KucoinEarnGetEarnRedeemPreviewByHoldingIdDemo</a>
 - __GetEthStakingProducts__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnGetEthStakingProductsDemo.java">KucoinEarnGetEthStakingProductsDemo</a>
 - __GetKcsStakingProducts__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnGetKcsStakingProductsDemo.java">KucoinEarnGetKcsStakingProductsDemo</a>
 - __GetPromotionProducts__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnGetPromotionProductsDemo.java">KucoinEarnGetPromotionProductsDemo</a>
 - __GetSavingProducts__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnGetSavingProductsDemo.java">KucoinEarnGetSavingProductsDemo</a>
 - __GetStakingProducts__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnGetStakingProductsDemo.java">KucoinEarnGetStakingProductsDemo</a>
 - __GetStructuredProductOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnGetStructuredProductOrdersDemo.java">KucoinEarnGetStructuredProductOrdersDemo</a>
 - __PurchaseStructuredProduct__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnPurchaseStructuredProductDemo.java">KucoinEarnPurchaseStructuredProductDemo</a>
 - __Redeem__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnRedeemDemo.java">KucoinEarnRedeemDemo</a>
 - __SubscribeToEarnFixedIncomeProducts__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/earn/demo/KucoinEarnSubscribeToEarnFixedIncomeProductsDemo.java">KucoinEarnSubscribeToEarnFixedIncomeProductsDemo</a>

#### Funding REST endpoints demo snippets:

 - __AddDepositAddressV3__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingAddDepositAddressV3Demo.java">KucoinFundingAddDepositAddressV3Demo</a>
 - __ApplyWithdrawV3__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingApplyWithdrawV3Demo.java">KucoinFundingApplyWithdrawV3Demo</a>
 - __CancelWithdrawal__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingCancelWithdrawalDemo.java">KucoinFundingCancelWithdrawalDemo</a>
 - __FlexTransfer__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingFlexTransferDemo.java">KucoinFundingFlexTransferDemo</a>
 - __GetAccountDetailCrossMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetAccountDetailCrossMarginDemo.java">KucoinFundingGetAccountDetailCrossMarginDemo</a>
 - __GetAccountDetailIsolatedMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetAccountDetailIsolatedMarginDemo.java">KucoinFundingGetAccountDetailIsolatedMarginDemo</a>
 - __GetAccountDetailsFutures__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetAccountDetailsFuturesDemo.java">KucoinFundingGetAccountDetailsFuturesDemo</a>
 - __GetActualFeeFutures__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetActualFeeFuturesDemo.java">KucoinFundingGetActualFeeFuturesDemo</a>
 - __GetActualFeeSpotMarginTradeHf__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetActualFeeSpotMarginTradeHfDemo.java">KucoinFundingGetActualFeeSpotMarginTradeHfDemo</a>
 - __GetAllSubAccountBalanceFutures__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetAllSubAccountBalanceFuturesDemo.java">KucoinFundingGetAllSubAccountBalanceFuturesDemo</a>
 - __GetBasicFeeSpotMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetBasicFeeSpotMarginDemo.java">KucoinFundingGetBasicFeeSpotMarginDemo</a>
 - __GetDepositAddressV3__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetDepositAddressV3Demo.java">KucoinFundingGetDepositAddressV3Demo</a>
 - __GetDepositHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetDepositHistoryDemo.java">KucoinFundingGetDepositHistoryDemo</a>
 - __GetWithdrawalsList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetWithdrawalsListDemo.java">KucoinFundingGetWithdrawalsListDemo</a>
 - __GetWithdrawalsQuotas__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/funding/demo/KucoinFundingGetWithdrawalsQuotasDemo.java">KucoinFundingGetWithdrawalsQuotasDemo</a>

#### FuturesMarketData REST endpoints demo snippets:

 - __ApplyConnectTokenPublic__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataApplyConnectTokenPublicDemo.java">KucoinFuturesMarketDataApplyConnectTokenPublicDemo</a>
 - __Get24hStats__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGet24hStatsDemo.java">KucoinFuturesMarketDataGet24hStatsDemo</a>
 - __GetSymbolsList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetSymbolsListDemo.java">KucoinFuturesMarketDataGetSymbolsListDemo</a>
 - __GetAllTickers__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetAllTickersDemo.java">KucoinFuturesMarketDataGetAllTickersDemo</a>
 - __GetCurrentFundingRate__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetCurrentFundingRateDemo.java">KucoinFuturesMarketDataGetCurrentFundingRateDemo</a>
 - __GetFullOrderBook__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetFullOrderBookDemo.java">KucoinFuturesMarketDataGetFullOrderBookDemo</a>
 - __GetInterestRateIndex__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetInterestRateIndexDemo.java">KucoinFuturesMarketDataGetInterestRateIndexDemo</a>
 - __GetKLines__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetKLinesDemo.java">KucoinFuturesMarketDataGetKLinesDemo</a>
 - __GetMarkPrice__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetMarkPriceDemo.java">KucoinFuturesMarketDataGetMarkPriceDemo</a>
 - __GetPartOrderBook100__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetPartOrderBook100Demo.java">KucoinFuturesMarketDataGetPartOrderBook100Demo</a>
 - __GetPartOrderBook20__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetPartOrderBook20Demo.java">KucoinFuturesMarketDataGetPartOrderBook20Demo</a>
 - __GetPremiumIndex__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetPremiumIndexDemo.java">KucoinFuturesMarketDataGetPremiumIndexDemo</a>
 - __GetPrivateFundingHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetPrivateFundingHistoryDemo.java">KucoinFuturesMarketDataGetPrivateFundingHistoryDemo</a>
 - __GetPublicFundingHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetPublicFundingHistoryDemo.java">KucoinFuturesMarketDataGetPublicFundingHistoryDemo</a>
 - __GetServerTime__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetServerTimeDemo.java">KucoinFuturesMarketDataGetServerTimeDemo</a>
 - __GetServiceStatus__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetServiceStatusDemo.java">KucoinFuturesMarketDataGetServiceStatusDemo</a>
 - __GetSpotIndexPrice__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetSpotIndexPriceDemo.java">KucoinFuturesMarketDataGetSpotIndexPriceDemo</a>
 - __GetSymbol__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetSymbolDemo.java">KucoinFuturesMarketDataGetSymbolDemo</a>
 - __GetTicker__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetTickerDemo.java">KucoinFuturesMarketDataGetTickerDemo</a>
 - __GetTransactionHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataGetTransactionHistoryDemo.java">KucoinFuturesMarketDataGetTransactionHistoryDemo</a>

#### FuturesMarketData Websocket endpoints demo snippets

 - __FundingFeeSettlement__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataFundingFeeSettlementDemo.java">KucoinFuturesMarketDataFundingFeeSettlementDemo</a>
 - __Instrument__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataInstrumentDemo.java">KucoinFuturesMarketDataInstrumentDemo</a>
 - __Klines__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataKlinesDemo.java">KucoinFuturesMarketDataKlinesDemo</a>
 - __OrderBookIncrement__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataOrderBookIncrementDemo.java">KucoinFuturesMarketDataOrderBookIncrementDemo</a>
 - __OrderbookLevel5__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataOrderbookLevel5Demo.java">KucoinFuturesMarketDataOrderbookLevel5Demo</a>
 - __OrderbookLevel50__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataOrderbookLevel50Demo.java">KucoinFuturesMarketDataOrderbookLevel50Demo</a>
 - __SymbolSnapshot__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataSymbolSnapshotDemo.java">KucoinFuturesMarketDataSymbolSnapshotDemo</a>
 - __TickerV1__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataTickerV1Demo.java">KucoinFuturesMarketDataTickerV1Demo</a>
 - __TickerV2__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataTickerV2Demo.java">KucoinFuturesMarketDataTickerV2Demo</a>
 - __Trade__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futuresmarketdata/demo/KucoinFuturesMarketDataTradeDemo.java">KucoinFuturesMarketDataTradeDemo</a>

#### FuturesTrading REST endpoints demo snippets:

 - __AddIsolatedMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingAddIsolatedMarginDemo.java">KucoinFuturesTradingAddIsolatedMarginDemo</a>
 - __AddOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingAddOrderDemo.java">KucoinFuturesTradingAddOrderDemo</a>
 - __AddOrderTest__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingAddOrderTestDemo.java">KucoinFuturesTradingAddOrderTestDemo</a>
 - __ApplyConnectTokenPrivate__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingApplyConnectTokenPrivateDemo.java">KucoinFuturesTradingApplyConnectTokenPrivateDemo</a>
 - __BatchCancelOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingBatchCancelOrdersDemo.java">KucoinFuturesTradingBatchCancelOrdersDemo</a>
 - __CancelAllOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingCancelAllOrdersDemo.java">KucoinFuturesTradingCancelAllOrdersDemo</a>
 - __CancelOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingCancelOrderByClientOidDemo.java">KucoinFuturesTradingCancelOrderByClientOidDemo</a>
 - __CancelOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingCancelOrderByOrderIdDemo.java">KucoinFuturesTradingCancelOrderByOrderIdDemo</a>
 - __GetOpenOrderValue__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetOpenOrderValueDemo.java">KucoinFuturesTradingGetOpenOrderValueDemo</a>
 - __GetCrossMarginLeverage__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetCrossMarginLeverageDemo.java">KucoinFuturesTradingGetCrossMarginLeverageDemo</a>
 - __GetTradeHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetTradeHistoryDemo.java">KucoinFuturesTradingGetTradeHistoryDemo</a>
 - __GetIsolatedMarginRiskLimit__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetIsolatedMarginRiskLimitDemo.java">KucoinFuturesTradingGetIsolatedMarginRiskLimitDemo</a>
 - __GetMarginMode__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetMarginModeDemo.java">KucoinFuturesTradingGetMarginModeDemo</a>
 - __GetMaxOpenSize__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetMaxOpenSizeDemo.java">KucoinFuturesTradingGetMaxOpenSizeDemo</a>
 - __GetMaxWithdrawMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetMaxWithdrawMarginDemo.java">KucoinFuturesTradingGetMaxWithdrawMarginDemo</a>
 - __GetOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetOrderByClientOidDemo.java">KucoinFuturesTradingGetOrderByClientOidDemo</a>
 - __GetOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetOrderByOrderIdDemo.java">KucoinFuturesTradingGetOrderByOrderIdDemo</a>
 - __GetOrderList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetOrderListDemo.java">KucoinFuturesTradingGetOrderListDemo</a>
 - __GetPositionDetails__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetPositionDetailsDemo.java">KucoinFuturesTradingGetPositionDetailsDemo</a>
 - __GetPositionList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetPositionListDemo.java">KucoinFuturesTradingGetPositionListDemo</a>
 - __GetPositionsHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetPositionsHistoryDemo.java">KucoinFuturesTradingGetPositionsHistoryDemo</a>
 - __GetPrivateFundingHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetPrivateFundingHistoryDemo.java">KucoinFuturesTradingGetPrivateFundingHistoryDemo</a>
 - __GetRecentClosedOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetRecentClosedOrdersDemo.java">KucoinFuturesTradingGetRecentClosedOrdersDemo</a>
 - __GetRecentTradeHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetRecentTradeHistoryDemo.java">KucoinFuturesTradingGetRecentTradeHistoryDemo</a>
 - __GetStopOrderList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingGetStopOrderListDemo.java">KucoinFuturesTradingGetStopOrderListDemo</a>
 - __ModifyCrossMarginLeverage__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingModifyCrossMarginLeverageDemo.java">KucoinFuturesTradingModifyCrossMarginLeverageDemo</a>
 - __ModifyRiskLimitLevel__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingModifyRiskLimitLevelDemo.java">KucoinFuturesTradingModifyRiskLimitLevelDemo</a>
 - __RemoveIsolatedMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingRemoveIsolatedMarginDemo.java">KucoinFuturesTradingRemoveIsolatedMarginDemo</a>
 - __SwitchMarginMode__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingSwitchMarginModeDemo.java">KucoinFuturesTradingSwitchMarginModeDemo</a>

#### FuturesTrading Websocket endpoints demo snippets

 - __AllOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingAllOrdersDemo.java">KucoinFuturesTradingAllOrdersDemo</a>
 - __AllPositions__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingAllPositionsDemo.java">KucoinFuturesTradingAllPositionsDemo</a>
 - __AccountBalanceEvents__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingAccountBalanceEventsDemo.java">KucoinFuturesTradingAccountBalanceEventsDemo</a>
 - __CrossMarginLeverage__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingCrossMarginLeverageDemo.java">KucoinFuturesTradingCrossMarginLeverageDemo</a>
 - __MarginMode__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingMarginModeDemo.java">KucoinFuturesTradingMarginModeDemo</a>
 - __Orders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingOrdersDemo.java">KucoinFuturesTradingOrdersDemo</a>
 - __Positions__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingPositionsDemo.java">KucoinFuturesTradingPositionsDemo</a>
 - __StopOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/futurestrading/demo/KucoinFuturesTradingStopOrdersDemo.java">KucoinFuturesTradingStopOrdersDemo</a>

#### Margin REST endpoints demo snippets:

 - __AddMarginOcoOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginAddMarginOcoOrderDemo.java">KucoinMarginAddMarginOcoOrderDemo</a>
 - __AddOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginAddOrderDemo.java">KucoinMarginAddOrderDemo</a>
 - __AddOrderTest__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginAddOrderTestDemo.java">KucoinMarginAddOrderTestDemo</a>
 - __AddStopOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginAddStopOrderDemo.java">KucoinMarginAddStopOrderDemo</a>
 - __BatchCancelOcoOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginBatchCancelOcoOrderDemo.java">KucoinMarginBatchCancelOcoOrderDemo</a>
 - __BatchCancelStopOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginBatchCancelStopOrdersDemo.java">KucoinMarginBatchCancelStopOrdersDemo</a>
 - __Borrow__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginBorrowDemo.java">KucoinMarginBorrowDemo</a>
 - __CancelAllMarginOrdersBySymbol__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginCancelAllMarginOrdersBySymbolDemo.java">KucoinMarginCancelAllMarginOrdersBySymbolDemo</a>
 - __CancelMarginOcoOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginCancelMarginOcoOrderByClientOidDemo.java">KucoinMarginCancelMarginOcoOrderByClientOidDemo</a>
 - __CancelMarginStopOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginCancelMarginStopOrderByClientOidDemo.java">KucoinMarginCancelMarginStopOrderByClientOidDemo</a>
 - __CancelMarginStopOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginCancelMarginStopOrderByOrderIdDemo.java">KucoinMarginCancelMarginStopOrderByOrderIdDemo</a>
 - __CancelOcoOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginCancelOcoOrderByOrderIdDemo.java">KucoinMarginCancelOcoOrderByOrderIdDemo</a>
 - __CancelOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginCancelOrderByClientOidDemo.java">KucoinMarginCancelOrderByClientOidDemo</a>
 - __CancelOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginCancelOrderByOrderIdDemo.java">KucoinMarginCancelOrderByOrderIdDemo</a>
 - __GetBorrowHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetBorrowHistoryDemo.java">KucoinMarginGetBorrowHistoryDemo</a>
 - __GetBorrowInterestRate__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetBorrowInterestRateDemo.java">KucoinMarginGetBorrowInterestRateDemo</a>
 - __GetClosedOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetClosedOrdersDemo.java">KucoinMarginGetClosedOrdersDemo</a>
 - __GetCrossMarginSymbols__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetCrossMarginSymbolsDemo.java">KucoinMarginGetCrossMarginSymbolsDemo</a>
 - __GetETFInfo__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetETFInfoDemo.java">KucoinMarginGetETFInfoDemo</a>
 - __GetInterestHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetInterestHistoryDemo.java">KucoinMarginGetInterestHistoryDemo</a>
 - __GetIsolatedMarginAccountDetailV1__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetIsolatedMarginAccountDetailV1Demo.java">KucoinMarginGetIsolatedMarginAccountDetailV1Demo</a>
 - __GetIsolatedMarginAccountListV1__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetIsolatedMarginAccountListV1Demo.java">KucoinMarginGetIsolatedMarginAccountListV1Demo</a>
 - __GetLoanMarket__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetLoanMarketDemo.java">KucoinMarginGetLoanMarketDemo</a>
 - __GetLoanMarketInterestRate__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetLoanMarketInterestRateDemo.java">KucoinMarginGetLoanMarketInterestRateDemo</a>
 - __GetMarginConfig__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetMarginConfigDemo.java">KucoinMarginGetMarginConfigDemo</a>
 - __GetMarginRiskLimit__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetMarginRiskLimitDemo.java">KucoinMarginGetMarginRiskLimitDemo</a>
 - __GetMarginStopOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetMarginStopOrderByClientOidDemo.java">KucoinMarginGetMarginStopOrderByClientOidDemo</a>
 - __GetMarginStopOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetMarginStopOrderByOrderIdDemo.java">KucoinMarginGetMarginStopOrderByOrderIdDemo</a>
 - __GetMarginStopOrdersList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetMarginStopOrdersListDemo.java">KucoinMarginGetMarginStopOrdersListDemo</a>
 - __GetMarkPriceDetail__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetMarkPriceDetailDemo.java">KucoinMarginGetMarkPriceDetailDemo</a>
 - __GetMarkPriceList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetMarkPriceListDemo.java">KucoinMarginGetMarkPriceListDemo</a>
 - __GetOcoOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetOcoOrderByClientOidDemo.java">KucoinMarginGetOcoOrderByClientOidDemo</a>
 - __GetOcoOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetOcoOrderByOrderIdDemo.java">KucoinMarginGetOcoOrderByOrderIdDemo</a>
 - __GetOcoOrderDetailByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetOcoOrderDetailByOrderIdDemo.java">KucoinMarginGetOcoOrderDetailByOrderIdDemo</a>
 - __GetOcoOrderList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetOcoOrderListDemo.java">KucoinMarginGetOcoOrderListDemo</a>
 - __GetOpenOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetOpenOrdersDemo.java">KucoinMarginGetOpenOrdersDemo</a>
 - __GetOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetOrderByClientOidDemo.java">KucoinMarginGetOrderByClientOidDemo</a>
 - __GetOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetOrderByOrderIdDemo.java">KucoinMarginGetOrderByOrderIdDemo</a>
 - __GetPurchaseOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetPurchaseOrdersDemo.java">KucoinMarginGetPurchaseOrdersDemo</a>
 - __GetRedeemOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetRedeemOrdersDemo.java">KucoinMarginGetRedeemOrdersDemo</a>
 - __GetRepayHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetRepayHistoryDemo.java">KucoinMarginGetRepayHistoryDemo</a>
 - __GetSymbolsWithOpenMarginOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginGetSymbolsWithOpenMarginOrderDemo.java">KucoinMarginGetSymbolsWithOpenMarginOrderDemo</a>
 - __ModifyLeverage__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginModifyLeverageDemo.java">KucoinMarginModifyLeverageDemo</a>
 - __ModifyPurchase__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginModifyPurchaseDemo.java">KucoinMarginModifyPurchaseDemo</a>
 - __Purchase__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginPurchaseDemo.java">KucoinMarginPurchaseDemo</a>
 - __Redeem__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginRedeemDemo.java">KucoinMarginRedeemDemo</a>
 - __Repay__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginRepayDemo.java">KucoinMarginRepayDemo</a>

#### Margin Websocket endpoints demo snippets

 - __CrossMarginPosition__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginCrossMarginPositionDemo.java">KucoinMarginCrossMarginPositionDemo</a>
 - __IsolatedMarginPosition__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/margin/demo/KucoinMarginIsolatedMarginPositionDemo.java">KucoinMarginIsolatedMarginPositionDemo</a>

#### SpotMarketData REST endpoints demo snippets:

 - __Get24hrStats__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGet24hrStatsDemo.java">KucoinSpotMarketDataGet24hrStatsDemo</a>
 - __GetAllCurrencies__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetAllCurrenciesDemo.java">KucoinSpotMarketDataGetAllCurrenciesDemo</a>
 - __GetAllSymbols__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetAllSymbolsDemo.java">KucoinSpotMarketDataGetAllSymbolsDemo</a>
 - __GetAllTickers__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetAllTickersDemo.java">KucoinSpotMarketDataGetAllTickersDemo</a>
 - __GetAnnoucements__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetAnnoucementsDemo.java">KucoinSpotMarketDataGetAnnoucementsDemo</a>
 - __GetCallAuctionInfo__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetCallAuctionInfoDemo.java">KucoinSpotMarketDataGetCallAuctionInfoDemo</a>
 - __GetCallAuctionPartOrderbook100__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetCallAuctionPartOrderbook100Demo.java">KucoinSpotMarketDataGetCallAuctionPartOrderbook100Demo</a>
 - __GetCallAuctionPartOrderbook20__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetCallAuctionPartOrderbook20Demo.java">KucoinSpotMarketDataGetCallAuctionPartOrderbook20Demo</a>
 - __GetClientIpAddress__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetClientIpAddressDemo.java">KucoinSpotMarketDataGetClientIpAddressDemo</a>
 - __GetCurrency__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetCurrencyDemo.java">KucoinSpotMarketDataGetCurrencyDemo</a>
 - __GetFiatPrice__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetFiatPriceDemo.java">KucoinSpotMarketDataGetFiatPriceDemo</a>
 - __GetFullOrderBook__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetFullOrderBookDemo.java">KucoinSpotMarketDataGetFullOrderBookDemo</a>
 - __GetKlines__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetKlinesDemo.java">KucoinSpotMarketDataGetKlinesDemo</a>
 - __GetMarketList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetMarketListDemo.java">KucoinSpotMarketDataGetMarketListDemo</a>
 - __GetPartOrderBook100__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetPartOrderBook100Demo.java">KucoinSpotMarketDataGetPartOrderBook100Demo</a>
 - __GetPartOrderBook20__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetPartOrderBook20Demo.java">KucoinSpotMarketDataGetPartOrderBook20Demo</a>
 - __GetPublicTokenSpotMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetPublicTokenSpotMarginDemo.java">KucoinSpotMarketDataGetPublicTokenSpotMarginDemo</a>
 - __GetServerTime__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetServerTimeDemo.java">KucoinSpotMarketDataGetServerTimeDemo</a>
 - __GetServiceStatus__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetServiceStatusDemo.java">KucoinSpotMarketDataGetServiceStatusDemo</a>
 - __GetSymbol__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetSymbolDemo.java">KucoinSpotMarketDataGetSymbolDemo</a>
 - __GetTicker__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetTickerDemo.java">KucoinSpotMarketDataGetTickerDemo</a>
 - __GetTradeHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataGetTradeHistoryDemo.java">KucoinSpotMarketDataGetTradeHistoryDemo</a>

#### SpotMarketData Websocket endpoints demo snippets

 - __AllSymbolsTickerStream__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataAllSymbolsTickerStreamDemo.java">KucoinSpotMarketDataAllSymbolsTickerStreamDemo</a>
 - __CallAuctionData__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataCallAuctionDataDemo.java">KucoinSpotMarketDataCallAuctionDataDemo</a>
 - __CallAuctionOrderbookLevel50__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataCallAuctionOrderbookLevel50Demo.java">KucoinSpotMarketDataCallAuctionOrderbookLevel50Demo</a>
 - __Klines__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataKlinesDemo.java">KucoinSpotMarketDataKlinesDemo</a>
 - __MarginIndexPrice__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataMarginIndexPriceDemo.java">KucoinSpotMarketDataMarginIndexPriceDemo</a>
 - __MarginMarkPrice__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataMarginMarkPriceDemo.java">KucoinSpotMarketDataMarginMarkPriceDemo</a>
 - __MarketSnapshot__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataMarketSnapshotDemo.java">KucoinSpotMarketDataMarketSnapshotDemo</a>
 - __OrderBookIncrement__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataOrderBookIncrementDemo.java">KucoinSpotMarketDataOrderBookIncrementDemo</a>
 - __OrderBookLevel1__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataOrderBookLevel1Demo.java">KucoinSpotMarketDataOrderBookLevel1Demo</a>
 - __OrderBookLevel5__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataOrderBookLevel5Demo.java">KucoinSpotMarketDataOrderBookLevel5Demo</a>
 - __OrderBookLevel50__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataOrderBookLevel50Demo.java">KucoinSpotMarketDataOrderBookLevel50Demo</a>
 - __SymbolSnapshot__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataSymbolSnapshotDemo.java">KucoinSpotMarketDataSymbolSnapshotDemo</a>
 - __Ticker__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataTickerDemo.java">KucoinSpotMarketDataTickerDemo</a>
 - __Trade__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spotmarketdata/demo/KucoinSpotMarketDataTradeDemo.java">KucoinSpotMarketDataTradeDemo</a>

#### SpotTrading REST endpoints demo snippets:

 - __AddOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingAddOrderDemo.java">KucoinSpotTradingAddOrderDemo</a>
 - __BatchCancelOcoOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingBatchCancelOcoOrdersDemo.java">KucoinSpotTradingBatchCancelOcoOrdersDemo</a>
 - __BatchCancelStopOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingBatchCancelStopOrdersDemo.java">KucoinSpotTradingBatchCancelStopOrdersDemo</a>
 - __CancelAllOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingCancelAllOrdersDemo.java">KucoinSpotTradingCancelAllOrdersDemo</a>
 - __CancelOcoOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingCancelOcoOrderByClientOidDemo.java">KucoinSpotTradingCancelOcoOrderByClientOidDemo</a>
 - __CancelOcoOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingCancelOcoOrderByOrderIdDemo.java">KucoinSpotTradingCancelOcoOrderByOrderIdDemo</a>
 - __CancelOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingCancelOrderByClientOidDemo.java">KucoinSpotTradingCancelOrderByClientOidDemo</a>
 - __CancelOrderByClientOidSync__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingCancelOrderByClientOidSyncDemo.java">KucoinSpotTradingCancelOrderByClientOidSyncDemo</a>
 - __CancelOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingCancelOrderByOrderIdDemo.java">KucoinSpotTradingCancelOrderByOrderIdDemo</a>
 - __CancelOrderByOrderIdSync__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingCancelOrderByOrderIdSyncDemo.java">KucoinSpotTradingCancelOrderByOrderIdSyncDemo</a>
 - __CancelStopOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingCancelStopOrderByClientOidDemo.java">KucoinSpotTradingCancelStopOrderByClientOidDemo</a>
 - __CancelStopOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingCancelStopOrderByOrderIdDemo.java">KucoinSpotTradingCancelStopOrderByOrderIdDemo</a>
 - __GetOcoOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetOcoOrderByClientOidDemo.java">KucoinSpotTradingGetOcoOrderByClientOidDemo</a>
 - __GetOcoOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetOcoOrderByOrderIdDemo.java">KucoinSpotTradingGetOcoOrderByOrderIdDemo</a>
 - __GetOcoOrderDetailByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetOcoOrderDetailByOrderIdDemo.java">KucoinSpotTradingGetOcoOrderDetailByOrderIdDemo</a>
 - __GetOcoOrderList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetOcoOrderListDemo.java">KucoinSpotTradingGetOcoOrderListDemo</a>
 - __GetOpenOrders__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetOpenOrdersDemo.java">KucoinSpotTradingGetOpenOrdersDemo</a>
 - __GetOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetOrderByClientOidDemo.java">KucoinSpotTradingGetOrderByClientOidDemo</a>
 - __GetOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetOrderByOrderIdDemo.java">KucoinSpotTradingGetOrderByOrderIdDemo</a>
 - __GetPrivateTokenSpotMargin__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetPrivateTokenSpotMarginDemo.java">KucoinSpotTradingGetPrivateTokenSpotMarginDemo</a>
 - __GetStopOrderByClientOid__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetStopOrderByClientOidDemo.java">KucoinSpotTradingGetStopOrderByClientOidDemo</a>
 - __GetStopOrderByOrderId__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetStopOrderByOrderIdDemo.java">KucoinSpotTradingGetStopOrderByOrderIdDemo</a>
 - __GetStopOrderList__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetStopOrderListDemo.java">KucoinSpotTradingGetStopOrderListDemo</a>
 - __GetTradeHistory__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingGetTradeHistoryDemo.java">KucoinSpotTradingGetTradeHistoryDemo</a>
 - __PlaceOCOOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingPlaceOCOOrderDemo.java">KucoinSpotTradingPlaceOCOOrderDemo</a>
 - __PlaceOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingPlaceOrderDemo.java">KucoinSpotTradingPlaceOrderDemo</a>
 - __PlaceOrderTest__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingPlaceOrderTestDemo.java">KucoinSpotTradingPlaceOrderTestDemo</a>
 - __PlaceStopOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingPlaceStopOrderDemo.java">KucoinSpotTradingPlaceStopOrderDemo</a>

#### SpotTrading Websocket endpoints demo snippets

 - __Balance__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingBalanceDemo.java">KucoinSpotTradingBalanceDemo</a>
 - __OrderV1__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingOrderV1Demo.java">KucoinSpotTradingOrderV1Demo</a>
 - __OrderV2__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingOrderV2Demo.java">KucoinSpotTradingOrderV2Demo</a>
 - __StopOrder__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/spottrading/demo/KucoinSpotTradingStopOrderDemo.java">KucoinSpotTradingStopOrderDemo</a>

#### UAMarketData REST endpoints demo snippets:

 - __GetAnnouncements__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetAnnouncementsDemo.java">KucoinUAMarketDataGetAnnouncementsDemo</a>
 - __GetCrossMarginConfig__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetCrossMarginConfigDemo.java">KucoinUAMarketDataGetCrossMarginConfigDemo</a>
 - __GetCurrency__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetCurrencyDemo.java">KucoinUAMarketDataGetCurrencyDemo</a>
 - __GetCurrentFundingRate__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetCurrentFundingRateDemo.java">KucoinUAMarketDataGetCurrentFundingRateDemo</a>
 - __GetHistoryFundingRate__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetHistoryFundingRateDemo.java">KucoinUAMarketDataGetHistoryFundingRateDemo</a>
 - __GetKlines__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetKlinesDemo.java">KucoinUAMarketDataGetKlinesDemo</a>
 - __GetOrderBook__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetOrderBookDemo.java">KucoinUAMarketDataGetOrderBookDemo</a>
 - __GetServiceStatus__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetServiceStatusDemo.java">KucoinUAMarketDataGetServiceStatusDemo</a>
 - __GetSymbol__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetSymbolDemo.java">KucoinUAMarketDataGetSymbolDemo</a>
 - __GetTicker__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetTickerDemo.java">KucoinUAMarketDataGetTickerDemo</a>
 - __GetTrades__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/uamarketdata/demo/KucoinUAMarketDataGetTradesDemo.java">KucoinUAMarketDataGetTradesDemo</a>

#### VipLending REST endpoints demo snippets:

 - __GetAccounts__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/viplending/demo/KucoinVipLendingGetAccountsDemo.java">KucoinVipLendingGetAccountsDemo</a>
 - __GetCollateralRatio__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/viplending/demo/KucoinVipLendingGetCollateralRatioDemo.java">KucoinVipLendingGetCollateralRatioDemo</a>
 - __GetLoanInfo__: <a href="https://github.com/scozic/jxapi-kucoin/blob/main/src//src/test/java/org/jxapi/exchanges/kucoin/gen/viplending/demo/KucoinVipLendingGetLoanInfoDemo.java">KucoinVipLendingGetLoanInfoDemo</a>

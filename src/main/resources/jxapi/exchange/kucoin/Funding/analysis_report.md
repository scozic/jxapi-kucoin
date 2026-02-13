# Kucoin Funding API YAML Analysis Report

This report summarizes the analysis of the YAML files in the `src/main/resources/jxapi/exchange/kucoin/Funding` directory against the official KuCoin API documentation.

## File-by-File Analysis

*   **`ApplyWithdrawV3.yaml`**:
    *   No discrepancies found.

*   **`BasicUserFeeSpotMarginTradeHf.yaml`**:
    *   File not found.

*   **`CancelWithDrawal.yaml`**:
    *   **Request Mismatch:** The `request` field is unnecessary and incorrectly defined.
    *   **Response Mismatch:** The `data` object in the response should be `null`, but the YAML defines it as an object with a `withdrawalId` field.

*   **`CreateDepositAddress.yaml`**:
    *   File not found.

*   **`CreateDepositAddressV3.yaml`**:
    *   File not found.

*   **`FlexTransfer.yaml`**:
    *   **Parameter Mismatch:** The conditional requirement for `fromUserId`, `fromAccountTag`, `toUserId`, and `toAccountTag` is not reflected in the YAML.

*   **`GetAccountDetailCrossMargin.yaml`**:
    *   **Response Mismatch:** In the `accounts` object of the response:
        *   `repayEnabled` is not in the documentation.
        *   `transferEnabled` should be `transferInEnabled`.
        *   `liabilityPrincipal` and `liabilityInterest` are missing.

*   **`GetAccountDetailIsolatedMargin.yaml`**:
    *   **Request Mismatch:** Request parameter `symbol` is missing.
    *   **Request Mismatch:** Request parameter `queryType` should be an enum.
    *   **Response Mismatch:** Response fields `debtRatio` and `status` are in the wrong place (should be inside the `assets` object).
    *   **Response Mismatch:** In the `baseAsset` and `quoteAsset` objects of the response:
        *   `repayEnabled` is not in the documentation.
        *   `transferEnabled` should be `transferInEnabled`.
        *   `borrowed` should be `liability`.
        *   `totalAsset` should be `total`.

## Next Endpoints to Analyze

*   `GetAccountDetailsFutures.yaml`
*   `GetAllSubAccountsBalanceFutures.yaml`
*   `GetDepositAddress.yaml`
*   `GetDepositAddressV2.yaml`
*   `GetDepositAddressV3.yaml`
*   `GetDepositList.yaml`
*   `GetFuturesTransferOutRequestRecords.yaml`
*   `GetTheTransferable.yaml`
*   `GetV1HistoricalWithdrawalsList.yaml`
*   `GetWithDrawalsList.yaml`
*   `GetWithDrawalsQuotas.yaml`
*   `InnerTransfer.yaml`
*   `TradingPairActualFeeFutures.yaml`
*   `TradingPairActualFeeSpotMarginTradeHf.yaml`
*   `TransferBetweenMasterAccountAndSubAccount.yaml`
*   `TransferToFuturesAccount.yaml`
*   `TransferToMainOrTradeAccount.yaml`

# Kucoin Affiliate API YAML Analysis Report

This report summarizes the analysis of the YAML files in the `src/main/resources/jxapi/exchange/kucoin/Affiliate` directory against the official KuCoin API documentation.

## File-by-File Analysis

*   **`GetCommission.yaml`**:
    *   **Parameter Mismatch:** The `siteType` parameter's enum values in the YAML (`global`, `asian`) differ from the documentation's single allowed value (`all`).
    *   **Parameter Mismatch:** The `rebateType` enum is missing the value `0`.

*   **`GetInvited.yaml`**:
    *   **Parameter Mismatch:** The `userType` parameter should be an enum with values `1`, `2`, `3`, but it is a string in the YAML.

*   **`GetTradeHistory.yaml`**:
    *   No major issues found.

*   **`GetTransaction.yaml`**:
    *   **Parameter Mismatch:** The `tradeStartAt` parameter should be required.
    *   **Parameter Mismatch:** The `tradeEndAt` parameter should be required.
    *   **Parameter Mismatch:** The `lastId` parameter should be an integer, but it is a string in the YAML.

## General Recommendations

*   **YAML Updates:** The identified discrepancies should be addressed to align the YAML files with the official KuCoin API documentation.

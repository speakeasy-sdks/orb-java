# FetchCustomerCostsExternalIdRequest


## Fields

| Field                                                                                                                                                                                                                                     | Type                                                                                                                                                                                                                                      | Required                                                                                                                                                                                                                                  | Description                                                                                                                                                                                                                               | Example                                                                                                                                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `externalCustomerId`                                                                                                                                                                                                                      | *String*                                                                                                                                                                                                                                  | :heavy_check_mark:                                                                                                                                                                                                                        | N/A                                                                                                                                                                                                                                       |                                                                                                                                                                                                                                           |
| `groupBy`                                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                                        | Groups per-price costs by the key provided.                                                                                                                                                                                               |                                                                                                                                                                                                                                           |
| `timeframeEnd`                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                                        | Costs returned are exclusive of `timeframe_end`.                                                                                                                                                                                          | 2022-03-01T05:00:00Z                                                                                                                                                                                                                      |
| `timeframeStart`                                                                                                                                                                                                                          | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                                        | Costs returned are inclusive of `timeframe_start`.                                                                                                                                                                                        | 2022-02-01T05:00:00Z                                                                                                                                                                                                                      |
| `viewMode`                                                                                                                                                                                                                                | [FetchCustomerCostsExternalIdViewMode](../../models/operations/FetchCustomerCostsExternalIdViewMode.md)                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                                        | Controls whether Orb returns cumulative costs since the start of the billing period, or incremental day-by-day costs. If your customer has minimums or discounts, it's strongly recommended that you use the default cumulative behavior. |                                                                                                                                                                                                                                           |
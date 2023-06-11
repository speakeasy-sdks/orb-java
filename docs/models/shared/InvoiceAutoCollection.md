# InvoiceAutoCollection

Information about payment auto-collection for this invoice.


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                                                                                                 | Type                                                                                                                                                                                                                                                                                                                                                                                                                                  | Required                                                                                                                                                                                                                                                                                                                                                                                                                              | Description                                                                                                                                                                                                                                                                                                                                                                                                                           |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `nextAttemptAt`                                                                                                                                                                                                                                                                                                                                                                                                                       | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                    | If the invoice is scheduled for auto-collection, this field will reflect when the next attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for this invoice, this field will be `null`.                                                                                                                                                                                                              |
| `previouslyAttemptedAt`                                                                                                                                                                                                                                                                                                                                                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                    | If Orb has ever attempted payment auto-collection for this invoice, this field will reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can be used to tell whether the invoice is currently in dunning (that is, `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if dunning has been exhausted (`previously_attempted_at` is non-null, but `next_attempt_time` is null). |
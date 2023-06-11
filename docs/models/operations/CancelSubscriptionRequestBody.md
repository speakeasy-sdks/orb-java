# CancelSubscriptionRequestBody


## Fields

| Field                                                                                                                            | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      | Example                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `cancelOption`                                                                                                                   | [CancelSubscriptionRequestBodyCancelOption](../../models/operations/CancelSubscriptionRequestBodyCancelOption.md)                | :heavy_check_mark:                                                                                                               | Determines the timing of subscription cancellation                                                                               | immediate                                                                                                                        |
| `cancellationDate`                                                                                                               | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                                        | :heavy_minus_sign:                                                                                                               | The date that the cancellation should take effect. This parameter can only be passed if the `cancel_option` is `requested_date`. | 2017-07-21T17:32:28Z                                                                                                             |
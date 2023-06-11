# CreateSubscriptionApplicationJSONPhaseOverrides


## Fields

| Field                                                                                                 | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `discount`                                                                                            | [Orb.Orb.models.shared.Discount](../../models/shared/Discount.md)                                     | :heavy_minus_sign:                                                                                    | N/A                                                                                                   |
| `minimumAmount`                                                                                       | *String*                                                                                              | :heavy_minus_sign:                                                                                    | The new minimum amount for the phase. Providing `null` will clear the existing minimum, if it exists. |
| `order`                                                                                               | *Double*                                                                                              | :heavy_minus_sign:                                                                                    | The phase order that is being modified.                                                               |
# CreateDiscount

The subscription's override discount for this price.


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `amountDiscount`                                                                | *String*                                                                        | :heavy_minus_sign:                                                              | Only allowed if discount_type is amount                                         |
| `discountType`                                                                  | [CreateDiscountDiscountType](../../models/shared/CreateDiscountDiscountType.md) | :heavy_minus_sign:                                                              | N/A                                                                             |
| `percentageDiscount`                                                            | *String*                                                                        | :heavy_minus_sign:                                                              | Only allowed if discount_type is percentage                                     |
| `usageDiscount`                                                                 | *String*                                                                        | :heavy_minus_sign:                                                              | Only allowed if discount_type is usage                                          |
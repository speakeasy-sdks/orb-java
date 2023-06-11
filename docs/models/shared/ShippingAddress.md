# ShippingAddress

The customer's shipping address; all fields in the address are optional. Note that downstream tax calculations are based on the shipping address.


## Fields

| Field                                         | Type                                          | Required                                      | Description                                   | Example                                       |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `city`                                        | *String*                                      | :heavy_minus_sign:                            | N/A                                           |                                               |
| `country`                                     | *String*                                      | :heavy_minus_sign:                            | Two-letter country code (ISO 3166-1 alpha-2). | US                                            |
| `line1`                                       | *String*                                      | :heavy_minus_sign:                            | N/A                                           |                                               |
| `line2`                                       | *String*                                      | :heavy_minus_sign:                            | N/A                                           |                                               |
| `postalCode`                                  | *String*                                      | :heavy_minus_sign:                            | ZIP or postal code                            |                                               |
| `state`                                       | *String*                                      | :heavy_minus_sign:                            | N/A                                           |                                               |
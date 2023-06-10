# ListCreditNoteRequest


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `customerId`                                                               | *String*                                                                   | :heavy_minus_sign:                                                         | Filter by a specific customer (cannot be used with `external_customer_id`) |
| `externalCustomerId`                                                       | *String*                                                                   | :heavy_minus_sign:                                                         | Filter by a specific customer (cannot be used with `customer_id`)          |
| `subscriptionId`                                                           | *String*                                                                   | :heavy_minus_sign:                                                         | Filter by a specific subscription                                          |
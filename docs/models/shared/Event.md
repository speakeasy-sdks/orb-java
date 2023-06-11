# Event


## Fields

| Field                                                                                                                                                                                           | Type                                                                                                                                                                                            | Required                                                                                                                                                                                        | Description                                                                                                                                                                                     |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `customerId`                                                                                                                                                                                    | *String*                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                              | The Orb Customer identifier                                                                                                                                                                     |
| `eventName`                                                                                                                                                                                     | *String*                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                              | A name to meaningfully identify the action or event type.                                                                                                                                       |
| `externalCustomerId`                                                                                                                                                                            | *String*                                                                                                                                                                                        | :heavy_minus_sign:                                                                                                                                                                              | An alias for the Orb customer, whose mapping is specified when creating the customer                                                                                                            |
| `id`                                                                                                                                                                                            | *String*                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                              | A unique value, generated by the client, that is used to de-duplicate events. Note that on ingestion, this value is passed in as idempotency_key                                                |
| `properties`                                                                                                                                                                                    | [EventProperties](../../models/shared/EventProperties.md)                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                              | A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or strings. Nested dictionaries are disallowed.                                                          |
| `timestamp`                                                                                                                                                                                     | *String*                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                              | An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the time that usage was recorded, and is particularly important to attribute usage to a given billing period. |
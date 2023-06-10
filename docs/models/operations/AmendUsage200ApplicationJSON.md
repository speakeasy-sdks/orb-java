# AmendUsage200ApplicationJSON

OK


## Fields

| Field                                                                                                           | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `duplicate`                                                                                                     | List<[AmendUsage200ApplicationJSONDuplicate](../../models/operations/AmendUsage200ApplicationJSONDuplicate.md)> | :heavy_minus_sign:                                                                                              | An array of strings, corresponding to idempotency_key's marked as duplicates (previously ingested)              |
| `ingested`                                                                                                      | List<*String*>                                                                                                  | :heavy_minus_sign:                                                                                              | An array of strings, corresponding to idempotency_key's which were successfully ingested.                       |
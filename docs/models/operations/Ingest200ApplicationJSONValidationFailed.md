# Ingest200ApplicationJSONValidationFailed


## Fields

| Field                                                                                                                                                 | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `idempotencyKey`                                                                                                                                      | *String*                                                                                                                                              | :heavy_minus_sign:                                                                                                                                    | The passed idempotency_key corresponding to the validation_errors                                                                                     |
| `validationErrors`                                                                                                                                    | List<[Ingest200ApplicationJSONValidationFailedValidationErrors](../../models/operations/Ingest200ApplicationJSONValidationFailedValidationErrors.md)> | :heavy_minus_sign:                                                                                                                                    | An array of objects corresponding to validation failures for each idempotency_key.                                                                    |
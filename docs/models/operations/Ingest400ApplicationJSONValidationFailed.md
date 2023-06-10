# Ingest400ApplicationJSONValidationFailed


## Fields

| Field                                                                              | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `idempotencyKey`                                                                   | *String*                                                                           | :heavy_minus_sign:                                                                 | N/A                                                                                |
| `validationErrors`                                                                 | List<*String*>                                                                     | :heavy_minus_sign:                                                                 | An array of objects corresponding to validation failures for each idempotency_key. |
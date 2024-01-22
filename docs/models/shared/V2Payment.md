# V2Payment


## Fields

| Field                                                                                                           | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     | Example                                                                                                         |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `adjustments`                                                                                                   | List<[com.formance.formance_sdk.models.shared.V2PaymentAdjustment](../../models/shared/V2PaymentAdjustment.md)> | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `asset`                                                                                                         | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             | USD                                                                                                             |
| `connectorID`                                                                                                   | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `createdAt`                                                                                                     | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                       | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `destinationAccountID`                                                                                          | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `id`                                                                                                            | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             | XXX                                                                                                             |
| `initialAmount`                                                                                                 | *Long*                                                                                                          | :heavy_check_mark:                                                                                              | N/A                                                                                                             | 100                                                                                                             |
| `metadata`                                                                                                      | [com.formance.formance_sdk.models.shared.V2PaymentMetadata](../../models/shared/V2PaymentMetadata.md)           | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `provider`                                                                                                      | [com.formance.formance_sdk.models.shared.V2Connector](../../models/shared/V2Connector.md)                       | :heavy_minus_sign:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `raw`                                                                                                           | [com.formance.formance_sdk.models.shared.V2PaymentRaw](../../models/shared/V2PaymentRaw.md)                     | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `reference`                                                                                                     | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `scheme`                                                                                                        | [com.formance.formance_sdk.models.shared.Scheme](../../models/shared/Scheme.md)                                 | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `sourceAccountID`                                                                                               | *String*                                                                                                        | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `status`                                                                                                        | [com.formance.formance_sdk.models.shared.V2PaymentStatus](../../models/shared/V2PaymentStatus.md)               | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
| `type`                                                                                                          | [com.formance.formance_sdk.models.shared.V2PaymentType](../../models/shared/V2PaymentType.md)                   | :heavy_check_mark:                                                                                              | N/A                                                                                                             |                                                                                                                 |
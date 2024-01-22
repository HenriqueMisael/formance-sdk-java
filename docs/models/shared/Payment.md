# Payment


## Fields

| Field                                                                                                       | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 | Example                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `adjustments`                                                                                               | List<[com.formance.formance_sdk.models.shared.PaymentAdjustment](../../models/shared/PaymentAdjustment.md)> | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `amount`                                                                                                    | *Long*                                                                                                      | :heavy_check_mark:                                                                                          | N/A                                                                                                         | 100                                                                                                         |
| `asset`                                                                                                     | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         | USD                                                                                                         |
| `connectorID`                                                                                               | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `createdAt`                                                                                                 | [OffsetDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/OffsetDateTime.html)                   | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `destinationAccountID`                                                                                      | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `id`                                                                                                        | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         | XXX                                                                                                         |
| `initialAmount`                                                                                             | *Long*                                                                                                      | :heavy_check_mark:                                                                                          | N/A                                                                                                         | 100                                                                                                         |
| `metadata`                                                                                                  | Map<String, *String*>                                                                                       | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `provider`                                                                                                  | [com.formance.formance_sdk.models.shared.Connector](../../models/shared/Connector.md)                       | :heavy_minus_sign:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `raw`                                                                                                       | [com.formance.formance_sdk.models.shared.Raw](../../models/shared/Raw.md)                                   | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `reference`                                                                                                 | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `scheme`                                                                                                    | [com.formance.formance_sdk.models.shared.PaymentScheme](../../models/shared/PaymentScheme.md)               | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `sourceAccountID`                                                                                           | *String*                                                                                                    | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `status`                                                                                                    | [com.formance.formance_sdk.models.shared.PaymentStatus](../../models/shared/PaymentStatus.md)               | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
| `type`                                                                                                      | [com.formance.formance_sdk.models.shared.PaymentType](../../models/shared/PaymentType.md)                   | :heavy_check_mark:                                                                                          | N/A                                                                                                         |                                                                                                             |
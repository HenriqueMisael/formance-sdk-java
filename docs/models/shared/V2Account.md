# V2Account


## Fields

| Field                                                                                            | Type                                                                                             | Required                                                                                         | Description                                                                                      | Example                                                                                          |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `address`                                                                                        | *String*                                                                                         | :heavy_check_mark:                                                                               | N/A                                                                                              | users:001                                                                                        |
| `effectiveVolumes`                                                                               | Map<String, [com.formance.formance_sdk.models.shared.V2Volume](../../models/shared/V2Volume.md)> | :heavy_minus_sign:                                                                               | N/A                                                                                              | {"USD":{"input":100,"output":10,"balance":90},"EUR":{"input":100,"output":10,"balance":90}}      |
| `metadata`                                                                                       | Map<String, *String*>                                                                            | :heavy_check_mark:                                                                               | N/A                                                                                              | {"admin":"true"}                                                                                 |
| `volumes`                                                                                        | Map<String, [com.formance.formance_sdk.models.shared.V2Volume](../../models/shared/V2Volume.md)> | :heavy_minus_sign:                                                                               | N/A                                                                                              | {"USD":{"input":100,"output":10,"balance":90},"EUR":{"input":100,"output":10,"balance":90}}      |
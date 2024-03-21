# DummyPayConfig


## Fields

| Field                                                                                         | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `directory`                                                                                   | *String*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           | /tmp/dummypay                                                                                 |
| `filePollingPeriod`                                                                           | *Optional<? extends String>*                                                                  | :heavy_minus_sign:                                                                            | The frequency at which the connector will try to fetch new payment objects from the directory | 60s                                                                                           |
| `name`                                                                                        | *String*                                                                                      | :heavy_check_mark:                                                                            | N/A                                                                                           | My DummyPay Account                                                                           |
| `numberOfAccountsPreGenerated`                                                                | *Optional<? extends Long>*                                                                    | :heavy_minus_sign:                                                                            | N/A                                                                                           |                                                                                               |
| `numberOfPaymentsPreGenerated`                                                                | *Optional<? extends Long>*                                                                    | :heavy_minus_sign:                                                                            | N/A                                                                                           |                                                                                               |
| `prefixFileToIngest`                                                                          | *Optional<? extends String>*                                                                  | :heavy_minus_sign:                                                                            | N/A                                                                                           |                                                                                               |
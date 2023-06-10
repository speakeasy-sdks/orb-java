# plan

## Overview

The Plan resource represents a plan that can be subscribed to by a customer. Plans define the amount of credits that a customer will receive, the price of the plan, and the billing interval.

### Available Operations

* [fetch](#fetch) - Retrieve a plan
* [getByExternalId](#getbyexternalid) - Retrieve a plan by external plan ID
* [list](#list) - List plans

## fetch

This endpoint is used to fetch [plan](../reference/Orb-API.json/components/schemas/Plan) details given a plan identifier. It returns information about the prices included in the plan and their configuration, as well as the product that the plan is attached to.

## Serialized prices
Orb supports a few different pricing models out of the box. Each of these models is serialized differently in a given [Price](../reference/Orb-API.json/components/schemas/Price) object. The `model_type` field determines the key for the configuration object that is present. A detailed explanation of price types can be found in the [Price schema](../reference/Orb-API.json/components/schemas/Price). 

## Phases
Orb supports plan phases, also known as contract ramps. For plans with phases, the serialized prices refer to all prices across all phases.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.GetPlansPlanIdRequest;
import Orb.Orb.models.operations.GetPlansPlanIdResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsam") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetPlansPlanIdRequest req = new GetPlansPlanIdRequest("voluptate");            

            GetPlansPlanIdResponse res = sdk.plan.fetch(req);

            if (res.plan != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [Orb.Orb.models.operations.GetPlansPlanIdRequest](../../models/operations/GetPlansPlanIdRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |


### Response

**[Orb.Orb.models.operations.GetPlansPlanIdResponse](../../models/operations/GetPlansPlanIdResponse.md)**


## getByExternalId

This endpoint is used to fetch [plan](../reference/Orb-API.json/components/schemas/Plan) details given an external_plan_id identifier. It returns information about the prices included in the plan and their configuration, as well as the product that the plan is attached to.

## Serialized prices
Orb supports a few different pricing models out of the box. Each of these models is serialized differently in a given [Price](../reference/Orb-API.json/components/schemas/Price) object. The `model_type` field determines the key for the configuration object that is present. A detailed explanation of price types can be found in the [Price schema](../reference/Orb-API.json/components/schemas/Price). 

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.GetPlansExternalPlanIdRequest;
import Orb.Orb.models.operations.GetPlansExternalPlanIdResponse;
import Orb.Orb.models.shared.Discount;
import Orb.Orb.models.shared.DiscountDiscountType;
import Orb.Orb.models.shared.MinimumAmount;
import Orb.Orb.models.shared.Plan;
import Orb.Orb.models.shared.PlanBasePlan;
import Orb.Orb.models.shared.PlanPhase;
import Orb.Orb.models.shared.PlanPhaseDurationUnit;
import Orb.Orb.models.shared.PlanProduct;
import Orb.Orb.models.shared.PlanTrialConfig;
import Orb.Orb.models.shared.PlanTrialConfigTrialPeriodUnit;
import Orb.Orb.models.shared.Price;
import Orb.Orb.models.shared.PriceBillableMetric;
import Orb.Orb.models.shared.PriceBpsConfig;
import Orb.Orb.models.shared.PriceBulkBpsConfig;
import Orb.Orb.models.shared.PriceBulkBpsConfigTiers;
import Orb.Orb.models.shared.PriceBulkConfig;
import Orb.Orb.models.shared.PriceBulkConfigTiers;
import Orb.Orb.models.shared.PriceCadence;
import Orb.Orb.models.shared.PriceMatrixConfig;
import Orb.Orb.models.shared.PriceMatrixConfigMatrixValues;
import Orb.Orb.models.shared.PriceModelType;
import Orb.Orb.models.shared.PricePackageConfig;
import Orb.Orb.models.shared.PriceTieredBpsConfig;
import Orb.Orb.models.shared.PriceTieredBpsConfigTiers;
import Orb.Orb.models.shared.PriceTieredConfig;
import Orb.Orb.models.shared.PriceTieredConfigTiers;
import Orb.Orb.models.shared.PriceUnitConfig;
import Orb.Orb.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("autem") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetPlansExternalPlanIdRequest req = new GetPlansExternalPlanIdRequest("nam") {{
                plan = new Plan(OffsetDateTime.parse("2022-02-18T18:29:26.833Z"), "nemo", "voluptatibus",                 new Discount(DiscountDiscountType.PERCENTAGE) {{
                                    amountDiscount = "perferendis";
                                    appliesToPriceIds = new String[]{{
                                        add("amet"),
                                        add("aut"),
                                        add("cumque"),
                                        add("corporis"),
                                    }};
                                    percentageDiscount = 0.15d;
                                    trialAmountDiscount = "hic";
                                    usageDiscount = 7299.91d;
                                }};, "nobis", "dolores",                 new MinimumAmount(                new String[]{{
                                                    add("totam"),
                                                    add("dignissimos"),
                                                }}, "eaque");, "quis",                 new Orb.Orb.models.shared.Price[]{{
                                    add(new Price("USD",                 new Discount(DiscountDiscountType.PERCENTAGE) {{
                                                        amountDiscount = "dicta";
                                                        appliesToPriceIds = new String[]{{
                                                            add("totam"),
                                                            add("incidunt"),
                                                            add("aspernatur"),
                                                        }};
                                                        percentageDiscount = 0.15d;
                                                        trialAmountDiscount = "dolores";
                                                        usageDiscount = 7168.6d;
                                                    }};,                 new MinimumAmount(                new String[]{{
                                                                        add("aliquid"),
                                                                        add("quam"),
                                                                        add("molestias"),
                                                                    }}, "temporibus");, 1832.8d) {{
                                        billableMetric = new PriceBillableMetric() {{
                                            id = "202c73d5-fe9b-490c-a890-9b3fe49a8d9c";
                                        }};
                                        bpsConfig = new PriceBpsConfig() {{
                                            bps = 7301.22d;
                                            perUnitMaximum = "delectus";
                                        }};
                                        bulkBpsConfig = new PriceBulkBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 5542.42d;
                                                    maximumAmount = "aliquid";
                                                    perUnitMaximum = "dolorem";
                                                }}),
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 2098.43d;
                                                    maximumAmount = "dolor";
                                                    perUnitMaximum = "qui";
                                                }}),
                                            }};
                                        }};
                                        bulkConfig = new PriceBulkConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "hic";
                                                    unitAmount = "excepturi";
                                                }}),
                                            }};
                                        }};
                                        cadence = PriceCadence.QUARTERLY;
                                        createdAt = OffsetDateTime.parse("2022-07-05T23:34:50.715Z");
                                        currency = "USD";
                                        discount = new Discount(DiscountDiscountType.PERCENTAGE) {{
                                            amountDiscount = "reiciendis";
                                            appliesToPriceIds = new String[]{{
                                                add("dolorum"),
                                            }};
                                            discountType = DiscountDiscountType.PERCENTAGE;
                                            percentageDiscount = 0.15d;
                                            trialAmountDiscount = "numquam";
                                            usageDiscount = 852.95d;
                                        }};
                                        fixedPriceQuantity = 580.29d;
                                        id = "0674ebf6-9280-4d1b-a77a-89ebf737ae42";
                                        matrixConfig = new PriceMatrixConfig() {{
                                            defaultUnitAmount = "perferendis";
                                            dimensions = new String[]{{
                                                add("optio"),
                                            }};
                                            matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("saepe"),
                                                        add("suscipit"),
                                                    }};
                                                    unitAmount = "deserunt";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("minima"),
                                                        add("repellendus"),
                                                        add("totam"),
                                                    }};
                                                    unitAmount = "similique";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("at"),
                                                    }};
                                                    unitAmount = "quaerat";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("vel"),
                                                        add("quod"),
                                                    }};
                                                    unitAmount = "officiis";
                                                }}),
                                            }};
                                        }};
                                        minimum = new MinimumAmount(                new String[]{{
                                                            add("harum"),
                                                            add("iusto"),
                                                        }}, "ipsum") {{
                                            appliesToPriceIds = new String[]{{
                                                add("dolorum"),
                                            }};
                                            minimumAmount = "a";
                                        }};
                                        modelType = PriceModelType.BULK_BPS;
                                        name = "Marvin Renner";
                                        packageConfig = new PricePackageConfig() {{
                                            packageAmount = "enim";
                                            packageSize = 2133.12d;
                                        }};
                                        planPhaseOrder = 9574.51d;
                                        tieredBpsConfig = new PriceTieredBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 4717.52d;
                                                    maximumAmount = "sit";
                                                    minimumAmount = "expedita";
                                                    perUnitMaximum = "neque";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 1536.94d;
                                                    maximumAmount = "vel";
                                                    minimumAmount = "libero";
                                                    perUnitMaximum = "voluptas";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 6462.65d;
                                                    maximumAmount = "quam";
                                                    minimumAmount = "ipsum";
                                                    perUnitMaximum = "incidunt";
                                                }}),
                                            }};
                                        }};
                                        tieredConfig = new PriceTieredConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "cupiditate";
                                                    lastUnit = "maxime";
                                                    unitAmount = "pariatur";
                                                }}),
                                            }};
                                        }};
                                        unitConfig = new PriceUnitConfig() {{
                                            unitAmount = "soluta";
                                        }};
                                    }}),
                                }},                 new PlanProduct(OffsetDateTime.parse("2022-11-09T03:08:00.106Z"), "magni", "odio");) {{
                    basePlan = new PlanBasePlan() {{
                        externalPlanId = "sunt";
                        id = "5bf0cbb1-e31b-48b9-8f34-43a1108e0adc";
                        name = "Alexander Prosacco";
                    }};;
                    basePlanId = "quae";
                    defaultInvoiceMemo = "laudantium";
                    externalPlanId = "odio";
                    netTerms = 580447L;
                    planPhases = new Orb.Orb.models.shared.PlanPhase[]{{
                        add(new PlanPhase(                new Discount(DiscountDiscountType.PERCENTAGE) {{
                                            amountDiscount = "impedit";
                                            appliesToPriceIds = new String[]{{
                                                add("voluptatibus"),
                                            }};
                                            percentageDiscount = 0.15d;
                                            trialAmountDiscount = "exercitationem";
                                            usageDiscount = 8623.1d;
                                        }};, PlanPhaseDurationUnit.MONTHLY,                 new MinimumAmount(                new String[]{{
                                                            add("maiores"),
                                                            add("doloribus"),
                                                            add("iusto"),
                                                            add("eligendi"),
                                                        }}, "ducimus");) {{
                            description = "quisquam";
                            discount = new Discount(DiscountDiscountType.PERCENTAGE) {{
                                amountDiscount = "vero";
                                appliesToPriceIds = new String[]{{
                                    add("quis"),
                                    add("ipsum"),
                                    add("delectus"),
                                }};
                                discountType = DiscountDiscountType.PERCENTAGE;
                                percentageDiscount = 0.15d;
                                trialAmountDiscount = "voluptate";
                                usageDiscount = 2317.01d;
                            }};
                            duration = 878870L;
                            durationUnit = PlanPhaseDurationUnit.ANNUAL;
                            minimum = new MinimumAmount(                new String[]{{
                                                add("similique"),
                                                add("facilis"),
                                            }}, "vero") {{
                                appliesToPriceIds = new String[]{{
                                    add("hic"),
                                    add("distinctio"),
                                }};
                                minimumAmount = "quod";
                            }};
                            name = "Joanne Sporer";
                            order = 617877L;
                        }}),
                        add(new PlanPhase(                new Discount(DiscountDiscountType.PERCENTAGE) {{
                                            amountDiscount = "sapiente";
                                            appliesToPriceIds = new String[]{{
                                                add("saepe"),
                                                add("ea"),
                                                add("impedit"),
                                                add("corporis"),
                                            }};
                                            percentageDiscount = 0.15d;
                                            trialAmountDiscount = "veniam";
                                            usageDiscount = 3994.99d;
                                        }};, PlanPhaseDurationUnit.MONTHLY,                 new MinimumAmount(                new String[]{{
                                                            add("ea"),
                                                            add("quo"),
                                                        }}, "consectetur");) {{
                            description = "alias";
                            discount = new Discount(DiscountDiscountType.PERCENTAGE) {{
                                amountDiscount = "officia";
                                appliesToPriceIds = new String[]{{
                                    add("ipsam"),
                                    add("ea"),
                                }};
                                discountType = DiscountDiscountType.PERCENTAGE;
                                percentageDiscount = 0.15d;
                                trialAmountDiscount = "aspernatur";
                                usageDiscount = 4282.24d;
                            }};
                            duration = 822118L;
                            durationUnit = PlanPhaseDurationUnit.MONTHLY;
                            minimum = new MinimumAmount(                new String[]{{
                                                add("dolor"),
                                            }}, "maiores") {{
                                appliesToPriceIds = new String[]{{
                                    add("ex"),
                                }};
                                minimumAmount = "laudantium";
                            }};
                            name = "Rosemary Stoltenberg";
                            order = 343605L;
                        }}),
                        add(new PlanPhase(                new Discount(DiscountDiscountType.PERCENTAGE) {{
                                            amountDiscount = "assumenda";
                                            appliesToPriceIds = new String[]{{
                                                add("voluptas"),
                                                add("libero"),
                                                add("quasi"),
                                                add("tempora"),
                                            }};
                                            percentageDiscount = 0.15d;
                                            trialAmountDiscount = "numquam";
                                            usageDiscount = 1314.82d;
                                        }};, PlanPhaseDurationUnit.QUARTERLY,                 new MinimumAmount(                new String[]{{
                                                            add("molestiae"),
                                                        }}, "magnam");) {{
                            description = "recusandae";
                            discount = new Discount(DiscountDiscountType.PERCENTAGE) {{
                                amountDiscount = "aspernatur";
                                appliesToPriceIds = new String[]{{
                                    add("eaque"),
                                    add("a"),
                                }};
                                discountType = DiscountDiscountType.PERCENTAGE;
                                percentageDiscount = 0.15d;
                                trialAmountDiscount = "libero";
                                usageDiscount = 139.48d;
                            }};
                            duration = 11427L;
                            durationUnit = PlanPhaseDurationUnit.QUARTERLY;
                            minimum = new MinimumAmount(                new String[]{{
                                                add("dolorum"),
                                            }}, "laborum") {{
                                appliesToPriceIds = new String[]{{
                                    add("aliquam"),
                                    add("fugit"),
                                    add("accusamus"),
                                    add("inventore"),
                                }};
                                minimumAmount = "non";
                            }};
                            name = "Lee Kemmer";
                            order = 557369L;
                        }}),
                        add(new PlanPhase(                new Discount(DiscountDiscountType.PERCENTAGE) {{
                                            amountDiscount = "illum";
                                            appliesToPriceIds = new String[]{{
                                                add("fuga"),
                                                add("eius"),
                                                add("eos"),
                                                add("voluptas"),
                                            }};
                                            percentageDiscount = 0.15d;
                                            trialAmountDiscount = "ab";
                                            usageDiscount = 5876d;
                                        }};, PlanPhaseDurationUnit.MONTHLY,                 new MinimumAmount(                new String[]{{
                                                            add("debitis"),
                                                            add("ipsam"),
                                                        }}, "aspernatur");) {{
                            description = "odio";
                            discount = new Discount(DiscountDiscountType.PERCENTAGE) {{
                                amountDiscount = "eius";
                                appliesToPriceIds = new String[]{{
                                    add("esse"),
                                    add("rem"),
                                }};
                                discountType = DiscountDiscountType.PERCENTAGE;
                                percentageDiscount = 0.15d;
                                trialAmountDiscount = "fuga";
                                usageDiscount = 4420.15d;
                            }};
                            duration = 695626L;
                            durationUnit = PlanPhaseDurationUnit.ANNUAL;
                            minimum = new MinimumAmount(                new String[]{{
                                                add("praesentium"),
                                            }}, "quisquam") {{
                                appliesToPriceIds = new String[]{{
                                    add("eum"),
                                    add("suscipit"),
                                }};
                                minimumAmount = "assumenda";
                            }};
                            name = "Angela Olson";
                            order = 778696L;
                        }}),
                    }};
                    trialConfig = new PlanTrialConfig(PlanTrialConfigTrialPeriodUnit.DAYS) {{
                        trialPeriod = 1970.54d;
                    }};;
                }};;
            }};            

            GetPlansExternalPlanIdResponse res = sdk.plan.getByExternalId(req);

            if (res.plan != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [Orb.Orb.models.operations.GetPlansExternalPlanIdRequest](../../models/operations/GetPlansExternalPlanIdRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |


### Response

**[Orb.Orb.models.operations.GetPlansExternalPlanIdResponse](../../models/operations/GetPlansExternalPlanIdResponse.md)**


## list

This endpoint returns a list of all [plans](../reference/Orb-API.json/components/schemas/Plan) for an account in a list format. 

The list of plans is ordered starting from the most recently created plan. The response also includes [`pagination_metadata`](../api/pagination), which lets the caller retrieve the next page of results if they exist.


### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.ListPlansResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("quo") {{
                    apiKeyAuth = "";
                }})
                .build();

            ListPlansResponse res = sdk.plan.list();

            if (res.listPlans200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Orb.Orb.models.operations.ListPlansResponse](../../models/operations/ListPlansResponse.md)**


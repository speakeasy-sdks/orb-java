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
                .setSecurity(new Security("similique") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetPlansPlanIdRequest req = new GetPlansPlanIdRequest("alias");            

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
                .setSecurity(new Security("at") {{
                    apiKeyAuth = "";
                }})
                .build();

            GetPlansExternalPlanIdRequest req = new GetPlansExternalPlanIdRequest("quaerat") {{
                plan = new Plan(OffsetDateTime.parse("2022-07-29T17:02:39.743Z"), "quod", "officiis",                 new Discount(DiscountDiscountType.PERCENTAGE) {{
                                    amountDiscount = "qui";
                                    appliesToPriceIds = new String[]{{
                                        add("a"),
                                        add("esse"),
                                        add("harum"),
                                    }};
                                    percentageDiscount = 0.15;
                                    trialAmountDiscount = "iusto";
                                    usageDiscount = 2155.07;
                                }};, "quisquam", "tenetur",                 new MinimumAmount(                new String[]{{
                                                    add("tempore"),
                                                }}, "accusamus");, "numquam",                 new Orb.Orb.models.shared.Price[]{{
                                    add(new Price("USD",                 new Discount(DiscountDiscountType.PERCENTAGE) {{
                                                        amountDiscount = "nulla";
                                                        appliesToPriceIds = new String[]{{
                                                            add("voluptatibus"),
                                                            add("nostrum"),
                                                            add("sapiente"),
                                                        }};
                                                        percentageDiscount = 0.15;
                                                        trialAmountDiscount = "quisquam";
                                                        usageDiscount = 9065.56;
                                                    }};,                 new MinimumAmount(                new String[]{{
                                                                        add("impedit"),
                                                                        add("corporis"),
                                                                    }}, "veniam");, 3994.99) {{
                                        billableMetric = new PriceBillableMetric() {{
                                            id = "3f870b32-6b5a-4734-a9cd-b1a8422bb679";
                                        }};
                                        bpsConfig = new PriceBpsConfig() {{
                                            bps = 8404.29;
                                            perUnitMaximum = "qui";
                                        }};
                                        bulkBpsConfig = new PriceBulkBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 1448.47;
                                                    maximumAmount = "magni";
                                                    perUnitMaximum = "odio";
                                                }}),
                                            }};
                                        }};
                                        bulkConfig = new PriceBulkConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "ullam";
                                                    unitAmount = "nam";
                                                }}),
                                            }};
                                        }};
                                        cadence = PriceCadence.QUARTERLY;
                                        createdAt = OffsetDateTime.parse("2022-03-27T15:45:02.604Z");
                                        currency = "USD";
                                        discount = new Discount(DiscountDiscountType.PERCENTAGE) {{
                                            amountDiscount = "soluta";
                                            appliesToPriceIds = new String[]{{
                                                add("et"),
                                                add("saepe"),
                                                add("ipsum"),
                                            }};
                                            discountType = DiscountDiscountType.PERCENTAGE;
                                            percentageDiscount = 0.15;
                                            trialAmountDiscount = "veritatis";
                                            usageDiscount = 7492.55;
                                        }};
                                        fixedPriceQuantity = 5521.93;
                                        id = "b90f3443-a110-48e0-adcf-4b921879fce9";
                                        matrixConfig = new PriceMatrixConfig() {{
                                            defaultUnitAmount = "quis";
                                            dimensions = new String[]{{
                                                add("delectus"),
                                            }};
                                            matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("vero"),
                                                    }};
                                                    unitAmount = "tenetur";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("hic"),
                                                        add("distinctio"),
                                                    }};
                                                    unitAmount = "quod";
                                                }}),
                                            }};
                                        }};
                                        minimum = new MinimumAmount(                new String[]{{
                                                            add("dolore"),
                                                            add("quibusdam"),
                                                        }}, "illum") {{
                                            appliesToPriceIds = new String[]{{
                                                add("similique"),
                                                add("facilis"),
                                            }};
                                            minimumAmount = "vero";
                                        }};
                                        modelType = PriceModelType.TIERED;
                                        name = "Edmund Ankunding";
                                        packageConfig = new PricePackageConfig() {{
                                            packageAmount = "nulla";
                                            packageSize = 1481.41;
                                        }};
                                        planPhaseOrder = 7804.27;
                                        tieredBpsConfig = new PriceTieredBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 9850.33;
                                                    maximumAmount = "iusto";
                                                    minimumAmount = "eligendi";
                                                    perUnitMaximum = "ducimus";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 40.48;
                                                    maximumAmount = "officia";
                                                    minimumAmount = "tempora";
                                                    perUnitMaximum = "ipsam";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 4104.92;
                                                    maximumAmount = "aspernatur";
                                                    minimumAmount = "vel";
                                                    perUnitMaximum = "possimus";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 2978.42;
                                                    maximumAmount = "ratione";
                                                    minimumAmount = "ex";
                                                    perUnitMaximum = "laudantium";
                                                }}),
                                            }};
                                        }};
                                        tieredConfig = new PriceTieredConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "dolor";
                                                    lastUnit = "maiores";
                                                    unitAmount = "quasi";
                                                }}),
                                            }};
                                        }};
                                        unitConfig = new PriceUnitConfig() {{
                                            unitAmount = "ex";
                                        }};
                                    }}),
                                    add(new Price("USD",                 new Discount(DiscountDiscountType.PERCENTAGE) {{
                                                        amountDiscount = "quaerat";
                                                        appliesToPriceIds = new String[]{{
                                                            add("consectetur"),
                                                            add("esse"),
                                                            add("blanditiis"),
                                                            add("provident"),
                                                        }};
                                                        percentageDiscount = 0.15;
                                                        trialAmountDiscount = "a";
                                                        usageDiscount = 8577.23;
                                                    }};,                 new MinimumAmount(                new String[]{{
                                                                        add("esse"),
                                                                        add("quasi"),
                                                                        add("a"),
                                                                    }}, "error");, 5757.51) {{
                                        billableMetric = new PriceBillableMetric() {{
                                            id = "146c3e25-0fb0-408c-82e1-41aac366c8dd";
                                        }};
                                        bpsConfig = new PriceBpsConfig() {{
                                            bps = 3790.34;
                                            perUnitMaximum = "libero";
                                        }};
                                        bulkBpsConfig = new PriceBulkBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 2703.28;
                                                    maximumAmount = "numquam";
                                                    perUnitMaximum = "explicabo";
                                                }}),
                                            }};
                                        }};
                                        bulkConfig = new PriceBulkConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "ipsa";
                                                    unitAmount = "molestiae";
                                                }}),
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "magnam";
                                                    unitAmount = "odio";
                                                }}),
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "eius";
                                                    unitAmount = "esse";
                                                }}),
                                            }};
                                        }};
                                        cadence = PriceCadence.MONTHLY;
                                        createdAt = OffsetDateTime.parse("2021-08-20T04:54:39.392Z");
                                        currency = "USD";
                                        discount = new Discount(DiscountDiscountType.PERCENTAGE) {{
                                            amountDiscount = "reprehenderit";
                                            appliesToPriceIds = new String[]{{
                                                add("fugiat"),
                                                add("ut"),
                                                add("eum"),
                                            }};
                                            discountType = DiscountDiscountType.PERCENTAGE;
                                            percentageDiscount = 0.15;
                                            trialAmountDiscount = "suscipit";
                                            usageDiscount = 8268.71;
                                        }};
                                        fixedPriceQuantity = 1811.51;
                                        id = "8c10ab3c-dca4-4251-904e-523c7e0bc717";
                                        matrixConfig = new PriceMatrixConfig() {{
                                            defaultUnitAmount = "totam";
                                            dimensions = new String[]{{
                                                add("aliquam"),
                                                add("odio"),
                                                add("occaecati"),
                                                add("commodi"),
                                            }};
                                            matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("deserunt"),
                                                    }};
                                                    unitAmount = "molestiae";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("porro"),
                                                    }};
                                                    unitAmount = "eum";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("praesentium"),
                                                        add("consequuntur"),
                                                        add("deleniti"),
                                                    }};
                                                    unitAmount = "fugit";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("mollitia"),
                                                        add("incidunt"),
                                                        add("atque"),
                                                    }};
                                                    unitAmount = "explicabo";
                                                }}),
                                            }};
                                        }};
                                        minimum = new MinimumAmount(                new String[]{{
                                                            add("ratione"),
                                                        }}, "explicabo") {{
                                            appliesToPriceIds = new String[]{{
                                                add("nisi"),
                                                add("fugit"),
                                            }};
                                            minimumAmount = "sapiente";
                                        }};
                                        modelType = PriceModelType.MATRIX;
                                        name = "Ivan Bosco";
                                        packageConfig = new PricePackageConfig() {{
                                            packageAmount = "accusamus";
                                            packageSize = 829.71;
                                        }};
                                        planPhaseOrder = 4586.04;
                                        tieredBpsConfig = new PriceTieredBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 7241.68;
                                                    maximumAmount = "vero";
                                                    minimumAmount = "aliquid";
                                                    perUnitMaximum = "quasi";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 9040.45;
                                                    maximumAmount = "vel";
                                                    minimumAmount = "harum";
                                                    perUnitMaximum = "molestiae";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 6996.22;
                                                    maximumAmount = "occaecati";
                                                    minimumAmount = "minima";
                                                    perUnitMaximum = "distinctio";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 7567.79;
                                                    maximumAmount = "sit";
                                                    minimumAmount = "culpa";
                                                    perUnitMaximum = "tempore";
                                                }}),
                                            }};
                                        }};
                                        tieredConfig = new PriceTieredConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "cumque";
                                                    lastUnit = "consequuntur";
                                                    unitAmount = "consequatur";
                                                }}),
                                            }};
                                        }};
                                        unitConfig = new PriceUnitConfig() {{
                                            unitAmount = "minus";
                                        }};
                                    }}),
                                }},                 new PlanProduct(OffsetDateTime.parse("2020-07-16T06:14:24.154Z"), "quia", "eveniet");) {{
                    basePlan = new PlanBasePlan() {{
                        externalPlanId = "asperiores";
                        id = "d121aa6f-1e67-44bd-b04f-15756082d68e";
                        name = "Roger Monahan PhD";
                    }};;
                    basePlanId = "et";
                    defaultInvoiceMemo = "voluptate";
                    externalPlanId = "ipsa";
                    netTerms = 326701L;
                    planPhases = new Orb.Orb.models.shared.PlanPhase[]{{
                        add(new PlanPhase(                new Discount(DiscountDiscountType.PERCENTAGE) {{
                                            amountDiscount = "maiores";
                                            appliesToPriceIds = new String[]{{
                                                add("velit"),
                                                add("voluptatibus"),
                                                add("voluptas"),
                                            }};
                                            percentageDiscount = 0.15;
                                            trialAmountDiscount = "asperiores";
                                            usageDiscount = 456.59;
                                        }};, PlanPhaseDurationUnit.QUARTERLY,                 new MinimumAmount(                new String[]{{
                                                            add("consequuntur"),
                                                            add("repellendus"),
                                                        }}, "officia");) {{
                            description = "consectetur";
                            discount = new Discount(DiscountDiscountType.PERCENTAGE) {{
                                amountDiscount = "adipisci";
                                appliesToPriceIds = new String[]{{
                                    add("temporibus"),
                                    add("accusantium"),
                                    add("rem"),
                                }};
                                discountType = DiscountDiscountType.PERCENTAGE;
                                percentageDiscount = 0.15;
                                trialAmountDiscount = "aut";
                                usageDiscount = 5130.75;
                            }};
                            duration = 428796L;
                            durationUnit = PlanPhaseDurationUnit.QUARTERLY;
                            minimum = new MinimumAmount(                new String[]{{
                                                add("dolor"),
                                            }}, "occaecati") {{
                                appliesToPriceIds = new String[]{{
                                    add("corrupti"),
                                }};
                                minimumAmount = "non";
                            }};
                            name = "Leticia Christiansen IV";
                            order = 115484L;
                        }}),
                    }};
                    trialConfig = new PlanTrialConfig(PlanTrialConfigTrialPeriodUnit.DAYS) {{
                        trialPeriod = 8070.23;
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
                .setSecurity(new Security("dignissimos") {{
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

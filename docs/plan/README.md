# plan

## Overview

Actions related to plan management.

### Available Operations

* [get](#get) - Retrieve a plan
* [getByExternalId](#getbyexternalid) - Retrieve a plan by external plan ID
* [list](#list) - List plans

## get

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
                .setSecurity(new Security("maxime") {{
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetPlansPlanIdRequest req = new GetPlansPlanIdRequest("ea");            

            GetPlansPlanIdResponse res = sdk.plan.get(req);

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
import Orb.Orb.models.shared.Plan;
import Orb.Orb.models.shared.PlanPhase;
import Orb.Orb.models.shared.PlanPhaseDurationUnitEnum;
import Orb.Orb.models.shared.PlanProduct;
import Orb.Orb.models.shared.PlanTrialConfig;
import Orb.Orb.models.shared.PlanTrialConfigTrialPeriodUnitEnum;
import Orb.Orb.models.shared.Price;
import Orb.Orb.models.shared.PriceBillableMetric;
import Orb.Orb.models.shared.PriceBpsConfig;
import Orb.Orb.models.shared.PriceBulkBpsConfig;
import Orb.Orb.models.shared.PriceBulkBpsConfigTiers;
import Orb.Orb.models.shared.PriceBulkConfig;
import Orb.Orb.models.shared.PriceBulkConfigTiers;
import Orb.Orb.models.shared.PriceCadenceEnum;
import Orb.Orb.models.shared.PriceMatrixConfig;
import Orb.Orb.models.shared.PriceMatrixConfigMatrixValues;
import Orb.Orb.models.shared.PriceModelTypeEnum;
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
                .setSecurity(new Security("excepturi") {{
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetPlansExternalPlanIdRequest req = new GetPlansExternalPlanIdRequest("odit") {{
                plan = new Plan(OffsetDateTime.parse("2022-12-19T20:58:17.857Z"), "ab", "maiores",                 new java.util.HashMap<String, Object>() {{
                                    put("ipsam", "voluptate");
                                    put("autem", "nam");
                                    put("eaque", "pariatur");
                                }}, "nemo", "voluptatibus",                 new java.util.HashMap<String, Object>() {{
                                    put("fugiat", "amet");
                                }}, "aut",                 new Orb.Orb.models.shared.Price[]{{
                                    add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                        put("ipsum", "incidunt");
                                                        put("qui", "cupiditate");
                                                    }},                 new java.util.HashMap<String, Object>() {{
                                                        put("pariatur", "soluta");
                                                        put("dicta", "laborum");
                                                        put("totam", "incidunt");
                                                        put("aspernatur", "dolores");
                                                    }}, 7168.6) {{
                                        billableMetric = new PriceBillableMetric() {{
                                            id = "5fbb2587-0532-402c-b3d5-fe9b90c28909";
                                        }};
                                        bpsConfig = new PriceBpsConfig() {{
                                            bps = 6990.98;
                                            perUnitMaximum = "adipisci";
                                        }};
                                        bulkBpsConfig = new PriceBulkBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 9342.14;
                                                    maximumAmount = "modi";
                                                    perUnitMaximum = "iste";
                                                }}),
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 6790.91;
                                                    maximumAmount = "deleniti";
                                                    perUnitMaximum = "pariatur";
                                                }}),
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 5899.1;
                                                    maximumAmount = "nobis";
                                                    perUnitMaximum = "libero";
                                                }}),
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 9644.9;
                                                    maximumAmount = "quaerat";
                                                    perUnitMaximum = "quos";
                                                }}),
                                            }};
                                        }};
                                        bulkConfig = new PriceBulkConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "dolorem";
                                                    unitAmount = "dolorem";
                                                }}),
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "dolor";
                                                    unitAmount = "qui";
                                                }}),
                                            }};
                                        }};
                                        cadence = PriceCadenceEnum.ANNUAL;
                                        createdAt = OffsetDateTime.parse("2021-04-17T07:36:26.867Z");
                                        currency = "USD";
                                        discount = new java.util.HashMap<String, Object>() {{
                                            put("voluptate", "dignissimos");
                                            put("reiciendis", "amet");
                                            put("dolorum", "numquam");
                                        }};
                                        fixedPriceQuantity = 852.95;
                                        id = "00674ebf-6928-40d1-ba77-a89ebf737ae4";
                                        matrixConfig = new PriceMatrixConfig() {{
                                            defaultUnitAmount = "aspernatur";
                                            dimensions = new String[]{{
                                                add("amet"),
                                            }};
                                            matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("ad"),
                                                        add("saepe"),
                                                        add("suscipit"),
                                                        add("deserunt"),
                                                    }};
                                                    unitAmount = "provident";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
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
                                        minimum = new java.util.HashMap<String, Object>() {{
                                            put("dolorum", "a");
                                        }};
                                        modelType = PriceModelTypeEnum.PACKAGE_;
                                        name = "Tyrone Emard";
                                        packageConfig = new PricePackageConfig() {{
                                            packageAmount = "amet";
                                            packageSize = 7308.56;
                                        }};
                                        planPhaseOrder = 8802.98;
                                        tieredBpsConfig = new PriceTieredBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 3136.92;
                                                    maximumAmount = "dolorem";
                                                    minimumAmount = "sapiente";
                                                    perUnitMaximum = "totam";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 4717.52;
                                                    maximumAmount = "sit";
                                                    minimumAmount = "expedita";
                                                    perUnitMaximum = "neque";
                                                }}),
                                            }};
                                        }};
                                        tieredConfig = new PriceTieredConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "vel";
                                                    lastUnit = "libero";
                                                    unitAmount = "voluptas";
                                                }}),
                                            }};
                                        }};
                                        unitConfig = new PriceUnitConfig() {{
                                            unitAmount = "deserunt";
                                        }};
                                    }}),
                                    add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                        put("eum", "autem");
                                                    }},                 new java.util.HashMap<String, Object>() {{
                                                        put("quas", "assumenda");
                                                        put("nulla", "voluptas");
                                                        put("libero", "quasi");
                                                        put("tempora", "numquam");
                                                    }}, 1314.82) {{
                                        billableMetric = new PriceBillableMetric() {{
                                            id = "b679d232-2715-4bf0-8bb1-e31b8b90f344";
                                        }};
                                        bpsConfig = new PriceBpsConfig() {{
                                            bps = 2408.29;
                                            perUnitMaximum = "dolorum";
                                        }};
                                        bulkBpsConfig = new PriceBulkBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 630.38;
                                                    maximumAmount = "aut";
                                                    perUnitMaximum = "quas";
                                                }}),
                                            }};
                                        }};
                                        bulkConfig = new PriceBulkConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "consequatur";
                                                    unitAmount = "est";
                                                }}),
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "repellendus";
                                                    unitAmount = "porro";
                                                }}),
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "doloribus";
                                                    unitAmount = "ut";
                                                }}),
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "facilis";
                                                    unitAmount = "cupiditate";
                                                }}),
                                            }};
                                        }};
                                        cadence = PriceCadenceEnum.ANNUAL;
                                        createdAt = OffsetDateTime.parse("2022-06-27T23:25:59.184Z");
                                        currency = "USD";
                                        discount = new java.util.HashMap<String, Object>() {{
                                            put("occaecati", "voluptatibus");
                                            put("quisquam", "vero");
                                        }};
                                        fixedPriceQuantity = 6064.76;
                                        id = "53f73ef7-fbc7-4abd-b4dd-39c0f5d2cff7";
                                        matrixConfig = new PriceMatrixConfig() {{
                                            defaultUnitAmount = "eligendi";
                                            dimensions = new String[]{{
                                                add("alias"),
                                                add("officia"),
                                            }};
                                            matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("ea"),
                                                        add("aspernatur"),
                                                    }};
                                                    unitAmount = "vel";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("magnam"),
                                                        add("ratione"),
                                                        add("ex"),
                                                        add("laudantium"),
                                                    }};
                                                    unitAmount = "dicta";
                                                }}),
                                            }};
                                        }};
                                        minimum = new java.util.HashMap<String, Object>() {{
                                            put("maiores", "quasi");
                                        }};
                                        modelType = PriceModelTypeEnum.PACKAGE_;
                                        name = "Marshall Wiza";
                                        packageConfig = new PricePackageConfig() {{
                                            packageAmount = "quisquam";
                                            packageSize = 9065.56;
                                        }};
                                        planPhaseOrder = 4113.72;
                                        tieredBpsConfig = new PriceTieredBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 3592.71;
                                                    maximumAmount = "veniam";
                                                    minimumAmount = "aliquid";
                                                    perUnitMaximum = "inventore";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 3018.31;
                                                    maximumAmount = "ea";
                                                    minimumAmount = "quo";
                                                    perUnitMaximum = "consectetur";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 9262.13;
                                                    maximumAmount = "aspernatur";
                                                    minimumAmount = "minima";
                                                    perUnitMaximum = "eaque";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 9528.71;
                                                    maximumAmount = "libero";
                                                    minimumAmount = "aut";
                                                    perUnitMaximum = "aut";
                                                }}),
                                            }};
                                        }};
                                        tieredConfig = new PriceTieredConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "impedit";
                                                    lastUnit = "aliquam";
                                                    unitAmount = "fugit";
                                                }}),
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "accusamus";
                                                    lastUnit = "inventore";
                                                    unitAmount = "non";
                                                }}),
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "et";
                                                    lastUnit = "dolorum";
                                                    unitAmount = "laborum";
                                                }}),
                                            }};
                                        }};
                                        unitConfig = new PriceUnitConfig() {{
                                            unitAmount = "placeat";
                                        }};
                                    }}),
                                    add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                        put("qui", "quibusdam");
                                                        put("ex", "deleniti");
                                                        put("itaque", "dolorum");
                                                    }},                 new java.util.HashMap<String, Object>() {{
                                                        put("omnis", "tenetur");
                                                    }}, 984.78) {{
                                        billableMetric = new PriceBillableMetric() {{
                                            id = "90747477-8a7b-4d46-ad28-c10ab3cdca42";
                                        }};
                                        bpsConfig = new PriceBpsConfig() {{
                                            bps = 3738.13;
                                            perUnitMaximum = "ab";
                                        }};
                                        bulkBpsConfig = new PriceBulkBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 96.88;
                                                    maximumAmount = "tempora";
                                                    perUnitMaximum = "debitis";
                                                }}),
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 3708.53;
                                                    maximumAmount = "aspernatur";
                                                    perUnitMaximum = "sequi";
                                                }}),
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 7791.92;
                                                    maximumAmount = "esse";
                                                    perUnitMaximum = "recusandae";
                                                }}),
                                            }};
                                        }};
                                        bulkConfig = new PriceBulkConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "distinctio";
                                                    unitAmount = "quod";
                                                }}),
                                            }};
                                        }};
                                        cadence = PriceCadenceEnum.MONTHLY;
                                        createdAt = OffsetDateTime.parse("2022-07-13T15:11:40.912Z");
                                        currency = "USD";
                                        discount = new java.util.HashMap<String, Object>() {{
                                            put("accusamus", "aliquam");
                                            put("odio", "occaecati");
                                            put("commodi", "sapiente");
                                        }};
                                        fixedPriceQuantity = 1741.12;
                                        id = "a70c6882-82aa-4482-962f-222e9817ee17";
                                        matrixConfig = new PriceMatrixConfig() {{
                                            defaultUnitAmount = "quod";
                                            dimensions = new String[]{{
                                                add("vero"),
                                                add("aliquid"),
                                                add("quasi"),
                                            }};
                                            matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("harum"),
                                                        add("molestiae"),
                                                    }};
                                                    unitAmount = "rerum";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("minima"),
                                                        add("distinctio"),
                                                        add("eligendi"),
                                                    }};
                                                    unitAmount = "sit";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("tempore"),
                                                        add("adipisci"),
                                                        add("cumque"),
                                                    }};
                                                    unitAmount = "consequuntur";
                                                }}),
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("minus"),
                                                    }};
                                                    unitAmount = "quaerat";
                                                }}),
                                            }};
                                        }};
                                        minimum = new java.util.HashMap<String, Object>() {{
                                            put("consectetur", "esse");
                                            put("blanditiis", "provident");
                                            put("a", "nulla");
                                            put("quas", "esse");
                                        }};
                                        modelType = PriceModelTypeEnum.UNIT;
                                        name = "Jeremiah Mayer";
                                        packageConfig = new PricePackageConfig() {{
                                            packageAmount = "quia";
                                            packageSize = 9088.44;
                                        }};
                                        planPhaseOrder = 9924.3;
                                        tieredBpsConfig = new PriceTieredBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 850.01;
                                                    maximumAmount = "consequuntur";
                                                    minimumAmount = "quasi";
                                                    perUnitMaximum = "similique";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 6336.08;
                                                    maximumAmount = "aliquid";
                                                    minimumAmount = "tenetur";
                                                    perUnitMaximum = "quae";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 9367.47;
                                                    maximumAmount = "vel";
                                                    minimumAmount = "in";
                                                    perUnitMaximum = "eius";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 7276.97;
                                                    maximumAmount = "illum";
                                                    minimumAmount = "soluta";
                                                    perUnitMaximum = "accusantium";
                                                }}),
                                            }};
                                        }};
                                        tieredConfig = new PriceTieredConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "sapiente";
                                                    lastUnit = "dicta";
                                                    unitAmount = "ullam";
                                                }}),
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "reprehenderit";
                                                    lastUnit = "ullam";
                                                    unitAmount = "nisi";
                                                }}),
                                            }};
                                        }};
                                        unitConfig = new PriceUnitConfig() {{
                                            unitAmount = "aut";
                                        }};
                                    }}),
                                    add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                        put("sit", "rerum");
                                                        put("sed", "reiciendis");
                                                        put("explicabo", "asperiores");
                                                        put("facilis", "voluptate");
                                                    }},                 new java.util.HashMap<String, Object>() {{
                                                        put("ab", "iste");
                                                        put("dolore", "laborum");
                                                        put("sed", "in");
                                                    }}, 4174.86) {{
                                        billableMetric = new PriceBillableMetric() {{
                                            id = "d1705133-9d08-4086-a184-0394c26071f9";
                                        }};
                                        bpsConfig = new PriceBpsConfig() {{
                                            bps = 2446.51;
                                            perUnitMaximum = "voluptatibus";
                                        }};
                                        bulkBpsConfig = new PriceBulkBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 9903.45;
                                                    maximumAmount = "aperiam";
                                                    perUnitMaximum = "ea";
                                                }}),
                                                add(new PriceBulkBpsConfigTiers() {{
                                                    bps = 3100.67;
                                                    maximumAmount = "consequuntur";
                                                    perUnitMaximum = "repellendus";
                                                }}),
                                            }};
                                        }};
                                        bulkConfig = new PriceBulkConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "maxime";
                                                    unitAmount = "dignissimos";
                                                }}),
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "officia";
                                                    unitAmount = "asperiores";
                                                }}),
                                                add(new PriceBulkConfigTiers() {{
                                                    maximumUnits = "nemo";
                                                    unitAmount = "quae";
                                                }}),
                                            }};
                                        }};
                                        cadence = PriceCadenceEnum.ANNUAL;
                                        createdAt = OffsetDateTime.parse("2020-08-05T23:44:45.300Z");
                                        currency = "USD";
                                        discount = new java.util.HashMap<String, Object>() {{
                                            put("ab", "adipisci");
                                            put("fuga", "id");
                                        }};
                                        fixedPriceQuantity = 3807.29;
                                        id = "3aae8d67-864d-4bb6-b5fd-5e60b375ed4f";
                                        matrixConfig = new PriceMatrixConfig() {{
                                            defaultUnitAmount = "suscipit";
                                            dimensions = new String[]{{
                                                add("quidem"),
                                                add("saepe"),
                                                add("necessitatibus"),
                                                add("dolore"),
                                            }};
                                            matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                add(new PriceMatrixConfigMatrixValues() {{
                                                    dimensionValues = new String[]{{
                                                        add("adipisci"),
                                                        add("non"),
                                                        add("amet"),
                                                        add("beatae"),
                                                    }};
                                                    unitAmount = "dignissimos";
                                                }}),
                                            }};
                                        }};
                                        minimum = new java.util.HashMap<String, Object>() {{
                                            put("debitis", "consectetur");
                                            put("corporis", "harum");
                                            put("laboriosam", "ipsa");
                                            put("voluptates", "libero");
                                        }};
                                        modelType = PriceModelTypeEnum.UNIT;
                                        name = "Otis Goldner";
                                        packageConfig = new PricePackageConfig() {{
                                            packageAmount = "voluptas";
                                            packageSize = 3742.96;
                                        }};
                                        planPhaseOrder = 3244.05;
                                        tieredBpsConfig = new PriceTieredBpsConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 6801.16;
                                                    maximumAmount = "adipisci";
                                                    minimumAmount = "minus";
                                                    perUnitMaximum = "dolores";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 5039.34;
                                                    maximumAmount = "in";
                                                    minimumAmount = "dolore";
                                                    perUnitMaximum = "aliquam";
                                                }}),
                                                add(new PriceTieredBpsConfigTiers() {{
                                                    bps = 8859.63;
                                                    maximumAmount = "temporibus";
                                                    minimumAmount = "ullam";
                                                    perUnitMaximum = "adipisci";
                                                }}),
                                            }};
                                        }};
                                        tieredConfig = new PriceTieredConfig() {{
                                            tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "blanditiis";
                                                    lastUnit = "quas";
                                                    unitAmount = "hic";
                                                }}),
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "nesciunt";
                                                    lastUnit = "culpa";
                                                    unitAmount = "corrupti";
                                                }}),
                                                add(new PriceTieredConfigTiers() {{
                                                    firstUnit = "pariatur";
                                                    lastUnit = "totam";
                                                    unitAmount = "hic";
                                                }}),
                                            }};
                                        }};
                                        unitConfig = new PriceUnitConfig() {{
                                            unitAmount = "exercitationem";
                                        }};
                                    }}),
                                }},                 new PlanProduct(OffsetDateTime.parse("2022-09-27T03:48:38.490Z"), "voluptas", "unde");) {{
                    basePlanId = "architecto";
                    externalPlanId = "suscipit";
                    planPhases = new Orb.Orb.models.shared.PlanPhase[]{{
                        add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                            put("voluptate", "reiciendis");
                                            put("ex", "sit");
                                        }}, PlanPhaseDurationUnitEnum.MONTHLY,                 new java.util.HashMap<String, Object>() {{
                                            put("praesentium", "facilis");
                                            put("quaerat", "incidunt");
                                            put("ipsam", "debitis");
                                            put("rem", "sit");
                                        }}) {{
                            description = "debitis";
                            discount = new java.util.HashMap<String, Object>() {{
                                put("reiciendis", "perferendis");
                            }};
                            duration = 546885L;
                            durationUnit = PlanPhaseDurationUnitEnum.ANNUAL;
                            minimum = new java.util.HashMap<String, Object>() {{
                                put("sed", "provident");
                                put("eius", "necessitatibus");
                            }};
                            name = "Rosemary McClure";
                            order = 271653L;
                        }}),
                        add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                            put("error", "hic");
                                            put("expedita", "debitis");
                                            put("neque", "dolorum");
                                        }}, PlanPhaseDurationUnitEnum.QUARTERLY,                 new java.util.HashMap<String, Object>() {{
                                            put("dolorum", "corrupti");
                                            put("accusamus", "tempora");
                                            put("atque", "fugit");
                                        }}) {{
                            description = "nobis";
                            discount = new java.util.HashMap<String, Object>() {{
                                put("veniam", "minima");
                                put("recusandae", "reiciendis");
                                put("nulla", "magni");
                            }};
                            duration = 48690L;
                            durationUnit = PlanPhaseDurationUnitEnum.ANNUAL;
                            minimum = new java.util.HashMap<String, Object>() {{
                                put("veniam", "in");
                                put("officiis", "beatae");
                            }};
                            name = "Jorge Langosh";
                            order = 680515L;
                        }}),
                        add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                            put("dicta", "architecto");
                                            put("occaecati", "labore");
                                            put("quidem", "atque");
                                        }}, PlanPhaseDurationUnitEnum.ANNUAL,                 new java.util.HashMap<String, Object>() {{
                                            put("tenetur", "laboriosam");
                                            put("alias", "amet");
                                            put("deserunt", "voluptate");
                                        }}) {{
                            description = "ut";
                            discount = new java.util.HashMap<String, Object>() {{
                                put("voluptatem", "culpa");
                                put("expedita", "magnam");
                                put("consequatur", "esse");
                                put("ipsam", "sit");
                            }};
                            duration = 530537L;
                            durationUnit = PlanPhaseDurationUnitEnum.QUARTERLY;
                            minimum = new java.util.HashMap<String, Object>() {{
                                put("corporis", "et");
                                put("blanditiis", "ex");
                                put("sed", "sit");
                                put("vel", "nostrum");
                            }};
                            name = "Evan Altenwerth";
                            order = 209750L;
                        }}),
                        add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                            put("et", "esse");
                                            put("amet", "assumenda");
                                            put("ea", "atque");
                                            put("error", "officiis");
                                        }}, PlanPhaseDurationUnitEnum.ANNUAL,                 new java.util.HashMap<String, Object>() {{
                                            put("natus", "minima");
                                            put("aspernatur", "ex");
                                            put("maiores", "corrupti");
                                            put("at", "error");
                                        }}) {{
                            description = "unde";
                            discount = new java.util.HashMap<String, Object>() {{
                                put("provident", "repellendus");
                                put("delectus", "voluptates");
                                put("perferendis", "est");
                                put("quidem", "reprehenderit");
                            }};
                            duration = 813679L;
                            durationUnit = PlanPhaseDurationUnitEnum.ANNUAL;
                            minimum = new java.util.HashMap<String, Object>() {{
                                put("mollitia", "veniam");
                                put("voluptatem", "quisquam");
                                put("repudiandae", "quasi");
                            }};
                            name = "Mitchell Zboncak";
                            order = 693957L;
                        }}),
                    }};
                    trialConfig = new PlanTrialConfig(PlanTrialConfigTrialPeriodUnitEnum.DAYS) {{
                        trialPeriod = 5027.21;
                    }};;
                }};;
            }};            

            GetPlansExternalPlanIdResponse res = sdk.plan.getByExternalId(req);

            if (res.statusCode == 200) {
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

The list of plans is ordered starting from the most recently created plan. The response also includes [`pagination_metadata`](../reference/Orb-API.json/components/schemas/Pagination-metadata), which lets the caller retrieve the next page of results if they exist. More information about pagination can be found in the [Pagination-metadata schema](../reference/Orb-API.json/components/schemas/Pagination-metadata).


### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.ListPlansRequestBody;
import Orb.Orb.models.operations.ListPlansResponse;
import Orb.Orb.models.shared.Plan;
import Orb.Orb.models.shared.PlanPhase;
import Orb.Orb.models.shared.PlanPhaseDurationUnitEnum;
import Orb.Orb.models.shared.PlanProduct;
import Orb.Orb.models.shared.PlanTrialConfig;
import Orb.Orb.models.shared.PlanTrialConfigTrialPeriodUnitEnum;
import Orb.Orb.models.shared.Price;
import Orb.Orb.models.shared.PriceBillableMetric;
import Orb.Orb.models.shared.PriceBpsConfig;
import Orb.Orb.models.shared.PriceBulkBpsConfig;
import Orb.Orb.models.shared.PriceBulkBpsConfigTiers;
import Orb.Orb.models.shared.PriceBulkConfig;
import Orb.Orb.models.shared.PriceBulkConfigTiers;
import Orb.Orb.models.shared.PriceCadenceEnum;
import Orb.Orb.models.shared.PriceMatrixConfig;
import Orb.Orb.models.shared.PriceMatrixConfigMatrixValues;
import Orb.Orb.models.shared.PriceModelTypeEnum;
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
                .setSecurity(new Security("suscipit") {{
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            ListPlansRequestBody req = new ListPlansRequestBody() {{
                data = new Orb.Orb.models.shared.Plan[]{{
                    add(new Plan(OffsetDateTime.parse("2020-10-17T04:42:29.949Z"), "vero", "odit",                 new java.util.HashMap<String, Object>() {{
                                        put("pariatur", "nemo");
                                        put("reprehenderit", "aperiam");
                                        put("odio", "minima");
                                        put("in", "ducimus");
                                    }}, "excepturi", "dolores",                 new java.util.HashMap<String, Object>() {{
                                        put("veritatis", "ducimus");
                                        put("voluptate", "pariatur");
                                        put("itaque", "similique");
                                    }}, "optio",                 new Orb.Orb.models.shared.Price[]{{
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("labore", "assumenda");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("quisquam", "provident");
                                                            put("laudantium", "repudiandae");
                                                        }}, 96.83) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "46ecb573-409e-43eb-9e5a-2b12eb07f116";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 8634.71;
                                                perUnitMaximum = "libero";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 5782.1;
                                                        maximumAmount = "nemo";
                                                        perUnitMaximum = "aliquam";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 3423.42;
                                                        maximumAmount = "doloribus";
                                                        perUnitMaximum = "eligendi";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 5740.32;
                                                        maximumAmount = "enim";
                                                        perUnitMaximum = "hic";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "quas";
                                                        unitAmount = "totam";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "molestias";
                                                        unitAmount = "odio";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "eaque";
                                                        unitAmount = "saepe";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.ANNUAL;
                                            createdAt = OffsetDateTime.parse("2021-10-09T11:02:42.252Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("tempore", "libero");
                                                put("velit", "doloremque");
                                                put("delectus", "impedit");
                                                put("cum", "ipsum");
                                            }};
                                            fixedPriceQuantity = 2380.11;
                                            id = "ea055b19-7cd4-44e2-b52d-82d3513bb6f4";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "blanditiis";
                                                dimensions = new String[]{{
                                                    add("nisi"),
                                                    add("quis"),
                                                    add("nisi"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("facere"),
                                                            add("facilis"),
                                                            add("ipsum"),
                                                            add("ad"),
                                                        }};
                                                        unitAmount = "voluptatibus";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("consequuntur"),
                                                            add("debitis"),
                                                            add("labore"),
                                                            add("rerum"),
                                                        }};
                                                        unitAmount = "eos";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("nostrum"),
                                                            add("neque"),
                                                        }};
                                                        unitAmount = "iusto";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("rem", "eligendi");
                                                put("fugiat", "unde");
                                                put("officiis", "ducimus");
                                            }};
                                            modelType = PriceModelTypeEnum.TIERED;
                                            name = "Ms. Sabrina Schaden";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "fugiat";
                                                packageSize = 3223.33;
                                            }};
                                            planPhaseOrder = 1348.18;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 9650.9;
                                                        maximumAmount = "iusto";
                                                        minimumAmount = "dignissimos";
                                                        perUnitMaximum = "libero";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 723.5;
                                                        maximumAmount = "ab";
                                                        minimumAmount = "incidunt";
                                                        perUnitMaximum = "accusamus";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "tempore";
                                                        lastUnit = "veniam";
                                                        unitAmount = "eos";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "reiciendis";
                                                        lastUnit = "earum";
                                                        unitAmount = "reprehenderit";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "praesentium";
                                                        lastUnit = "nemo";
                                                        unitAmount = "repellat";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "quisquam";
                                                        lastUnit = "sequi";
                                                        unitAmount = "nihil";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "deleniti";
                                            }};
                                        }}),
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("veniam", "reiciendis");
                                                            put("ab", "modi");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("aut", "eveniet");
                                                        }}, 4837.53) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "c2bb89eb-75da-4d63-ac60-0503d8bb3118";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 407.1;
                                                perUnitMaximum = "earum";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 2286.46;
                                                        maximumAmount = "provident";
                                                        perUnitMaximum = "dolorum";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 8979.56;
                                                        maximumAmount = "provident";
                                                        perUnitMaximum = "repudiandae";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "nemo";
                                                        unitAmount = "molestiae";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.QUARTERLY;
                                            createdAt = OffsetDateTime.parse("2021-11-28T13:56:44.956Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("sint", "accusamus");
                                            }};
                                            fixedPriceQuantity = 1786.35;
                                            id = "810331f3-981d-44c7-80b6-07f3c93c73b9";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "temporibus";
                                                dimensions = new String[]{{
                                                    add("amet"),
                                                    add("tenetur"),
                                                    add("aspernatur"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("illum"),
                                                            add("laborum"),
                                                            add("dignissimos"),
                                                            add("vero"),
                                                        }};
                                                        unitAmount = "qui";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("repellat"),
                                                        }};
                                                        unitAmount = "explicabo";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("exercitationem"),
                                                        }};
                                                        unitAmount = "nihil";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("ab"),
                                                            add("illo"),
                                                        }};
                                                        unitAmount = "hic";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("delectus", "non");
                                                put("distinctio", "in");
                                                put("exercitationem", "labore");
                                            }};
                                            modelType = PriceModelTypeEnum.BULK;
                                            name = "Dr. Joel Kirlin";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "aperiam";
                                                packageSize = 1418.17;
                                            }};
                                            planPhaseOrder = 5358.02;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 4527.3;
                                                        maximumAmount = "similique";
                                                        minimumAmount = "minima";
                                                        perUnitMaximum = "libero";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 3001.89;
                                                        maximumAmount = "sit";
                                                        minimumAmount = "modi";
                                                        perUnitMaximum = "eum";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "mollitia";
                                                        lastUnit = "dignissimos";
                                                        unitAmount = "fugiat";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "nostrum";
                                            }};
                                        }}),
                                    }},                 new PlanProduct(OffsetDateTime.parse("2022-09-29T12:26:34.592Z"), "dolorum", "possimus");) {{
                        basePlanId = "atque";
                        createdAt = OffsetDateTime.parse("2022-10-04T17:29:33.184Z");
                        currency = "recusandae";
                        description = "dolorum";
                        discount = new java.util.HashMap<String, Object>() {{
                            put("labore", "reiciendis");
                            put("doloremque", "repudiandae");
                            put("dicta", "accusantium");
                            put("beatae", "dolores");
                        }};
                        externalPlanId = "enim";
                        id = "63f94e29-e973-4e92-aa57-a15be3e06080";
                        invoicingCurrency = "molestiae";
                        minimum = new java.util.HashMap<String, Object>() {{
                            put("qui", "cum");
                            put("iure", "necessitatibus");
                            put("ratione", "laborum");
                            put("distinctio", "voluptatum");
                        }};
                        name = "Jim Hammes II";
                        planPhases = new Orb.Orb.models.shared.PlanPhase[]{{
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("nemo", "recusandae");
                                                put("esse", "provident");
                                            }}, PlanPhaseDurationUnitEnum.QUARTERLY,                 new java.util.HashMap<String, Object>() {{
                                                put("reiciendis", "provident");
                                                put("aspernatur", "ullam");
                                            }}) {{
                                description = "nihil";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("voluptas", "alias");
                                    put("maiores", "reiciendis");
                                    put("dolores", "id");
                                }};
                                duration = 327988L;
                                durationUnit = PlanPhaseDurationUnitEnum.MONTHLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("nesciunt", "quae");
                                    put("recusandae", "omnis");
                                    put("quaerat", "molestiae");
                                }};
                                name = "April Nader";
                                order = 514513L;
                            }}),
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("rerum", "tempora");
                                            }}, PlanPhaseDurationUnitEnum.QUARTERLY,                 new java.util.HashMap<String, Object>() {{
                                                put("fugit", "cumque");
                                            }}) {{
                                description = "quasi";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("nostrum", "mollitia");
                                    put("provident", "possimus");
                                    put("animi", "ex");
                                }};
                                duration = 397257L;
                                durationUnit = PlanPhaseDurationUnitEnum.MONTHLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("doloribus", "ullam");
                                    put("in", "nam");
                                    put("earum", "officia");
                                    put("laborum", "placeat");
                                }};
                                name = "Tami Maggio";
                                order = 764562L;
                            }}),
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("illum", "eaque");
                                                put("earum", "perspiciatis");
                                                put("maiores", "debitis");
                                                put("aliquid", "porro");
                                            }}, PlanPhaseDurationUnitEnum.QUARTERLY,                 new java.util.HashMap<String, Object>() {{
                                                put("fugit", "cumque");
                                            }}) {{
                                description = "quae";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("velit", "aspernatur");
                                }};
                                duration = 432281L;
                                durationUnit = PlanPhaseDurationUnitEnum.MONTHLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("at", "impedit");
                                    put("eos", "sapiente");
                                    put("eum", "dicta");
                                }};
                                name = "Teresa McCullough";
                                order = 745398L;
                            }}),
                        }};
                        prices = new Orb.Orb.models.shared.Price[]{{
                            add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                put("laudantium", "quae");
                                            }},                 new java.util.HashMap<String, Object>() {{
                                                put("fugiat", "ipsam");
                                            }}, 1621.2) {{
                                billableMetric = new PriceBillableMetric() {{
                                    id = "3aed0117-9963-412f-9e04-771778ff61d0";
                                }};
                                bpsConfig = new PriceBpsConfig() {{
                                    bps = 1173.15;
                                    perUnitMaximum = "odio";
                                }};
                                bulkBpsConfig = new PriceBulkBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 4582.59;
                                            maximumAmount = "ex";
                                            perUnitMaximum = "consectetur";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 3998.12;
                                            maximumAmount = "ipsa";
                                            perUnitMaximum = "laborum";
                                        }}),
                                    }};
                                }};
                                bulkConfig = new PriceBulkConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "nostrum";
                                            unitAmount = "fugiat";
                                        }}),
                                    }};
                                }};
                                cadence = PriceCadenceEnum.QUARTERLY;
                                createdAt = OffsetDateTime.parse("2022-05-12T16:43:21.506Z");
                                currency = "USD";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("aliquid", "perferendis");
                                    put("eum", "voluptas");
                                }};
                                fixedPriceQuantity = 6145.28;
                                id = "a1adeaab-5851-4d6c-a45b-08b61891baa0";
                                matrixConfig = new PriceMatrixConfig() {{
                                    defaultUnitAmount = "sapiente";
                                    dimensions = new String[]{{
                                        add("architecto"),
                                        add("fuga"),
                                        add("pariatur"),
                                        add("debitis"),
                                    }};
                                    matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("deleniti"),
                                            }};
                                            unitAmount = "earum";
                                        }}),
                                    }};
                                }};
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("sapiente", "rem");
                                    put("minus", "nemo");
                                }};
                                modelType = PriceModelTypeEnum.MATRIX;
                                name = "Marion Aufderhar";
                                packageConfig = new PricePackageConfig() {{
                                    packageAmount = "impedit";
                                    packageSize = 8427.77;
                                }};
                                planPhaseOrder = 7205.28;
                                tieredBpsConfig = new PriceTieredBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 6334.15;
                                            maximumAmount = "dolor";
                                            minimumAmount = "aliquam";
                                            perUnitMaximum = "inventore";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 5372.79;
                                            maximumAmount = "veritatis";
                                            minimumAmount = "tempora";
                                            perUnitMaximum = "dolor";
                                        }}),
                                    }};
                                }};
                                tieredConfig = new PriceTieredConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "architecto";
                                            lastUnit = "sit";
                                            unitAmount = "modi";
                                        }}),
                                    }};
                                }};
                                unitConfig = new PriceUnitConfig() {{
                                    unitAmount = "fugit";
                                }};
                            }}),
                            add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                put("repudiandae", "nam");
                                                put("dolore", "iusto");
                                                put("voluptate", "sequi");
                                            }},                 new java.util.HashMap<String, Object>() {{
                                                put("neque", "quo");
                                                put("deleniti", "quibusdam");
                                            }}, 4378.14) {{
                                billableMetric = new PriceBillableMetric() {{
                                    id = "08ece7e2-53b6-4684-91c6-c6e205e16dea";
                                }};
                                bpsConfig = new PriceBpsConfig() {{
                                    bps = 6907.85;
                                    perUnitMaximum = "sequi";
                                }};
                                bulkBpsConfig = new PriceBulkBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 9180.92;
                                            maximumAmount = "optio";
                                            perUnitMaximum = "occaecati";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 3645.44;
                                            maximumAmount = "voluptate";
                                            perUnitMaximum = "blanditiis";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 6423.52;
                                            maximumAmount = "voluptas";
                                            perUnitMaximum = "numquam";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 3649.12;
                                            maximumAmount = "quos";
                                            perUnitMaximum = "eius";
                                        }}),
                                    }};
                                }};
                                bulkConfig = new PriceBulkConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "ducimus";
                                            unitAmount = "nesciunt";
                                        }}),
                                    }};
                                }};
                                cadence = PriceCadenceEnum.QUARTERLY;
                                createdAt = OffsetDateTime.parse("2022-06-12T12:59:53.732Z");
                                currency = "USD";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("rem", "fugiat");
                                }};
                                fixedPriceQuantity = 1173.8;
                                id = "62309fb0-9299-421a-afb9-f58c4d86e68e";
                                matrixConfig = new PriceMatrixConfig() {{
                                    defaultUnitAmount = "modi";
                                    dimensions = new String[]{{
                                        add("vero"),
                                        add("voluptatem"),
                                        add("ipsam"),
                                    }};
                                    matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("quasi"),
                                            }};
                                            unitAmount = "non";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("enim"),
                                                add("sint"),
                                                add("nulla"),
                                                add("deserunt"),
                                            }};
                                            unitAmount = "esse";
                                        }}),
                                    }};
                                }};
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("reprehenderit", "est");
                                    put("quis", "sint");
                                }};
                                modelType = PriceModelTypeEnum.MATRIX;
                                name = "Irvin Tromp";
                                packageConfig = new PricePackageConfig() {{
                                    packageAmount = "voluptas";
                                    packageSize = 8953.46;
                                }};
                                planPhaseOrder = 9661.48;
                                tieredBpsConfig = new PriceTieredBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 7918.8;
                                            maximumAmount = "fuga";
                                            minimumAmount = "laborum";
                                            perUnitMaximum = "consectetur";
                                        }}),
                                    }};
                                }};
                                tieredConfig = new PriceTieredConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "atque";
                                            lastUnit = "ipsum";
                                            unitAmount = "impedit";
                                        }}),
                                    }};
                                }};
                                unitConfig = new PriceUnitConfig() {{
                                    unitAmount = "magni";
                                }};
                            }}),
                            add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                put("corporis", "error");
                                            }},                 new java.util.HashMap<String, Object>() {{
                                                put("adipisci", "recusandae");
                                                put("similique", "ut");
                                                put("quidem", "quis");
                                                put("beatae", "unde");
                                            }}, 4769.46) {{
                                billableMetric = new PriceBillableMetric() {{
                                    id = "2f64d1db-1f2c-4431-8661-e96349e1cf9e";
                                }};
                                bpsConfig = new PriceBpsConfig() {{
                                    bps = 26.77;
                                    perUnitMaximum = "nisi";
                                }};
                                bulkBpsConfig = new PriceBulkBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 2421.78;
                                            maximumAmount = "laborum";
                                            perUnitMaximum = "non";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 2244.67;
                                            maximumAmount = "iusto";
                                            perUnitMaximum = "sit";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 399.92;
                                            maximumAmount = "consequatur";
                                            perUnitMaximum = "officia";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 9274.03;
                                            maximumAmount = "ea";
                                            perUnitMaximum = "quidem";
                                        }}),
                                    }};
                                }};
                                bulkConfig = new PriceBulkConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "facilis";
                                            unitAmount = "placeat";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "perspiciatis";
                                            unitAmount = "expedita";
                                        }}),
                                    }};
                                }};
                                cadence = PriceCadenceEnum.MONTHLY;
                                createdAt = OffsetDateTime.parse("2021-08-20T03:23:43.072Z");
                                currency = "USD";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("unde", "necessitatibus");
                                    put("animi", "impedit");
                                }};
                                fixedPriceQuantity = 3730.4;
                                id = "5a9741d3-1135-4296-9bb8-a7202611435e";
                                matrixConfig = new PriceMatrixConfig() {{
                                    defaultUnitAmount = "et";
                                    dimensions = new String[]{{
                                        add("unde"),
                                    }};
                                    matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("maxime"),
                                                add("quia"),
                                                add("quia"),
                                            }};
                                            unitAmount = "nostrum";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("libero"),
                                                add("dicta"),
                                                add("id"),
                                            }};
                                            unitAmount = "libero";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("officia"),
                                                add("quos"),
                                                add("placeat"),
                                                add("sit"),
                                            }};
                                            unitAmount = "iusto";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("voluptates"),
                                            }};
                                            unitAmount = "inventore";
                                        }}),
                                    }};
                                }};
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("totam", "dolore");
                                }};
                                modelType = PriceModelTypeEnum.BULK_BPS;
                                name = "Kenneth Johnson";
                                packageConfig = new PricePackageConfig() {{
                                    packageAmount = "assumenda";
                                    packageSize = 1072.1;
                                }};
                                planPhaseOrder = 6686.06;
                                tieredBpsConfig = new PriceTieredBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 5459.18;
                                            maximumAmount = "molestiae";
                                            minimumAmount = "provident";
                                            perUnitMaximum = "accusamus";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 8964.8;
                                            maximumAmount = "tempore";
                                            minimumAmount = "sint";
                                            perUnitMaximum = "ea";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 4218.19;
                                            maximumAmount = "ipsam";
                                            minimumAmount = "rerum";
                                            perUnitMaximum = "laudantium";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 3572.07;
                                            maximumAmount = "officiis";
                                            minimumAmount = "voluptatibus";
                                            perUnitMaximum = "cum";
                                        }}),
                                    }};
                                }};
                                tieredConfig = new PriceTieredConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "alias";
                                            lastUnit = "quia";
                                            unitAmount = "quidem";
                                        }}),
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "fuga";
                                            lastUnit = "repudiandae";
                                            unitAmount = "accusantium";
                                        }}),
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "expedita";
                                            lastUnit = "officiis";
                                            unitAmount = "eos";
                                        }}),
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "quibusdam";
                                            lastUnit = "odio";
                                            unitAmount = "praesentium";
                                        }}),
                                    }};
                                }};
                                unitConfig = new PriceUnitConfig() {{
                                    unitAmount = "odit";
                                }};
                            }}),
                        }};
                        product = new PlanProduct(OffsetDateTime.parse("2020-12-12T09:57:14.382Z"), "nostrum", "est") {{
                            createdAt = OffsetDateTime.parse("2021-03-30T18:36:20.933Z");
                            id = "2443da7c-e52b-4895-8537-c6454efb0b34";
                            name = "Sergio Hirthe";
                        }};
                        trialConfig = new PlanTrialConfig(PlanTrialConfigTrialPeriodUnitEnum.DAYS) {{
                            trialPeriod = 7708.73;
                            trialPeriodUnit = PlanTrialConfigTrialPeriodUnitEnum.DAYS;
                        }};
                    }}),
                    add(new Plan(OffsetDateTime.parse("2022-11-18T14:17:14.435Z"), "minus", "commodi",                 new java.util.HashMap<String, Object>() {{
                                        put("porro", "tempore");
                                        put("quidem", "modi");
                                        put("voluptates", "fugit");
                                        put("eius", "sequi");
                                    }}, "eligendi", "asperiores",                 new java.util.HashMap<String, Object>() {{
                                        put("blanditiis", "sint");
                                        put("repellat", "a");
                                    }}, "animi",                 new Orb.Orb.models.shared.Price[]{{
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("ducimus", "adipisci");
                                                            put("recusandae", "tempora");
                                                            put("blanditiis", "numquam");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("voluptatum", "sit");
                                                        }}, 7031.89) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "eda53e5a-e6e0-4ac1-84c2-b9c247c88373";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 6751.26;
                                                perUnitMaximum = "modi";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 8970.58;
                                                        maximumAmount = "architecto";
                                                        perUnitMaximum = "molestias";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "sunt";
                                                        unitAmount = "maiores";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "neque";
                                                        unitAmount = "odit";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.QUARTERLY;
                                            createdAt = OffsetDateTime.parse("2022-08-17T19:35:32.022Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("exercitationem", "veniam");
                                            }};
                                            fixedPriceQuantity = 4699.94;
                                            id = "56f5d56d-0bd0-4af2-9fe1-3db4f62cba3f";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "praesentium";
                                                dimensions = new String[]{{
                                                    add("non"),
                                                    add("quasi"),
                                                    add("mollitia"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("cumque"),
                                                            add("doloremque"),
                                                            add("expedita"),
                                                        }};
                                                        unitAmount = "corrupti";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("deserunt"),
                                                        }};
                                                        unitAmount = "aliquid";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("magni"),
                                                            add("tempora"),
                                                            add("possimus"),
                                                        }};
                                                        unitAmount = "dolor";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("sed"),
                                                            add("accusamus"),
                                                            add("optio"),
                                                        }};
                                                        unitAmount = "delectus";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("quo", "quos");
                                                put("asperiores", "voluptatum");
                                                put("iste", "corporis");
                                                put("accusantium", "illo");
                                            }};
                                            modelType = PriceModelTypeEnum.UNIT;
                                            name = "Gordon Strosin";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "pariatur";
                                                packageSize = 4248.53;
                                            }};
                                            planPhaseOrder = 9608.13;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 651.21;
                                                        maximumAmount = "quos";
                                                        minimumAmount = "aperiam";
                                                        perUnitMaximum = "non";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 9132.84;
                                                        maximumAmount = "ad";
                                                        minimumAmount = "aliquam";
                                                        perUnitMaximum = "quisquam";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 5579.87;
                                                        maximumAmount = "consequuntur";
                                                        minimumAmount = "maiores";
                                                        perUnitMaximum = "inventore";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "laudantium";
                                                        lastUnit = "est";
                                                        unitAmount = "dolor";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "aliquid";
                                                        lastUnit = "consectetur";
                                                        unitAmount = "cumque";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "rem";
                                            }};
                                        }}),
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("modi", "sunt");
                                                            put("impedit", "eius");
                                                            put("voluptatum", "ipsa");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("dolorem", "repellat");
                                                            put("aspernatur", "inventore");
                                                            put("sequi", "fugit");
                                                            put("fuga", "hic");
                                                        }}, 494.99) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "1f6b8ca2-75a6-40a0-8c49-5cc699171b51";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 7665.91;
                                                perUnitMaximum = "dicta";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 8132.24;
                                                        maximumAmount = "facilis";
                                                        perUnitMaximum = "beatae";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 7672.1;
                                                        maximumAmount = "delectus";
                                                        perUnitMaximum = "labore";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 7126.4;
                                                        maximumAmount = "corrupti";
                                                        perUnitMaximum = "rem";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "officiis";
                                                        unitAmount = "cum";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "pariatur";
                                                        unitAmount = "sapiente";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "quo";
                                                        unitAmount = "incidunt";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.QUARTERLY;
                                            createdAt = OffsetDateTime.parse("2020-08-28T06:25:44.919Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("excepturi", "occaecati");
                                                put("libero", "quo");
                                                put("esse", "hic");
                                            }};
                                            fixedPriceQuantity = 8022.16;
                                            id = "0b2dce10-873e-442b-806d-678878ba8581";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "est";
                                                dimensions = new String[]{{
                                                    add("rem"),
                                                    add("magni"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("placeat"),
                                                            add("enim"),
                                                            add("labore"),
                                                        }};
                                                        unitAmount = "sapiente";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("delectus", "officia");
                                                put("natus", "cumque");
                                                put("natus", "quaerat");
                                                put("doloribus", "quia");
                                            }};
                                            modelType = PriceModelTypeEnum.MATRIX;
                                            name = "Noel Hauck";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "nemo";
                                                packageSize = 8493.37;
                                            }};
                                            planPhaseOrder = 2012.66;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 4871.48;
                                                        maximumAmount = "minus";
                                                        minimumAmount = "asperiores";
                                                        perUnitMaximum = "recusandae";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "praesentium";
                                                        lastUnit = "dicta";
                                                        unitAmount = "fugit";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "sit";
                                                        lastUnit = "aliquid";
                                                        unitAmount = "necessitatibus";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "sed";
                                                        lastUnit = "deleniti";
                                                        unitAmount = "sunt";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "nesciunt";
                                                        lastUnit = "delectus";
                                                        unitAmount = "laborum";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "aliquam";
                                            }};
                                        }}),
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("voluptatem", "optio");
                                                            put("sequi", "sunt");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("voluptatibus", "doloremque");
                                                        }}, 1494.98) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "3102d514-f4cc-46f1-8bf9-621a6a4f77a8";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 4610.5;
                                                perUnitMaximum = "eveniet";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 2464.02;
                                                        maximumAmount = "officiis";
                                                        perUnitMaximum = "eius";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 7019.78;
                                                        maximumAmount = "itaque";
                                                        perUnitMaximum = "dignissimos";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 3734.49;
                                                        maximumAmount = "explicabo";
                                                        perUnitMaximum = "impedit";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 3970.14;
                                                        maximumAmount = "quis";
                                                        perUnitMaximum = "facilis";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "ut";
                                                        unitAmount = "quaerat";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.ANNUAL;
                                            createdAt = OffsetDateTime.parse("2021-03-09T05:37:08.074Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("expedita", "libero");
                                            }};
                                            fixedPriceQuantity = 6152.77;
                                            id = "1c8d975e-0e84-419d-8f84-f144f3e07edc";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "cumque";
                                                dimensions = new String[]{{
                                                    add("dolorum"),
                                                    add("deserunt"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("sequi"),
                                                            add("porro"),
                                                            add("laborum"),
                                                            add("nobis"),
                                                        }};
                                                        unitAmount = "quibusdam";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("aut"),
                                                            add("ipsam"),
                                                            add("officia"),
                                                        }};
                                                        unitAmount = "cupiditate";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("quia", "necessitatibus");
                                                put("accusantium", "ad");
                                            }};
                                            modelType = PriceModelTypeEnum.PACKAGE_;
                                            name = "Lori Larkin";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "iusto";
                                                packageSize = 7128.93;
                                            }};
                                            planPhaseOrder = 1769.35;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 1998.79;
                                                        maximumAmount = "ipsa";
                                                        minimumAmount = "sint";
                                                        perUnitMaximum = "dolore";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 4570.63;
                                                        maximumAmount = "accusantium";
                                                        minimumAmount = "distinctio";
                                                        perUnitMaximum = "sapiente";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 4630.5;
                                                        maximumAmount = "est";
                                                        minimumAmount = "aliquam";
                                                        perUnitMaximum = "delectus";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 6358.68;
                                                        maximumAmount = "voluptatum";
                                                        minimumAmount = "iusto";
                                                        perUnitMaximum = "quod";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "voluptas";
                                                        lastUnit = "non";
                                                        unitAmount = "ullam";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "laborum";
                                                        lastUnit = "voluptas";
                                                        unitAmount = "doloribus";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "animi";
                                                        lastUnit = "recusandae";
                                                        unitAmount = "corporis";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "non";
                                                        lastUnit = "necessitatibus";
                                                        unitAmount = "distinctio";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "maiores";
                                            }};
                                        }}),
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("cum", "nobis");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("porro", "impedit");
                                                            put("nisi", "cumque");
                                                            put("soluta", "fugiat");
                                                        }}, 3892.87) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "3b75d236-7fe1-4a0c-88df-79f0a396d90c";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 1967;
                                                perUnitMaximum = "commodi";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 7100.59;
                                                        maximumAmount = "in";
                                                        perUnitMaximum = "quisquam";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 1237.95;
                                                        maximumAmount = "enim";
                                                        perUnitMaximum = "nulla";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "distinctio";
                                                        unitAmount = "mollitia";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "impedit";
                                                        unitAmount = "accusamus";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "et";
                                                        unitAmount = "quas";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "blanditiis";
                                                        unitAmount = "cum";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.ANNUAL;
                                            createdAt = OffsetDateTime.parse("2022-03-06T22:12:49.401Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("repudiandae", "sed");
                                                put("impedit", "quas");
                                                put("impedit", "vel");
                                                put("eligendi", "recusandae");
                                            }};
                                            fixedPriceQuantity = 4046.43;
                                            id = "11feeb1c-7cbd-4b6e-ac74-378ba2531774";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "odio";
                                                dimensions = new String[]{{
                                                    add("impedit"),
                                                    add("cupiditate"),
                                                    add("illo"),
                                                    add("exercitationem"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("fugit"),
                                                            add("maxime"),
                                                            add("dolorum"),
                                                            add("repellat"),
                                                        }};
                                                        unitAmount = "nostrum";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("quibusdam"),
                                                            add("commodi"),
                                                            add("esse"),
                                                            add("explicabo"),
                                                        }};
                                                        unitAmount = "consectetur";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("optio"),
                                                            add("ipsa"),
                                                            add("maiores"),
                                                            add("exercitationem"),
                                                        }};
                                                        unitAmount = "culpa";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("aspernatur", "sapiente");
                                                put("neque", "officia");
                                                put("suscipit", "harum");
                                                put("ducimus", "doloremque");
                                            }};
                                            modelType = PriceModelTypeEnum.UNIT;
                                            name = "Mathew Lockman";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "iure";
                                                packageSize = 685.96;
                                            }};
                                            planPhaseOrder = 3086.58;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 9569.42;
                                                        maximumAmount = "corporis";
                                                        minimumAmount = "est";
                                                        perUnitMaximum = "iure";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "provident";
                                                        lastUnit = "laudantium";
                                                        unitAmount = "nam";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "nemo";
                                                        lastUnit = "enim";
                                                        unitAmount = "ipsam";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "minima";
                                                        lastUnit = "tempora";
                                                        unitAmount = "perferendis";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "corrupti";
                                                        lastUnit = "doloremque";
                                                        unitAmount = "fugiat";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "numquam";
                                            }};
                                        }}),
                                    }},                 new PlanProduct(OffsetDateTime.parse("2022-05-15T18:24:57.713Z"), "maiores", "consectetur");) {{
                        basePlanId = "voluptate";
                        createdAt = OffsetDateTime.parse("2022-10-19T18:24:49.544Z");
                        currency = "quaerat";
                        description = "itaque";
                        discount = new java.util.HashMap<String, Object>() {{
                            put("sunt", "distinctio");
                            put("iusto", "quas");
                            put("et", "facilis");
                            put("amet", "autem");
                        }};
                        externalPlanId = "fuga";
                        id = "08088d10-0efa-4da2-80ef-0422eb2164cf";
                        invoicingCurrency = "molestias";
                        minimum = new java.util.HashMap<String, Object>() {{
                            put("libero", "totam");
                            put("sequi", "aliquid");
                            put("ea", "impedit");
                        }};
                        name = "Kathy Frami";
                        planPhases = new Orb.Orb.models.shared.PlanPhase[]{{
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("rem", "perferendis");
                                                put("facilis", "reiciendis");
                                                put("a", "iste");
                                                put("dicta", "quos");
                                            }}, PlanPhaseDurationUnitEnum.QUARTERLY,                 new java.util.HashMap<String, Object>() {{
                                                put("modi", "itaque");
                                                put("maxime", "modi");
                                            }}) {{
                                description = "laborum";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("accusamus", "doloremque");
                                    put("nisi", "rerum");
                                    put("recusandae", "voluptates");
                                }};
                                duration = 251627L;
                                durationUnit = PlanPhaseDurationUnitEnum.QUARTERLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("ullam", "quisquam");
                                }};
                                name = "Dr. Shari Roob Sr.";
                                order = 317898L;
                            }}),
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("distinctio", "eius");
                                                put("ipsa", "rem");
                                            }}, PlanPhaseDurationUnitEnum.ANNUAL,                 new java.util.HashMap<String, Object>() {{
                                                put("veniam", "saepe");
                                            }}) {{
                                description = "consequuntur";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("vero", "doloribus");
                                    put("impedit", "porro");
                                    put("accusamus", "totam");
                                    put("reiciendis", "ab");
                                }};
                                duration = 573444L;
                                durationUnit = PlanPhaseDurationUnitEnum.QUARTERLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("iure", "odio");
                                    put("nesciunt", "debitis");
                                }};
                                name = "Dawn Herzog";
                                order = 641133L;
                            }}),
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("alias", "quidem");
                                                put("nesciunt", "commodi");
                                                put("sapiente", "consequuntur");
                                                put("veniam", "debitis");
                                            }}, PlanPhaseDurationUnitEnum.QUARTERLY,                 new java.util.HashMap<String, Object>() {{
                                                put("ut", "numquam");
                                                put("tenetur", "adipisci");
                                                put("libero", "in");
                                            }}) {{
                                description = "neque";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("aliquam", "quos");
                                    put("doloribus", "fugiat");
                                    put("est", "delectus");
                                    put("velit", "vitae");
                                }};
                                duration = 201096L;
                                durationUnit = PlanPhaseDurationUnitEnum.QUARTERLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("repellat", "nemo");
                                }};
                                name = "Woodrow Mitchell III";
                                order = 583193L;
                            }}),
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("praesentium", "dolor");
                                            }}, PlanPhaseDurationUnitEnum.QUARTERLY,                 new java.util.HashMap<String, Object>() {{
                                                put("facilis", "impedit");
                                                put("sit", "nemo");
                                                put("culpa", "consequuntur");
                                            }}) {{
                                description = "minima";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("minus", "ab");
                                    put("beatae", "hic");
                                }};
                                duration = 392319L;
                                durationUnit = PlanPhaseDurationUnitEnum.ANNUAL;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("ducimus", "fuga");
                                }};
                                name = "Julie Davis";
                                order = 276650L;
                            }}),
                        }};
                        prices = new Orb.Orb.models.shared.Price[]{{
                            add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                put("neque", "vero");
                                            }},                 new java.util.HashMap<String, Object>() {{
                                                put("accusantium", "qui");
                                                put("impedit", "beatae");
                                                put("incidunt", "dicta");
                                            }}, 1391.33) {{
                                billableMetric = new PriceBillableMetric() {{
                                    id = "a45cefc5-fde1-40a0-8e21-69e510019c6d";
                                }};
                                bpsConfig = new PriceBpsConfig() {{
                                    bps = 7986.9;
                                    perUnitMaximum = "nemo";
                                }};
                                bulkBpsConfig = new PriceBulkBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 2467.72;
                                            maximumAmount = "magnam";
                                            perUnitMaximum = "dignissimos";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 3884.04;
                                            maximumAmount = "sed";
                                            perUnitMaximum = "odio";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 6169.41;
                                            maximumAmount = "provident";
                                            perUnitMaximum = "cum";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 9838.54;
                                            maximumAmount = "facilis";
                                            perUnitMaximum = "quidem";
                                        }}),
                                    }};
                                }};
                                bulkConfig = new PriceBulkConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "laboriosam";
                                            unitAmount = "unde";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "modi";
                                            unitAmount = "perspiciatis";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "hic";
                                            unitAmount = "cum";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "aspernatur";
                                            unitAmount = "libero";
                                        }}),
                                    }};
                                }};
                                cadence = PriceCadenceEnum.QUARTERLY;
                                createdAt = OffsetDateTime.parse("2022-01-28T05:32:22.367Z");
                                currency = "USD";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("id", "saepe");
                                    put("autem", "quo");
                                    put("nesciunt", "illum");
                                    put("nemo", "illum");
                                }};
                                fixedPriceQuantity = 7068.72;
                                id = "3adebd5d-aea4-4c50-aa8a-a94c02644cf5";
                                matrixConfig = new PriceMatrixConfig() {{
                                    defaultUnitAmount = "officiis";
                                    dimensions = new String[]{{
                                        add("nulla"),
                                        add("error"),
                                        add("mollitia"),
                                    }};
                                    matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("esse"),
                                                add("corrupti"),
                                            }};
                                            unitAmount = "fuga";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("impedit"),
                                                add("quasi"),
                                                add("deserunt"),
                                                add("quod"),
                                            }};
                                            unitAmount = "laboriosam";
                                        }}),
                                    }};
                                }};
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("voluptatem", "facere");
                                }};
                                modelType = PriceModelTypeEnum.MATRIX;
                                name = "Miss William Bechtelar";
                                packageConfig = new PricePackageConfig() {{
                                    packageAmount = "blanditiis";
                                    packageSize = 608.92;
                                }};
                                planPhaseOrder = 1698.19;
                                tieredBpsConfig = new PriceTieredBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 1483.79;
                                            maximumAmount = "necessitatibus";
                                            minimumAmount = "impedit";
                                            perUnitMaximum = "ipsa";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 5676.93;
                                            maximumAmount = "a";
                                            minimumAmount = "maiores";
                                            perUnitMaximum = "laudantium";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 9822.48;
                                            maximumAmount = "alias";
                                            minimumAmount = "asperiores";
                                            perUnitMaximum = "rem";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 1186.15;
                                            maximumAmount = "suscipit";
                                            minimumAmount = "earum";
                                            perUnitMaximum = "doloribus";
                                        }}),
                                    }};
                                }};
                                tieredConfig = new PriceTieredConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "eius";
                                            lastUnit = "esse";
                                            unitAmount = "in";
                                        }}),
                                    }};
                                }};
                                unitConfig = new PriceUnitConfig() {{
                                    unitAmount = "eligendi";
                                }};
                            }}),
                        }};
                        product = new PlanProduct(OffsetDateTime.parse("2022-01-05T00:04:42.693Z"), "a", "nobis") {{
                            createdAt = OffsetDateTime.parse("2022-04-19T23:22:44.065Z");
                            id = "0960a668-151a-4472-af92-3c5949f83f35";
                            name = "Adrienne White";
                        }};
                        trialConfig = new PlanTrialConfig(PlanTrialConfigTrialPeriodUnitEnum.DAYS) {{
                            trialPeriod = 5983.16;
                            trialPeriodUnit = PlanTrialConfigTrialPeriodUnitEnum.DAYS;
                        }};
                    }}),
                    add(new Plan(OffsetDateTime.parse("2022-02-28T18:10:48.265Z"), "eos", "magnam",                 new java.util.HashMap<String, Object>() {{
                                        put("aliquid", "eum");
                                    }}, "vel", "ad",                 new java.util.HashMap<String, Object>() {{
                                        put("illo", "suscipit");
                                        put("quibusdam", "fugiat");
                                        put("impedit", "culpa");
                                    }}, "atque",                 new Orb.Orb.models.shared.Price[]{{
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("deserunt", "itaque");
                                                            put("et", "eos");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("ex", "praesentium");
                                                            put("natus", "vitae");
                                                            put("tenetur", "laudantium");
                                                            put("aspernatur", "eligendi");
                                                        }}, 9178.77) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "f51fcb4c-593e-4c12-8daa-d0ec7afedbd8";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 128.77;
                                                perUnitMaximum = "temporibus";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 2780.5;
                                                        maximumAmount = "numquam";
                                                        perUnitMaximum = "corrupti";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 6302.37;
                                                        maximumAmount = "dolore";
                                                        perUnitMaximum = "esse";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 9682.05;
                                                        maximumAmount = "iste";
                                                        perUnitMaximum = "amet";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 5810.19;
                                                        maximumAmount = "aut";
                                                        perUnitMaximum = "impedit";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "quos";
                                                        unitAmount = "blanditiis";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "quas";
                                                        unitAmount = "voluptatem";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.MONTHLY;
                                            createdAt = OffsetDateTime.parse("2022-07-25T13:23:50.414Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("fuga", "facilis");
                                                put("maiores", "error");
                                                put("recusandae", "a");
                                                put("consectetur", "sapiente");
                                            }};
                                            fixedPriceQuantity = 9776.41;
                                            id = "dd9f7f07-9af4-4d35-b24c-db0f4d281187";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "fugiat";
                                                dimensions = new String[]{{
                                                    add("iure"),
                                                    add("laudantium"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("accusamus"),
                                                            add("nulla"),
                                                        }};
                                                        unitAmount = "repudiandae";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("praesentium"),
                                                            add("enim"),
                                                            add("animi"),
                                                            add("unde"),
                                                        }};
                                                        unitAmount = "quae";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("nostrum", "eveniet");
                                                put("laboriosam", "ratione");
                                            }};
                                            modelType = PriceModelTypeEnum.BPS;
                                            name = "Gilberto Wisozk";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "consequatur";
                                                packageSize = 2019.66;
                                            }};
                                            planPhaseOrder = 1553.71;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 3771.61;
                                                        maximumAmount = "quo";
                                                        minimumAmount = "laudantium";
                                                        perUnitMaximum = "dignissimos";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 6069.89;
                                                        maximumAmount = "omnis";
                                                        minimumAmount = "fugit";
                                                        perUnitMaximum = "dolorem";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 6962.91;
                                                        maximumAmount = "molestiae";
                                                        minimumAmount = "debitis";
                                                        perUnitMaximum = "vitae";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "ad";
                                                        lastUnit = "atque";
                                                        unitAmount = "ut";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "asperiores";
                                            }};
                                        }}),
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("deleniti", "est");
                                                            put("et", "expedita");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("quos", "maiores");
                                                            put("quidem", "in");
                                                            put("culpa", "doloremque");
                                                            put("fuga", "dicta");
                                                        }}, 1039.01) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "11571723-0537-47dc-ba89-df975e356686";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 444.43;
                                                perUnitMaximum = "perspiciatis";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 9320.57;
                                                        maximumAmount = "unde";
                                                        perUnitMaximum = "cumque";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "repellendus";
                                                        unitAmount = "temporibus";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.QUARTERLY;
                                            createdAt = OffsetDateTime.parse("2022-01-18T13:21:09.532Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("vitae", "veritatis");
                                            }};
                                            fixedPriceQuantity = 8143.98;
                                            id = "ea1026d5-41a4-4d19-8feb-21780bccc0db";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "distinctio";
                                                dimensions = new String[]{{
                                                    add("illum"),
                                                    add("soluta"),
                                                    add("magnam"),
                                                    add("laudantium"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("doloremque"),
                                                            add("corrupti"),
                                                        }};
                                                        unitAmount = "reiciendis";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("aliquam"),
                                                            add("repudiandae"),
                                                            add("amet"),
                                                        }};
                                                        unitAmount = "natus";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("officiis", "eum");
                                            }};
                                            modelType = PriceModelTypeEnum.TIERED_BPS;
                                            name = "Andrew Hammes";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "labore";
                                                packageSize = 7738.89;
                                            }};
                                            planPhaseOrder = 2851.75;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 3559.27;
                                                        maximumAmount = "numquam";
                                                        minimumAmount = "enim";
                                                        perUnitMaximum = "cupiditate";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 5786.1;
                                                        maximumAmount = "itaque";
                                                        minimumAmount = "fuga";
                                                        perUnitMaximum = "consectetur";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 2687.49;
                                                        maximumAmount = "aspernatur";
                                                        minimumAmount = "explicabo";
                                                        perUnitMaximum = "suscipit";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 588.08;
                                                        maximumAmount = "eveniet";
                                                        minimumAmount = "sint";
                                                        perUnitMaximum = "nobis";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "accusantium";
                                                        lastUnit = "consequatur";
                                                        unitAmount = "impedit";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "recusandae";
                                            }};
                                        }}),
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("itaque", "rem");
                                                            put("nemo", "non");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("omnis", "ipsa");
                                                            put("aliquam", "dolor");
                                                            put("occaecati", "quibusdam");
                                                            put("magni", "consequuntur");
                                                        }}, 1594.69) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "6ce723d4-097f-4a30-a9af-725b29122030";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 8526.34;
                                                perUnitMaximum = "voluptatum";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 9427.8;
                                                        maximumAmount = "ullam";
                                                        perUnitMaximum = "deserunt";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "distinctio";
                                                        unitAmount = "iusto";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "dignissimos";
                                                        unitAmount = "provident";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "occaecati";
                                                        unitAmount = "assumenda";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "sunt";
                                                        unitAmount = "odit";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.QUARTERLY;
                                            createdAt = OffsetDateTime.parse("2021-06-24T14:54:46.838Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("repellat", "atque");
                                            }};
                                            fixedPriceQuantity = 2977.23;
                                            id = "93825fdc-42c8-476c-ac2d-fb4cfc1c7623";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "alias";
                                                dimensions = new String[]{{
                                                    add("quos"),
                                                    add("numquam"),
                                                    add("vitae"),
                                                    add("maiores"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("rerum"),
                                                        }};
                                                        unitAmount = "assumenda";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("dolorem"),
                                                        }};
                                                        unitAmount = "hic";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("nam"),
                                                            add("ab"),
                                                            add("magnam"),
                                                            add("pariatur"),
                                                        }};
                                                        unitAmount = "expedita";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("tempore", "recusandae");
                                                put("nostrum", "officia");
                                            }};
                                            modelType = PriceModelTypeEnum.PACKAGE_;
                                            name = "Lewis Mante";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "necessitatibus";
                                                packageSize = 1367.7;
                                            }};
                                            planPhaseOrder = 1731.93;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 8752;
                                                        maximumAmount = "eos";
                                                        minimumAmount = "voluptatem";
                                                        perUnitMaximum = "temporibus";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 6603.39;
                                                        maximumAmount = "quae";
                                                        minimumAmount = "commodi";
                                                        perUnitMaximum = "a";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 7912.82;
                                                        maximumAmount = "sed";
                                                        minimumAmount = "nam";
                                                        perUnitMaximum = "quia";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "ab";
                                                        lastUnit = "deserunt";
                                                        unitAmount = "sed";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "blanditiis";
                                                        lastUnit = "sint";
                                                        unitAmount = "placeat";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "ullam";
                                            }};
                                        }}),
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("enim", "aspernatur");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("magni", "odio");
                                                            put("alias", "quidem");
                                                            put("deleniti", "possimus");
                                                        }}, 3689.76) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "46569462-4070-484f-bab3-7cef02225194";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 8527.37;
                                                perUnitMaximum = "quidem";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 3327.77;
                                                        maximumAmount = "modi";
                                                        perUnitMaximum = "quasi";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 618.89;
                                                        maximumAmount = "similique";
                                                        perUnitMaximum = "possimus";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "suscipit";
                                                        unitAmount = "ex";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "sint";
                                                        unitAmount = "est";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "doloribus";
                                                        unitAmount = "provident";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "alias";
                                                        unitAmount = "deserunt";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.ANNUAL;
                                            createdAt = OffsetDateTime.parse("2022-03-22T14:59:15.400Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("maxime", "facere");
                                                put("impedit", "cupiditate");
                                            }};
                                            fixedPriceQuantity = 5369.99;
                                            id = "1f068981-d6bb-433c-baa3-48c31bf407ee";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "numquam";
                                                dimensions = new String[]{{
                                                    add("eligendi"),
                                                    add("sapiente"),
                                                    add("alias"),
                                                    add("impedit"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("nobis"),
                                                        }};
                                                        unitAmount = "nihil";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("reiciendis"),
                                                            add("vitae"),
                                                            add("ullam"),
                                                        }};
                                                        unitAmount = "nisi";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("voluptas", "ratione");
                                            }};
                                            modelType = PriceModelTypeEnum.BPS;
                                            name = "Carlton Bahringer";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "ducimus";
                                                packageSize = 3925.69;
                                            }};
                                            planPhaseOrder = 3920.22;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 1439.76;
                                                        maximumAmount = "dolore";
                                                        minimumAmount = "maxime";
                                                        perUnitMaximum = "maxime";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "accusantium";
                                                        lastUnit = "ea";
                                                        unitAmount = "impedit";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "totam";
                                                        lastUnit = "optio";
                                                        unitAmount = "est";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "inventore";
                                                        lastUnit = "consequuntur";
                                                        unitAmount = "repellendus";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "sit";
                                            }};
                                        }}),
                                    }},                 new PlanProduct(OffsetDateTime.parse("2022-11-09T17:06:05.186Z"), "aspernatur", "at");) {{
                        basePlanId = "necessitatibus";
                        createdAt = OffsetDateTime.parse("2021-03-29T13:04:21.901Z");
                        currency = "voluptatem";
                        description = "provident";
                        discount = new java.util.HashMap<String, Object>() {{
                            put("accusantium", "magnam");
                        }};
                        externalPlanId = "repellat";
                        id = "926bad25-5381-49b4-b4b0-ed20e56248ff";
                        invoicingCurrency = "asperiores";
                        minimum = new java.util.HashMap<String, Object>() {{
                            put("nesciunt", "cupiditate");
                            put("animi", "provident");
                        }};
                        name = "Angela O'Conner";
                        planPhases = new Orb.Orb.models.shared.PlanPhase[]{{
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("similique", "eligendi");
                                                put("tempore", "amet");
                                                put("debitis", "nobis");
                                            }}, PlanPhaseDurationUnitEnum.ANNUAL,                 new java.util.HashMap<String, Object>() {{
                                                put("id", "atque");
                                                put("quibusdam", "sit");
                                                put("quo", "veniam");
                                                put("aliquam", "provident");
                                            }}) {{
                                description = "fuga";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("commodi", "fugit");
                                    put("suscipit", "voluptate");
                                    put("nisi", "aliquid");
                                }};
                                duration = 589712L;
                                durationUnit = PlanPhaseDurationUnitEnum.QUARTERLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("ab", "itaque");
                                    put("quisquam", "eaque");
                                    put("alias", "qui");
                                    put("consequuntur", "vitae");
                                }};
                                name = "Johnny Farrell";
                                order = 506532L;
                            }}),
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("tenetur", "voluptate");
                                                put("quam", "quod");
                                                put("vitae", "sapiente");
                                            }}, PlanPhaseDurationUnitEnum.ANNUAL,                 new java.util.HashMap<String, Object>() {{
                                                put("voluptate", "inventore");
                                                put("facere", "maxime");
                                                put("fuga", "ab");
                                                put("ex", "consectetur");
                                            }}) {{
                                description = "vero";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("doloremque", "ipsum");
                                    put("alias", "doloremque");
                                    put("tempora", "perspiciatis");
                                    put("quam", "atque");
                                }};
                                duration = 638363L;
                                durationUnit = PlanPhaseDurationUnitEnum.QUARTERLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("a", "laborum");
                                }};
                                name = "Traci Wiegand III";
                                order = 538944L;
                            }}),
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("illum", "at");
                                                put("tenetur", "molestias");
                                                put("ipsam", "esse");
                                                put("laborum", "perspiciatis");
                                            }}, PlanPhaseDurationUnitEnum.ANNUAL,                 new java.util.HashMap<String, Object>() {{
                                                put("quasi", "quas");
                                                put("odio", "commodi");
                                            }}) {{
                                description = "maiores";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("animi", "sequi");
                                }};
                                duration = 757471L;
                                durationUnit = PlanPhaseDurationUnitEnum.QUARTERLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("laborum", "omnis");
                                }};
                                name = "Mindy Williamson";
                                order = 250298L;
                            }}),
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("provident", "dolor");
                                                put("sint", "aperiam");
                                                put("eaque", "eum");
                                            }}, PlanPhaseDurationUnitEnum.QUARTERLY,                 new java.util.HashMap<String, Object>() {{
                                                put("autem", "assumenda");
                                                put("explicabo", "fugiat");
                                                put("doloremque", "voluptatem");
                                            }}) {{
                                description = "porro";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("mollitia", "quidem");
                                    put("explicabo", "et");
                                }};
                                duration = 860027L;
                                durationUnit = PlanPhaseDurationUnitEnum.MONTHLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("illum", "a");
                                    put("impedit", "unde");
                                    put("ut", "facere");
                                }};
                                name = "Ora Walter";
                                order = 491380L;
                            }}),
                        }};
                        prices = new Orb.Orb.models.shared.Price[]{{
                            add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                put("id", "consequatur");
                                            }},                 new java.util.HashMap<String, Object>() {{
                                                put("ratione", "iure");
                                                put("tempora", "eos");
                                                put("natus", "voluptatem");
                                            }}, 3842.73) {{
                                billableMetric = new PriceBillableMetric() {{
                                    id = "355338ce-c086-4fa2-9e91-52cb3119167b";
                                }};
                                bpsConfig = new PriceBpsConfig() {{
                                    bps = 5620.65;
                                    perUnitMaximum = "necessitatibus";
                                }};
                                bulkBpsConfig = new PriceBulkBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 7698.72;
                                            maximumAmount = "quos";
                                            perUnitMaximum = "illum";
                                        }}),
                                    }};
                                }};
                                bulkConfig = new PriceBulkConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "voluptatem";
                                            unitAmount = "non";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "quaerat";
                                            unitAmount = "consequatur";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "laudantium";
                                            unitAmount = "repellendus";
                                        }}),
                                    }};
                                }};
                                cadence = PriceCadenceEnum.MONTHLY;
                                createdAt = OffsetDateTime.parse("2022-04-22T18:37:10.708Z");
                                currency = "USD";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("quaerat", "earum");
                                    put("tenetur", "assumenda");
                                }};
                                fixedPriceQuantity = 2941.81;
                                id = "55906d12-63d4-48e9-b5c2-c9e81f30be3e";
                                matrixConfig = new PriceMatrixConfig() {{
                                    defaultUnitAmount = "labore";
                                    dimensions = new String[]{{
                                        add("magni"),
                                    }};
                                    matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("illum"),
                                            }};
                                            unitAmount = "iusto";
                                        }}),
                                    }};
                                }};
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("beatae", "aliquid");
                                }};
                                modelType = PriceModelTypeEnum.BULK;
                                name = "Ms. Kristin Hane";
                                packageConfig = new PricePackageConfig() {{
                                    packageAmount = "quaerat";
                                    packageSize = 941.22;
                                }};
                                planPhaseOrder = 5252.23;
                                tieredBpsConfig = new PriceTieredBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 400.17;
                                            maximumAmount = "assumenda";
                                            minimumAmount = "provident";
                                            perUnitMaximum = "facere";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 1528.87;
                                            maximumAmount = "inventore";
                                            minimumAmount = "voluptatibus";
                                            perUnitMaximum = "unde";
                                        }}),
                                    }};
                                }};
                                tieredConfig = new PriceTieredConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "repellendus";
                                            lastUnit = "consequatur";
                                            unitAmount = "adipisci";
                                        }}),
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "doloremque";
                                            lastUnit = "optio";
                                            unitAmount = "tempora";
                                        }}),
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "debitis";
                                            lastUnit = "cumque";
                                            unitAmount = "maxime";
                                        }}),
                                    }};
                                }};
                                unitConfig = new PriceUnitConfig() {{
                                    unitAmount = "et";
                                }};
                            }}),
                        }};
                        product = new PlanProduct(OffsetDateTime.parse("2021-12-11T00:26:54.870Z"), "aliquid", "nihil") {{
                            createdAt = OffsetDateTime.parse("2021-08-05T12:18:31.502Z");
                            id = "8502a55e-7f73-4bc8-85e3-20a319f4badf";
                            name = "Jesus Kreiger";
                        }};
                        trialConfig = new PlanTrialConfig(PlanTrialConfigTrialPeriodUnitEnum.DAYS) {{
                            trialPeriod = 7063.28;
                            trialPeriodUnit = PlanTrialConfigTrialPeriodUnitEnum.DAYS;
                        }};
                    }}),
                    add(new Plan(OffsetDateTime.parse("2021-11-12T01:17:53.470Z"), "odio", "omnis",                 new java.util.HashMap<String, Object>() {{
                                        put("delectus", "magni");
                                        put("sit", "velit");
                                        put("voluptatum", "nihil");
                                        put("neque", "aspernatur");
                                    }}, "eaque", "corporis",                 new java.util.HashMap<String, Object>() {{
                                        put("aut", "impedit");
                                        put("quod", "quo");
                                        put("architecto", "voluptatem");
                                    }}, "perspiciatis",                 new Orb.Orb.models.shared.Price[]{{
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("voluptates", "minus");
                                                            put("autem", "vel");
                                                            put("beatae", "quos");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("soluta", "tenetur");
                                                        }}, 8971.46) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "400313b3-e504-44f6-9fe7-2dc4077d0cc3";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 9504.86;
                                                perUnitMaximum = "non";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 5484.73;
                                                        maximumAmount = "itaque";
                                                        perUnitMaximum = "earum";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "dicta";
                                                        unitAmount = "corporis";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "impedit";
                                                        unitAmount = "eveniet";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "cum";
                                                        unitAmount = "dolore";
                                                    }}),
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "illum";
                                                        unitAmount = "ea";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.QUARTERLY;
                                            createdAt = OffsetDateTime.parse("2022-02-12T13:11:34.622Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("necessitatibus", "voluptatem");
                                                put("maiores", "odio");
                                                put("veniam", "fuga");
                                            }};
                                            fixedPriceQuantity = 9290.12;
                                            id = "df2acab5-8b99-41c9-a6dd-b589461e7421";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "optio";
                                                dimensions = new String[]{{
                                                    add("recusandae"),
                                                    add("commodi"),
                                                    add("possimus"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("sit"),
                                                            add("fugit"),
                                                        }};
                                                        unitAmount = "a";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("vero"),
                                                        }};
                                                        unitAmount = "id";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("ratione"),
                                                            add("perferendis"),
                                                            add("distinctio"),
                                                        }};
                                                        unitAmount = "voluptas";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("maiores", "nihil");
                                                put("fuga", "cumque");
                                                put("consequuntur", "maiores");
                                            }};
                                            modelType = PriceModelTypeEnum.PACKAGE_;
                                            name = "Faith Lubowitz";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "sit";
                                                packageSize = 279.55;
                                            }};
                                            planPhaseOrder = 6197.72;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 2712.16;
                                                        maximumAmount = "occaecati";
                                                        minimumAmount = "quasi";
                                                        perUnitMaximum = "veritatis";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "doloremque";
                                                        lastUnit = "quas";
                                                        unitAmount = "dolores";
                                                    }}),
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "perferendis";
                                                        lastUnit = "esse";
                                                        unitAmount = "quas";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "blanditiis";
                                            }};
                                        }}),
                                        add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                            put("molestiae", "autem");
                                                        }},                 new java.util.HashMap<String, Object>() {{
                                                            put("eius", "nostrum");
                                                            put("ex", "amet");
                                                        }}, 4543.86) {{
                                            billableMetric = new PriceBillableMetric() {{
                                                id = "9659eb40-ec16-4faf-b5b0-b532a4da37cb";
                                            }};
                                            bpsConfig = new PriceBpsConfig() {{
                                                bps = 6338.25;
                                                perUnitMaximum = "culpa";
                                            }};
                                            bulkBpsConfig = new PriceBulkBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 3005.57;
                                                        maximumAmount = "eius";
                                                        perUnitMaximum = "ad";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 1542.77;
                                                        maximumAmount = "quod";
                                                        perUnitMaximum = "quaerat";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 5321.63;
                                                        maximumAmount = "numquam";
                                                        perUnitMaximum = "explicabo";
                                                    }}),
                                                    add(new PriceBulkBpsConfigTiers() {{
                                                        bps = 7568.33;
                                                        maximumAmount = "cupiditate";
                                                        perUnitMaximum = "tempore";
                                                    }}),
                                                }};
                                            }};
                                            bulkConfig = new PriceBulkConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                                    add(new PriceBulkConfigTiers() {{
                                                        maximumUnits = "est";
                                                        unitAmount = "at";
                                                    }}),
                                                }};
                                            }};
                                            cadence = PriceCadenceEnum.ANNUAL;
                                            createdAt = OffsetDateTime.parse("2022-02-20T10:34:20.495Z");
                                            currency = "USD";
                                            discount = new java.util.HashMap<String, Object>() {{
                                                put("sapiente", "necessitatibus");
                                                put("voluptatum", "quasi");
                                                put("mollitia", "voluptatum");
                                            }};
                                            fixedPriceQuantity = 5006.92;
                                            id = "f4444573-fecd-4473-93f6-3c8209379aa6";
                                            matrixConfig = new PriceMatrixConfig() {{
                                                defaultUnitAmount = "occaecati";
                                                dimensions = new String[]{{
                                                    add("at"),
                                                    add("ad"),
                                                    add("asperiores"),
                                                    add("nam"),
                                                }};
                                                matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("quam"),
                                                            add("occaecati"),
                                                            add("repellendus"),
                                                            add("culpa"),
                                                        }};
                                                        unitAmount = "dicta";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("fuga"),
                                                            add("odio"),
                                                            add("totam"),
                                                        }};
                                                        unitAmount = "magni";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("harum"),
                                                        }};
                                                        unitAmount = "voluptatibus";
                                                    }}),
                                                    add(new PriceMatrixConfigMatrixValues() {{
                                                        dimensionValues = new String[]{{
                                                            add("quis"),
                                                            add("quos"),
                                                            add("natus"),
                                                        }};
                                                        unitAmount = "aliquam";
                                                    }}),
                                                }};
                                            }};
                                            minimum = new java.util.HashMap<String, Object>() {{
                                                put("nisi", "praesentium");
                                                put("eum", "vitae");
                                                put("animi", "possimus");
                                                put("libero", "ullam");
                                            }};
                                            modelType = PriceModelTypeEnum.BULK;
                                            name = "Nick Torp";
                                            packageConfig = new PricePackageConfig() {{
                                                packageAmount = "odio";
                                                packageSize = 3562.53;
                                            }};
                                            planPhaseOrder = 819.17;
                                            tieredBpsConfig = new PriceTieredBpsConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 5786.78;
                                                        maximumAmount = "doloribus";
                                                        minimumAmount = "necessitatibus";
                                                        perUnitMaximum = "rem";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 9534.06;
                                                        maximumAmount = "nihil";
                                                        minimumAmount = "veniam";
                                                        perUnitMaximum = "aut";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 1701.26;
                                                        maximumAmount = "rerum";
                                                        minimumAmount = "voluptatibus";
                                                        perUnitMaximum = "nulla";
                                                    }}),
                                                    add(new PriceTieredBpsConfigTiers() {{
                                                        bps = 7967.05;
                                                        maximumAmount = "non";
                                                        minimumAmount = "dolore";
                                                        perUnitMaximum = "enim";
                                                    }}),
                                                }};
                                            }};
                                            tieredConfig = new PriceTieredConfig() {{
                                                tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                                    add(new PriceTieredConfigTiers() {{
                                                        firstUnit = "blanditiis";
                                                        lastUnit = "modi";
                                                        unitAmount = "illo";
                                                    }}),
                                                }};
                                            }};
                                            unitConfig = new PriceUnitConfig() {{
                                                unitAmount = "a";
                                            }};
                                        }}),
                                    }},                 new PlanProduct(OffsetDateTime.parse("2021-01-18T07:41:24.384Z"), "ipsum", "hic");) {{
                        basePlanId = "illum";
                        createdAt = OffsetDateTime.parse("2021-11-07T06:10:09.611Z");
                        currency = "exercitationem";
                        description = "cum";
                        discount = new java.util.HashMap<String, Object>() {{
                            put("facilis", "placeat");
                            put("reiciendis", "dolores");
                            put("dolore", "pariatur");
                        }};
                        externalPlanId = "facilis";
                        id = "95969335-2f74-4533-994d-78de3b6e9389";
                        invoicingCurrency = "voluptatibus";
                        minimum = new java.util.HashMap<String, Object>() {{
                            put("dolorum", "soluta");
                            put("cum", "in");
                        }};
                        name = "Rafael Johns";
                        planPhases = new Orb.Orb.models.shared.PlanPhase[]{{
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("voluptatem", "illo");
                                                put("iure", "incidunt");
                                            }}, PlanPhaseDurationUnitEnum.ANNUAL,                 new java.util.HashMap<String, Object>() {{
                                                put("ea", "asperiores");
                                            }}) {{
                                description = "doloremque";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("qui", "praesentium");
                                    put("adipisci", "totam");
                                    put("qui", "deserunt");
                                }};
                                duration = 754784L;
                                durationUnit = PlanPhaseDurationUnitEnum.MONTHLY;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("dolor", "est");
                                    put("reiciendis", "possimus");
                                    put("odit", "consectetur");
                                }};
                                name = "Cathy Prosacco";
                                order = 392759L;
                            }}),
                            add(new PlanPhase(                new java.util.HashMap<String, Object>() {{
                                                put("ad", "a");
                                            }}, PlanPhaseDurationUnitEnum.ANNUAL,                 new java.util.HashMap<String, Object>() {{
                                                put("atque", "quaerat");
                                                put("aperiam", "dignissimos");
                                                put("quam", "modi");
                                            }}) {{
                                description = "veniam";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("asperiores", "eum");
                                    put("deserunt", "repudiandae");
                                    put("nemo", "molestias");
                                }};
                                duration = 102019L;
                                durationUnit = PlanPhaseDurationUnitEnum.ANNUAL;
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("praesentium", "facilis");
                                    put("assumenda", "repudiandae");
                                    put("maiores", "ipsum");
                                    put("commodi", "vitae");
                                }};
                                name = "Juana Jacobson";
                                order = 176104L;
                            }}),
                        }};
                        prices = new Orb.Orb.models.shared.Price[]{{
                            add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                put("consectetur", "autem");
                                            }},                 new java.util.HashMap<String, Object>() {{
                                                put("numquam", "incidunt");
                                            }}, 2669.76) {{
                                billableMetric = new PriceBillableMetric() {{
                                    id = "68a9a35d-086b-46f6-afef-020e9f443b42";
                                }};
                                bpsConfig = new PriceBpsConfig() {{
                                    bps = 3184.03;
                                    perUnitMaximum = "nihil";
                                }};
                                bulkBpsConfig = new PriceBulkBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 6072.05;
                                            maximumAmount = "excepturi";
                                            perUnitMaximum = "eos";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 7890.36;
                                            maximumAmount = "corrupti";
                                            perUnitMaximum = "repellendus";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 7388.32;
                                            maximumAmount = "quibusdam";
                                            perUnitMaximum = "est";
                                        }}),
                                    }};
                                }};
                                bulkConfig = new PriceBulkConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "similique";
                                            unitAmount = "autem";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "dicta";
                                            unitAmount = "recusandae";
                                        }}),
                                    }};
                                }};
                                cadence = PriceCadenceEnum.QUARTERLY;
                                createdAt = OffsetDateTime.parse("2022-09-20T03:07:59.187Z");
                                currency = "USD";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("iste", "atque");
                                }};
                                fixedPriceQuantity = 1295.31;
                                id = "58fd0a9e-ba47-4f7d-bef0-49640d6a1831";
                                matrixConfig = new PriceMatrixConfig() {{
                                    defaultUnitAmount = "quisquam";
                                    dimensions = new String[]{{
                                        add("nihil"),
                                        add("culpa"),
                                        add("temporibus"),
                                    }};
                                    matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("cupiditate"),
                                                add("suscipit"),
                                            }};
                                            unitAmount = "reiciendis";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("delectus"),
                                                add("ab"),
                                                add("mollitia"),
                                                add("possimus"),
                                            }};
                                            unitAmount = "praesentium";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("quam"),
                                            }};
                                            unitAmount = "animi";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("voluptatum"),
                                                add("voluptatem"),
                                                add("quisquam"),
                                                add("vitae"),
                                            }};
                                            unitAmount = "cumque";
                                        }}),
                                    }};
                                }};
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("sint", "eligendi");
                                }};
                                modelType = PriceModelTypeEnum.BPS;
                                name = "Whitney Nienow";
                                packageConfig = new PricePackageConfig() {{
                                    packageAmount = "quas";
                                    packageSize = 3858.28;
                                }};
                                planPhaseOrder = 4976.95;
                                tieredBpsConfig = new PriceTieredBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 9575.1;
                                            maximumAmount = "deserunt";
                                            minimumAmount = "dolor";
                                            perUnitMaximum = "hic";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 4370.94;
                                            maximumAmount = "sint";
                                            minimumAmount = "autem";
                                            perUnitMaximum = "iste";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 5865.56;
                                            maximumAmount = "ab";
                                            minimumAmount = "fuga";
                                            perUnitMaximum = "a";
                                        }}),
                                    }};
                                }};
                                tieredConfig = new PriceTieredConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "voluptatum";
                                            lastUnit = "molestias";
                                            unitAmount = "quod";
                                        }}),
                                    }};
                                }};
                                unitConfig = new PriceUnitConfig() {{
                                    unitAmount = "repudiandae";
                                }};
                            }}),
                            add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                put("nostrum", "tempora");
                                                put("nam", "numquam");
                                                put("odio", "nostrum");
                                            }},                 new java.util.HashMap<String, Object>() {{
                                                put("veritatis", "autem");
                                                put("earum", "minima");
                                                put("ex", "possimus");
                                                put("nesciunt", "corrupti");
                                            }}, 3438.14) {{
                                billableMetric = new PriceBillableMetric() {{
                                    id = "8c7977a0-ef2f-4536-828e-feef934152ed";
                                }};
                                bpsConfig = new PriceBpsConfig() {{
                                    bps = 4917.84;
                                    perUnitMaximum = "itaque";
                                }};
                                bulkBpsConfig = new PriceBulkBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 3558.98;
                                            maximumAmount = "non";
                                            perUnitMaximum = "delectus";
                                        }}),
                                    }};
                                }};
                                bulkConfig = new PriceBulkConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "quod";
                                            unitAmount = "sunt";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "ullam";
                                            unitAmount = "quam";
                                        }}),
                                    }};
                                }};
                                cadence = PriceCadenceEnum.QUARTERLY;
                                createdAt = OffsetDateTime.parse("2021-01-29T02:22:12.222Z");
                                currency = "USD";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("in", "illo");
                                    put("voluptate", "consequatur");
                                    put("delectus", "incidunt");
                                }};
                                fixedPriceQuantity = 2930.23;
                                id = "5accf667-aaf9-4bba-9185-fe431d6bf5c8";
                                matrixConfig = new PriceMatrixConfig() {{
                                    defaultUnitAmount = "sequi";
                                    dimensions = new String[]{{
                                        add("maiores"),
                                        add("expedita"),
                                        add("rerum"),
                                    }};
                                    matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("aspernatur"),
                                                add("eaque"),
                                                add("impedit"),
                                                add("nam"),
                                            }};
                                            unitAmount = "ex";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("delectus"),
                                                add("minus"),
                                            }};
                                            unitAmount = "ut";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("eius"),
                                                add("eos"),
                                                add("veniam"),
                                            }};
                                            unitAmount = "repudiandae";
                                        }}),
                                    }};
                                }};
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("occaecati", "debitis");
                                    put("laboriosam", "eos");
                                    put("amet", "incidunt");
                                }};
                                modelType = PriceModelTypeEnum.BULK_BPS;
                                name = "Dominick Kling";
                                packageConfig = new PricePackageConfig() {{
                                    packageAmount = "omnis";
                                    packageSize = 8207.35;
                                }};
                                planPhaseOrder = 9503.37;
                                tieredBpsConfig = new PriceTieredBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 7115.72;
                                            maximumAmount = "iusto";
                                            minimumAmount = "esse";
                                            perUnitMaximum = "harum";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 3216.54;
                                            maximumAmount = "quod";
                                            minimumAmount = "ratione";
                                            perUnitMaximum = "totam";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 8736.81;
                                            maximumAmount = "dolore";
                                            minimumAmount = "nam";
                                            perUnitMaximum = "officia";
                                        }}),
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 9780.79;
                                            maximumAmount = "cupiditate";
                                            minimumAmount = "illo";
                                            perUnitMaximum = "saepe";
                                        }}),
                                    }};
                                }};
                                tieredConfig = new PriceTieredConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "eaque";
                                            lastUnit = "ex";
                                            unitAmount = "eveniet";
                                        }}),
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "delectus";
                                            lastUnit = "deleniti";
                                            unitAmount = "provident";
                                        }}),
                                    }};
                                }};
                                unitConfig = new PriceUnitConfig() {{
                                    unitAmount = "aut";
                                }};
                            }}),
                            add(new Price("USD",                 new java.util.HashMap<String, Object>() {{
                                                put("magnam", "maiores");
                                                put("ipsam", "dicta");
                                            }},                 new java.util.HashMap<String, Object>() {{
                                                put("praesentium", "libero");
                                                put("consequatur", "totam");
                                                put("tempora", "quo");
                                                put("dolor", "sunt");
                                            }}, 6050.89) {{
                                billableMetric = new PriceBillableMetric() {{
                                    id = "a3c4ac63-1b99-4e26-8ed8-f9fdb9410f63";
                                }};
                                bpsConfig = new PriceBpsConfig() {{
                                    bps = 7331.27;
                                    perUnitMaximum = "expedita";
                                }};
                                bulkBpsConfig = new PriceBulkBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkBpsConfigTiers[]{{
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 5051.13;
                                            maximumAmount = "vitae";
                                            perUnitMaximum = "iusto";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 5422.42;
                                            maximumAmount = "velit";
                                            perUnitMaximum = "molestiae";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 7221.51;
                                            maximumAmount = "aperiam";
                                            perUnitMaximum = "vitae";
                                        }}),
                                        add(new PriceBulkBpsConfigTiers() {{
                                            bps = 6506.78;
                                            maximumAmount = "asperiores";
                                            perUnitMaximum = "at";
                                        }}),
                                    }};
                                }};
                                bulkConfig = new PriceBulkConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceBulkConfigTiers[]{{
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "quam";
                                            unitAmount = "deleniti";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "rem";
                                            unitAmount = "vel";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "eos";
                                            unitAmount = "labore";
                                        }}),
                                        add(new PriceBulkConfigTiers() {{
                                            maximumUnits = "sunt";
                                            unitAmount = "blanditiis";
                                        }}),
                                    }};
                                }};
                                cadence = PriceCadenceEnum.MONTHLY;
                                createdAt = OffsetDateTime.parse("2020-11-07T12:44:30.685Z");
                                currency = "USD";
                                discount = new java.util.HashMap<String, Object>() {{
                                    put("labore", "blanditiis");
                                    put("ducimus", "consectetur");
                                }};
                                fixedPriceQuantity = 9580.6;
                                id = "5033f19d-bf12-45ce-8152-eab9cd7e5224";
                                matrixConfig = new PriceMatrixConfig() {{
                                    defaultUnitAmount = "error";
                                    dimensions = new String[]{{
                                        add("dolorum"),
                                        add("alias"),
                                    }};
                                    matrixValues = new Orb.Orb.models.shared.PriceMatrixConfigMatrixValues[]{{
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("sunt"),
                                            }};
                                            unitAmount = "amet";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("iusto"),
                                                add("corrupti"),
                                                add("non"),
                                            }};
                                            unitAmount = "esse";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("eligendi"),
                                                add("minima"),
                                                add("omnis"),
                                                add("recusandae"),
                                            }};
                                            unitAmount = "architecto";
                                        }}),
                                        add(new PriceMatrixConfigMatrixValues() {{
                                            dimensionValues = new String[]{{
                                                add("autem"),
                                                add("in"),
                                                add("repellat"),
                                                add("amet"),
                                            }};
                                            unitAmount = "cumque";
                                        }}),
                                    }};
                                }};
                                minimum = new java.util.HashMap<String, Object>() {{
                                    put("optio", "quo");
                                    put("repudiandae", "tempora");
                                }};
                                modelType = PriceModelTypeEnum.TIERED_BPS;
                                name = "Angel Kris";
                                packageConfig = new PricePackageConfig() {{
                                    packageAmount = "aliquid";
                                    packageSize = 9961.01;
                                }};
                                planPhaseOrder = 9570.32;
                                tieredBpsConfig = new PriceTieredBpsConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredBpsConfigTiers[]{{
                                        add(new PriceTieredBpsConfigTiers() {{
                                            bps = 7574.94;
                                            maximumAmount = "ullam";
                                            minimumAmount = "nihil";
                                            perUnitMaximum = "eius";
                                        }}),
                                    }};
                                }};
                                tieredConfig = new PriceTieredConfig() {{
                                    tiers = new Orb.Orb.models.shared.PriceTieredConfigTiers[]{{
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "corporis";
                                            lastUnit = "perferendis";
                                            unitAmount = "architecto";
                                        }}),
                                        add(new PriceTieredConfigTiers() {{
                                            firstUnit = "amet";
                                            lastUnit = "corporis";
                                            unitAmount = "nihil";
                                        }}),
                                    }};
                                }};
                                unitConfig = new PriceUnitConfig() {{
                                    unitAmount = "officiis";
                                }};
                            }}),
                        }};
                        product = new PlanProduct(OffsetDateTime.parse("2021-12-05T03:14:49.946Z"), "repellendus", "aut") {{
                            createdAt = OffsetDateTime.parse("2022-02-11T03:57:43.231Z");
                            id = "193a2454-67f9-4487-8c2d-5cc4972233e6";
                            name = "Karla Stehr";
                        }};
                        trialConfig = new PlanTrialConfig(PlanTrialConfigTrialPeriodUnitEnum.DAYS) {{
                            trialPeriod = 316.05;
                            trialPeriodUnit = PlanTrialConfigTrialPeriodUnitEnum.DAYS;
                        }};
                    }}),
                }};
                paginationMetadata = new java.util.HashMap<String, Object>() {{
                    put("odit", "molestiae");
                    put("accusamus", "quia");
                    put("inventore", "doloribus");
                }};
            }};            

            ListPlansResponse res = sdk.plan.list(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

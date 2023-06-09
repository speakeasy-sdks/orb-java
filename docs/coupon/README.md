# coupon

## Overview

The Coupon resource represents a discount that can be applied to a customer's invoice. Coupons can be applied to a customer's invoice either by the customer or by the Orb API.

### Available Operations

* [archive](#archive) - Archive a coupon
* [create](#create) - Create a coupon
* [fetch](#fetch) - Retrieve a coupon
* [list](#list) - List coupons
* [listSubscriptions](#listsubscriptions) - List subscriptions for a coupon

## archive

This endpoint allows a coupon to be archived. Archived coupons can no longer be redeemed, and will be hidden from lists of active coupons. Additionally, once a coupon is archived, its redemption code can be reused for a different coupon.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.ArchiveCouponRequest;
import Orb.Orb.models.operations.ArchiveCouponResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("distinctio") {{
                    apiKeyAuth = "";
                }})
                .build();

            ArchiveCouponRequest req = new ArchiveCouponRequest("quibusdam");            

            ArchiveCouponResponse res = sdk.coupon.archive(req);

            if (res.coupon != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## create

This endpoint allows the creation of coupons, which can then be redeemed at subscription creation or plan change.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.CreateCouponResponse;
import Orb.Orb.models.shared.CouponInput;
import Orb.Orb.models.shared.Discount;
import Orb.Orb.models.shared.DiscountDiscountType;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("unde") {{
                    apiKeyAuth = "";
                }})
                .build();

            Orb.Orb.models.shared.CouponInput req = new CouponInput(                new Discount(DiscountDiscountType.PERCENTAGE) {{
                                amountDiscount = "nulla";
                                appliesToPriceIds = new String[]{{
                                    add("illum"),
                                    add("vel"),
                                    add("error"),
                                }};
                                percentageDiscount = 0.15d;
                                trialAmountDiscount = "deserunt";
                                usageDiscount = 3843.82d;
                            }};, "iure") {{
                durationInMonths = 297534L;
                id = "e0f467cc-8796-4ed1-91a0-5dfc2ddf7cc7";
                maxRedemptions = 520478L;
                timesRedeemed = 780529L;
            }};            

            CreateCouponResponse res = sdk.coupon.create(req);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## fetch

This endpoint retrieves a coupon by its ID. To fetch coupons by their redemption code, use the [List coupons](list-coupons) endpoint with the `redemption_code` parameter.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.FetchCouponRequest;
import Orb.Orb.models.operations.FetchCouponResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("dolorum") {{
                    apiKeyAuth = "";
                }})
                .build();

            FetchCouponRequest req = new FetchCouponRequest("dicta");            

            FetchCouponResponse res = sdk.coupon.fetch(req);

            if (res.coupon != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## list

This endpoint returns a list of all [coupons](../reference/Orb-API.json/components/schemas/Coupon) for an account in a list format. 

The list of coupons is ordered starting from the most recently created coupon. The response also includes [`pagination_metadata`](../api/pagination), which lets the caller retrieve the next page of results if they exist. More information about pagination can be found in the [Pagination-metadata schema](../reference/Orb-API.json/components/schemas/Pagination-metadata).

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.ListCouponsRequest;
import Orb.Orb.models.operations.ListCouponsResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("nam") {{
                    apiKeyAuth = "";
                }})
                .build();

            ListCouponsRequest req = new ListCouponsRequest() {{
                redemptionCode = "officia";
                showArchived = false;
            }};            

            ListCouponsResponse res = sdk.coupon.list(req);

            if (res.listCoupons200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## listSubscriptions

This endpoint returns a list of all subscriptions that have redeemed a given coupon as a [paginated](../api/pagination) list, ordered starting from the most recently created subscription. For a full discussion of the subscription resource, see [Subscription](../reference/Orb-API.json/components/schemas/Subscription).

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.ListCouponSubscriptionsRequest;
import Orb.Orb.models.operations.ListCouponSubscriptionsResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("occaecati") {{
                    apiKeyAuth = "";
                }})
                .build();

            ListCouponSubscriptionsRequest req = new ListCouponSubscriptionsRequest("fugit");            

            ListCouponSubscriptionsResponse res = sdk.coupon.listSubscriptions(req);

            if (res.listCouponSubscriptions200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

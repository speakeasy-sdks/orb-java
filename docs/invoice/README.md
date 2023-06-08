# invoice

## Overview

The Invoice resource represents an invoice that has been generated for a customer. Invoices are generated when a customer's billing interval has elapsed, and are updated when a customer's invoice is paid.

### Available Operations

* [create](#create) - Create invoice line item
* [fetch](#fetch) - Retrieve an Invoice
* [fetchUpcoming](#fetchupcoming) - Retrieve upcoming invoice
* [list](#list) - List invoices
* [void_](#void_) - Void an invoice

## create

This creates a one-off fixed fee [Invoice line item](../reference/Orb-API.json/components/schemas/Invoice-line-item) on an [Invoice](../reference/Orb-API.json/components/schemas/Invoice). This can only be done for invoices that are in a `draft` status.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.CreateInvoiceLineItemRequestBody;
import Orb.Orb.models.operations.CreateInvoiceLineItemResponse;
import Orb.Orb.models.shared.Security;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("asperiores") {{
                    apiKeyAuth = "";
                }})
                .build();

            CreateInvoiceLineItemRequestBody req = new CreateInvoiceLineItemRequestBody("nihil", LocalDate.parse("2022-07-18"), "id", "saepe", 2633.22, LocalDate.parse("2022-12-24"));            

            CreateInvoiceLineItemResponse res = sdk.invoice.create(req);

            if (res.invoiceLineItem != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## fetch

This endpoint is used to fetch an [`Invoice`](../reference/Orb-API.json/components/schemas/Invoice) given an identifier.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.FetchInvoiceRequest;
import Orb.Orb.models.operations.FetchInvoiceResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("amet") {{
                    apiKeyAuth = "";
                }})
                .build();

            FetchInvoiceRequest req = new FetchInvoiceRequest("optio");            

            FetchInvoiceResponse res = sdk.invoice.fetch(req);

            if (res.invoice != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## fetchUpcoming

This endpoint can be used to fetch the [`Upcoming Invoice`](../reference/Orb-API.json/components/schemas/UpcomingInvoice) for the current billing period given a subscription.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.FetchUpcomingInvoiceRequest;
import Orb.Orb.models.operations.FetchUpcomingInvoiceResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("accusamus") {{
                    apiKeyAuth = "";
                }})
                .build();

            FetchUpcomingInvoiceRequest req = new FetchUpcomingInvoiceRequest("ad");            

            FetchUpcomingInvoiceResponse res = sdk.invoice.fetchUpcoming(req);

            if (res.upcomingInvoice != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## list

This endpoint returns a list of all [`Invoice`](../reference/Orb-API.json/components/schemas/Invoice)s for an account in a list format. 

The list of invoices is ordered starting from the most recently issued invoice date. The response also includes [`pagination_metadata`](../api/pagination), which lets the caller retrieve the next page of results if they exist.

By default, this only returns invoices that are `issued`, `paid`, or `synced`.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.ListInvoicesRequest;
import Orb.Orb.models.operations.ListInvoicesResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("saepe") {{
                    apiKeyAuth = "";
                }})
                .build();

            ListInvoicesRequest req = new ListInvoicesRequest() {{
                customerId = "suscipit";
                externalCustomerId = "deserunt";
                status = "provident";
                subscriptionId = "minima";
            }};            

            ListInvoicesResponse res = sdk.invoice.list(req);

            if (res.listInvoices200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## void_

This endpoint allows an invoice's status to be set the `void` status. This can only be done to invoices that are in the `issued` status.

If the associated invoice has used the customer balance to change the amount due, the customer balance operation will be reverted. For example, if the invoice used $10 of customer balance, that amount will be added back to the customer balance upon voiding.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.PostInvoicesInvoiceIdVoidRequest;
import Orb.Orb.models.operations.PostInvoicesInvoiceIdVoidResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("repellendus") {{
                    apiKeyAuth = "";
                }})
                .build();

            PostInvoicesInvoiceIdVoidRequest req = new PostInvoicesInvoiceIdVoidRequest("totam");            

            PostInvoicesInvoiceIdVoidResponse res = sdk.invoice.void_(req);

            if (res.invoice != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

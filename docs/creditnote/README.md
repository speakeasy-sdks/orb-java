# creditNote

## Overview

The Credit Note resource represents a credit note that has been generated for a customer. Credit Notes are generated when a customer's billing interval has elapsed, and are updated when a customer's invoice is paid.

### Available Operations

* [list](#list) - List credit notes

## list

This endpoint returns a list of all [`Credit Note`](../reference/Orb-API.json/components/schemas/Credit-note)s for an account in a list format. 

The list of credit notes is ordered starting from the most recently created date. The response also includes [`pagination_metadata`](../api/pagination), which lets the caller retrieve the next page of results if they exist.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.ListCreditNoteRequest;
import Orb.Orb.models.operations.ListCreditNoteResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("dolores") {{
                    apiKeyAuth = "";
                }})
                .build();

            ListCreditNoteRequest req = new ListCreditNoteRequest() {{
                customerId = "dolorem";
                externalCustomerId = "corporis";
                subscriptionId = "explicabo";
            }};            

            ListCreditNoteResponse res = sdk.creditNote.list(req);

            if (res.listCreditNote200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

# Orb

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'Orb.Orb:Orb:1.0.1'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->
```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.shared.Security;
import Orb.Orb.models.operations.PostCustomersRequestBodyBillingAddress;
import Orb.Orb.models.operations.PostCustomersRequestBodyPaymentProviderEnum;
import Orb.Orb.models.operations.PostCustomersRequestBodyShippingAddress;
import Orb.Orb.models.operations.PostCustomersRequestBody;
import Orb.Orb.models.operations.PostCustomersResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            PostCustomersRequestBody req = new PostCustomersRequestBody() {{
                billingAddress = new PostCustomersRequestBodyBillingAddress() {{
                    city = "Laruecester";
                    country = "US";
                    line1 = "quibusdam";
                    line2 = "unde";
                    postalCode = "58466-3428";
                    state = "ipsa";
                }};
                currency = "delectus";
                email = "Geraldine_Kreiger52@gmail.com";
                externalCustomerId = "iusto";
                name = "excepturi";
                paymentProvider = "bill.com";
                paymentProviderId = "recusandae";
                shippingAddress = new PostCustomersRequestBodyShippingAddress() {{
                    city = "Belleville";
                    country = "US";
                    line1 = "quis";
                    line2 = "veritatis";
                    postalCode = "03897-1889";
                    state = "molestiae";
                }};
                timezone = "Etc/UTC";
            }}            

            PostCustomersResponse res = sdk.customer.create(req);

            if (res.customer.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### availability

* `ping` - Check availability

### credits

* `create` - Add credit ledger entry
* `getCredits` - Retrieve credit balance
* `getCreditsLedger` - View credits ledger

### customer

* `create` - Create customer
* `get` - Retrieve a customer
* `getBalance` - Get customer balance transactions
* `getByExternalId` - Retrieve a customer by external ID
* `getCosts` - View customer costs
* `getCostsByExternalId` - View customer costs by external customer ID
* `list` - List customers
* `update` - Update customer
* `updateByExternalId` - Update a customer by external ID
* `updateUsage` - Amend customer usage
* `updateUsageByExternalId` - Amend customer usage by external ID

### event

* `deprecate` - Deprecate single event
* `ingest` - Ingest events
* `search` - Search events
* `update` - Amend single event

### invoice

* `get` - Retrieve an Invoice
* `getUpcoming` - Retrieve upcoming invoice
* `list` - List invoices

### plan

* `get` - Retrieve a plan
* `get` - Retrieve a plan by external plan ID
* `get` - List plans

### subscription

* `cancel` - Cancel subscription
* `changeSchedule` - Schedule plan change
* `create` - Create subscription
* `get` - Retrieve a subscription
* `getCost` - View subscription costs
* `getSchedule` - View subscription schedule
* `getUsage` - View subscription usage
* `list` - List subscriptions
* `unschedule` - Unschedule pending plan changes
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage 
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally 
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. 
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release !

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)

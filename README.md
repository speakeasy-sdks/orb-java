<div align="center">
    <picture>
        <source srcset="https://user-images.githubusercontent.com/6267663/229776363-b219eaec-e1aa-4192-9123-d8a8e0ab997d.svg" media="(prefers-color-scheme: dark)">
        <img src="https://user-images.githubusercontent.com/6267663/229776275-b670d564-fc2e-4843-b061-adf230737e3f.svg">
    </picture>
    <h1>Java SDK</h1>
   <p>The modern pricing platform to bill for seats, consumption, and everything in between.</p>
   <a href="https://docs.withorb.com/docs/orb-docs/overview"><img src="https://img.shields.io/static/v1?label=Docs&message=API Ref&color=5444e4&style=for-the-badge" /></a>
   <a href="https://github.com/speakeasy-sdks/orb-java/actions"><img src="https://img.shields.io/github/actions/workflow/status/speakeasy-sdks/orb-java/speakeasy_sdk_generation.yml?style=for-the-badge" /></a>
  <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge" /></a>
  <a href="https://github.com/speakeasy-sdks/orb-java/releases"><img src="https://img.shields.io/github/v/release/speakeasy-sdks/orb-java?sort=semver&style=for-the-badge" /></a>
</div>

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'Orb.Orb:Orb:0.2.2'
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
                name = "Charlie Walsh II";
                paymentProvider = "quickbooks";
                paymentProviderId = "deserunt";
                shippingAddress = new PostCustomersRequestBodyShippingAddress() {{
                    city = "West Ritaworth";
                    country = "US";
                    line1 = "quo";
                    line2 = "odit";
                    postalCode = "89478-4576";
                    state = "dicta";
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
* `getByExternalId` - Retrieve a plan by external plan ID
* `list` - List plans

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

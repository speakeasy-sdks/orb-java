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
                .setSecurity(new Security("corrupti") {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            PostCustomersRequestBody req = new PostCustomersRequestBody("provident", "distinctio") {{
                currency = "suscipit";
                externalCustomerId = "molestiae";
                paymentProvider = "stripe_invoice";
                paymentProviderId = "placeat";
                timezone = "Etc/UTC";
            }};            

            PostCustomersResponse res = sdk.customer.create(req);

            if (res.customer.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->
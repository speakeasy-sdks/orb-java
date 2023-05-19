<!-- Start SDK Example Usage -->
```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.PostCustomersRequestBody;
import Orb.Orb.models.operations.PostCustomersRequestBodyBillingAddress;
import Orb.Orb.models.operations.PostCustomersRequestBodyPaymentProvider;
import Orb.Orb.models.operations.PostCustomersRequestBodyShippingAddress;
import Orb.Orb.models.operations.PostCustomersResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("corrupti") {{
                    bearerAuth = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            PostCustomersRequestBody req = new PostCustomersRequestBody("provident", "distinctio") {{
                billingAddress = new PostCustomersRequestBodyBillingAddress() {{
                    city = "New Orleans";
                    country = "US";
                    line1 = "nulla";
                    line2 = "corrupti";
                    postalCode = "46634-2809";
                    state = "tempora";
                }};;
                currency = "suscipit";
                externalCustomerId = "molestiae";
                paymentProvider = PostCustomersRequestBodyPaymentProvider.STRIPE_INVOICE;
                paymentProviderId = "placeat";
                shippingAddress = new PostCustomersRequestBodyShippingAddress() {{
                    city = "Jayceestead";
                    country = "US";
                    line1 = "nisi";
                    line2 = "recusandae";
                    postalCode = "03060-3897";
                    state = "odit";
                }};;
                timezone = "Etc/UTC";
            }};            

            PostCustomersResponse res = sdk.customer.create(req);

            if (res.customer != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->
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
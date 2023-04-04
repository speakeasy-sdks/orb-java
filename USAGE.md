<!-- Start SDK Example Usage -->
```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.shared.Security;
import Orb.Orb.models.operations.GetPingResponse;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security() {{
                    bearerAuth = "Bearer YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            GetPingResponse res = sdk.availability.ping();

            if (res.getPing200ApplicationJSONObject.isPresent()) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
```
<!-- End SDK Example Usage -->
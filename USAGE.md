<!-- Start SDK Example Usage -->
```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.PingResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("corrupti") {{
                    apiKeyAuth = "YOUR_BEARER_TOKEN_HERE";
                }})
                .build();

            PingResponse res = sdk.availability.ping();

            if (res.ping200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->
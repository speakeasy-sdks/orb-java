/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FetchSubscriptionUsage200ApplicationJSON - OK
 */
public class FetchSubscriptionUsage200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public FetchSubscriptionUsage200ApplicationJSONData[] data;

    public FetchSubscriptionUsage200ApplicationJSON withData(FetchSubscriptionUsage200ApplicationJSONData[] data) {
        this.data = data;
        return this;
    }
    
    public FetchSubscriptionUsage200ApplicationJSON(){}
}

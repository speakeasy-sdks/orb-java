/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetSubscriptionsSubscriptionIdCost200ApplicationJSON - OK
 */
public class GetSubscriptionsSubscriptionIdCost200ApplicationJSON {
    @JsonProperty("data")
    public GetSubscriptionsSubscriptionIdCost200ApplicationJSONData[] data;
    public GetSubscriptionsSubscriptionIdCost200ApplicationJSON withData(GetSubscriptionsSubscriptionIdCost200ApplicationJSONData[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("pagination_metadata")
    public java.util.Map<String, Object> paginationMetadata;
    public GetSubscriptionsSubscriptionIdCost200ApplicationJSON withPaginationMetadata(java.util.Map<String, Object> paginationMetadata) {
        this.paginationMetadata = paginationMetadata;
        return this;
    }
    
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetSubscriptionsSubscriptionIdSchedule200ApplicationJSON - OK
 */
public class GetSubscriptionsSubscriptionIdSchedule200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public GetSubscriptionsSubscriptionIdSchedule200ApplicationJSONData[] data;
    public GetSubscriptionsSubscriptionIdSchedule200ApplicationJSON withData(GetSubscriptionsSubscriptionIdSchedule200ApplicationJSONData[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pagination_metadata")
    public java.util.Map<String, Object> paginationMetadata;
    public GetSubscriptionsSubscriptionIdSchedule200ApplicationJSON withPaginationMetadata(java.util.Map<String, Object> paginationMetadata) {
        this.paginationMetadata = paginationMetadata;
        return this;
    }
    
    public GetSubscriptionsSubscriptionIdSchedule200ApplicationJSON(){}
}

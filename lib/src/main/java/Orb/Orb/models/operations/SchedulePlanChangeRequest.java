/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SchedulePlanChangeRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public SchedulePlanChangeRequestBody requestBody;

    public SchedulePlanChangeRequest withRequestBody(SchedulePlanChangeRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subscription_id")
    public String subscriptionId;

    public SchedulePlanChangeRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    
    public SchedulePlanChangeRequest(@JsonProperty("subscription_id") String subscriptionId) {
        this.subscriptionId = subscriptionId;
  }
}

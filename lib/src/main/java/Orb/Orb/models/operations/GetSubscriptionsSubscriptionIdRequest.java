/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;

public class GetSubscriptionsSubscriptionIdRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subscription_id")
    public String subscriptionId;
    public GetSubscriptionsSubscriptionIdRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    
}

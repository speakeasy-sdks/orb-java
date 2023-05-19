/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSubscriptionsSubscriptionIdCancelRequest {
    /**
     * Determines the timing of subscription cancellation
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=cancel_option")
    public PostSubscriptionsSubscriptionIdCancelCancelOption cancelOption;

    public PostSubscriptionsSubscriptionIdCancelRequest withCancelOption(PostSubscriptionsSubscriptionIdCancelCancelOption cancelOption) {
        this.cancelOption = cancelOption;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subscription_id")
    public String subscriptionId;

    public PostSubscriptionsSubscriptionIdCancelRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    
    public PostSubscriptionsSubscriptionIdCancelRequest(@JsonProperty("cancel_option") PostSubscriptionsSubscriptionIdCancelCancelOption cancelOption, @JsonProperty("subscription_id") String subscriptionId) {
        this.cancelOption = cancelOption;
        this.subscriptionId = subscriptionId;
  }
}

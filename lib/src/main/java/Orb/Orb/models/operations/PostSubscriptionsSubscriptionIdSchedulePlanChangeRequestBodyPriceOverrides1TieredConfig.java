/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tiers")
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfigTiers[] tiers;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfig withTiers(PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfigTiers[] tiers) {
        this.tiers = tiers;
        return this;
    }
    
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfig(){}
}

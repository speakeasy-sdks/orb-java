/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSubscriptionsRequestBodyPriceOverrides6BulkBpsConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tiers")
    public PostSubscriptionsRequestBodyPriceOverrides6BulkBpsConfigTiers[] tiers;
    public PostSubscriptionsRequestBodyPriceOverrides6BulkBpsConfig withTiers(PostSubscriptionsRequestBodyPriceOverrides6BulkBpsConfigTiers[] tiers) {
        this.tiers = tiers;
        return this;
    }
    
    public PostSubscriptionsRequestBodyPriceOverrides6BulkBpsConfig(){}
}

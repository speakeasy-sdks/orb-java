/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSubscriptionsRequestBodyPriceOverrides1TieredConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tiers")
    public PostSubscriptionsRequestBodyPriceOverrides1TieredConfigTiers[] tiers;
    public PostSubscriptionsRequestBodyPriceOverrides1TieredConfig withTiers(PostSubscriptionsRequestBodyPriceOverrides1TieredConfigTiers[] tiers) {
        this.tiers = tiers;
        return this;
    }
    
}

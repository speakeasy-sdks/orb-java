/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SchedulePlanChangeRequestBodyPriceOverrides6BulkBpsConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tiers")
    public SchedulePlanChangeRequestBodyPriceOverrides6BulkBpsConfigTiers[] tiers;

    public SchedulePlanChangeRequestBodyPriceOverrides6BulkBpsConfig withTiers(SchedulePlanChangeRequestBodyPriceOverrides6BulkBpsConfigTiers[] tiers) {
        this.tiers = tiers;
        return this;
    }
    
    public SchedulePlanChangeRequestBodyPriceOverrides6BulkBpsConfig(){}
}
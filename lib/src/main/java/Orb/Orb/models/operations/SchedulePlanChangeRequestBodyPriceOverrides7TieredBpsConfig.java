/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SchedulePlanChangeRequestBodyPriceOverrides7TieredBpsConfig {
    @JsonProperty("tiers")
    public SchedulePlanChangeRequestBodyPriceOverrides7TieredBpsConfigTiers[] tiers;

    public SchedulePlanChangeRequestBodyPriceOverrides7TieredBpsConfig withTiers(SchedulePlanChangeRequestBodyPriceOverrides7TieredBpsConfigTiers[] tiers) {
        this.tiers = tiers;
        return this;
    }
    
    public SchedulePlanChangeRequestBodyPriceOverrides7TieredBpsConfig(@JsonProperty("tiers") SchedulePlanChangeRequestBodyPriceOverrides7TieredBpsConfigTiers[] tiers) {
        this.tiers = tiers;
  }
}
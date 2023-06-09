/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSubscriptionsRequestBodyPriceOverrides6BulkBpsConfigTiers {
    @JsonProperty("bps")
    public Double bps;
    public PostSubscriptionsRequestBodyPriceOverrides6BulkBpsConfigTiers withBps(Double bps) {
        this.bps = bps;
        return this;
    }
    
    @JsonProperty("maximum_amount")
    public String maximumAmount;
    public PostSubscriptionsRequestBodyPriceOverrides6BulkBpsConfigTiers withMaximumAmount(String maximumAmount) {
        this.maximumAmount = maximumAmount;
        return this;
    }
    
    @JsonProperty("per_unit_maximum")
    public String perUnitMaximum;
    public PostSubscriptionsRequestBodyPriceOverrides6BulkBpsConfigTiers withPerUnitMaximum(String perUnitMaximum) {
        this.perUnitMaximum = perUnitMaximum;
        return this;
    }
    
}

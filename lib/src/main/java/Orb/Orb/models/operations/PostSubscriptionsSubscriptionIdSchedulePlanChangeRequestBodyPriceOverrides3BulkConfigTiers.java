/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides3BulkConfigTiers {
    @JsonProperty("maximum_units")
    public String maximumUnits;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides3BulkConfigTiers withMaximumUnits(String maximumUnits) {
        this.maximumUnits = maximumUnits;
        return this;
    }
    
    @JsonProperty("unit_amount")
    public String unitAmount;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides3BulkConfigTiers withUnitAmount(String unitAmount) {
        this.unitAmount = unitAmount;
        return this;
    }
    
}
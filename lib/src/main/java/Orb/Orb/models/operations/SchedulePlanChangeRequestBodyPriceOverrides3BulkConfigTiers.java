/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SchedulePlanChangeRequestBodyPriceOverrides3BulkConfigTiers {
    @JsonProperty("maximum_units")
    public String maximumUnits;

    public SchedulePlanChangeRequestBodyPriceOverrides3BulkConfigTiers withMaximumUnits(String maximumUnits) {
        this.maximumUnits = maximumUnits;
        return this;
    }
    
    @JsonProperty("unit_amount")
    public String unitAmount;

    public SchedulePlanChangeRequestBodyPriceOverrides3BulkConfigTiers withUnitAmount(String unitAmount) {
        this.unitAmount = unitAmount;
        return this;
    }
    
    public SchedulePlanChangeRequestBodyPriceOverrides3BulkConfigTiers(@JsonProperty("maximum_units") String maximumUnits, @JsonProperty("unit_amount") String unitAmount) {
        this.maximumUnits = maximumUnits;
        this.unitAmount = unitAmount;
  }
}
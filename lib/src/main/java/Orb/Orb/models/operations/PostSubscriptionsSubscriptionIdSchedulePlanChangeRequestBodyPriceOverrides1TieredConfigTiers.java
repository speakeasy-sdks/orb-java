/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfigTiers {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_unit")
    public String firstUnit;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfigTiers withFirstUnit(String firstUnit) {
        this.firstUnit = firstUnit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_unit")
    public String lastUnit;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfigTiers withLastUnit(String lastUnit) {
        this.lastUnit = lastUnit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_amount")
    public String unitAmount;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfigTiers withUnitAmount(String unitAmount) {
        this.unitAmount = unitAmount;
        return this;
    }
    
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfigTiers(){}
}

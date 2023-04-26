/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2 - Unit price override
 */
public class PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2 {
    @JsonProperty("id")
    public String id;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2 withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The subscription's override minimum amount for this price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_amount")
    public String minimumAmount;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2 withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    @JsonProperty("model_type")
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2ModelTypeEnum modelType;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2 withModelType(PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2ModelTypeEnum modelType) {
        this.modelType = modelType;
        return this;
    }
    
    @JsonProperty("unit_config")
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2UnitConfig unitConfig;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2 withUnitConfig(PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2UnitConfig unitConfig) {
        this.unitConfig = unitConfig;
        return this;
    }
    
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2(@JsonProperty("id") String id, @JsonProperty("model_type") PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2ModelTypeEnum modelType, @JsonProperty("unit_config") PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides2UnitConfig unitConfig) {
        this.id = id;
        this.modelType = modelType;
        this.unitConfig = unitConfig;
  }
}

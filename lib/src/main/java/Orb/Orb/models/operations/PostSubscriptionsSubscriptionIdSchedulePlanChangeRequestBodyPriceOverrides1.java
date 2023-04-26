/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1 - Tiered price override
 */
public class PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1 {
    /**
     * price_id
     */
    @JsonProperty("id")
    public String id;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1 withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The subscription's override minimum amount for this price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_amount")
    public String minimumAmount;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1 withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    @JsonProperty("model_type")
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1ModelTypeEnum modelType;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1 withModelType(PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1ModelTypeEnum modelType) {
        this.modelType = modelType;
        return this;
    }
    
    @JsonProperty("tiered_config")
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfig tieredConfig;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1 withTieredConfig(PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfig tieredConfig) {
        this.tieredConfig = tieredConfig;
        return this;
    }
    
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1(@JsonProperty("id") String id, @JsonProperty("model_type") PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1ModelTypeEnum modelType, @JsonProperty("tiered_config") PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyPriceOverrides1TieredConfig tieredConfig) {
        this.id = id;
        this.modelType = modelType;
        this.tieredConfig = tieredConfig;
  }
}

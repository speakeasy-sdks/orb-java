/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostSubscriptionsRequestBodyPriceOverrides1 - Tiered price override
 */
public class PostSubscriptionsRequestBodyPriceOverrides1 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount")
    public java.util.Map<String, Object> discount;

    public PostSubscriptionsRequestBodyPriceOverrides1 withDiscount(java.util.Map<String, Object> discount) {
        this.discount = discount;
        return this;
    }
    
    /**
     * price_id
     */
    @JsonProperty("id")
    public String id;

    public PostSubscriptionsRequestBodyPriceOverrides1 withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The subscription's override minimum amount for this price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_amount")
    public String minimumAmount;

    public PostSubscriptionsRequestBodyPriceOverrides1 withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    @JsonProperty("model_type")
    public PostSubscriptionsRequestBodyPriceOverrides1ModelTypeEnum modelType;

    public PostSubscriptionsRequestBodyPriceOverrides1 withModelType(PostSubscriptionsRequestBodyPriceOverrides1ModelTypeEnum modelType) {
        this.modelType = modelType;
        return this;
    }
    
    @JsonProperty("tiered_config")
    public PostSubscriptionsRequestBodyPriceOverrides1TieredConfig tieredConfig;

    public PostSubscriptionsRequestBodyPriceOverrides1 withTieredConfig(PostSubscriptionsRequestBodyPriceOverrides1TieredConfig tieredConfig) {
        this.tieredConfig = tieredConfig;
        return this;
    }
    
    public PostSubscriptionsRequestBodyPriceOverrides1(@JsonProperty("id") String id, @JsonProperty("model_type") PostSubscriptionsRequestBodyPriceOverrides1ModelTypeEnum modelType, @JsonProperty("tiered_config") PostSubscriptionsRequestBodyPriceOverrides1TieredConfig tieredConfig) {
        this.id = id;
        this.modelType = modelType;
        this.tieredConfig = tieredConfig;
  }
}

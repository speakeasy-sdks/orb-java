/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostSubscriptionsRequestBodyPriceOverrides7 - Tiered BPS price override
 */
public class PostSubscriptionsRequestBodyPriceOverrides7 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount")
    public java.util.Map<String, Object> discount;
    public PostSubscriptionsRequestBodyPriceOverrides7 withDiscount(java.util.Map<String, Object> discount) {
        this.discount = discount;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public PostSubscriptionsRequestBodyPriceOverrides7 withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The subscription's override minimum amount for this price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_amount")
    public String minimumAmount;
    public PostSubscriptionsRequestBodyPriceOverrides7 withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    @JsonProperty("model_type")
    public PostSubscriptionsRequestBodyPriceOverrides7ModelTypeEnum modelType;
    public PostSubscriptionsRequestBodyPriceOverrides7 withModelType(PostSubscriptionsRequestBodyPriceOverrides7ModelTypeEnum modelType) {
        this.modelType = modelType;
        return this;
    }
    
    @JsonProperty("tiered_bps_config")
    public PostSubscriptionsRequestBodyPriceOverrides7TieredBpsConfig tieredBpsConfig;
    public PostSubscriptionsRequestBodyPriceOverrides7 withTieredBpsConfig(PostSubscriptionsRequestBodyPriceOverrides7TieredBpsConfig tieredBpsConfig) {
        this.tieredBpsConfig = tieredBpsConfig;
        return this;
    }
    
}

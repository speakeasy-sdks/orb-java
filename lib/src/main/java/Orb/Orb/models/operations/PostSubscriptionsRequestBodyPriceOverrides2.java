/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostSubscriptionsRequestBodyPriceOverrides2 - Unit price override
 */
public class PostSubscriptionsRequestBodyPriceOverrides2 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount")
    public java.util.Map<String, Object> discount;
    public PostSubscriptionsRequestBodyPriceOverrides2 withDiscount(java.util.Map<String, Object> discount) {
        this.discount = discount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fixed_price_quantity")
    public Long fixedPriceQuantity;
    public PostSubscriptionsRequestBodyPriceOverrides2 withFixedPriceQuantity(Long fixedPriceQuantity) {
        this.fixedPriceQuantity = fixedPriceQuantity;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public PostSubscriptionsRequestBodyPriceOverrides2 withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The subscription's override minimum amount for this price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_amount")
    public String minimumAmount;
    public PostSubscriptionsRequestBodyPriceOverrides2 withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    @JsonProperty("model_type")
    public PostSubscriptionsRequestBodyPriceOverrides2ModelTypeEnum modelType;
    public PostSubscriptionsRequestBodyPriceOverrides2 withModelType(PostSubscriptionsRequestBodyPriceOverrides2ModelTypeEnum modelType) {
        this.modelType = modelType;
        return this;
    }
    
    @JsonProperty("unit_config")
    public PostSubscriptionsRequestBodyPriceOverrides2UnitConfig unitConfig;
    public PostSubscriptionsRequestBodyPriceOverrides2 withUnitConfig(PostSubscriptionsRequestBodyPriceOverrides2UnitConfig unitConfig) {
        this.unitConfig = unitConfig;
        return this;
    }
    
}

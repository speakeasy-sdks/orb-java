/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateSubscriptionApplicationJSONPriceOverrides2 - Unit price override
 */
public class CreateSubscriptionApplicationJSONPriceOverrides2 {
    /**
     * The subscription's override discount for this price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount")
    public Orb.Orb.models.shared.CreateDiscount discount;

    public CreateSubscriptionApplicationJSONPriceOverrides2 withDiscount(Orb.Orb.models.shared.CreateDiscount discount) {
        this.discount = discount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fixed_price_quantity")
    public Long fixedPriceQuantity;

    public CreateSubscriptionApplicationJSONPriceOverrides2 withFixedPriceQuantity(Long fixedPriceQuantity) {
        this.fixedPriceQuantity = fixedPriceQuantity;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public CreateSubscriptionApplicationJSONPriceOverrides2 withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The subscription's override minimum amount for this price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_amount")
    public String minimumAmount;

    public CreateSubscriptionApplicationJSONPriceOverrides2 withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    @JsonProperty("model_type")
    public CreateSubscriptionApplicationJSONPriceOverrides2ModelType modelType;

    public CreateSubscriptionApplicationJSONPriceOverrides2 withModelType(CreateSubscriptionApplicationJSONPriceOverrides2ModelType modelType) {
        this.modelType = modelType;
        return this;
    }
    
    @JsonProperty("unit_config")
    public CreateSubscriptionApplicationJSONPriceOverrides2UnitConfig unitConfig;

    public CreateSubscriptionApplicationJSONPriceOverrides2 withUnitConfig(CreateSubscriptionApplicationJSONPriceOverrides2UnitConfig unitConfig) {
        this.unitConfig = unitConfig;
        return this;
    }
    
    public CreateSubscriptionApplicationJSONPriceOverrides2(@JsonProperty("id") String id, @JsonProperty("model_type") CreateSubscriptionApplicationJSONPriceOverrides2ModelType modelType, @JsonProperty("unit_config") CreateSubscriptionApplicationJSONPriceOverrides2UnitConfig unitConfig) {
        this.id = id;
        this.modelType = modelType;
        this.unitConfig = unitConfig;
  }
}
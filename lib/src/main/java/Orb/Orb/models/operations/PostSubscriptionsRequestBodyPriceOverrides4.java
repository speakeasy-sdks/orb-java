/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostSubscriptionsRequestBodyPriceOverrides4 - Package price override
 */
public class PostSubscriptionsRequestBodyPriceOverrides4 {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount")
    public java.util.Map<String, Object> discount;

    public PostSubscriptionsRequestBodyPriceOverrides4 withDiscount(java.util.Map<String, Object> discount) {
        this.discount = discount;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public PostSubscriptionsRequestBodyPriceOverrides4 withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The subscription's override minimum amount for this price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_amount")
    public String minimumAmount;

    public PostSubscriptionsRequestBodyPriceOverrides4 withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    @JsonProperty("model_type")
    public PostSubscriptionsRequestBodyPriceOverrides4ModelType modelType;

    public PostSubscriptionsRequestBodyPriceOverrides4 withModelType(PostSubscriptionsRequestBodyPriceOverrides4ModelType modelType) {
        this.modelType = modelType;
        return this;
    }
    
    @JsonProperty("package_config")
    public PostSubscriptionsRequestBodyPriceOverrides4PackageConfig packageConfig;

    public PostSubscriptionsRequestBodyPriceOverrides4 withPackageConfig(PostSubscriptionsRequestBodyPriceOverrides4PackageConfig packageConfig) {
        this.packageConfig = packageConfig;
        return this;
    }
    
    public PostSubscriptionsRequestBodyPriceOverrides4(@JsonProperty("id") String id, @JsonProperty("model_type") PostSubscriptionsRequestBodyPriceOverrides4ModelType modelType, @JsonProperty("package_config") PostSubscriptionsRequestBodyPriceOverrides4PackageConfig packageConfig) {
        this.id = id;
        this.modelType = modelType;
        this.packageConfig = packageConfig;
  }
}

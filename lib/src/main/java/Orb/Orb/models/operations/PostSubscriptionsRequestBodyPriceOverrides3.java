/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostSubscriptionsRequestBodyPriceOverrides3 - Bulk price override
 */
public class PostSubscriptionsRequestBodyPriceOverrides3 {
    @JsonProperty("bulk_config")
    public PostSubscriptionsRequestBodyPriceOverrides3BulkConfig bulkConfig;

    public PostSubscriptionsRequestBodyPriceOverrides3 withBulkConfig(PostSubscriptionsRequestBodyPriceOverrides3BulkConfig bulkConfig) {
        this.bulkConfig = bulkConfig;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount")
    public java.util.Map<String, Object> discount;

    public PostSubscriptionsRequestBodyPriceOverrides3 withDiscount(java.util.Map<String, Object> discount) {
        this.discount = discount;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public PostSubscriptionsRequestBodyPriceOverrides3 withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The subscription's override minimum amount for this price.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_amount")
    public String minimumAmount;

    public PostSubscriptionsRequestBodyPriceOverrides3 withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    @JsonProperty("model_type")
    public PostSubscriptionsRequestBodyPriceOverrides3ModelTypeEnum modelType;

    public PostSubscriptionsRequestBodyPriceOverrides3 withModelType(PostSubscriptionsRequestBodyPriceOverrides3ModelTypeEnum modelType) {
        this.modelType = modelType;
        return this;
    }
    
    public PostSubscriptionsRequestBodyPriceOverrides3(@JsonProperty("bulk_config") PostSubscriptionsRequestBodyPriceOverrides3BulkConfig bulkConfig, @JsonProperty("id") String id, @JsonProperty("model_type") PostSubscriptionsRequestBodyPriceOverrides3ModelTypeEnum modelType) {
        this.bulkConfig = bulkConfig;
        this.id = id;
        this.modelType = modelType;
  }
}

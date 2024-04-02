/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSubscriptionsRequestBodyPhaseOverrides {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("discount")
    public java.util.Map<String, Object> discount;
    public PostSubscriptionsRequestBodyPhaseOverrides withDiscount(java.util.Map<String, Object> discount) {
        this.discount = discount;
        return this;
    }
    
    /**
     * The new minimum amount for the phase. Providing `null` will clear the existing minimum, if it exists.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_amount")
    public String minimumAmount;
    public PostSubscriptionsRequestBodyPhaseOverrides withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    /**
     * The phase order that is being modified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Double order;
    public PostSubscriptionsRequestBodyPhaseOverrides withOrder(Double order) {
        this.order = order;
        return this;
    }
    
}
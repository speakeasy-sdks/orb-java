/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class UpdateFixedFeeQuantityRequestBody {
    /**
     * Determines when the change takes effect. Note that if `effective_date` is specified, this defautls to `effective_date`. Otherwise, this defaults to `immediate` unless it's explicitly set to `upcoming_invoice.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("change_option")
    public UpdateFixedFeeQuantityRequestBodyChangeOption changeOption;

    public UpdateFixedFeeQuantityRequestBody withChangeOption(UpdateFixedFeeQuantityRequestBodyChangeOption changeOption) {
        this.changeOption = changeOption;
        return this;
    }
    
    /**
     * The date that the quantity change should take effect, localized to the customer's timezone. If this parameter is not passed in, the quantity change is effective immediately.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("effective_date")
    public LocalDate effectiveDate;

    public UpdateFixedFeeQuantityRequestBody withEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }
    
    /**
     * Price for which the quantity should be updated. Must be a fixed fee.
     */
    @JsonProperty("price_id")
    public String priceId;

    public UpdateFixedFeeQuantityRequestBody withPriceId(String priceId) {
        this.priceId = priceId;
        return this;
    }
    
    @JsonProperty("quantity")
    public Double quantity;

    public UpdateFixedFeeQuantityRequestBody withQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }
    
    public UpdateFixedFeeQuantityRequestBody(@JsonProperty("price_id") String priceId, @JsonProperty("quantity") Double quantity) {
        this.priceId = priceId;
        this.quantity = quantity;
  }
}

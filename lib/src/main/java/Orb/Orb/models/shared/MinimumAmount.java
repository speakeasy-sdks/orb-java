/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MinimumAmount {
    /**
     * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this can be a subset of prices.
     */
    @JsonProperty("applies_to_price_ids")
    public String[] appliesToPriceIds;

    public MinimumAmount withAppliesToPriceIds(String[] appliesToPriceIds) {
        this.appliesToPriceIds = appliesToPriceIds;
        return this;
    }
    
    /**
     * Minimum amount applied
     */
    @JsonProperty("minimum_amount")
    public String minimumAmount;

    public MinimumAmount withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    public MinimumAmount(@JsonProperty("applies_to_price_ids") String[] appliesToPriceIds, @JsonProperty("minimum_amount") String minimumAmount) {
        this.appliesToPriceIds = appliesToPriceIds;
        this.minimumAmount = minimumAmount;
  }
}
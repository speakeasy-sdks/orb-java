/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceMatrixConfigMatrixValues {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("dimension_values")
    public String[] dimensionValues;
    public PriceMatrixConfigMatrixValues withDimensionValues(String[] dimensionValues) {
        this.dimensionValues = dimensionValues;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_amount")
    public String unitAmount;
    public PriceMatrixConfigMatrixValues withUnitAmount(String unitAmount) {
        this.unitAmount = unitAmount;
        return this;
    }
    

    public PriceMatrixConfigMatrixValues(){}
}

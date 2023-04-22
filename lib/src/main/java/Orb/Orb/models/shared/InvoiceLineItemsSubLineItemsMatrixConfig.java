/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceLineItemsSubLineItemsMatrixConfig - Only available if `type` is `matrix`. Contains the values of the matrix that this `sub_line_item` represents.
 */
public class InvoiceLineItemsSubLineItemsMatrixConfig {
    /**
     * The ordered dimension values for this line item.
     */
    @JsonProperty("dimension_values")
    public String[] dimensionValues;
    public InvoiceLineItemsSubLineItemsMatrixConfig withDimensionValues(String[] dimensionValues) {
        this.dimensionValues = dimensionValues;
        return this;
    }
    

    public InvoiceLineItemsSubLineItemsMatrixConfig(@JsonProperty("dimension_values") String[] dimensionValues) {
    this.dimensionValues = dimensionValues;
  }
}

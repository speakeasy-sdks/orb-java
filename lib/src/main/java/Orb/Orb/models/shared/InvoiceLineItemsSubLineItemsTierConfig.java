/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceLineItemsSubLineItemsTierConfig - Only available if `type` is `tier`. Contains the range of units in this tier and the unit amount.
 */
public class InvoiceLineItemsSubLineItemsTierConfig {
    @JsonProperty("first_unit")
    public Double firstUnit;
    public InvoiceLineItemsSubLineItemsTierConfig withFirstUnit(Double firstUnit) {
        this.firstUnit = firstUnit;
        return this;
    }
    
    @JsonProperty("last_unit")
    public Double lastUnit;
    public InvoiceLineItemsSubLineItemsTierConfig withLastUnit(Double lastUnit) {
        this.lastUnit = lastUnit;
        return this;
    }
    
    @JsonProperty("unit_amount")
    public String unitAmount;
    public InvoiceLineItemsSubLineItemsTierConfig withUnitAmount(String unitAmount) {
        this.unitAmount = unitAmount;
        return this;
    }
    
}

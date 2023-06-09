/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceLineItemsTaxAmounts {
    /**
     * The amount of additional tax incurred by this tax rate.
     */
    @JsonProperty("amount")
    public String amount;
    public InvoiceLineItemsTaxAmounts withAmount(String amount) {
        this.amount = amount;
        return this;
    }
    
    /**
     * The human-readable description of the applied tax rate.
     */
    @JsonProperty("tax_rate_description")
    public String taxRateDescription;
    public InvoiceLineItemsTaxAmounts withTaxRateDescription(String taxRateDescription) {
        this.taxRateDescription = taxRateDescription;
        return this;
    }
    
    /**
     * The tax rate percentage, out of 100.
     */
    @JsonProperty("tax_rate_percentage")
    public String taxRatePercentage;
    public InvoiceLineItemsTaxAmounts withTaxRatePercentage(String taxRatePercentage) {
        this.taxRatePercentage = taxRatePercentage;
        return this;
    }
    
}

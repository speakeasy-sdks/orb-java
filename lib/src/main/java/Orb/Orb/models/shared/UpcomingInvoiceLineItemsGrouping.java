/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpcomingInvoiceLineItemsGrouping - For configured prices that are split by a grouping key, this will be populated with the key and a value. The `amount` and `subtotal` will be the values for this particular grouping.
 */
public class UpcomingInvoiceLineItemsGrouping {
    @JsonProperty("key")
    public String key;
    public UpcomingInvoiceLineItemsGrouping withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonProperty("value")
    public String value;
    public UpcomingInvoiceLineItemsGrouping withValue(String value) {
        this.value = value;
        return this;
    }
    
    public UpcomingInvoiceLineItemsGrouping(@JsonProperty("key") String key, @JsonProperty("value") String value) {
        this.key = key;
        this.value = value;
  }
}

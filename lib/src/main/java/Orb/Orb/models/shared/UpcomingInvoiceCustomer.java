/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpcomingInvoiceCustomer - The customer receiving this invoice.
 */
public class UpcomingInvoiceCustomer {
    @JsonProperty("external_customer_id")
    public String externalCustomerId;

    public UpcomingInvoiceCustomer withExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public UpcomingInvoiceCustomer withId(String id) {
        this.id = id;
        return this;
    }
    
    public UpcomingInvoiceCustomer(@JsonProperty("external_customer_id") String externalCustomerId, @JsonProperty("id") String id) {
        this.externalCustomerId = externalCustomerId;
        this.id = id;
  }
}

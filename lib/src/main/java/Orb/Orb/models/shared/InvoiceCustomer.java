/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCustomer - The customer receiving this invoice.
 */
public class InvoiceCustomer {
    @JsonProperty("external_customer_id")
    public String externalCustomerId;
    public InvoiceCustomer withExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public InvoiceCustomer withId(String id) {
        this.id = id;
        return this;
    }
    

    public InvoiceCustomer(@JsonProperty("external_customer_id") String externalCustomerId, @JsonProperty("id") String id) {
    this.externalCustomerId = externalCustomerId;
this.id = id;
  }
}

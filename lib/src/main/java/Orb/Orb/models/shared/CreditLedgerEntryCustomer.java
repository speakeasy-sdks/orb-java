/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditLedgerEntryCustomer {
    @JsonProperty("external_customer_id")
    public String externalCustomerId;
    public CreditLedgerEntryCustomer withExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public CreditLedgerEntryCustomer withId(String id) {
        this.id = id;
        return this;
    }
    
    public CreditLedgerEntryCustomer(@JsonProperty("external_customer_id") String externalCustomerId, @JsonProperty("id") String id) {
        this.externalCustomerId = externalCustomerId;
        this.id = id;
  }
}

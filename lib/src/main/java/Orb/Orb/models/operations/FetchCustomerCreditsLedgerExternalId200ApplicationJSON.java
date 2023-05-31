/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FetchCustomerCreditsLedgerExternalId200ApplicationJSON - OK
 */
public class FetchCustomerCreditsLedgerExternalId200ApplicationJSON {
    @JsonProperty("data")
    public Orb.Orb.models.shared.CreditLedgerEntry[] data;

    public FetchCustomerCreditsLedgerExternalId200ApplicationJSON withData(Orb.Orb.models.shared.CreditLedgerEntry[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("pagination_metadata")
    public FetchCustomerCreditsLedgerExternalId200ApplicationJSONPaginationMetadata paginationMetadata;

    public FetchCustomerCreditsLedgerExternalId200ApplicationJSON withPaginationMetadata(FetchCustomerCreditsLedgerExternalId200ApplicationJSONPaginationMetadata paginationMetadata) {
        this.paginationMetadata = paginationMetadata;
        return this;
    }
    
    public FetchCustomerCreditsLedgerExternalId200ApplicationJSON(@JsonProperty("data") Orb.Orb.models.shared.CreditLedgerEntry[] data, @JsonProperty("pagination_metadata") FetchCustomerCreditsLedgerExternalId200ApplicationJSONPaginationMetadata paginationMetadata) {
        this.data = data;
        this.paginationMetadata = paginationMetadata;
  }
}

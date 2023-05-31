/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FetchCustomerCredits200ApplicationJSON - OK
 */
public class FetchCustomerCredits200ApplicationJSON {
    @JsonProperty("data")
    public FetchCustomerCredits200ApplicationJSONData[] data;

    public FetchCustomerCredits200ApplicationJSON withData(FetchCustomerCredits200ApplicationJSONData[] data) {
        this.data = data;
        return this;
    }
    
    @JsonProperty("pagination_metadata")
    public FetchCustomerCredits200ApplicationJSONPaginationMetadata paginationMetadata;

    public FetchCustomerCredits200ApplicationJSON withPaginationMetadata(FetchCustomerCredits200ApplicationJSONPaginationMetadata paginationMetadata) {
        this.paginationMetadata = paginationMetadata;
        return this;
    }
    
    public FetchCustomerCredits200ApplicationJSON(@JsonProperty("data") FetchCustomerCredits200ApplicationJSONData[] data, @JsonProperty("pagination_metadata") FetchCustomerCredits200ApplicationJSONPaginationMetadata paginationMetadata) {
        this.data = data;
        this.paginationMetadata = paginationMetadata;
  }
}

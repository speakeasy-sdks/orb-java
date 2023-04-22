/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListInvoices200ApplicationJSON - OK
 */
public class ListInvoices200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public Orb.Orb.models.shared.Invoice[] data;
    public ListInvoices200ApplicationJSON withData(Orb.Orb.models.shared.Invoice[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pagination_metadata")
    public java.util.Map<String, Object> paginationMetadata;
    public ListInvoices200ApplicationJSON withPaginationMetadata(java.util.Map<String, Object> paginationMetadata) {
        this.paginationMetadata = paginationMetadata;
        return this;
    }
    

    public ListInvoices200ApplicationJSON(){}
}

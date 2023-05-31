/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class AddLedgerEntryExternalIdResponse {
    
    public String contentType;

    public AddLedgerEntryExternalIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public Orb.Orb.models.shared.CreditLedgerEntry creditLedgerEntry;

    public AddLedgerEntryExternalIdResponse withCreditLedgerEntry(Orb.Orb.models.shared.CreditLedgerEntry creditLedgerEntry) {
        this.creditLedgerEntry = creditLedgerEntry;
        return this;
    }
    
    
    public Integer statusCode;

    public AddLedgerEntryExternalIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public AddLedgerEntryExternalIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public AddLedgerEntryExternalIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}

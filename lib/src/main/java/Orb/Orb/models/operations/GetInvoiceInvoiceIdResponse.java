/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetInvoiceInvoiceIdResponse {
    
    public String contentType;
    public GetInvoiceInvoiceIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public Orb.Orb.models.shared.Invoice invoice;
    public GetInvoiceInvoiceIdResponse withInvoice(Orb.Orb.models.shared.Invoice invoice) {
        this.invoice = invoice;
        return this;
    }
    
    
    public Integer statusCode;
    public GetInvoiceInvoiceIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetInvoiceInvoiceIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    

    public GetInvoiceInvoiceIdResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
    this.contentType = contentType;
this.statusCode = statusCode;
  }
}

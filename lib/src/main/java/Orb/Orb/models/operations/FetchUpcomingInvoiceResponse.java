/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class FetchUpcomingInvoiceResponse {
    
    public String contentType;

    public FetchUpcomingInvoiceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public FetchUpcomingInvoiceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public FetchUpcomingInvoiceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public Orb.Orb.models.shared.UpcomingInvoice upcomingInvoice;

    public FetchUpcomingInvoiceResponse withUpcomingInvoice(Orb.Orb.models.shared.UpcomingInvoice upcomingInvoice) {
        this.upcomingInvoice = upcomingInvoice;
        return this;
    }
    
    public FetchUpcomingInvoiceResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
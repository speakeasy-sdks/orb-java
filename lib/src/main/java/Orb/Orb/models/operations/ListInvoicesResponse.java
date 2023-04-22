/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ListInvoicesResponse {
    
    public String contentType;
    public ListInvoicesResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public ListInvoicesResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public ListInvoicesResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public ListInvoices200ApplicationJSON listInvoices200ApplicationJSONObject;
    public ListInvoicesResponse withListInvoices200ApplicationJSONObject(ListInvoices200ApplicationJSON listInvoices200ApplicationJSONObject) {
        this.listInvoices200ApplicationJSONObject = listInvoices200ApplicationJSONObject;
        return this;
    }
    

    public ListInvoicesResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
    this.contentType = contentType;
this.statusCode = statusCode;
  }
}

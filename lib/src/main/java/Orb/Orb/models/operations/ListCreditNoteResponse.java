/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ListCreditNoteResponse {
    
    public String contentType;

    public ListCreditNoteResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public ListCreditNoteResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListCreditNoteResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public ListCreditNote200ApplicationJSON listCreditNote200ApplicationJSONObject;

    public ListCreditNoteResponse withListCreditNote200ApplicationJSONObject(ListCreditNote200ApplicationJSON listCreditNote200ApplicationJSONObject) {
        this.listCreditNote200ApplicationJSONObject = listCreditNote200ApplicationJSONObject;
        return this;
    }
    
    public ListCreditNoteResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
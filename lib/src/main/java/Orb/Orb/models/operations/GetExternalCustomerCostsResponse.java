/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetExternalCustomerCostsResponse {
    
    public String contentType;
    public GetExternalCustomerCostsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public GetExternalCustomerCostsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetExternalCustomerCostsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public GetExternalCustomerCosts200ApplicationJSON getExternalCustomerCosts200ApplicationJSONObject;
    public GetExternalCustomerCostsResponse withGetExternalCustomerCosts200ApplicationJSONObject(GetExternalCustomerCosts200ApplicationJSON getExternalCustomerCosts200ApplicationJSONObject) {
        this.getExternalCustomerCosts200ApplicationJSONObject = getExternalCustomerCosts200ApplicationJSONObject;
        return this;
    }
    
    public GetExternalCustomerCostsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}

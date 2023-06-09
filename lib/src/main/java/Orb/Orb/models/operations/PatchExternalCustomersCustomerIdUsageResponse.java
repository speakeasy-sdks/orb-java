/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import java.net.http.HttpResponse;

public class PatchExternalCustomersCustomerIdUsageResponse {
    
    public String contentType;
    public PatchExternalCustomersCustomerIdUsageResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public PatchExternalCustomersCustomerIdUsageResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PatchExternalCustomersCustomerIdUsageResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public PatchExternalCustomersCustomerIdUsage200ApplicationJSON patchExternalCustomersCustomerIdUsage200ApplicationJSONObject;
    public PatchExternalCustomersCustomerIdUsageResponse withPatchExternalCustomersCustomerIdUsage200ApplicationJSONObject(PatchExternalCustomersCustomerIdUsage200ApplicationJSON patchExternalCustomersCustomerIdUsage200ApplicationJSONObject) {
        this.patchExternalCustomersCustomerIdUsage200ApplicationJSONObject = patchExternalCustomersCustomerIdUsage200ApplicationJSONObject;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public PatchExternalCustomersCustomerIdUsage400ApplicationJSON patchExternalCustomersCustomerIdUsage400ApplicationJSONObject;
    public PatchExternalCustomersCustomerIdUsageResponse withPatchExternalCustomersCustomerIdUsage400ApplicationJSONObject(PatchExternalCustomersCustomerIdUsage400ApplicationJSON patchExternalCustomersCustomerIdUsage400ApplicationJSONObject) {
        this.patchExternalCustomersCustomerIdUsage400ApplicationJSONObject = patchExternalCustomersCustomerIdUsage400ApplicationJSONObject;
        return this;
    }
    
}

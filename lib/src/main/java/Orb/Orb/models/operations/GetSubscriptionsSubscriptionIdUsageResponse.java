/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import java.net.http.HttpResponse;

public class GetSubscriptionsSubscriptionIdUsageResponse {
    
    public String contentType;
    public GetSubscriptionsSubscriptionIdUsageResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public GetSubscriptionsSubscriptionIdUsageResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetSubscriptionsSubscriptionIdUsageResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
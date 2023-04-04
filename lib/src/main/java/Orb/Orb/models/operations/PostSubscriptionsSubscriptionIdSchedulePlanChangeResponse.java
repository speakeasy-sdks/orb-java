/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import java.net.http.HttpResponse;

public class PostSubscriptionsSubscriptionIdSchedulePlanChangeResponse {
    
    public String contentType;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public Orb.Orb.models.shared.Subscription subscription;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeResponse withSubscription(Orb.Orb.models.shared.Subscription subscription) {
        this.subscription = subscription;
        return this;
    }
    
}

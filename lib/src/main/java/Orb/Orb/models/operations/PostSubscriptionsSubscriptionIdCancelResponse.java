/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PostSubscriptionsSubscriptionIdCancelResponse {
    
    public String contentType;

    public PostSubscriptionsSubscriptionIdCancelResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public PostSubscriptionsSubscriptionIdCancelResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostSubscriptionsSubscriptionIdCancelResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public Orb.Orb.models.shared.Subscription subscription;

    public PostSubscriptionsSubscriptionIdCancelResponse withSubscription(Orb.Orb.models.shared.Subscription subscription) {
        this.subscription = subscription;
        return this;
    }
    
    public PostSubscriptionsSubscriptionIdCancelResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}

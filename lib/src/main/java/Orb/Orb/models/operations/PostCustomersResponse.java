/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import java.net.http.HttpResponse;

public class PostCustomersResponse {
    
    public String contentType;
    public PostCustomersResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Created
     */
    
    public Orb.Orb.models.shared.Customer customer;
    public PostCustomersResponse withCustomer(Orb.Orb.models.shared.Customer customer) {
        this.customer = customer;
        return this;
    }
    
    
    public Integer statusCode;
    public PostCustomersResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PostCustomersResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}

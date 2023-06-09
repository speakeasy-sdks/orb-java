/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import java.net.http.HttpResponse;

public class PutCustomersExternalCustomerIdExternalCustomerIdResponse {
    
    public String contentType;
    public PutCustomersExternalCustomerIdExternalCustomerIdResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public Orb.Orb.models.shared.Customer customer;
    public PutCustomersExternalCustomerIdExternalCustomerIdResponse withCustomer(Orb.Orb.models.shared.Customer customer) {
        this.customer = customer;
        return this;
    }
    
    
    public Integer statusCode;
    public PutCustomersExternalCustomerIdExternalCustomerIdResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PutCustomersExternalCustomerIdExternalCustomerIdResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}

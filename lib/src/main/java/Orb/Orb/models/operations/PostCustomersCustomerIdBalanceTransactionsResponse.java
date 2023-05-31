/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PostCustomersCustomerIdBalanceTransactionsResponse {
    
    public String contentType;

    public PostCustomersCustomerIdBalanceTransactionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * OK
     */
    
    public Orb.Orb.models.shared.CustomerBalanceTransaction customerBalanceTransaction;

    public PostCustomersCustomerIdBalanceTransactionsResponse withCustomerBalanceTransaction(Orb.Orb.models.shared.CustomerBalanceTransaction customerBalanceTransaction) {
        this.customerBalanceTransaction = customerBalanceTransaction;
        return this;
    }
    
    
    public Integer statusCode;

    public PostCustomersCustomerIdBalanceTransactionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PostCustomersCustomerIdBalanceTransactionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PostCustomersCustomerIdBalanceTransactionsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}

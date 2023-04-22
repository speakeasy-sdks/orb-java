/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetCustomersCustomerIdBalanceTransactionsResponse {
    
    public String contentType;
    public GetCustomersCustomerIdBalanceTransactionsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public GetCustomersCustomerIdBalanceTransactionsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public GetCustomersCustomerIdBalanceTransactionsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public GetCustomersCustomerIdBalanceTransactions200ApplicationJSON getCustomersCustomerIdBalanceTransactions200ApplicationJSONObject;
    public GetCustomersCustomerIdBalanceTransactionsResponse withGetCustomersCustomerIdBalanceTransactions200ApplicationJSONObject(GetCustomersCustomerIdBalanceTransactions200ApplicationJSON getCustomersCustomerIdBalanceTransactions200ApplicationJSONObject) {
        this.getCustomersCustomerIdBalanceTransactions200ApplicationJSONObject = getCustomersCustomerIdBalanceTransactions200ApplicationJSONObject;
        return this;
    }
    

    public GetCustomersCustomerIdBalanceTransactionsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
    this.contentType = contentType;
this.statusCode = statusCode;
  }
}

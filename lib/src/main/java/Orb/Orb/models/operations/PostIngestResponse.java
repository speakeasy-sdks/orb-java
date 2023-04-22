/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PostIngestResponse {
    
    public String contentType;
    public PostIngestResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public PostIngestResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public PostIngestResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public PostIngest200ApplicationJSON postIngest200ApplicationJSONObject;
    public PostIngestResponse withPostIngest200ApplicationJSONObject(PostIngest200ApplicationJSON postIngest200ApplicationJSONObject) {
        this.postIngest200ApplicationJSONObject = postIngest200ApplicationJSONObject;
        return this;
    }
    
    /**
     * Bad Request
     */
    
    public PostIngest400ApplicationJSON postIngest400ApplicationJSONObject;
    public PostIngestResponse withPostIngest400ApplicationJSONObject(PostIngest400ApplicationJSON postIngest400ApplicationJSONObject) {
        this.postIngest400ApplicationJSONObject = postIngest400ApplicationJSONObject;
        return this;
    }
    

    public PostIngestResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
    this.contentType = contentType;
this.statusCode = statusCode;
  }
}

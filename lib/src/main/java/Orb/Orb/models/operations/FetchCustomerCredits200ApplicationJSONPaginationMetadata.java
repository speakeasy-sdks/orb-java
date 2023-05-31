/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FetchCustomerCredits200ApplicationJSONPaginationMetadata {
    @JsonProperty("has_more")
    public Boolean hasMore;

    public FetchCustomerCredits200ApplicationJSONPaginationMetadata withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_cursor")
    public String nextCursor;

    public FetchCustomerCredits200ApplicationJSONPaginationMetadata withNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    
    public FetchCustomerCredits200ApplicationJSONPaginationMetadata(@JsonProperty("has_more") Boolean hasMore) {
        this.hasMore = hasMore;
  }
}
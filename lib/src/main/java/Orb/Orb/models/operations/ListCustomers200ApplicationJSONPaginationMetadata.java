/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListCustomers200ApplicationJSONPaginationMetadata {
    @JsonProperty("has_more")
    public Boolean hasMore;
    public ListCustomers200ApplicationJSONPaginationMetadata withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    
    @JsonProperty("next_cursor")
    public String nextCursor;
    public ListCustomers200ApplicationJSONPaginationMetadata withNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
        return this;
    }
    
}

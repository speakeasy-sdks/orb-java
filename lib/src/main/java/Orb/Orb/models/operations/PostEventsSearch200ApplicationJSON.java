/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostEventsSearch200ApplicationJSON - An array of events matching the specified search_criteria. If no events match, this array will be empty.
 */
public class PostEventsSearch200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public Orb.Orb.models.shared.Event[] data;
    public PostEventsSearch200ApplicationJSON withData(Orb.Orb.models.shared.Event[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pagination_metadata")
    public java.util.Map<String, Object> paginationMetadata;
    public PostEventsSearch200ApplicationJSON withPaginationMetadata(java.util.Map<String, Object> paginationMetadata) {
        this.paginationMetadata = paginationMetadata;
        return this;
    }
    

    public PostEventsSearch200ApplicationJSON(){}
}

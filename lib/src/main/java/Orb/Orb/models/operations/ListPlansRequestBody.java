/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPlansRequestBody {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public Orb.Orb.models.shared.Plan[] data;

    public ListPlansRequestBody withData(Orb.Orb.models.shared.Plan[] data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pagination_metadata")
    public java.util.Map<String, Object> paginationMetadata;

    public ListPlansRequestBody withPaginationMetadata(java.util.Map<String, Object> paginationMetadata) {
        this.paginationMetadata = paginationMetadata;
        return this;
    }
    
    public ListPlansRequestBody(){}
}

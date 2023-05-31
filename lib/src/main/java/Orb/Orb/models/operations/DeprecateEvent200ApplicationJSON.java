/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeprecateEvent200ApplicationJSON - OK
 */
public class DeprecateEvent200ApplicationJSON {
    /**
     * event_id of the deprecated event, if successfully updated
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deprecated")
    public String deprecated;

    public DeprecateEvent200ApplicationJSON withDeprecated(String deprecated) {
        this.deprecated = deprecated;
        return this;
    }
    
    public DeprecateEvent200ApplicationJSON(){}
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutEventsEventId200ApplicationJSON - OK
 */
public class PutEventsEventId200ApplicationJSON {
    /**
     * event_id of the amended event, if successfully ingested
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amended")
    public String amended;

    public PutEventsEventId200ApplicationJSON withAmended(String amended) {
        this.amended = amended;
        return this;
    }
    
    public PutEventsEventId200ApplicationJSON(){}
}

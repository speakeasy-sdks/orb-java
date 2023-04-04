/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostIngest400ApplicationJSONDebug - Optional debug information (only present when debug=true is passed to the endpoint). Contains ingested and duplicate event idempotency keys.
 */
public class PostIngest400ApplicationJSONDebug {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duplicate")
    public String[] duplicate;
    public PostIngest400ApplicationJSONDebug withDuplicate(String[] duplicate) {
        this.duplicate = duplicate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ingested")
    public String[] ingested;
    public PostIngest400ApplicationJSONDebug withIngested(String[] ingested) {
        this.ingested = ingested;
        return this;
    }
    
}

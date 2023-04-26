/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostIngest200ApplicationJSON - OK
 */
public class PostIngest200ApplicationJSON {
    /**
     * Optional debug information (only present when debug=true is passed to the endpoint). Contains ingested and duplicate event idempotency keys.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("debug")
    public PostIngest200ApplicationJSONDebug debug;
    public PostIngest200ApplicationJSON withDebug(PostIngest200ApplicationJSONDebug debug) {
        this.debug = debug;
        return this;
    }
    
    /**
     * Contains all failing validation events. In the case of a 200, this array will always be empty. This field will always be present.
     */
    @JsonProperty("validation_failed")
    public PostIngest200ApplicationJSONValidationFailed[] validationFailed;
    public PostIngest200ApplicationJSON withValidationFailed(PostIngest200ApplicationJSONValidationFailed[] validationFailed) {
        this.validationFailed = validationFailed;
        return this;
    }
    
    public PostIngest200ApplicationJSON(@JsonProperty("validation_failed") PostIngest200ApplicationJSONValidationFailed[] validationFailed) {
        this.validationFailed = validationFailed;
  }
}

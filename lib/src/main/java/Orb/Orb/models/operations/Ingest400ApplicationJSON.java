/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ingest400ApplicationJSON - Bad Request
 */
public class Ingest400ApplicationJSON {
    /**
     * Optional debug information (only present when debug=true is passed to the endpoint). Contains ingested and duplicate event idempotency keys.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("debug")
    public Ingest400ApplicationJSONDebug debug;

    public Ingest400ApplicationJSON withDebug(Ingest400ApplicationJSONDebug debug) {
        this.debug = debug;
        return this;
    }
    
    /**
     * Contains all failing validation events. In the case of a 400, there will be at least one entry in this array.
     */
    @JsonProperty("validation_failed")
    public Ingest400ApplicationJSONValidationFailed[] validationFailed;

    public Ingest400ApplicationJSON withValidationFailed(Ingest400ApplicationJSONValidationFailed[] validationFailed) {
        this.validationFailed = validationFailed;
        return this;
    }
    
    public Ingest400ApplicationJSON(@JsonProperty("validation_failed") Ingest400ApplicationJSONValidationFailed[] validationFailed) {
        this.validationFailed = validationFailed;
  }
}
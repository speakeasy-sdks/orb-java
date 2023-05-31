/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AmendUsage400ApplicationJSON - Bad Request
 */
public class AmendUsage400ApplicationJSON {
    /**
     * HTTP Code
     */
    @JsonProperty("status")
    public Long status;

    public AmendUsage400ApplicationJSON withStatus(Long status) {
        this.status = status;
        return this;
    }
    
    /**
     * Error message
     */
    @JsonProperty("title")
    public String title;

    public AmendUsage400ApplicationJSON withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonProperty("type")
    public String type;

    public AmendUsage400ApplicationJSON withType(String type) {
        this.type = type;
        return this;
    }
    
    /**
     * Contains all failing validation events.
     */
    @JsonProperty("validation_errors")
    public AmendUsage400ApplicationJSONValidationErrors[] validationErrors;

    public AmendUsage400ApplicationJSON withValidationErrors(AmendUsage400ApplicationJSONValidationErrors[] validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }
    
    public AmendUsage400ApplicationJSON(@JsonProperty("status") Long status, @JsonProperty("title") String title, @JsonProperty("type") String type, @JsonProperty("validation_errors") AmendUsage400ApplicationJSONValidationErrors[] validationErrors) {
        this.status = status;
        this.title = title;
        this.type = type;
        this.validationErrors = validationErrors;
  }
}

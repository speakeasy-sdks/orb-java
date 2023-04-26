/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchExternalCustomersCustomerIdUsage400ApplicationJSON - Bad Request
 */
public class PatchExternalCustomersCustomerIdUsage400ApplicationJSON {
    /**
     * HTTP Code
     */
    @JsonProperty("status")
    public Long status;
    public PatchExternalCustomersCustomerIdUsage400ApplicationJSON withStatus(Long status) {
        this.status = status;
        return this;
    }
    
    /**
     * Error message
     */
    @JsonProperty("title")
    public String title;
    public PatchExternalCustomersCustomerIdUsage400ApplicationJSON withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonProperty("type")
    public String type;
    public PatchExternalCustomersCustomerIdUsage400ApplicationJSON withType(String type) {
        this.type = type;
        return this;
    }
    
    /**
     * Contains all failing validation events.
     */
    @JsonProperty("validation_errors")
    public PatchExternalCustomersCustomerIdUsage400ApplicationJSONValidationErrors[] validationErrors;
    public PatchExternalCustomersCustomerIdUsage400ApplicationJSON withValidationErrors(PatchExternalCustomersCustomerIdUsage400ApplicationJSONValidationErrors[] validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }
    
    public PatchExternalCustomersCustomerIdUsage400ApplicationJSON(@JsonProperty("status") Long status, @JsonProperty("title") String title, @JsonProperty("type") String type, @JsonProperty("validation_errors") PatchExternalCustomersCustomerIdUsage400ApplicationJSONValidationErrors[] validationErrors) {
        this.status = status;
        this.title = title;
        this.type = type;
        this.validationErrors = validationErrors;
  }
}

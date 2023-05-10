/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatchCustomersCustomerIdUsageRequestBodyEvents {
    /**
     * A name to meaningfully identify the action or event type.
     */
    @JsonProperty("event_name")
    public String eventName;

    public PatchCustomersCustomerIdUsageRequestBodyEvents withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    
    /**
     * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or strings. Nested dictionaries are disallowed.
     */
    @JsonProperty("properties")
    public java.util.Map<String, Object> properties;

    public PatchCustomersCustomerIdUsageRequestBodyEvents withProperties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }
    
    /**
     * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the time that usage was recorded, and is particularly important to attribute usage to a given billing period.
     */
    @JsonProperty("timestamp")
    public String timestamp;

    public PatchCustomersCustomerIdUsageRequestBodyEvents withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    public PatchCustomersCustomerIdUsageRequestBodyEvents(@JsonProperty("event_name") String eventName, @JsonProperty("properties") java.util.Map<String, Object> properties, @JsonProperty("timestamp") String timestamp) {
        this.eventName = eventName;
        this.properties = properties;
        this.timestamp = timestamp;
  }
}

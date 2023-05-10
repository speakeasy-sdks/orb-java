/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
    /**
     * The Orb Customer identifier
     */
    @JsonProperty("customer_id")
    public String customerId;

    public Event withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    /**
     * A name to meaningfully identify the action or event type.
     */
    @JsonProperty("event_name")
    public String eventName;

    public Event withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    
    /**
     * An alias for the Orb customer, whose mapping is specified when creating the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_customer_id")
    public String externalCustomerId;

    public Event withExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    
    /**
     * A unique value, generated by the client, that is used to de-duplicate events. Note that on ingestion, this value is passed in as idempotency_key
     */
    @JsonProperty("id")
    public String id;

    public Event withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or strings. Nested dictionaries are disallowed.
     */
    @JsonProperty("properties")
    public java.util.Map<String, Object> properties;

    public Event withProperties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }
    
    /**
     * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the time that usage was recorded, and is particularly important to attribute usage to a given billing period.
     */
    @JsonProperty("timestamp")
    public String timestamp;

    public Event withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    public Event(@JsonProperty("customer_id") String customerId, @JsonProperty("event_name") String eventName, @JsonProperty("id") String id, @JsonProperty("properties") java.util.Map<String, Object> properties, @JsonProperty("timestamp") String timestamp) {
        this.customerId = customerId;
        this.eventName = eventName;
        this.id = id;
        this.properties = properties;
        this.timestamp = timestamp;
  }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostIngestRequestBodyEvents {
    /**
     * The Orb Customer identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    public String customerId;
    public PostIngestRequestBodyEvents withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    /**
     * A name to meaningfully identify the action or event type.
     */
    @JsonProperty("event_name")
    public String eventName;
    public PostIngestRequestBodyEvents withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    
    /**
     * An alias for the Orb customer, whose mapping is specified when creating the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_customer_id")
    public String externalCustomerId;
    public PostIngestRequestBodyEvents withExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    
    /**
     * A unique value, generated by the client, that is used to de-duplicate events. Exactly one event with a given idempotency key will be ingested, which allows for safe request retries.
     */
    @JsonProperty("idempotency_key")
    public String idempotencyKey;
    public PostIngestRequestBodyEvents withIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    
    /**
     * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or strings. Nested dictionaries are disallowed.
     */
    @JsonProperty("properties")
    public java.util.Map<String, Object> properties;
    public PostIngestRequestBodyEvents withProperties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }
    
    /**
     * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the time that usage was recorded, and is particularly important to attribute usage to a given billing period.
     */
    @JsonProperty("timestamp")
    public String timestamp;
    public PostIngestRequestBodyEvents withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
}
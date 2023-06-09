/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.DateTimeDeserializer;
import Orb.Orb.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class PutEventsEventIdRequestBody {
    /**
     * The Orb Customer identifier
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_id")
    public String customerId;
    public PutEventsEventIdRequestBody withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    /**
     * A name to meaningfully identify the action or event type.
     */
    @JsonProperty("event_name")
    public String eventName;
    public PutEventsEventIdRequestBody withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    
    /**
     * An alias for the Orb customer, whose mapping is specified when creating the customer
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_customer_id")
    public String externalCustomerId;
    public PutEventsEventIdRequestBody withExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    
    /**
     * A dictionary of custom properties. Values in this dictionary must be numeric, boolean, or strings. Nested dictionaries are disallowed.
     */
    @JsonProperty("properties")
    public java.util.Map<String, Object> properties;
    public PutEventsEventIdRequestBody withProperties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
    }
    
    /**
     * An ISO 8601 format date with no timezone offset (i.e. UTC). This should represent the time that usage was recorded, and is particularly important to attribute usage to a given billing period.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timestamp")
    public OffsetDateTime timestamp;
    public PutEventsEventIdRequestBody withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
}

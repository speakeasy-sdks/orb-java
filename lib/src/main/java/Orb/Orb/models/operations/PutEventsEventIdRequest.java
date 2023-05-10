/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PutEventsEventIdRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PutEventsEventIdRequestBody requestBody;

    public PutEventsEventIdRequest withRequestBody(PutEventsEventIdRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Identical to the `idempotency_key` provided on event ingestion. Uniquely identifies an event in the system.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=event_id")
    public String eventId;

    public PutEventsEventIdRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    
    public PutEventsEventIdRequest(@JsonProperty("event_id") String eventId) {
        this.eventId = eventId;
  }
}

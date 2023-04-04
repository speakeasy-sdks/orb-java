/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;

public class PutDeprecateEventsEventIdRequest {
    /**
     * Identical to the `idempotency_key` provided on event ingestion. Uniquely identifies an event in the system.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=event_id")
    public String eventId;
    public PutDeprecateEventsEventIdRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    
}

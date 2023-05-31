/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.DateTimeDeserializer;
import Orb.Orb.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class FetchSubscriptionUsage200ApplicationJSONDataUsage {
    @JsonProperty("quantity")
    public String quantity;

    public FetchSubscriptionUsage200ApplicationJSONDataUsage withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timeframe_end")
    public OffsetDateTime timeframeEnd;

    public FetchSubscriptionUsage200ApplicationJSONDataUsage withTimeframeEnd(OffsetDateTime timeframeEnd) {
        this.timeframeEnd = timeframeEnd;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timeframe_start")
    public OffsetDateTime timeframeStart;

    public FetchSubscriptionUsage200ApplicationJSONDataUsage withTimeframeStart(OffsetDateTime timeframeStart) {
        this.timeframeStart = timeframeStart;
        return this;
    }
    
    public FetchSubscriptionUsage200ApplicationJSONDataUsage(@JsonProperty("quantity") String quantity, @JsonProperty("timeframe_end") OffsetDateTime timeframeEnd, @JsonProperty("timeframe_start") OffsetDateTime timeframeStart) {
        this.quantity = quantity;
        this.timeframeEnd = timeframeEnd;
        this.timeframeStart = timeframeStart;
  }
}

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

public class GetSubscriptionsSubscriptionIdCost200ApplicationJSONData {
    @JsonProperty("per_price_costs")
    public GetSubscriptionsSubscriptionIdCost200ApplicationJSONDataPerPriceCosts[] perPriceCosts;
    public GetSubscriptionsSubscriptionIdCost200ApplicationJSONData withPerPriceCosts(GetSubscriptionsSubscriptionIdCost200ApplicationJSONDataPerPriceCosts[] perPriceCosts) {
        this.perPriceCosts = perPriceCosts;
        return this;
    }
    
    /**
     * Total costs for the timeframe, excluding any minimums and discounts.
     */
    @JsonProperty("subtotal")
    public String subtotal;
    public GetSubscriptionsSubscriptionIdCost200ApplicationJSONData withSubtotal(String subtotal) {
        this.subtotal = subtotal;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timeframe_end")
    public OffsetDateTime timeframeEnd;
    public GetSubscriptionsSubscriptionIdCost200ApplicationJSONData withTimeframeEnd(OffsetDateTime timeframeEnd) {
        this.timeframeEnd = timeframeEnd;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timeframe_start")
    public OffsetDateTime timeframeStart;
    public GetSubscriptionsSubscriptionIdCost200ApplicationJSONData withTimeframeStart(OffsetDateTime timeframeStart) {
        this.timeframeStart = timeframeStart;
        return this;
    }
    
    /**
     * Total costs for the timeframe, including any minimums and discounts.
     */
    @JsonProperty("total")
    public String total;
    public GetSubscriptionsSubscriptionIdCost200ApplicationJSONData withTotal(String total) {
        this.total = total;
        return this;
    }
    
}

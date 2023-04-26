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

public class GetExternalCustomerCosts200ApplicationJSONData {
    @JsonProperty("per_price_costs")
    public GetExternalCustomerCosts200ApplicationJSONDataPerPriceCosts[] perPriceCosts;
    public GetExternalCustomerCosts200ApplicationJSONData withPerPriceCosts(GetExternalCustomerCosts200ApplicationJSONDataPerPriceCosts[] perPriceCosts) {
        this.perPriceCosts = perPriceCosts;
        return this;
    }
    
    /**
     * Total costs for the timeframe, excluding minimums and discounts.
     */
    @JsonProperty("subtotal")
    public String subtotal;
    public GetExternalCustomerCosts200ApplicationJSONData withSubtotal(String subtotal) {
        this.subtotal = subtotal;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timeframe_end")
    public OffsetDateTime timeframeEnd;
    public GetExternalCustomerCosts200ApplicationJSONData withTimeframeEnd(OffsetDateTime timeframeEnd) {
        this.timeframeEnd = timeframeEnd;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timeframe_start")
    public OffsetDateTime timeframeStart;
    public GetExternalCustomerCosts200ApplicationJSONData withTimeframeStart(OffsetDateTime timeframeStart) {
        this.timeframeStart = timeframeStart;
        return this;
    }
    
    /**
     * Total costs for the timeframe, including minimums and discounts.
     */
    @JsonProperty("total")
    public String total;
    public GetExternalCustomerCosts200ApplicationJSONData withTotal(String total) {
        this.total = total;
        return this;
    }
    
    public GetExternalCustomerCosts200ApplicationJSONData(@JsonProperty("per_price_costs") GetExternalCustomerCosts200ApplicationJSONDataPerPriceCosts[] perPriceCosts, @JsonProperty("subtotal") String subtotal, @JsonProperty("timeframe_end") OffsetDateTime timeframeEnd, @JsonProperty("timeframe_start") OffsetDateTime timeframeStart, @JsonProperty("total") String total) {
        this.perPriceCosts = perPriceCosts;
        this.subtotal = subtotal;
        this.timeframeEnd = timeframeEnd;
        this.timeframeStart = timeframeStart;
        this.total = total;
  }
}

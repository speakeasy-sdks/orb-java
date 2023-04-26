/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

public class GetCustomerCostsRequest {
    /**
     * The Orb Customer ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customer_id")
    public String customerId;
    public GetCustomerCostsRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    /**
     * Groups per-price costs by the key provided.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=group_by")
    public String groupBy;
    public GetCustomerCostsRequest withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    
    /**
     * Costs returned are exclusive of `timeframe_end`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeframe_end")
    public String timeframeEnd;
    public GetCustomerCostsRequest withTimeframeEnd(String timeframeEnd) {
        this.timeframeEnd = timeframeEnd;
        return this;
    }
    
    /**
     * Costs returned are inclusive of `timeframe_start`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeframe_start")
    public OffsetDateTime timeframeStart;
    public GetCustomerCostsRequest withTimeframeStart(OffsetDateTime timeframeStart) {
        this.timeframeStart = timeframeStart;
        return this;
    }
    
    /**
     * Controls whether Orb returns cumulative costs since the start of the billing period, or incremental day-by-day costs. If your customer has minimums or discounts, it's strongly recommended that you use the default cumulative behavior.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=view_mode")
    public GetCustomerCostsViewModeEnum viewMode;
    public GetCustomerCostsRequest withViewMode(GetCustomerCostsViewModeEnum viewMode) {
        this.viewMode = viewMode;
        return this;
    }
    
    public GetCustomerCostsRequest(@JsonProperty("customer_id") String customerId) {
        this.customerId = customerId;
  }
}

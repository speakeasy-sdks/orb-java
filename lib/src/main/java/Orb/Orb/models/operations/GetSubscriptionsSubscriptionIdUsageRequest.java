/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;

public class GetSubscriptionsSubscriptionIdUsageRequest {
    /**
     * When specified in conjunction with `group_by`, this parameter filters usage to a single billable metric. Note that both `group_by` and `billable_metric_id` must be specific together.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=billable_metric_id")
    public String billableMetricId;
    public GetSubscriptionsSubscriptionIdUsageRequest withBillableMetricId(String billableMetricId) {
        this.billableMetricId = billableMetricId;
        return this;
    }
    
    /**
     * This determines the windowing of usage reporting.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=granularity")
    public GetSubscriptionsSubscriptionIdUsageGranularityEnum granularity;
    public GetSubscriptionsSubscriptionIdUsageRequest withGranularity(GetSubscriptionsSubscriptionIdUsageGranularityEnum granularity) {
        this.granularity = granularity;
        return this;
    }
    
    /**
     * When specified in conjunction with `billable_metric_id`, this parameter groups by the key provided. Note that both `group_by` and `billable_metric_id` must be specific together.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=group_by")
    public String groupBy;
    public GetSubscriptionsSubscriptionIdUsageRequest withGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=subscription_id")
    public String subscriptionId;
    public GetSubscriptionsSubscriptionIdUsageRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    
    /**
     * Usage returned is _exclusive_ of `timeframe_end`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeframe_end")
    public OffsetDateTime timeframeEnd;
    public GetSubscriptionsSubscriptionIdUsageRequest withTimeframeEnd(OffsetDateTime timeframeEnd) {
        this.timeframeEnd = timeframeEnd;
        return this;
    }
    
    /**
     * Usage returned is _inclusive_ of `timeframe_start`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeframe_start")
    public OffsetDateTime timeframeStart;
    public GetSubscriptionsSubscriptionIdUsageRequest withTimeframeStart(OffsetDateTime timeframeStart) {
        this.timeframeStart = timeframeStart;
        return this;
    }
    
}
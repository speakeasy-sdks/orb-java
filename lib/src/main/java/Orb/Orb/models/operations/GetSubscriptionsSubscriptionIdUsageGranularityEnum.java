/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetSubscriptionsSubscriptionIdUsageGranularityEnum - This determines the windowing of usage reporting.
 */
public enum GetSubscriptionsSubscriptionIdUsageGranularityEnum {
    DAY("day");

    @JsonValue
    public final String value;

    private GetSubscriptionsSubscriptionIdUsageGranularityEnum(String value) {
        this.value = value;
    }
}
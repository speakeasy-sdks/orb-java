/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PostSubscriptionsSubscriptionIdCancelCancelOptionEnum - Determines the timing of subscription cancellation
 */
public enum PostSubscriptionsSubscriptionIdCancelCancelOptionEnum {
    END_OF_SUBSCRIPTION_TERM("end_of_subscription_term"),
    IMMEDIATE("immediate");

    @JsonValue
    public final String value;

    private PostSubscriptionsSubscriptionIdCancelCancelOptionEnum(String value) {
        this.value = value;
    }
}

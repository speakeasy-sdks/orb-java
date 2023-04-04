/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBody {
    /**
     * Reset billing periods to be aligned with the plan change\u2019s effective date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("align_billing_with_plan_change_date")
    public Boolean alignBillingWithPlanChangeDate;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBody withAlignBillingWithPlanChangeDate(Boolean alignBillingWithPlanChangeDate) {
        this.alignBillingWithPlanChangeDate = alignBillingWithPlanChangeDate;
        return this;
    }
    
    /**
     * The date that the plan change should take effect, localized to the customer's timezone. This parameter can only be passed if the `change_option` is `requested_date`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("change_date")
    public LocalDate changeDate;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBody withChangeDate(LocalDate changeDate) {
        this.changeDate = changeDate;
        return this;
    }
    
    /**
     * Determines the timing of the plan change
     */
    @JsonProperty("change_option")
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyChangeOptionEnum changeOption;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBody withChangeOption(PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBodyChangeOptionEnum changeOption) {
        this.changeOption = changeOption;
        return this;
    }
    
    /**
     * The external_plan_id of the plan that the given subscription should be switched to. Note that either this property or `plan_id` must be specified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_plan_id")
    public String externalPlanId;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBody withExternalPlanId(String externalPlanId) {
        this.externalPlanId = externalPlanId;
        return this;
    }
    
    /**
     * The subscription's override minimum amount for the plan.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_amount")
    public String minimumAmount;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBody withMinimumAmount(String minimumAmount) {
        this.minimumAmount = minimumAmount;
        return this;
    }
    
    /**
     * The plan that the given subscription should be switched to. Note that either this property or `external_plan_id` must be specified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("plan_id")
    public String planId;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBody withPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    
    /**
     * Optionally provide a list of overrides for prices on the plan
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("price_overrides")
    public Object[] priceOverrides;
    public PostSubscriptionsSubscriptionIdSchedulePlanChangeRequestBody withPriceOverrides(Object[] priceOverrides) {
        this.priceOverrides = priceOverrides;
        return this;
    }
    
}

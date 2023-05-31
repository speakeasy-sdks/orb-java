/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CouponInput - A coupon represents a reusable discount configuration, and have an attached redemption code that can be issued to your end users. Coupons are most often used in self-serve signup or upgrade flows in your checkout experience or billing portal.
 * 
 * To redeem a coupon, pass the `redemption_code` property in the [create subscription](https://docs.withorb.com/docs/orb-docs/api-reference/operations/create-a-subscription) or [schedule plan change](https://docs.withorb.com/docs/orb-docs/api-reference/operations/create-a-subscription-schedule-plan-change) request. 
 * 
 */
public class CouponInput {
    @JsonProperty("discount")
    public Discount discount;

    public CouponInput withDiscount(Discount discount) {
        this.discount = discount;
        return this;
    }
    
    /**
     * This allows for a coupon's discount to apply for a limited time (determined in months); a `null` value here means "unlimited time".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration_in_months")
    public Long durationInMonths;

    public CouponInput withDurationInMonths(Long durationInMonths) {
        this.durationInMonths = durationInMonths;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CouponInput withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The maximum number of redemptions allowed for this coupon before it is exhausted; `null` here means "unlimited".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_redemptions")
    public Long maxRedemptions;

    public CouponInput withMaxRedemptions(Long maxRedemptions) {
        this.maxRedemptions = maxRedemptions;
        return this;
    }
    
    /**
     * This string can be used to redeem this coupon for a given subscription.
     */
    @JsonProperty("redemption_code")
    public String redemptionCode;

    public CouponInput withRedemptionCode(String redemptionCode) {
        this.redemptionCode = redemptionCode;
        return this;
    }
    
    /**
     * The number of times this coupon has been redeemed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("times_redeemed")
    public Long timesRedeemed;

    public CouponInput withTimesRedeemed(Long timesRedeemed) {
        this.timesRedeemed = timesRedeemed;
        return this;
    }
    
    public CouponInput(@JsonProperty("discount") Discount discount, @JsonProperty("redemption_code") String redemptionCode) {
        this.discount = discount;
        this.redemptionCode = redemptionCode;
  }
}
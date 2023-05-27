/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PlanPhaseDurationUnit - Term for this plan, which is the maximum cadence among all component prices
 */
public enum PlanPhaseDurationUnit {
    MONTHLY("monthly"),
    QUARTERLY("quarterly"),
    ANNUAL("annual");

    @JsonValue
    public final String value;

    private PlanPhaseDurationUnit(String value) {
        this.value = value;
    }
}
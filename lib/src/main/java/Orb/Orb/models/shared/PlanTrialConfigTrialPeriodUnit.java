/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PlanTrialConfigTrialPeriodUnit {
    DAYS("days");

    @JsonValue
    public final String value;

    private PlanTrialConfigTrialPeriodUnit(String value) {
        this.value = value;
    }
}
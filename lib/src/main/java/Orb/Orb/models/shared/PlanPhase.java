/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PlanPhase - A plan can optionally consist of plan phases, which represents a pricing configuration that's only active for the length of time specified by `duration` and `duration_unit`. All plans must have an evergreen phase, which is the last phase and active indefinitely.
 */
public class PlanPhase {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public PlanPhase withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("discount")
    public java.util.Map<String, Object> discount;

    public PlanPhase withDiscount(java.util.Map<String, Object> discount) {
        this.discount = discount;
        return this;
    }
    
    /**
     * How many terms of length `duration_unit` this phase is active for. If null, this phase is evergreen and active indefinitely
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Long duration;

    public PlanPhase withDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    
    /**
     * Term for this plan, which is the maximum cadence among all component prices
     */
    @JsonProperty("duration_unit")
    public PlanPhaseDurationUnitEnum durationUnit;

    public PlanPhase withDurationUnit(PlanPhaseDurationUnitEnum durationUnit) {
        this.durationUnit = durationUnit;
        return this;
    }
    
    @JsonProperty("minimum")
    public java.util.Map<String, Object> minimum;

    public PlanPhase withMinimum(java.util.Map<String, Object> minimum) {
        this.minimum = minimum;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public PlanPhase withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Determines the ordering of the phase in a plan's lifecycle. 1 = first phase.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order")
    public Long order;

    public PlanPhase withOrder(Long order) {
        this.order = order;
        return this;
    }
    
    public PlanPhase(@JsonProperty("discount") java.util.Map<String, Object> discount, @JsonProperty("duration_unit") PlanPhaseDurationUnitEnum durationUnit, @JsonProperty("minimum") java.util.Map<String, Object> minimum) {
        this.discount = discount;
        this.durationUnit = durationUnit;
        this.minimum = minimum;
  }
}

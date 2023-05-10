/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PriceBpsConfig - Provided when model_type is `bps`
 */
public class PriceBpsConfig {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bps")
    public Double bps;

    public PriceBpsConfig withBps(Double bps) {
        this.bps = bps;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("per_unit_maximum")
    public String perUnitMaximum;

    public PriceBpsConfig withPerUnitMaximum(String perUnitMaximum) {
        this.perUnitMaximum = perUnitMaximum;
        return this;
    }
    
    public PriceBpsConfig(){}
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetCustomerCostsViewModeEnum - Controls whether Orb returns cumulative costs since the start of the billing period, or incremental day-by-day costs. If your customer has minimums or discounts, it's strongly recommended that you use the default cumulative behavior.
 */
public enum GetCustomerCostsViewModeEnum {
    PERIODIC("periodic"),
    CUMULATIVE("cumulative");

    @JsonValue
    public final String value;

    private GetCustomerCostsViewModeEnum(String value) {
        this.value = value;
    }
}

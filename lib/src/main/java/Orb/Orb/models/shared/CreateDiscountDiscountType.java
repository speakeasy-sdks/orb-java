/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CreateDiscountDiscountType {
    PERCENTAGE("percentage"),
    USAGE("usage"),
    AMOUNT("amount");

    @JsonValue
    public final String value;

    private CreateDiscountDiscountType(String value) {
        this.value = value;
    }
}

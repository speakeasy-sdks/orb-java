/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PostCustomersCustomerIdCreditsLedgerEntryRequestBodyEntryTypeEnum {
    INCREMENT("increment"),
    DECREMENT("decrement"),
    EXPIRATION_CHANGE("expiration_change");

    @JsonValue
    public final String value;

    private PostCustomersCustomerIdCreditsLedgerEntryRequestBodyEntryTypeEnum(String value) {
        this.value = value;
    }
}

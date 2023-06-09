/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * GetCustomersCustomerIdCreditsLedgerEntryTypeEnum - Filter to a single type of ledger entry
 */
public enum GetCustomersCustomerIdCreditsLedgerEntryTypeEnum {
    INCREMENT("increment"),
    DECREMENT("decrement"),
    EXPIRATION_CHANGE("expiration_change"),
    CREDIT_BLOCK_EXPIRY("credit_block_expiry");

    @JsonValue
    public final String value;

    private GetCustomersCustomerIdCreditsLedgerEntryTypeEnum(String value) {
        this.value = value;
    }
}

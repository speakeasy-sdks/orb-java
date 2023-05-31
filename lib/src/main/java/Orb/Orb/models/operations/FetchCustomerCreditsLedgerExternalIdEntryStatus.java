/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * FetchCustomerCreditsLedgerExternalIdEntryStatus - Filters to a single status of ledger entry
 */
public enum FetchCustomerCreditsLedgerExternalIdEntryStatus {
    COMMITTED("committed"),
    PENDING("pending");

    @JsonValue
    public final String value;

    private FetchCustomerCreditsLedgerExternalIdEntryStatus(String value) {
        this.value = value;
    }
}
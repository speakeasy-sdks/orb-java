/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CustomerBalanceTransactionActionEnum - Describes the reason that this transaction took place.
 */
public enum CustomerBalanceTransactionActionEnum {
    APPLIED_TO_INVOICE("applied_to_invoice"),
    PRORATED_REFUND("prorated_refund"),
    MANUAL_ADJUSTMENT("manual_adjustment");

    @JsonValue
    public final String value;

    private CustomerBalanceTransactionActionEnum(String value) {
        this.value = value;
    }
}

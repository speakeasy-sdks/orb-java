/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PostCustomersRequestBodyPaymentProviderEnum - This is used for creating charges or invoices in an external system via Orb. When not in test mode:
 * - the connection must first be configured in the Orb webapp. 
 * - if the provider is an invoicing provider (`stripe_invoice`, `quickbooks`, `bill.com`), any product mappings must first be configured with the Orb team.
 */
public enum PostCustomersRequestBodyPaymentProviderEnum {
    QUICKBOOKS("quickbooks"),
    BILL_COM("bill.com"),
    STRIPE_CHARGE("stripe_charge"),
    STRIPE_INVOICE("stripe_invoice"),
    LESS_THAN_NIL_GREATER_THAN("<nil>");

    @JsonValue
    public final String value;

    private PostCustomersRequestBodyPaymentProviderEnum(String value) {
        this.value = value;
    }
}

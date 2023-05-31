/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * InvoiceLineItemSubLineItemsType - An identifier for a sub line item that is specific to a pricing model.
 */
public enum InvoiceLineItemSubLineItemsType {
    MATRIX("matrix"),
    TIER("tier");

    @JsonValue
    public final String value;

    private InvoiceLineItemSubLineItemsType(String value) {
        this.value = value;
    }
}
/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PostCustomersCustomerIdBalanceTransactionsRequestBodyType {
    INCREMENT("increment"),
    DECREMENT("decrement");

    @JsonValue
    public final String value;

    private PostCustomersCustomerIdBalanceTransactionsRequestBodyType(String value) {
        this.value = value;
    }
}
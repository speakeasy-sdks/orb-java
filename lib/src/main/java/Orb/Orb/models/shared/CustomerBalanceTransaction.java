/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import Orb.Orb.utils.DateTimeDeserializer;
import Orb.Orb.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * CustomerBalanceTransaction - A single change to the customer balance. All amounts are in the customer's currency.
 */
public class CustomerBalanceTransaction {
    /**
     * Describes the reason that this transaction took place.
     */
    @JsonProperty("action")
    public CustomerBalanceTransactionActionEnum action;
    public CustomerBalanceTransaction withAction(CustomerBalanceTransactionActionEnum action) {
        this.action = action;
        return this;
    }
    
    /**
     * The value of the amount changed in the transaction.
     */
    @JsonProperty("amount")
    public String amount;
    public CustomerBalanceTransaction withAmount(String amount) {
        this.amount = amount;
        return this;
    }
    
    /**
     * The creation time of this transaction.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public CustomerBalanceTransaction withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * An optional description provided for manual customer balance adjustments.
     */
    @JsonProperty("description")
    public String description;
    public CustomerBalanceTransaction withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * The new value of the customer's balance prior to the transaction, in the customer's currency.
     */
    @JsonProperty("ending_balance")
    public String endingBalance;
    public CustomerBalanceTransaction withEndingBalance(String endingBalance) {
        this.endingBalance = endingBalance;
        return this;
    }
    
    /**
     * A unique id for this transaction.
     */
    @JsonProperty("id")
    public String id;
    public CustomerBalanceTransaction withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The Invoice associated with this transaction
     */
    @JsonProperty("invoice")
    public CustomerBalanceTransactionInvoice invoice;
    public CustomerBalanceTransaction withInvoice(CustomerBalanceTransactionInvoice invoice) {
        this.invoice = invoice;
        return this;
    }
    
    /**
     * The original value of the customer's balance prior to the transaction, in the customer's currency.
     */
    @JsonProperty("starting_balance")
    public String startingBalance;
    public CustomerBalanceTransaction withStartingBalance(String startingBalance) {
        this.startingBalance = startingBalance;
        return this;
    }
    
}
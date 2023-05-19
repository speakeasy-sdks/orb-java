/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import Orb.Orb.utils.DateTimeDeserializer;
import Orb.Orb.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * CreditLedgerEntry - A credit ledger entry is a single entry in the customer balance ledger. More details about working with real-time balances are [here](../docs/Credits.md).
 * 
 * To support late and out-of-order event reporting, ledger entries are marked as either __committed_ or _pending_. Committed entries are finalized and will not change. Pending entries can be updated up until the event reporting grace period. 
 */
public class CreditLedgerEntry {
    /**
     * Number of credits that were impacted
     */
    @JsonProperty("amount")
    public Double amount;

    public CreditLedgerEntry withAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;

    public CreditLedgerEntry withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * Credit block that the entry affected
     */
    @JsonProperty("credit_block")
    public CreditLedgerEntryCreditBlock creditBlock;

    public CreditLedgerEntry withCreditBlock(CreditLedgerEntryCreditBlock creditBlock) {
        this.creditBlock = creditBlock;
        return this;
    }
    
    @JsonProperty("customer")
    public CreditLedgerEntryCustomer customer;

    public CreditLedgerEntry withCustomer(CreditLedgerEntryCustomer customer) {
        this.customer = customer;
        return this;
    }
    
    /**
     * Optional metadata that can be specified when adding ledger results via the API
     */
    @JsonProperty("description")
    public String description;

    public CreditLedgerEntry withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("ending_balance")
    public Double endingBalance;

    public CreditLedgerEntry withEndingBalance(Double endingBalance) {
        this.endingBalance = endingBalance;
        return this;
    }
    
    /**
     * Committed entries are older than the ingestion grace period, and cannot change. Pending entries are newer than the grace period and are subject to updates
     */
    @JsonProperty("entry_status")
    public CreditLedgerEntryEntryStatus entryStatus;

    public CreditLedgerEntry withEntryStatus(CreditLedgerEntryEntryStatus entryStatus) {
        this.entryStatus = entryStatus;
        return this;
    }
    
    @JsonProperty("entry_type")
    public CreditLedgerEntryEntryType entryType;

    public CreditLedgerEntry withEntryType(CreditLedgerEntryEntryType entryType) {
        this.entryType = entryType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("event_id")
    public String eventId;

    public CreditLedgerEntry withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    
    @JsonProperty("id")
    public String id;

    public CreditLedgerEntry withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The position in which this entry appears in the ledger, starting at 0
     */
    @JsonProperty("ledger_sequence_number")
    public Double ledgerSequenceNumber;

    public CreditLedgerEntry withLedgerSequenceNumber(Double ledgerSequenceNumber) {
        this.ledgerSequenceNumber = ledgerSequenceNumber;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("price_id")
    public String priceId;

    public CreditLedgerEntry withPriceId(String priceId) {
        this.priceId = priceId;
        return this;
    }
    
    @JsonProperty("starting_balance")
    public Double startingBalance;

    public CreditLedgerEntry withStartingBalance(Double startingBalance) {
        this.startingBalance = startingBalance;
        return this;
    }
    
    public CreditLedgerEntry(@JsonProperty("amount") Double amount, @JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("credit_block") CreditLedgerEntryCreditBlock creditBlock, @JsonProperty("customer") CreditLedgerEntryCustomer customer, @JsonProperty("description") String description, @JsonProperty("ending_balance") Double endingBalance, @JsonProperty("entry_status") CreditLedgerEntryEntryStatus entryStatus, @JsonProperty("entry_type") CreditLedgerEntryEntryType entryType, @JsonProperty("id") String id, @JsonProperty("ledger_sequence_number") Double ledgerSequenceNumber, @JsonProperty("starting_balance") Double startingBalance) {
        this.amount = amount;
        this.createdAt = createdAt;
        this.creditBlock = creditBlock;
        this.customer = customer;
        this.description = description;
        this.endingBalance = endingBalance;
        this.entryStatus = entryStatus;
        this.entryType = entryType;
        this.id = id;
        this.ledgerSequenceNumber = ledgerSequenceNumber;
        this.startingBalance = startingBalance;
  }
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class PostCustomersCustomerIdCreditsLedgerEntryRequestBody {
    @JsonProperty("amount")
    public Double amount;
    public PostCustomersCustomerIdCreditsLedgerEntryRequestBody withAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    
    /**
     * The ID of the block affected by an `expiration_change`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("block_id")
    public String blockId;
    public PostCustomersCustomerIdCreditsLedgerEntryRequestBody withBlockId(String blockId) {
        this.blockId = blockId;
        return this;
    }
    
    /**
     * Optional metadata that can be specified when adding ledger results via the API. For example, this can be used to note an increment refers to trial credits, or for noting corrections as a result of an incident, etc.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;
    public PostCustomersCustomerIdCreditsLedgerEntryRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonProperty("entry_type")
    public PostCustomersCustomerIdCreditsLedgerEntryRequestBodyEntryTypeEnum entryType;
    public PostCustomersCustomerIdCreditsLedgerEntryRequestBody withEntryType(PostCustomersCustomerIdCreditsLedgerEntryRequestBodyEntryTypeEnum entryType) {
        this.entryType = entryType;
        return this;
    }
    
    /**
     * A future date (specified in YYYY-MM-DD format) that denotes when this credit balance should expire.
     * 
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("expiry_date")
    public LocalDate expiryDate;
    public PostCustomersCustomerIdCreditsLedgerEntryRequestBody withExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }
    
    /**
     * Can only be specified when `entry_type=increment`. How much, in USD, a customer paid for a single credit in this block
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("per_unit_cost_basis")
    public String perUnitCostBasis;
    public PostCustomersCustomerIdCreditsLedgerEntryRequestBody withPerUnitCostBasis(String perUnitCostBasis) {
        this.perUnitCostBasis = perUnitCostBasis;
        return this;
    }
    
    /**
     * A future date (specified in YYYY-MM-DD) used for `expiration_change`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("target_expiry_date")
    public LocalDate targetExpiryDate;
    public PostCustomersCustomerIdCreditsLedgerEntryRequestBody withTargetExpiryDate(LocalDate targetExpiryDate) {
        this.targetExpiryDate = targetExpiryDate;
        return this;
    }
    
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PatchCustomersCustomerIdUsage200ApplicationJSON - OK
 */
public class PatchCustomersCustomerIdUsage200ApplicationJSON {
    /**
     * An array of strings, corresponding to idempotency_key's marked as duplicates (previously ingested)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duplicate")
    public java.util.Map<String, Object>[] duplicate;
    public PatchCustomersCustomerIdUsage200ApplicationJSON withDuplicate(java.util.Map<String, Object>[] duplicate) {
        this.duplicate = duplicate;
        return this;
    }
    
    /**
     * An array of strings, corresponding to idempotency_key's which were successfully ingested.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ingested")
    public String[] ingested;
    public PatchCustomersCustomerIdUsage200ApplicationJSON withIngested(String[] ingested) {
        this.ingested = ingested;
        return this;
    }
    
    public PatchCustomersCustomerIdUsage200ApplicationJSON(){}
}

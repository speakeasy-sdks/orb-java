/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AmendUsageExternalCustomerId200ApplicationJSON - OK
 */
public class AmendUsageExternalCustomerId200ApplicationJSON {
    /**
     * An array of strings, corresponding to idempotency_key's marked as duplicates (previously ingested)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duplicate")
    public AmendUsageExternalCustomerId200ApplicationJSONDuplicate[] duplicate;

    public AmendUsageExternalCustomerId200ApplicationJSON withDuplicate(AmendUsageExternalCustomerId200ApplicationJSONDuplicate[] duplicate) {
        this.duplicate = duplicate;
        return this;
    }
    
    /**
     * An array of strings, corresponding to idempotency_key's which were successfully ingested.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ingested")
    public String[] ingested;

    public AmendUsageExternalCustomerId200ApplicationJSON withIngested(String[] ingested) {
        this.ingested = ingested;
        return this;
    }
    
    public AmendUsageExternalCustomerId200ApplicationJSON(){}
}

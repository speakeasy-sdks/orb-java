/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatchExternalCustomersCustomerIdUsageRequestBody {
    @JsonProperty("events")
    public PatchExternalCustomersCustomerIdUsageRequestBodyEvents[] events;
    public PatchExternalCustomersCustomerIdUsageRequestBody withEvents(PatchExternalCustomersCustomerIdUsageRequestBodyEvents[] events) {
        this.events = events;
        return this;
    }
    
}

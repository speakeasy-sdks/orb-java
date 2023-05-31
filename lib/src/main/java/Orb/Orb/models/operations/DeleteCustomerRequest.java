/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteCustomerRequest {
    /**
     * Orb customer ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=customer_id")
    public String customerId;

    public DeleteCustomerRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    public DeleteCustomerRequest(@JsonProperty("customer_id") String customerId) {
        this.customerId = customerId;
  }
}
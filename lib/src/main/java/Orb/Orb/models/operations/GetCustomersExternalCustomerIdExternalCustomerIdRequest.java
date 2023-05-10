/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCustomersExternalCustomerIdExternalCustomerIdRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=external_customer_id")
    public String externalCustomerId;

    public GetCustomersExternalCustomerIdExternalCustomerIdRequest withExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    
    public GetCustomersExternalCustomerIdExternalCustomerIdRequest(@JsonProperty("external_customer_id") String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
  }
}

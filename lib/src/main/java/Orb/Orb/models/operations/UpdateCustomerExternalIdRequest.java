/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateCustomerExternalIdRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public UpdateCustomerExternalIdRequestBody requestBody;

    public UpdateCustomerExternalIdRequest withRequestBody(UpdateCustomerExternalIdRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=external_customer_id")
    public String externalCustomerId;

    public UpdateCustomerExternalIdRequest withExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    
    public UpdateCustomerExternalIdRequest(@JsonProperty("external_customer_id") String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
  }
}

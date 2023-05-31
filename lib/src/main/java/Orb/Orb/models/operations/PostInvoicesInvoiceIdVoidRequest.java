/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostInvoicesInvoiceIdVoidRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=invoice_id")
    public String invoiceId;

    public PostInvoicesInvoiceIdVoidRequest withInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    
    public PostInvoicesInvoiceIdVoidRequest(@JsonProperty("invoice_id") String invoiceId) {
        this.invoiceId = invoiceId;
  }
}
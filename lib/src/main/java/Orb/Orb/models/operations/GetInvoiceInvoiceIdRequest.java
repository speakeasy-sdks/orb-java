/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;

public class GetInvoiceInvoiceIdRequest {
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=invoice_id")
    public String invoiceId;
    public GetInvoiceInvoiceIdRequest withInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
        return this;
    }
    
}

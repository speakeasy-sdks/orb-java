/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;

public class ListInvoicesRequest {
    /**
     * Filter by a specific customer (cannot be used with `external_customer_id`)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=customer_id")
    public String customerId;
    public ListInvoicesRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    /**
     * Filter by a specific customer (cannot be used with `customer_id`)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=external_customer_id")
    public String externalCustomerId;
    public ListInvoicesRequest withExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    
    /**
     * Filter by a specific subscription
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=subscription_id")
    public String subscriptionId;
    public ListInvoicesRequest withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }
    
}

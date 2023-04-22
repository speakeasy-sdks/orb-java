/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PutCustomersExternalCustomerIdExternalCustomerIdRequestBody {
    /**
     * The customer's billing address; all fields in the address are optional. This address appears on customer invoices.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("billing_address")
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyBillingAddress billingAddress;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBody withBillingAddress(PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyBillingAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    public String email;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBody withEmail(String email) {
        this.email = email;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBody withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * This is used for creating charges or invoices in an external system via Orb. When not in test mode:
     * - the connection must first be configured in the Orb webapp. 
     * - if the provider is an invoicing provider (`stripe_invoice`, `quickbooks`, `bill.com`), any product mappings must first be configured with the Orb team.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_provider")
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyPaymentProviderEnum paymentProvider;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBody withPaymentProvider(PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyPaymentProviderEnum paymentProvider) {
        this.paymentProvider = paymentProvider;
        return this;
    }
    
    /**
     * The ID of this customer in an external payments solution, such as Stripe. This is used for creating charges or invoices in the external system via Orb.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_provider_id")
    public String paymentProviderId;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBody withPaymentProviderId(String paymentProviderId) {
        this.paymentProviderId = paymentProviderId;
        return this;
    }
    
    /**
     * The customer's shipping address; all fields in the address are optional. Note that downstream tax calculations are based on the shipping address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shipping_address")
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyShippingAddress shippingAddress;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBody withShippingAddress(PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }
    

    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBody(){}
}

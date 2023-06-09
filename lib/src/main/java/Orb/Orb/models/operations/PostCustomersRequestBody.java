/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PostCustomersRequestBody {
    /**
     * The customer's billing address; all fields in the address are optional. This address appears on customer invoices.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("billing_address")
    public PostCustomersRequestBodyBillingAddress billingAddress;
    public PostCustomersRequestBody withBillingAddress(PostCustomersRequestBodyBillingAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }
    
    /**
     * An ISO 4217 currency string used for the customer's invoices and balance. If not set at creation time, will be set at subscription creation time.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    public String currency;
    public PostCustomersRequestBody withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    /**
     * A valid customer email, to be used for invoicing and notifications.
     */
    @JsonProperty("email")
    public String email;
    public PostCustomersRequestBody withEmail(String email) {
        this.email = email;
        return this;
    }
    
    /**
     * An optional user-defined ID for this customer resource, used throughout the system as an alias for this Customer. Use this field to identify a customer by an existing identifier in your system.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("external_customer_id")
    public String externalCustomerId;
    public PostCustomersRequestBody withExternalCustomerId(String externalCustomerId) {
        this.externalCustomerId = externalCustomerId;
        return this;
    }
    
    /**
     * The full name of the customer
     */
    @JsonProperty("name")
    public String name;
    public PostCustomersRequestBody withName(String name) {
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
    public PostCustomersRequestBodyPaymentProviderEnum paymentProvider;
    public PostCustomersRequestBody withPaymentProvider(PostCustomersRequestBodyPaymentProviderEnum paymentProvider) {
        this.paymentProvider = paymentProvider;
        return this;
    }
    
    /**
     * The ID of this customer in an external payments solution, such as Stripe. This is used for creating charges or invoices in the external system via Orb.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_provider_id")
    public String paymentProviderId;
    public PostCustomersRequestBody withPaymentProviderId(String paymentProviderId) {
        this.paymentProviderId = paymentProviderId;
        return this;
    }
    
    /**
     * The customer's shipping address; all fields in the address are optional. Note that downstream tax calculations are based on the shipping address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shipping_address")
    public PostCustomersRequestBodyShippingAddress shippingAddress;
    public PostCustomersRequestBody withShippingAddress(PostCustomersRequestBodyShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }
    
    /**
     * A timezone identifier from the IANA timezone database, such as "America/Los_Angeles". This defaults to your account's timezone if not set. This cannot be changed after customer creation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    public String timezone;
    public PostCustomersRequestBody withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    
}

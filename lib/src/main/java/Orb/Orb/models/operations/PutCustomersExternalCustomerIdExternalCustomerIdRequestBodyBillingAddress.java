/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyBillingAddress - The customer's billing address; all fields in the address are optional. This address appears on customer invoices.
 */
public class PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyBillingAddress {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    public String city;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyBillingAddress withCity(String city) {
        this.city = city;
        return this;
    }
    
    /**
     * Two-letter country code (ISO 3166-1 alpha-2).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    public String country;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyBillingAddress withCountry(String country) {
        this.country = country;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line1")
    public String line1;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyBillingAddress withLine1(String line1) {
        this.line1 = line1;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line2")
    public String line2;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyBillingAddress withLine2(String line2) {
        this.line2 = line2;
        return this;
    }
    
    /**
     * ZIP or postal code
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postal_code")
    public String postalCode;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyBillingAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    public String state;
    public PutCustomersExternalCustomerIdExternalCustomerIdRequestBodyBillingAddress withState(String state) {
        this.state = state;
        return this;
    }
    
}
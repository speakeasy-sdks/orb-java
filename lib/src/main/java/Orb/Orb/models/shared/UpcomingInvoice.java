/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * UpcomingInvoice - Upcoming invoices contain a line-by-line breakdown of an upcoming amount due for a subscription, including incurred usage in the billing period as well as any recurring fees. 
 * 
 * Although each line item will be invoiced on the `target_date`, each invoice line item may have distinct date ranges (e.g. for usage billed in arrears, the range may specify the current month whereas an in-advance recurring fees will be for the following month).
 * 
 * Since an invoice resource has not been created for this upcoming invoice, this endpoint intentionally does not return an `id` field.
 */
public class UpcomingInvoice {
    /**
     * The final amount to be charged to the customer after all minimums and discounts have been applied. Only populated for non-pre-paid plans.
     */
    @JsonProperty("amount_due")
    public String amountDue;
    public UpcomingInvoice withAmountDue(String amountDue) {
        this.amountDue = amountDue;
        return this;
    }
    
    /**
     * An ISO 4217 currency string or `credits`
     */
    @JsonProperty("currency")
    public String currency;
    public UpcomingInvoice withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    /**
     * The customer receiving this invoice.
     */
    @JsonProperty("customer")
    public UpcomingInvoiceCustomer customer;
    public UpcomingInvoice withCustomer(UpcomingInvoiceCustomer customer) {
        this.customer = customer;
        return this;
    }
    
    /**
     * The breakdown of prices in this invoice.
     */
    @JsonProperty("line_items")
    public UpcomingInvoiceLineItems[] lineItems;
    public UpcomingInvoice withLineItems(UpcomingInvoiceLineItems[] lineItems) {
        this.lineItems = lineItems;
        return this;
    }
    
    /**
     * The associated subscription for this invoice.
     */
    @JsonProperty("subscription")
    public UpcomingInvoiceSubscription subscription;
    public UpcomingInvoice withSubscription(UpcomingInvoiceSubscription subscription) {
        this.subscription = subscription;
        return this;
    }
    
    /**
     * The total before any discounts and minimums are applied.
     */
    @JsonProperty("subtotal")
    public String subtotal;
    public UpcomingInvoice withSubtotal(String subtotal) {
        this.subtotal = subtotal;
        return this;
    }
    
    /**
     * The expected issue date of the invoice.
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("target_date")
    public LocalDate targetDate;
    public UpcomingInvoice withTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
        return this;
    }
    
    public UpcomingInvoice(@JsonProperty("amount_due") String amountDue, @JsonProperty("currency") String currency, @JsonProperty("customer") UpcomingInvoiceCustomer customer, @JsonProperty("line_items") UpcomingInvoiceLineItems[] lineItems, @JsonProperty("subscription") UpcomingInvoiceSubscription subscription, @JsonProperty("subtotal") String subtotal, @JsonProperty("target_date") LocalDate targetDate) {
        this.amountDue = amountDue;
        this.currency = currency;
        this.customer = customer;
        this.lineItems = lineItems;
        this.subscription = subscription;
        this.subtotal = subtotal;
        this.targetDate = targetDate;
  }
}

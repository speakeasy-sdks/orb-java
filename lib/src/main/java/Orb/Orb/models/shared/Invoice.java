/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import Orb.Orb.utils.DateTimeDeserializer;
import Orb.Orb.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

/**
 * Invoice - An [`Invoice`](../reference/Orb-API.json/components/schemas/Invoice) is a fundamental billing entity, representing the request for payment for a single subscription. This includes a set of line items, which correspond to prices in the subscription's plan and can represent fixed recurring fees or usage-based fees. They are generated at the end of a billing period, or as the result of an action, such as a cancellation.
 */
public class Invoice {
    /**
     * This is the final amount required to be charged to the customer and reflects the application of the customer balance to the `total` of the invoice.
     */
    @JsonProperty("amount_due")
    public String amountDue;
    public Invoice withAmountDue(String amountDue) {
        this.amountDue = amountDue;
        return this;
    }
    
    /**
     * The creation time of the resource in Orb.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Invoice withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    /**
     * An ISO 4217 currency string or `credits`
     */
    @JsonProperty("currency")
    public String currency;
    public Invoice withCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    
    /**
     * The customer receiving this invoice.
     */
    @JsonProperty("customer")
    public InvoiceCustomer customer;
    public Invoice withCustomer(InvoiceCustomer customer) {
        this.customer = customer;
        return this;
    }
    
    /**
     * A list of Customer balance transactions that may be associated with this invoice.
     */
    @JsonProperty("customer_balance_transactions")
    public CustomerBalanceTransaction[] customerBalanceTransactions;
    public Invoice withCustomerBalanceTransactions(CustomerBalanceTransaction[] customerBalanceTransactions) {
        this.customerBalanceTransactions = customerBalanceTransactions;
        return this;
    }
    
    @JsonProperty("discount")
    public java.util.Map<String, Object> discount;
    public Invoice withDiscount(java.util.Map<String, Object> discount) {
        this.discount = discount;
        return this;
    }
    
    /**
     * When the invoice payment is due.
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("due_date")
    public OffsetDateTime dueDate;
    public Invoice withDueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
        return this;
    }
    
    @JsonProperty("id")
    public String id;
    public Invoice withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Issue date of the invoice
     */
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("invoice_date")
    public OffsetDateTime invoiceDate;
    public Invoice withInvoiceDate(OffsetDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }
    
    /**
     * The link to download the PDF representation of the `Invoice`.
     */
    @JsonProperty("invoice_pdf")
    public String invoicePdf;
    public Invoice withInvoicePdf(String invoicePdf) {
        this.invoicePdf = invoicePdf;
        return this;
    }
    
    /**
     * The breakdown of prices in this invoice.
     */
    @JsonProperty("line_items")
    public InvoiceLineItems[] lineItems;
    public Invoice withLineItems(InvoiceLineItems[] lineItems) {
        this.lineItems = lineItems;
        return this;
    }
    
    @JsonProperty("minimum")
    public java.util.Map<String, Object> minimum;
    public Invoice withMinimum(java.util.Map<String, Object> minimum) {
        this.minimum = minimum;
        return this;
    }
    
    /**
     * The status of this invoice as known to Orb. Invoices that have been issued for past billing periods are marked `"issued"`. Invoices will be marked `"paid"` upon confirmation of successful automatic payment collection by Orb. Invoices synced to an external billing provider (such as Bill.com, QuickBooks, or Stripe Invoicing) will be marked as `"synced"`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public InvoiceStatusEnum status;
    public Invoice withStatus(InvoiceStatusEnum status) {
        this.status = status;
        return this;
    }
    
    /**
     * The associated subscription for this invoice.
     */
    @JsonProperty("subscription")
    public InvoiceSubscription subscription;
    public Invoice withSubscription(InvoiceSubscription subscription) {
        this.subscription = subscription;
        return this;
    }
    
    /**
     * The total before any discounts and minimums are applied.
     */
    @JsonProperty("subtotal")
    public String subtotal;
    public Invoice withSubtotal(String subtotal) {
        this.subtotal = subtotal;
        return this;
    }
    
    /**
     * The total after any minimums, discounts, and taxes have been applied.
     */
    @JsonProperty("total")
    public String total;
    public Invoice withTotal(String total) {
        this.total = total;
        return this;
    }
    
}
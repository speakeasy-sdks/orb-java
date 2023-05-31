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
     * Information about payment auto-collection for this invoice.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auto_collection")
    public InvoiceAutoCollection autoCollection;

    public Invoice withAutoCollection(InvoiceAutoCollection autoCollection) {
        this.autoCollection = autoCollection;
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
     * A list of credit notes associated with the invoice
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("credit_notes")
    public InvoiceCreditNotes[] creditNotes;

    public Invoice withCreditNotes(InvoiceCreditNotes[] creditNotes) {
        this.creditNotes = creditNotes;
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
    
    /**
     * Tax IDs are commonly required to be displayed on customer invoices, which are added to the headers of invoices.
     * 
     * 
     * ### Supported Tax ID Countries and Types
     * 
     * 
     * | Country        | Type         | Description                                 |
     * |----------------|--------------|---------------------------------------------|
     * | Australia      | `au_abn`     | Australian Business Number (AU ABN)	        |
     * | Australia      | `au_arn`     | Australian Taxation Office Reference Number |
     * | Austria        | `eu_vat`     | European VAT number                         |
     * | Belgium        | `eu_vat`     | European VAT number                         |
     * | Brazil         | `br_cnpj`    | Brazilian CNPJ number                       |
     * | Brazil         | `br_cpf`     | Brazilian CPF number	                       |
     * | Bulgaria       | `bg_uic`     | Bulgaria Unified Identification Code        |
     * | Bulgaria       | `eu_vat`     | European VAT number                         |
     * | Canada         | `ca_bn`      | Canadian BN                                 |
     * | Canada         | `ca_gst_hst` | Canadian GST/HST number                     |
     * | Canada         | `ca_pst_bc`  | Canadian PST number (British Columbia)      |
     * | Canada         | `ca_pst_mb`  | Canadian PST number (Manitoba)              |
     * | Canada         | `ca_pst_sk`  | Canadian PST number (Saskatchewan)          |
     * | Canada         | `ca_qst`     | Canadian QST number (Québec)                |
     * | Chile          | `cl_tin`     | Chilean TIN                                 |
     * | Croatia        | `eu_vat`     | European VAT number                         |
     * | Cyprus         | `eu_vat`     | European VAT number                         |
     * | Czech Republic | `eu_vat`     | European VAT number                         |
     * | Denmark        | `eu_vat`     | European VAT number                         |
     * | Egypt          | `eg_tin`     | Egyptian Tax Identification Number	         |
     * | Estonia   | `eu_vat`     | European VAT number   |                                                                             
     * | EU        | `eu_oss_vat` | European One Stop Shop VAT number for non-Union scheme                                                   |
     * | Finland   | `eu_vat`     | European VAT number                                                                                      |
     * | France    | `eu_vat`     | European VAT number                                                                                      |
     * | Georgia   | `ge_vat`     | Georgian VAT                                                                                             |
     * | Germany   | `eu_vat`     | European VAT number                                                                                      |
     * | Greece    | `eu_vat`     | European VAT number                                                                                      |
     * | Hong Kong | `hk_br`      | Hong Kong BR number                                                                                      |
     * | Hungary   | `eu_vat`     | European VAT number                                                                                      |
     * | Hungary   | `hu_tin`     | Hungary tax number (adószám)	                                                                            |
     * | Iceland   | `is_vat`     | Icelandic VAT                                                                                            |
     * | India     | `in_gst`     | Indian GST number                                                                                        |
     * | Indonesia | `id_npwp`    | Indonesian NPWP number                                                                                   |
     * | Ireland   | `eu_vat`     | European VAT number                                                                                      |
     * | Israel    | `il_vat`     | Israel VAT                                                                                               |
     * | Italy     | `eu_vat`     | European VAT number                                                                                      |
     * | Japan     | `jp_cn`      | Japanese Corporate Number (*Hōjin Bangō*)                                                                |
     * | Japan     | `jp_rn`      | Japanese Registered Foreign Businesses' Registration Number (*Tōroku Kokugai Jigyōsha no Tōroku Bangō*)	 |
     * | Japan     | `jp_trn`     | Japanese Tax Registration Number (*Tōroku Bangō*)	                                                       |
     * | Kenya     | `ke_pin`     | Kenya Revenue Authority Personal Identification Number                                                   |
     * | Latvia    | `eu_vat`     | European VAT number                                                                                  |
     * | Liechtenstein | `li_uid`  | Liechtensteinian UID number           |
     * | Lithuania     | `eu_vat`  | European VAT number	                  |
     * | Luxembourg    | `eu_vat`  | European VAT number	                  |
     * | Malaysia      | `my_frp`  | Malaysian FRP number                  |
     * | Malaysia      | `my_itn`  | Malaysian ITN                         |
     * | Malaysia      | `my_sst`  | Malaysian SST number                  |
     * | Malta         | `eu_vat ` | European VAT number                   |
     * | Mexico        | `mx_rfc`  | Mexican RFC number                    |
     * | Netherlands   | `eu_vat`  | European VAT number	                  |
     * | New Zealand   | `nz_gst`  | New Zealand GST number	               |
     * | Norway        | `no_vat`  | Norwegian VAT number                  |
     * | Philippines   | `ph_tin	` | Philippines Tax Identification Number |
     * | Poland        | `eu_vat`  | European VAT number                   |
     * | Portugal      | `eu_vat`  | European VAT number                   |
     * | Romania       | `eu_vat`  | European VAT number                   |
     * | Russia        | `ru_inn`  | Russian INN                           |
     * | Russia        | `ru_kpp`  | Russian KPP                           |
     * | Saudi Arabia  | `sg_gst`  | Singaporean GST                       |
     * | Singapore     | `sg_uen`  | Singaporean UEN	                      |
     * | Slovakia      | `eu_vat`  | European VAT number                   |
     * | Slovenia      | `eu_vat`  | European VAT number                   |
     * | Slovenia             | `si_tin` | Slovenia tax number (davčna številka)	             |
     * | South Africa	        | `za_vat` | South African VAT number                           |
     * | South Korea          | `kr_brn` | Korean BRN                                         |
     * | Spain                | `es_cif` | Spanish NIF number (previously Spanish CIF number) |
     * | Spain                | `eu_vat` | European VAT number	                               |
     * | Sweden               | `eu_vat` | European VAT number                                |
     * | Switzerland          | `ch_vat` | Switzerland VAT number	                            |
     * | Taiwan               | `tw_vat` | Taiwanese VAT	                                     |
     * | Thailand             | `th_vat` | Thai VAT                                           |
     * | Turkey               | `tr_tin` | Turkish Tax Identification Number                  |
     * | Ukraine              | `ua_vat` | Ukrainian VAT                                      |
     * | United Arab Emirates | `ae_trn` | United Arab Emirates TRN	                          |
     * | United Kingdom       | `eu_vat` | Northern Ireland VAT number                        |
     * | United Kingdom       | `gb_vat` | United Kingdom VAT number                          |
     * | United States        | `us_ein` | United States EIN                                  |
     * 
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_tax_id")
    public CustomerTaxId customerTaxId;

    public Invoice withCustomerTaxId(CustomerTaxId customerTaxId) {
        this.customerTaxId = customerTaxId;
        return this;
    }
    
    @JsonProperty("discount")
    public Discount discount;

    public Invoice withDiscount(Discount discount) {
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
    
    /**
     * A URL for the invoice portal.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hosted_invoice_url")
    public String hostedInvoiceUrl;

    public Invoice withHostedInvoiceUrl(String hostedInvoiceUrl) {
        this.hostedInvoiceUrl = hostedInvoiceUrl;
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
     * If the invoice failed to issue, this will be the last time it failed to issue (even if it is now in a different state.)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("issue_failed_at")
    public OffsetDateTime issueFailedAt;

    public Invoice withIssueFailedAt(OffsetDateTime issueFailedAt) {
        this.issueFailedAt = issueFailedAt;
        return this;
    }
    
    /**
     * If the invoice has been issued, this will be the time it transitioned to `issued` (even if it is now in a different state.)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("issued_at")
    public OffsetDateTime issuedAt;

    public Invoice withIssuedAt(OffsetDateTime issuedAt) {
        this.issuedAt = issuedAt;
        return this;
    }
    
    /**
     * The breakdown of prices in this invoice.
     */
    @JsonProperty("line_items")
    public InvoiceLineItem[] lineItems;

    public Invoice withLineItems(InvoiceLineItem[] lineItems) {
        this.lineItems = lineItems;
        return this;
    }
    
    /**
     * Free-form text which is available on the invoice PDF and the Orb invoice portal.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("memo")
    public String memo;

    public Invoice withMemo(String memo) {
        this.memo = memo;
        return this;
    }
    
    @JsonProperty("minimum")
    public MinimumAmount minimum;

    public Invoice withMinimum(MinimumAmount minimum) {
        this.minimum = minimum;
        return this;
    }
    
    /**
     * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("paid_at")
    public OffsetDateTime paidAt;

    public Invoice withPaidAt(OffsetDateTime paidAt) {
        this.paidAt = paidAt;
        return this;
    }
    
    /**
     * If payment was attempted on this invoice but failed, this will be the time of the most recent attempt.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("payment_failed_at")
    public OffsetDateTime paymentFailedAt;

    public Invoice withPaymentFailedAt(OffsetDateTime paymentFailedAt) {
        this.paymentFailedAt = paymentFailedAt;
        return this;
    }
    
    /**
     * If payment was attempted on this invoice, this will be the start time of the most recent attempt. This field is especially useful for delayed-notification payment mechanisms (like bank transfers), where payment can take 3 days or more.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("payment_started_at")
    public OffsetDateTime paymentStartedAt;

    public Invoice withPaymentStartedAt(OffsetDateTime paymentStartedAt) {
        this.paymentStartedAt = paymentStartedAt;
        return this;
    }
    
    /**
     * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to be issued.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("scheduled_issue_at")
    public OffsetDateTime scheduledIssueAt;

    public Invoice withScheduledIssueAt(OffsetDateTime scheduledIssueAt) {
        this.scheduledIssueAt = scheduledIssueAt;
        return this;
    }
    
    /**
     * The status of this invoice as known to Orb. Invoices start in `"draft"` state for a given billing period, and are automatically transitioned to `"issued"` when that billing period ends. Invoices will be marked `"paid"` upon confirmation of successful automatic payment collection by Orb. Invoices may be manually voided; those will be in the terminal `"void"` state. Invoices synced to an external billing provider (such as Bill.com, QuickBooks, or Stripe Invoicing) will be marked as `"synced"`.
     */
    @JsonProperty("status")
    public InvoiceStatus status;

    public Invoice withStatus(InvoiceStatus status) {
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
     * If the invoice failed to sync, this will be the last time an external invoicing provider sync was attempted. This field will always be `null` for invoices using Orb Invoicing.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("sync_failed_at")
    public OffsetDateTime syncFailedAt;

    public Invoice withSyncFailedAt(OffsetDateTime syncFailedAt) {
        this.syncFailedAt = syncFailedAt;
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
    
    /**
     * If the invoice has a status of `void`, this gives a timestamp when the invoice was voided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("voided_at")
    public OffsetDateTime voidedAt;

    public Invoice withVoidedAt(OffsetDateTime voidedAt) {
        this.voidedAt = voidedAt;
        return this;
    }
    
    public Invoice(@JsonProperty("amount_due") String amountDue, @JsonProperty("created_at") OffsetDateTime createdAt, @JsonProperty("currency") String currency, @JsonProperty("customer") InvoiceCustomer customer, @JsonProperty("customer_balance_transactions") CustomerBalanceTransaction[] customerBalanceTransactions, @JsonProperty("discount") Discount discount, @JsonProperty("due_date") OffsetDateTime dueDate, @JsonProperty("id") String id, @JsonProperty("invoice_date") OffsetDateTime invoiceDate, @JsonProperty("invoice_pdf") String invoicePdf, @JsonProperty("line_items") InvoiceLineItem[] lineItems, @JsonProperty("minimum") MinimumAmount minimum, @JsonProperty("status") InvoiceStatus status, @JsonProperty("subscription") InvoiceSubscription subscription, @JsonProperty("subtotal") String subtotal, @JsonProperty("total") String total) {
        this.amountDue = amountDue;
        this.createdAt = createdAt;
        this.currency = currency;
        this.customer = customer;
        this.customerBalanceTransactions = customerBalanceTransactions;
        this.discount = discount;
        this.dueDate = dueDate;
        this.id = id;
        this.invoiceDate = invoiceDate;
        this.invoicePdf = invoicePdf;
        this.lineItems = lineItems;
        this.minimum = minimum;
        this.status = status;
        this.subscription = subscription;
        this.subtotal = subtotal;
        this.total = total;
  }
}

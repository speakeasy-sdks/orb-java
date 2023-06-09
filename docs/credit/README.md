# credit

## Overview

The Credits resource represents a customer's credits. Credits are created when a customer's invoice is paid, and are updated when a customer's transaction is refunded.

### Available Operations

* [addByExternalId](#addbyexternalid) - Add credit ledger entry by external customer ID
* [create](#create) - Add credit ledger entry
* [fetch](#fetch) - Retrieve credit balance
* [fetchByExternalId](#fetchbyexternalid) - Retrieve credit balance by external customer ID
* [fetchLedger](#fetchledger) - View credits ledger
* [fetchLedgerByExternalId](#fetchledgerbyexternalid) - View credits ledger by external customer ID

## addByExternalId

This endpoint's resource and semantics exactly mirror [Add credit ledger entry](create-ledger-entry) but operates on an [external customer ID](../guides/events-and-metrics/customer-aliases) rather than an Orb issued identifier.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.AddLedgerEntryExternalIdRequest;
import Orb.Orb.models.operations.AddLedgerEntryExternalIdRequestBody;
import Orb.Orb.models.operations.AddLedgerEntryExternalIdRequestBodyEntryType;
import Orb.Orb.models.operations.AddLedgerEntryExternalIdRequestBodyInvoiceSettings;
import Orb.Orb.models.operations.AddLedgerEntryExternalIdResponse;
import Orb.Orb.models.shared.Security;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("deleniti") {{
                    apiKeyAuth = "";
                }})
                .build();

            AddLedgerEntryExternalIdRequest req = new AddLedgerEntryExternalIdRequest("hic") {{
                requestBody = new AddLedgerEntryExternalIdRequestBody(AddLedgerEntryExternalIdRequestBodyEntryType.EXPIRATION_CHANGE) {{
                    amount = 5218.48d;
                    blockId = "beatae";
                    description = "commodi";
                    expiryDate = LocalDate.parse("2023-01-01");
                    invoiceSettings = new AddLedgerEntryExternalIdRequestBodyInvoiceSettings(false, 4736d) {{
                        memo = "modi";
                    }};;
                    metadata = new java.util.HashMap<String, Object>() {{
                        put("impedit", "cum");
                    }};
                    perUnitCostBasis = "esse";
                    targetExpiryDate = LocalDate.parse("2023-02-01");
                }};;
            }};            

            AddLedgerEntryExternalIdResponse res = sdk.credit.addByExternalId(req);

            if (res.creditLedgerEntry != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## create

This endpoint allows you to create a new ledger entry for a specified customer's balance. This can be used to increment balance, deduct credits, and change the expiry date of existing credits.

## Effects of adding a ledger entry
1. After calling this endpoint, [Fetch Credit Balance](fetch-customer-credits) will return a credit block that represents the changes (i.e. balance changes or transfers).
2. A ledger entry will be added to the credits ledger for this customer, and therefore returned in the [View Credits Ledger](fetch-customer-credits) response as well as serialized in the response to this request. In the case of deductions without a specified block, multiple ledger entries may be created if the deduction spans credit blocks.
3. If `invoice_settings` is specified, an invoice will be created that reflects the cost of the credits (based on `amount` and `per_unit_cost_basis`).

## Adding credits
Adding credits is done by creating an entry of type `increment`. This requires the caller to specify a number of credits as well as an optional expiry date in `YYYY-MM-DD` format. Orb also recommends specifying a description to assist with auditing. When adding credits, the caller can also specify a cost basis per-credit, to indicate how much in USD a customer paid for a single credit in a block. This can later be used for revenue recognition.

The following snippet illustrates a sample request body to increment credits which will expire in January of 2022.

```json
{
  "entry_type": "increment",
  "amount": 100,
  "expiry_date": "2022-12-28",
  "per_unit_cost_basis": "0.20",
  "description": "Purchased 100 credits"
}
```

Note that by default, Orb will always first increment any _negative_ balance in existing blocks before adding the remaining amount to the desired credit block.

### Invoicing for credits
By default, Orb manipulates the credit ledger but does not charge for credits. However, if you pass `invoice_settings` in the body of this request, Orb will also generate a one-off invoice for the customer for the credits pre-purchase. Note that you _must_ provide the `per_unit_cost_basis`, since the total charges on the invoice are calculated by multiplying the cost basis with the number of credit units added.

## Deducting Credits
Orb allows you to deduct credits from a customer by creating an entry of type `decrement`. Orb matches the algorithm for automatic deductions for determining which credit blocks to decrement from. In the case that the deduction leads to multiple ledger entries, the response from this endpoint will be the final deduction. Orb also optionally allows specifying a description to assist with auditing.

The following snippet illustrates a sample request body to decrement credits.

```json
{
  "entry_type": "decrement",
  "amount": 20,
  "description": "Removing excess credits"
}
```

## Changing credits expiry
If you'd like to change when existing credits expire, you should create a ledger entry of type `expiration_change`. For this entry, the required parameter `expiry_date` identifies the _originating_ block, and the required parameter `target_expiry_date` identifies when the transferred credits should now expire. A new credit block will be created with expiry date `target_expiry_date`, with the same cost basis data as the original credit block, if present.

Note that the balance of the block with the given `expiry_date` must be at least equal to the desired transfer amount determined by the `amount` parameter.

The following snippet illustrates a sample request body to extend the expiration date of credits by one year:

```json
{
  "entry_type": "expiration_change",
  "amount": 10,
  "expiry_date": "2022-12-28",
  "block_id": "UiUhFWeLHPrBY4Ad",
  "target_expiry_date": "2023-12-28",
  "description": "Extending credit validity"
}
```

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.CreateLedgerEntryRequest;
import Orb.Orb.models.operations.CreateLedgerEntryRequestBody;
import Orb.Orb.models.operations.CreateLedgerEntryRequestBodyEntryType;
import Orb.Orb.models.operations.CreateLedgerEntryRequestBodyInvoiceSettings;
import Orb.Orb.models.operations.CreateLedgerEntryResponse;
import Orb.Orb.models.shared.Security;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsum") {{
                    apiKeyAuth = "";
                }})
                .build();

            CreateLedgerEntryRequest req = new CreateLedgerEntryRequest("excepturi") {{
                requestBody = new CreateLedgerEntryRequestBody(CreateLedgerEntryRequestBodyEntryType.INCREMENT) {{
                    amount = 187.89d;
                    blockId = "ad";
                    description = "natus";
                    expiryDate = LocalDate.parse("2023-01-01");
                    invoiceSettings = new CreateLedgerEntryRequestBodyInvoiceSettings(false, 1496.75d) {{
                        memo = "iste";
                    }};;
                    metadata = new java.util.HashMap<String, Object>() {{
                        put("natus", "laboriosam");
                    }};
                    perUnitCostBasis = "hic";
                    targetExpiryDate = LocalDate.parse("2023-02-01");
                }};;
            }};            

            CreateLedgerEntryResponse res = sdk.credit.create(req);

            if (res.creditLedgerEntry != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## fetch

This [paginated endpoint](../api/pagination) can be used to fetch the current state of credit balance for the specified `customer_id`.

Orb keeps track of credit balances in _credit blocks_, where each block is optionally associated with an `expiry_date`. Each time credits are added, a new credit block is created. Credits which do not expire have an `expiry_date` of `null`. To aid in revenue recognition, credit blocks can optionally have a `per_unit_cost_basis`, to indicate how much in USD a customer paid for a single credit in a block.

Orb only returns _unexpired_ credit blocks in this response. For credits that have already expired, you can view this deduction from the customer's balance in the [Credit Ledger](fetch-customer-credits-ledger) response.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.FetchCustomerCreditsRequest;
import Orb.Orb.models.operations.FetchCustomerCreditsResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("saepe") {{
                    apiKeyAuth = "";
                }})
                .build();

            FetchCustomerCreditsRequest req = new FetchCustomerCreditsRequest("fuga");            

            FetchCustomerCreditsResponse res = sdk.credit.fetch(req);

            if (res.fetchCustomerCredits200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## fetchByExternalId

This endpoint's resource and semantics exactly mirror [Retrieve credit balance](fetch-customer-credits) but operates on an [external customer ID](../guides/events-and-metrics/customer-aliases) rather than an Orb issued identifier.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.FetchCustomerCreditsExternalIdRequest;
import Orb.Orb.models.operations.FetchCustomerCreditsExternalIdResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("in") {{
                    apiKeyAuth = "";
                }})
                .build();

            FetchCustomerCreditsExternalIdRequest req = new FetchCustomerCreditsExternalIdRequest("corporis");            

            FetchCustomerCreditsExternalIdResponse res = sdk.credit.fetchByExternalId(req);

            if (res.fetchCustomerCreditsExternalId200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## fetchLedger

The credits ledger provides _auditing_ functionality over Orb's credits system with a list of actions that have taken place to modify a customer's credit balance. This [paginated endpoint](../api/pagination) lists these entries, starting from the most recent ledger entry.

More details on using Orb's real-time credit feature are [here](../guides/product-catalog/prepurchase).

There are four major types of modifications to credit balance, detailed below.

## Increment
Credits (which optionally expire on a future date) can be added via the API ([Add Ledger Entry](create-ledger-entry)). The ledger entry for such an action will always contain the total eligible starting and ending balance for the customer at the time the entry was added to the ledger. 

## Decrement

Deductions can occur as a result of an API call to create a ledger entry (see [Add Ledger Entry](create-ledger-entry)), or automatically as a result of incurring usage. Both ledger entries present the `decrement` entry type.

As usage for a customer is reported into Orb, credits may be deducted according to the customer's plan configuration. An automated deduction of this type will result in a ledger entry, also with a starting and ending balance. In order to provide better tracing capabilities for automatic deductions, Orb always associates each automatic deduction with the `event_id` at the time of ingestion, used to pinpoint _why_ credit deduction took place and to ensure that credits are never deducted without an associated usage event. 

By default, Orb uses an algorithm that automatically deducts from the *soonest expiring credit block* first in order to ensure that all credits are utilized appropriately. As an example, if trial credits with an expiration date of 2 weeks from now are present for a customer, they will be used before any deductions take place from a non-expiring credit block. 

If there are multiple blocks with the same expiration date, Orb will deduct from the block with the *lower cost basis* first (ex. trial credits with a $0 cost basis before paid credits with a $5.00 cost basis). 

It's also possible for a single usage event's deduction to _span_ credit blocks. In this case, Orb will deduct from the next block, ending at the credit block which consists of unexpiring credits. Each of these deductions will lead to a _separate_ ledger entry, one per credit block that is deducted from. By default, the customer's total credit balance in Orb can be negative as a result of a decrement. 

## Expiration change

The expiry of credits can be changed as a result of the API (See [Add Ledger Entry](create-ledger-entry)). This will create a ledger entry that specifies the balance as well as the initial and target expiry dates. 

Note that for this entry type, `starting_balance` will equal `ending_balance`, and the `amount` represents the balance transferred. The credit block linked to the ledger entry is the source credit block from which there was an expiration change.


## Credits expiry

When a set of credits expire on pre-set expiration date, the customer's balance automatically reflects this change and adds an entry to the ledger indicating this event. Note that credit expiry should always happen close to a date boundary in the customer's timezone.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.FetchCustomerCreditsLedgerEntryStatus;
import Orb.Orb.models.operations.FetchCustomerCreditsLedgerEntryType;
import Orb.Orb.models.operations.FetchCustomerCreditsLedgerRequest;
import Orb.Orb.models.operations.FetchCustomerCreditsLedgerResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("iste") {{
                    apiKeyAuth = "";
                }})
                .build();

            FetchCustomerCreditsLedgerRequest req = new FetchCustomerCreditsLedgerRequest("iure") {{
                entryStatus = FetchCustomerCreditsLedgerEntryStatus.PENDING;
                entryType = FetchCustomerCreditsLedgerEntryType.EXPIRATION_CHANGE;
                minimumAmount = 992.8d;
            }};            

            FetchCustomerCreditsLedgerResponse res = sdk.credit.fetchLedger(req);

            if (res.fetchCustomerCreditsLedger200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## fetchLedgerByExternalId

This endpoint's resource and semantics exactly mirror [View credits ledger](fetch-customer-credits-ledger) but operates on an [external customer ID](../guides/events-and-metrics/customer-aliases) rather than an Orb issued identifier.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.FetchCustomerCreditsLedgerExternalIdEntryStatus;
import Orb.Orb.models.operations.FetchCustomerCreditsLedgerExternalIdEntryType;
import Orb.Orb.models.operations.FetchCustomerCreditsLedgerExternalIdRequest;
import Orb.Orb.models.operations.FetchCustomerCreditsLedgerExternalIdResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ipsa") {{
                    apiKeyAuth = "";
                }})
                .build();

            FetchCustomerCreditsLedgerExternalIdRequest req = new FetchCustomerCreditsLedgerExternalIdRequest("reiciendis") {{
                entryStatus = FetchCustomerCreditsLedgerExternalIdEntryStatus.PENDING;
                entryType = FetchCustomerCreditsLedgerExternalIdEntryType.EXPIRATION_CHANGE;
                minimumAmount = 6706.38d;
            }};            

            FetchCustomerCreditsLedgerExternalIdResponse res = sdk.credit.fetchLedgerByExternalId(req);

            if (res.fetchCustomerCreditsLedgerExternalId200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

# event

## Overview

The Event resource represents an event that has been created for a customer. Events are created when a customer's invoice is paid, and are updated when a customer's transaction is refunded.

### Available Operations

* [amend](#amend) - Amend single event
* [closeBackfill](#closebackfill) - Close a backfill
* [create](#create) - Create a backfill
* [deprecateEvent](#deprecateevent) - Deprecate single event
* [ingest](#ingest) - Ingest events
* [listBackfills](#listbackfills) - List backfills
* [revertBackfill](#revertbackfill) - Revert a backfill
* [search](#search) - Search events

## amend

This endpoint is used to amend a single usage event with a given `event_id`. `event_id` refers to the `idempotency_key` passed in during ingestion. The event will maintain its existing `event_id` after the amendment.

This endpoint will mark the existing event as ignored, and Orb will only use the new event passed in the body of this request as the source of truth for that `event_id`. Note that a single event can be amended any number of times, so the same event can be overwritten in subsequent calls to this endpoint, or overwritten using the [Amend customer usage](amend-usage) endpoint. Only a single event with a given `event_id` will be considered the source of truth at any given time.

This is a powerful and audit-safe mechanism to retroactively update a single event in cases where you need to:
* update an event with new metadata as you iterate on your pricing model
* update an event based on the result of an external API call (ex. call to a payment gateway succeeded or failed)

This amendment API is always audit-safe. The process will still retain the original event, though it will be ignored for billing calculations. For auditing and data fidelity purposes, Orb never overwrites or permanently deletes ingested usage data.

## Request validation
* The `timestamp` of the new event must match the `timestamp` of the existing event already ingested. As with ingestion, all timestamps must be sent in ISO8601 format with UTC timezone offset.
* The `customer_id` or `external_customer_id` of the new event must match the `customer_id` or `external_customer_id` of the existing event already ingested. Exactly one of `customer_id` and `external_customer_id` should be specified, and similar to ingestion, the ID must identify a Customer resource within Orb. Unlike ingestion, for event amendment, we strictly enforce that the Customer must be in the Orb system, even during the initial integration period. We do not allow updating the `Customer` an event is associated with.
* Orb does not accept an `idempotency_key` with the event in this endpoint, since this request is by design idempotent. On retryable errors, you should retry the request and assume the amendment operation has not succeeded until receipt of a 2xx. 
* The event's `timestamp` must fall within the customer's current subscription's billing period, or within the grace period of the customer's current subscription's previous billing period.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.AmendEventRequest;
import Orb.Orb.models.operations.AmendEventRequestBody;
import Orb.Orb.models.operations.AmendEventRequestBodyProperties;
import Orb.Orb.models.operations.AmendEventResponse;
import Orb.Orb.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("natus") {{
                    apiKeyAuth = "";
                }})
                .build();

            AmendEventRequest req = new AmendEventRequest("fQp2wSmK7CF9oPcu") {{
                requestBody = new AmendEventRequestBody("nobis",                 new AmendEventRequestBodyProperties();, OffsetDateTime.parse("2020-12-09T16:09:53Z")) {{
                    customerId = "eum";
                    externalCustomerId = "vero";
                }};;
            }};            

            AmendEventResponse res = sdk.event.amend(req);

            if (res.amendEvent200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [Orb.Orb.models.operations.AmendEventRequest](../../models/operations/AmendEventRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |


### Response

**[Orb.Orb.models.operations.AmendEventResponse](../../models/operations/AmendEventResponse.md)**


## closeBackfill

Closing a backfill makes the updated usage visible in Orb. Upon closing a backfill, Orb will asynchronously reflect the updated usage in invoice amounts and usage graphs. Once all of the updates are complete, the backfill's status will transition to `reflected`.



### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.CloseBackfillRequest;
import Orb.Orb.models.operations.CloseBackfillResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("aspernatur") {{
                    apiKeyAuth = "";
                }})
                .build();

            CloseBackfillRequest req = new CloseBackfillRequest("architecto");            

            CloseBackfillResponse res = sdk.event.closeBackfill(req);

            if (res.backfill != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [Orb.Orb.models.operations.CloseBackfillRequest](../../models/operations/CloseBackfillRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[Orb.Orb.models.operations.CloseBackfillResponse](../../models/operations/CloseBackfillResponse.md)**


## create

Creating the backfill enables adding or replacing past events, even those that are older than the ingestion grace period. Performing a backfill in Orb involves 3 steps:

1. Create the backfill, specifying its parameters.
2. [Ingest](ingest) usage events, referencing the backfill (query parameter `backfill_id`).
3. [Close](close-backfill) the backfill, propagating the update in past usage throughout Orb.

Changes from a backfill are not reflected until the backfill is closed, so you won’t need to worry about your customers seeing partially updated usage data. Backfills are also reversible, so you’ll be able to revert a backfill if you’ve made a mistake.

This endpoint will return a backfill object, which contains an `id`. That `id` can then be used as the `backfill_id` query parameter to the event ingestion endpoint to associate ingested events with this backfill. The effects (e.g. updated usage graphs) of this backfill will not take place until the backfill is closed.

If the `replace_existing_events` is `true`, existing events in the backfill's timeframe will be replaced with the newly ingested events associated with the backfill. If `false`, newly ingested events will be added to the existing events.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.CreateBackfillRequestBody;
import Orb.Orb.models.operations.CreateBackfillResponse;
import Orb.Orb.models.shared.Security;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("magnam") {{
                    apiKeyAuth = "";
                }})
                .build();

            CreateBackfillRequestBody req = new CreateBackfillRequestBody(false, OffsetDateTime.parse("2022-06-06T23:06:26.119Z"), OffsetDateTime.parse("2022-05-30T07:57:16.138Z")) {{
                closeTime = OffsetDateTime.parse("2021-11-07T17:49:17.039Z");
                customerId = "accusantium";
                externalCustomerId = "mollitia";
            }};            

            CreateBackfillResponse res = sdk.event.create(req);

            if (res.backfill != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [Orb.Orb.models.operations.CreateBackfillRequestBody](../../models/operations/CreateBackfillRequestBody.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |


### Response

**[Orb.Orb.models.operations.CreateBackfillResponse](../../models/operations/CreateBackfillResponse.md)**


## deprecateEvent

This endpoint is used to deprecate a single usage event with a given `event_id`. `event_id` refers to the `idempotency_key` passed in during ingestion. 

This endpoint will mark the existing event as ignored. Note that if you attempt to re-ingest an event with the same `event_id` as a deprecated event, Orb will return an error.

This is a powerful and audit-safe mechanism to retroactively deprecate a single event in cases where you need to:
* no longer bill for an event that was improperly reported
* no longer bill for an event based on the result of an external API call (ex. call to a payment gateway failed and the user should not be billed)

If you want to only change specific properties of an event, but keep the event as part of the billing calculation, use the [Amend single event](amend-event) endpoint instead.

This API is always audit-safe. The process will still retain the deprecated event, though it will be ignored for billing calculations. For auditing and data fidelity purposes, Orb never overwrites or permanently deletes ingested usage data.

## Request validation
* Orb does not accept an `idempotency_key` with the event in this endpoint, since this request is by design idempotent. On retryable errors, you should retry the request and assume the deprecation operation has not succeeded until receipt of a 2xx. 
* The event's `timestamp` must fall within the customer's current subscription's billing period, or within the grace period of the customer's current subscription's previous billing period. Orb does not allow deprecating events for billing periods that have already invoiced customers.
* The `customer_id` or the `external_customer_id` of the original event ingestion request must identify a Customer resource within Orb, even if this event was ingested during the initial integration period. We do not allow deprecating events for customers not in the Orb system.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.DeprecateEventRequest;
import Orb.Orb.models.operations.DeprecateEventResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("reiciendis") {{
                    apiKeyAuth = "";
                }})
                .build();

            DeprecateEventRequest req = new DeprecateEventRequest("fQp2wSmK7CF9oPcu");            

            DeprecateEventResponse res = sdk.event.deprecateEvent(req);

            if (res.deprecateEvent200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [Orb.Orb.models.operations.DeprecateEventRequest](../../models/operations/DeprecateEventRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |


### Response

**[Orb.Orb.models.operations.DeprecateEventResponse](../../models/operations/DeprecateEventResponse.md)**


## ingest

Orb's event ingestion model and API is designed around two core principles:

1. **Data fidelity**: The accuracy of your billing model depends on a robust foundation of events. Orb's API protocol encourages usage patterns that ensure that your data is consistently complete and correct.
2. **Fast integration**: Sending events into Orb requires no tedious setup steps or explicit field schema for your event shape, making it instant to start streaming in usage in real-time.


## Event shape

Events are the starting point for all usage calculations in the system, and are simple at their core:

```json
{
  // customer_id and external_customer_id are used to
  // attribute usage to a given Customer. Exactly one of these
  // should be specified in a given ingestion event.

  // `customer_id` is the Orb generated identifier for the Customer,
  // which is returned from the Create Customer API call.
  customer_id: string,

  // external_customer_id is an alternate identifier which is associated
  // with a Customer at creation time. This is treated as an alias for
  // customer_id, and is usually set to an identifier native to your system.
  external_customer_id: string,

  // A string name identifying the event, usually a usage
  // action. By convention, this should not contain any whitespace.
  event_name: string,

  // An ISO 8601 format date with no timezone offset.
  // This should represent the time that usage occurred
  // and is important to attribute usage to a given
  // billing period. See the notes below on determining the timestamp.
  // e.g. 2020-12-09T16:09:53Z
  timestamp: string,

  // A unique value, generated by the client, that is
  // used to de-duplicate events.
  // Exactly one event with a given
  // idempotency key will be ingested, which allows for
  // safe request retries.
  idempotency_key: string

  // Optional custom metadata to attach to the event.
  // This might include a numeric value used for aggregation,
  // or a string/boolean value used for filtering.
  // The schema of this dictionary need not be pre-declared, and
  // properties can be added at any time.
  properties: {
    [key: string]?: string | number | boolean,
  },
}
```

## Required fields
Because events streamed to Orb are meant to be as flexible as possible, there are only a few required fields in every event.

- We recommend that `idempotency_key` are unique strings that you generated with V4 UUIDs, but only require that they uniquely identify an event (i.e. don’t collide).
- The `timestamp` field in the event body will be used to determine which billable period a given event falls into. For example, with a monthly billing cycle starting from the first of December, Orb will calculate metrics based on events that fall into the range `12-01 00:00:00 <= timestamp < 01-01 00:00:00`.

## Logging metadata

Orb allows tagging events with metadata using a flexible properties dictionary. Since Orb does not enforce a rigid schema for this field-set, key-value pairs can be added dynamically as your events evolve.

This dictionary can be helpful for a wide variety of use cases:

- Numeric properties on events like `compute_time_ms` can later be inputs to our flexible query engine to determine usage.
- Logging a region or cluster with each event can help you provide customers more granular visibility into their usage.

We encourage logging this metadata with an eye towards future use cases to ensure full coverage for historical data. The datatype of the value in the properties dictionary is important for metric creation from an event source. Values that you wish to numerically aggregate should be of numeric type in the event.


## Determining event timestamp
For cases where usage is being reported in real time as it is occurring, timestamp should correspond to the time that usage occurred.

In cases where usage is reported in aggregate for a historical timeframe at a regular interval, we recommend setting the event `timestamp` to the midpoint of the interval. As an example, if you have an hourly reporter that sends data once an hour for the previous hour of usage, setting the `timestamp` to the half-hour mark will ensure that the usage is counted within the correct period.

Note that other time-related fields (e.g. time elapsed) can be added to the properties dictionary as necessary.

In cases where usage is reported in aggregate for a historical timeframe, the timestamp must be within the grace period set for your account. Events with `timestamp < current_time - grace_period` will not be accepted as a valid event, and will throw validation errors. Enforcing the grace period enables Orb to accurately map usage to the correct billing cycle and ensure that all usage is billed for in the corresponding billing period.

## Event validation

Orb’s validation ensures that you recognize errors in your events as quickly as possible, and the API provides informative error messages to help you fix problems quickly.

We validate the following:

- Exactly one of `customer_id` and `external_customer_id` should be specified.
- If specified, `customer_id` must identify a Customer resource within Orb. We do not support sending events for customers that have not been provisioned. Similarly, if specified, `external_customer_id` must be an identifier that is associated with an Orb Customer resource. Note: During our initial integration period, this enforcement will be temporarily turned into a warning to ensure smooth customer migration.
- `timestamp` must conform to ISO 8601 and represent a timestamp at most 1 hour in the future. This timestamp should be sent in UTC timezone (no timezone offset).

## Idempotency and retry semantics

Orb's idempotency guarantees allow you to implement safe retry logic in the event of network or machine failures, ensuring data fidelity. Each event in the request payload is associated with an idempotency key, and Orb guarantees that a single idempotency key will be successfully ingested at most once.

- Successful responses return a 200 HTTP status code. The response contains information about previously processed events.
- Requests that return a `4xx` HTTP status code indicate a payload error and contain at least one event with a validation failure. An event with a validation failure can be re-sent to the ingestion endpoint (after the payload is fixed) with the original idempotency key since that key is not marked as processed.
- Requests that return a `5xx` HTTP status code indicate a server-side failure. These requests should be retried in their entirety.


## API usage and limits
The ingestion API is designed made for real-time streaming ingestion and architected for high throughput. Even if events are later deemed unnecessary or filtered out, we encourage you to log them to Orb if they may be relevant to billing calculations in the future.

To take advantage of the real-time features of the Orb platform and avoid any chance of dropped events by producers, we recommend reporting events to Orb frequently. Optionally, events can also be briefly aggregated at the source, as this API accepts an array of event bodies.

Orb does not currently enforce a hard rate-limit for API usage or a maximum request payload size, but please give us a heads up if you’re changing either of these factors by an order of magnitude from initial setup.

## Testing in debug mode
The ingestion API supports a debug mode, which returns additional verbose output to indicate which event idempotency keys were newly ingested or duplicates from previous requests. To enable this mode, mark `debug=true` as a query parameter.

If `debug=true` is not specified, the response will only contain `validation_failed`. Orb will still honor the idempotency guarantees set [here](https://docs.withorb.com/docs/orb-docs/event-ingestion#event-volume-and-concurrency) in all cases.

We strongly recommend that you only use debug mode as part of testing your initial Orb integration. Once you're ready to switch to production, disable debug mode to take advantage of improved performance and maximal throughput.

#### Example: ingestion response with `debug=true`

```json
{
  "debug": {
    "duplicate": [], 
    "ingested": [
      "B7E83HDMfJPAunXW",
      "SJs5DQJ3TnwSqEZE",
      "8SivfDsNKwCeAXim"
    ]
  }, 
  "validation_failed": []
}
```

#### Example: ingestion response with `debug=false`

```json
{
  "validation_failed": []
}
```

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.IngestDebug;
import Orb.Orb.models.operations.IngestRequest;
import Orb.Orb.models.operations.IngestRequestBody;
import Orb.Orb.models.operations.IngestRequestBodyEvents;
import Orb.Orb.models.operations.IngestRequestBodyEventsProperties;
import Orb.Orb.models.operations.IngestResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("mollitia") {{
                    apiKeyAuth = "";
                }})
                .build();

            IngestRequest req = new IngestRequest() {{
                requestBody = new IngestRequestBody(                new Orb.Orb.models.operations.IngestRequestBodyEvents[]{{
                                    add(new IngestRequestBodyEvents("nemo", "quasi",                 new IngestRequestBodyEventsProperties();, "2020-12-09T16:09:53Z") {{
                                        customerId = "eum";
                                        eventName = "dolor";
                                        externalCustomerId = "necessitatibus";
                                        idempotencyKey = "odit";
                                        properties = new IngestRequestBodyEventsProperties() {{}};
                                        timestamp = "2020-12-09T16:09:53Z";
                                    }}),
                                    add(new IngestRequestBodyEvents("maxime", "deleniti",                 new IngestRequestBodyEventsProperties();, "2020-12-09T16:09:53Z") {{
                                        customerId = "iure";
                                        eventName = "doloribus";
                                        externalCustomerId = "debitis";
                                        idempotencyKey = "eius";
                                        properties = new IngestRequestBodyEventsProperties() {{}};
                                        timestamp = "2020-12-09T16:09:53Z";
                                    }}),
                                }});;
                backfillId = "facilis";
                debug = IngestDebug.TRUE;
            }};            

            IngestResponse res = sdk.event.ingest(req);

            if (res.ingest200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [Orb.Orb.models.operations.IngestRequest](../../models/operations/IngestRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |


### Response

**[Orb.Orb.models.operations.IngestResponse](../../models/operations/IngestResponse.md)**


## listBackfills

This endpoint returns a list of all [backfills](../reference/Orb-API.json/components/schemas/Backfill) in a list format. 

The list of backfills is ordered starting from the most recently created backfill. The response also includes [`pagination_metadata`](../api/pagination), which lets the caller retrieve the next page of results if they exist. More information about pagination can be found in the [Pagination-metadata schema](../reference/Orb-API.json/components/schemas/Pagination-metadata).

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.ListBackfillsResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("architecto") {{
                    apiKeyAuth = "";
                }})
                .build();

            ListBackfillsResponse res = sdk.event.listBackfills();

            if (res.listBackfills200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[Orb.Orb.models.operations.ListBackfillsResponse](../../models/operations/ListBackfillsResponse.md)**


## revertBackfill

Reverting a backfill undoes all the effects of closing the backfill. If the backfill is reflected, the status will transition to `pending_revert` while the effects of the backfill are undone. Once all effects are undone, the backfill will transition to `reverted`.

If a backfill is reverted before its closed, no usage will be updated as a result of the backfill and it will immediately transition to `reverted`.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.RevertBackfillRequest;
import Orb.Orb.models.operations.RevertBackfillResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("architecto") {{
                    apiKeyAuth = "";
                }})
                .build();

            RevertBackfillRequest req = new RevertBackfillRequest("repudiandae");            

            RevertBackfillResponse res = sdk.event.revertBackfill(req);

            if (res.backfill != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [Orb.Orb.models.operations.RevertBackfillRequest](../../models/operations/RevertBackfillRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |


### Response

**[Orb.Orb.models.operations.RevertBackfillResponse](../../models/operations/RevertBackfillResponse.md)**


## search

This endpoint returns a filtered set of events for an account in a [paginated list format](../api/pagination). 

Note that this is a `POST` endpoint rather than a `GET` endpoint because it employs a JSON body for search criteria rather than query parameters, allowing for a more flexible search syntax.

Note that a search criteria _must_ be specified. Currently, Orb supports the following criteria:
- `event_ids`: This is an explicit array of IDs to filter by. Note that an event's ID is the `idempotency_key` that was originally used for ingestion.
- `invoice_id`: This is an issued Orb invoice ID (see also [List Invoices](list-invoices)). Orb will fetch all events that were used to calculate the invoice. In the common case, this will be a list of events whose `timestamp` property falls within the billing period specified by the invoice.

By default, Orb does not return _deprecated_ events in this endpoint.

By default, Orb will not throw a `404` if no events matched, Orb will return an empty array for `data` instead.

### Example Usage

```java
package hello.world;

import Orb.Orb.SDK;
import Orb.Orb.models.operations.SearchEventsRequestBody;
import Orb.Orb.models.operations.SearchEventsResponse;
import Orb.Orb.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("ullam") {{
                    apiKeyAuth = "";
                }})
                .build();

            SearchEventsRequestBody req = new SearchEventsRequestBody() {{
                eventIds = new String[]{{
                    add("nihil"),
                    add("repellat"),
                    add("quibusdam"),
                }};
                invoiceId = "sed";
            }};            

            SearchEventsResponse res = sdk.event.search(req);

            if (res.searchEvents200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                               | Type                                                                                                    | Required                                                                                                | Description                                                                                             |
| ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `request`                                                                                               | [Orb.Orb.models.operations.SearchEventsRequestBody](../../models/operations/SearchEventsRequestBody.md) | :heavy_check_mark:                                                                                      | The request object to use for the request.                                                              |


### Response

**[Orb.Orb.models.operations.SearchEventsResponse](../../models/operations/SearchEventsResponse.md)**

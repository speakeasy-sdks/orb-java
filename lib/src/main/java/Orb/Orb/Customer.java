/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb;

import Orb.Orb.utils.HTTPClient;
import Orb.Orb.utils.HTTPRequest;
import Orb.Orb.utils.JSON;
import Orb.Orb.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

/**
 * Actions related to customer management.
 */
public class Customer {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Customer(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    public Orb.Orb.models.operations.PostCustomersResponse create(Orb.Orb.models.operations.PostCustomersRequestBody request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(baseUrl, "/customers");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Orb.Orb.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.PostCustomersResponse res = new Orb.Orb.models.operations.PostCustomersResponse(contentType, httpRes.statusCode()) {{
            customer = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.shared.Customer out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.shared.Customer.class);
                res.customer = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.GetCustomersCustomerIdResponse get(Orb.Orb.models.operations.GetCustomersCustomerIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.GetCustomersCustomerIdRequest.class, baseUrl, "/customers/{customer_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetCustomersCustomerIdResponse res = new Orb.Orb.models.operations.GetCustomersCustomerIdResponse(contentType, httpRes.statusCode()) {{
            customer = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.shared.Customer out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.shared.Customer.class);
                res.customer = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.GetCustomersCustomerIdBalanceTransactionsResponse getBalance(Orb.Orb.models.operations.GetCustomersCustomerIdBalanceTransactionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.GetCustomersCustomerIdBalanceTransactionsRequest.class, baseUrl, "/customers/{customer_id}/balance_transactions", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetCustomersCustomerIdBalanceTransactionsResponse res = new Orb.Orb.models.operations.GetCustomersCustomerIdBalanceTransactionsResponse(contentType, httpRes.statusCode()) {{
            getCustomersCustomerIdBalanceTransactions200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.GetCustomersCustomerIdBalanceTransactions200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.GetCustomersCustomerIdBalanceTransactions200ApplicationJSON.class);
                res.getCustomersCustomerIdBalanceTransactions200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.GetCustomersExternalCustomerIdExternalCustomerIdResponse getByExternalId(Orb.Orb.models.operations.GetCustomersExternalCustomerIdExternalCustomerIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.GetCustomersExternalCustomerIdExternalCustomerIdRequest.class, baseUrl, "/customers/external_customer_id/{external_customer_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetCustomersExternalCustomerIdExternalCustomerIdResponse res = new Orb.Orb.models.operations.GetCustomersExternalCustomerIdExternalCustomerIdResponse(contentType, httpRes.statusCode()) {{
            customer = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.shared.Customer out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.shared.Customer.class);
                res.customer = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.GetCustomerCostsResponse getCosts(Orb.Orb.models.operations.GetCustomerCostsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.GetCustomerCostsRequest.class, baseUrl, "/customers/{customer_id}/costs", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = Orb.Orb.utils.Utils.getQueryParams(Orb.Orb.models.operations.GetCustomerCostsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetCustomerCostsResponse res = new Orb.Orb.models.operations.GetCustomerCostsResponse(contentType, httpRes.statusCode()) {{
            getCustomerCosts200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.GetCustomerCosts200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.GetCustomerCosts200ApplicationJSON.class);
                res.getCustomerCosts200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.GetExternalCustomerCostsResponse getCostsByExternalId(Orb.Orb.models.operations.GetExternalCustomerCostsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.GetExternalCustomerCostsRequest.class, baseUrl, "/customers/external_customer_id/{external_customer_id}/costs", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = Orb.Orb.utils.Utils.getQueryParams(Orb.Orb.models.operations.GetExternalCustomerCostsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetExternalCustomerCostsResponse res = new Orb.Orb.models.operations.GetExternalCustomerCostsResponse(contentType, httpRes.statusCode()) {{
            getExternalCustomerCosts200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.GetExternalCustomerCosts200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.GetExternalCustomerCosts200ApplicationJSON.class);
                res.getExternalCustomerCosts200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.ListCustomersResponse list() throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(baseUrl, "/customers");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.ListCustomersResponse res = new Orb.Orb.models.operations.ListCustomersResponse(contentType, httpRes.statusCode()) {{
            listCustomers200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.ListCustomers200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.ListCustomers200ApplicationJSON.class);
                res.listCustomers200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.PutCustomersCustomerIdResponse update(Orb.Orb.models.operations.PutCustomersCustomerIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.PutCustomersCustomerIdRequest.class, baseUrl, "/customers/{customer_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = Orb.Orb.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.PutCustomersCustomerIdResponse res = new Orb.Orb.models.operations.PutCustomersCustomerIdResponse(contentType, httpRes.statusCode()) {{
            customer = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.shared.Customer out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.shared.Customer.class);
                res.customer = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.PutCustomersExternalCustomerIdExternalCustomerIdResponse updateByExternalId(Orb.Orb.models.operations.PutCustomersExternalCustomerIdExternalCustomerIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.PutCustomersExternalCustomerIdExternalCustomerIdRequest.class, baseUrl, "/customers/external_customer_id/{external_customer_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = Orb.Orb.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.PutCustomersExternalCustomerIdExternalCustomerIdResponse res = new Orb.Orb.models.operations.PutCustomersExternalCustomerIdExternalCustomerIdResponse(contentType, httpRes.statusCode()) {{
            customer = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.shared.Customer out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.shared.Customer.class);
                res.customer = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.PatchCustomersCustomerIdUsageResponse updateUsage(Orb.Orb.models.operations.PatchCustomersCustomerIdUsageRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.PatchCustomersCustomerIdUsageRequest.class, baseUrl, "/customers/{customer_id}/usage", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = Orb.Orb.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);
        
        java.util.List<NameValuePair> queryParams = Orb.Orb.utils.Utils.getQueryParams(Orb.Orb.models.operations.PatchCustomersCustomerIdUsageRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.PatchCustomersCustomerIdUsageResponse res = new Orb.Orb.models.operations.PatchCustomersCustomerIdUsageResponse(contentType, httpRes.statusCode()) {{
            patchCustomersCustomerIdUsage200ApplicationJSONObject = null;
            patchCustomersCustomerIdUsage400ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.PatchCustomersCustomerIdUsage200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.PatchCustomersCustomerIdUsage200ApplicationJSON.class);
                res.patchCustomersCustomerIdUsage200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.PatchCustomersCustomerIdUsage400ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.PatchCustomersCustomerIdUsage400ApplicationJSON.class);
                res.patchCustomersCustomerIdUsage400ApplicationJSONObject = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.PatchExternalCustomersCustomerIdUsageResponse updateUsageByExternalId(Orb.Orb.models.operations.PatchExternalCustomersCustomerIdUsageRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.PatchExternalCustomersCustomerIdUsageRequest.class, baseUrl, "/customers/external_customer_id/{external_customer_id}/usage", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = Orb.Orb.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);
        
        java.util.List<NameValuePair> queryParams = Orb.Orb.utils.Utils.getQueryParams(Orb.Orb.models.operations.PatchExternalCustomersCustomerIdUsageRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.PatchExternalCustomersCustomerIdUsageResponse res = new Orb.Orb.models.operations.PatchExternalCustomersCustomerIdUsageResponse(contentType, httpRes.statusCode()) {{
            patchExternalCustomersCustomerIdUsage200ApplicationJSONObject = null;
            patchExternalCustomersCustomerIdUsage400ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.PatchExternalCustomersCustomerIdUsage200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.PatchExternalCustomersCustomerIdUsage200ApplicationJSON.class);
                res.patchExternalCustomersCustomerIdUsage200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.PatchExternalCustomersCustomerIdUsage400ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.PatchExternalCustomersCustomerIdUsage400ApplicationJSON.class);
                res.patchExternalCustomersCustomerIdUsage400ApplicationJSONObject = out;
            }
        }

        return res;
    }
}
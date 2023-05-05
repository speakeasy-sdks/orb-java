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
 * Actions related to credit management.
 */
public class Credits {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Credits(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    public Orb.Orb.models.operations.PostCustomersCustomerIdCreditsLedgerEntryResponse get(Orb.Orb.models.operations.PostCustomersCustomerIdCreditsLedgerEntryRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.PostCustomersCustomerIdCreditsLedgerEntryRequest.class, baseUrl, "/customers/{customer_id}/credits/ledger_entry", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Orb.Orb.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.PostCustomersCustomerIdCreditsLedgerEntryResponse res = new Orb.Orb.models.operations.PostCustomersCustomerIdCreditsLedgerEntryResponse(contentType, httpRes.statusCode()) {{
            creditLedgerEntry = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.shared.CreditLedgerEntry out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.shared.CreditLedgerEntry.class);
                res.creditLedgerEntry = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.GetCustomersCustomerIdCreditsResponse getCredits(Orb.Orb.models.operations.GetCustomersCustomerIdCreditsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.GetCustomersCustomerIdCreditsRequest.class, baseUrl, "/customers/{customer_id}/credits", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetCustomersCustomerIdCreditsResponse res = new Orb.Orb.models.operations.GetCustomersCustomerIdCreditsResponse(contentType, httpRes.statusCode()) {{
            getCustomersCustomerIdCredits200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.GetCustomersCustomerIdCredits200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.GetCustomersCustomerIdCredits200ApplicationJSON.class);
                res.getCustomersCustomerIdCredits200ApplicationJSONObject = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.GetCustomersCustomerIdCreditsLedgerResponse getCreditsLedger(Orb.Orb.models.operations.GetCustomersCustomerIdCreditsLedgerRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.GetCustomersCustomerIdCreditsLedgerRequest.class, baseUrl, "/customers/{customer_id}/credits/ledger", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = Orb.Orb.utils.Utils.getQueryParams(Orb.Orb.models.operations.GetCustomersCustomerIdCreditsLedgerRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetCustomersCustomerIdCreditsLedgerResponse res = new Orb.Orb.models.operations.GetCustomersCustomerIdCreditsLedgerResponse(contentType, httpRes.statusCode()) {{
            getCustomersCustomerIdCreditsLedger200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.GetCustomersCustomerIdCreditsLedger200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.GetCustomersCustomerIdCreditsLedger200ApplicationJSON.class);
                res.getCustomersCustomerIdCreditsLedger200ApplicationJSONObject = out;
            }
        }

        return res;
    }
}
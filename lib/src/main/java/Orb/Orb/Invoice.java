/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb;

import Orb.Orb.utils.HTTPClient;
import Orb.Orb.utils.HTTPRequest;
import Orb.Orb.utils.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

/**
 * Actions related to invoice management.
 */
public class Invoice {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Invoice(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    public Orb.Orb.models.operations.GetInvoiceInvoiceIdResponse get(Orb.Orb.models.operations.GetInvoiceInvoiceIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.GetInvoiceInvoiceIdRequest.class, baseUrl, "/invoices/{invoice_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetInvoiceInvoiceIdResponse res = new Orb.Orb.models.operations.GetInvoiceInvoiceIdResponse(contentType, httpRes.statusCode()) {{
            invoice = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.shared.Invoice out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.shared.Invoice.class);
                res.invoice = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.GetInvoicesUpcomingResponse getUpcoming(Orb.Orb.models.operations.GetInvoicesUpcomingRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(baseUrl, "/invoices/upcoming");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = Orb.Orb.utils.Utils.getQueryParams(Orb.Orb.models.operations.GetInvoicesUpcomingRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetInvoicesUpcomingResponse res = new Orb.Orb.models.operations.GetInvoicesUpcomingResponse(contentType, httpRes.statusCode()) {{
            upcomingInvoice = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.shared.UpcomingInvoice out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.shared.UpcomingInvoice.class);
                res.upcomingInvoice = out;
            }
        }

        return res;
    }

    public Orb.Orb.models.operations.ListInvoicesResponse list(Orb.Orb.models.operations.ListInvoicesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(baseUrl, "/invoices");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = Orb.Orb.utils.Utils.getQueryParams(Orb.Orb.models.operations.ListInvoicesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.ListInvoicesResponse res = new Orb.Orb.models.operations.ListInvoicesResponse(contentType, httpRes.statusCode()) {{
            listInvoices200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.ListInvoices200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.ListInvoices200ApplicationJSON.class);
                res.listInvoices200ApplicationJSONObject = out;
            }
        }

        return res;
    }
}
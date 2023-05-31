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

/**
 * The Availability resource represents a customer's availability. Availability is created when a customer's invoice is paid, and is updated when a customer's transaction is refunded.
 */
public class Availability {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Availability(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Check availability
     * This endpoint allows you to test your connection to the Orb API and check the validity of your API key, passed in the `Authorization` header. This is particularly useful for checking that your environment is set up properly, and is a great choice for connectors and integrations.
     * 
     * This API does not have any side-effects or return any Orb resources.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Orb.Orb.models.operations.PingResponse ping() throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(baseUrl, "/ping");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s", this._language, this._sdkVersion, this._genVersion));
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.PingResponse res = new Orb.Orb.models.operations.PingResponse(contentType, httpRes.statusCode()) {{
            ping200ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.operations.Ping200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.operations.Ping200ApplicationJSON.class);
                res.ping200ApplicationJSONObject = out;
            }
        }

        return res;
    }
}
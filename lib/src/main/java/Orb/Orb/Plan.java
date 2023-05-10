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

/**
 * Actions related to plan management.
 */
public class Plan {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Plan(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Retrieve a plan
     * This endpoint is used to fetch [plan](../reference/Orb-API.json/components/schemas/Plan) details given a plan identifier. It returns information about the prices included in the plan and their configuration, as well as the product that the plan is attached to.
     * 
     * ## Serialized prices
     * Orb supports a few different pricing models out of the box. Each of these models is serialized differently in a given [Price](../reference/Orb-API.json/components/schemas/Price) object. The `model_type` field determines the key for the configuration object that is present. A detailed explanation of price types can be found in the [Price schema](../reference/Orb-API.json/components/schemas/Price). 
     * 
     * ## Phases
     * Orb supports plan phases, also known as contract ramps. For plans with phases, the serialized prices refer to all prices across all phases.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Orb.Orb.models.operations.GetPlansPlanIdResponse get(Orb.Orb.models.operations.GetPlansPlanIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.GetPlansPlanIdRequest.class, baseUrl, "/plans/{plan_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetPlansPlanIdResponse res = new Orb.Orb.models.operations.GetPlansPlanIdResponse(contentType, httpRes.statusCode()) {{
            plan = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Orb.Orb.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Orb.Orb.models.shared.Plan out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Orb.Orb.models.shared.Plan.class);
                res.plan = out;
            }
        }

        return res;
    }

    /**
     * Retrieve a plan by external plan ID
     * This endpoint is used to fetch [plan](../reference/Orb-API.json/components/schemas/Plan) details given an external_plan_id identifier. It returns information about the prices included in the plan and their configuration, as well as the product that the plan is attached to.
     * 
     * ## Serialized prices
     * Orb supports a few different pricing models out of the box. Each of these models is serialized differently in a given [Price](../reference/Orb-API.json/components/schemas/Price) object. The `model_type` field determines the key for the configuration object that is present. A detailed explanation of price types can be found in the [Price schema](../reference/Orb-API.json/components/schemas/Price). 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Orb.Orb.models.operations.GetPlansExternalPlanIdResponse getByExternalId(Orb.Orb.models.operations.GetPlansExternalPlanIdRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(Orb.Orb.models.operations.GetPlansExternalPlanIdRequest.class, baseUrl, "/plans/external_plan_id/{external_plan_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        SerializedBody serializedRequestBody = Orb.Orb.utils.Utils.serializeRequestBody(request, "plan", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.GetPlansExternalPlanIdResponse res = new Orb.Orb.models.operations.GetPlansExternalPlanIdResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }

    /**
     * List plans
     * This endpoint returns a list of all [plans](../reference/Orb-API.json/components/schemas/Plan) for an account in a list format. 
     * 
     * The list of plans is ordered starting from the most recently created plan. The response also includes [`pagination_metadata`](../reference/Orb-API.json/components/schemas/Pagination-metadata), which lets the caller retrieve the next page of results if they exist. More information about pagination can be found in the [Pagination-metadata schema](../reference/Orb-API.json/components/schemas/Pagination-metadata).
     * 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Orb.Orb.models.operations.ListPlansResponse list(Orb.Orb.models.operations.ListPlansRequestBody request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = Orb.Orb.utils.Utils.generateURL(baseUrl, "/plans");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        SerializedBody serializedRequestBody = Orb.Orb.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Orb.Orb.models.operations.ListPlansResponse res = new Orb.Orb.models.operations.ListPlansResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }
}
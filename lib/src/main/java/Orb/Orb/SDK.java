/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb;

import Orb.Orb.utils.HTTPClient;
import Orb.Orb.utils.SpeakeasyHTTPClient;

/**
 * Orb powers usage-based billing for the fastest-growing software companies.
 * Orb's API is built with the following principles in mind:
 * 
 * 1. **Predictable developer experience**: Where applicable, the Orb API uses industry-standard patterns such as cursor-based pagination and standardized error output. To help with debugging in critical API actions, the API always strives to provide detailed and actionable error messages. Aliases such as external customer IDs aid in fast integration times.
 * 2. **Reliably real time**: Orb's event-based APIs, such as event ingestion are designed to handle extremely high throughput and scale with concurrent load. Orb also provides a real-time event-level credits ledger and a highly performant webhooks architecture.
 * 3. **Flexibility at the forefront**: Features like timezone localization and the ability to amend historical usage show the flexible nature of the platform.
 */
public class SDK {
	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final String[] SERVERS = {
        /**
         * Production server
         */
        "https://api.billwithorb.com/v1",
	};
  	
    /**
     * Actions related to API availability.
     */
    public Availability availability;
    /**
     * Actions related to credit management.
     */
    public Credits credits;
    /**
     * Actions related to customer management.
     */
    public Customer customer;
    /**
     * Actions related to event management.
     */
    public Event event;
    /**
     * Actions related to invoice management.
     */
    public Invoice invoice;
    /**
     * Actions related to plan management.
     */
    public Plan plan;
    /**
     * Actions related to subscription mangement.
     */
    public Subscription subscription;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private Orb.Orb.models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "0.4.0";
	private String _genVersion = "2.20.1";
	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private HTTPClient client;
		private Orb.Orb.models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		/**
		 * Configures the SDK to use the provided security details.
		 * @param security The security details to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setSecurity(Orb.Orb.models.shared.Security security) {
			this.security = security;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public SDK build() throws Exception {
			return new SDK(this.client, this.security, this.serverUrl, this.params);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private SDK(HTTPClient client, Orb.Orb.models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = Orb.Orb.utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = Orb.Orb.utils.Utils.templateUrl(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}
		
		
		this.availability = new Availability(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.credits = new Credits(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.customer = new Customer(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.event = new Event(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.invoice = new Invoice(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.plan = new Plan(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.subscription = new Subscription(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
}
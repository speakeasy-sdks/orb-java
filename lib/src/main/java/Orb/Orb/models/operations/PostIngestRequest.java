/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.SpeakeasyMetadata;

public class PostIngestRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PostIngestRequestBody requestBody;
    public PostIngestRequest withRequestBody(PostIngestRequestBody requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Flag to enable additional debug information in the endpoint response
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=debug")
    public PostIngestDebugEnum debug;
    public PostIngestRequest withDebug(PostIngestDebugEnum debug) {
        this.debug = debug;
        return this;
    }
    

    public PostIngestRequest(){}
}

/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.shared;

import Orb.Orb.utils.SpeakeasyMetadata;

public class Security {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String bearerAuth;
    public Security withBearerAuth(String bearerAuth) {
        this.bearerAuth = bearerAuth;
        return this;
    }
    
}

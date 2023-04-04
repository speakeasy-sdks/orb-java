/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostSubscriptionsRequestBodyPriceOverrides4PackageConfig {
    @JsonProperty("package_amount")
    public String packageAmount;
    public PostSubscriptionsRequestBodyPriceOverrides4PackageConfig withPackageAmount(String packageAmount) {
        this.packageAmount = packageAmount;
        return this;
    }
    
    @JsonProperty("package_size")
    public Double packageSize;
    public PostSubscriptionsRequestBodyPriceOverrides4PackageConfig withPackageSize(Double packageSize) {
        this.packageSize = packageSize;
        return this;
    }
    
}

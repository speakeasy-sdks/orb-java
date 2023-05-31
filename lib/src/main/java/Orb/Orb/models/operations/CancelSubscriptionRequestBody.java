/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Orb.Orb.models.operations;

import Orb.Orb.utils.DateTimeDeserializer;
import Orb.Orb.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class CancelSubscriptionRequestBody {
    /**
     * Determines the timing of subscription cancellation
     */
    @JsonProperty("cancel_option")
    public CancelSubscriptionRequestBodyCancelOption cancelOption;

    public CancelSubscriptionRequestBody withCancelOption(CancelSubscriptionRequestBodyCancelOption cancelOption) {
        this.cancelOption = cancelOption;
        return this;
    }
    
    /**
     * The date that the cancellation should take effect. This parameter can only be passed if the `cancel_option` is `requested_date`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("cancellation_date")
    public OffsetDateTime cancellationDate;

    public CancelSubscriptionRequestBody withCancellationDate(OffsetDateTime cancellationDate) {
        this.cancellationDate = cancellationDate;
        return this;
    }
    
    public CancelSubscriptionRequestBody(@JsonProperty("cancel_option") CancelSubscriptionRequestBodyCancelOption cancelOption) {
        this.cancelOption = cancelOption;
  }
}
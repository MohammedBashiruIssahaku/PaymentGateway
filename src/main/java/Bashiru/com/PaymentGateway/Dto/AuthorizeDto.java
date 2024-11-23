package Bashiru.com.PaymentGateway.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AuthorizeDto(
        @JsonProperty("auth_req_id")
     String auth_req_id,
     @JsonProperty("interval")
     Integer interval,
     @JsonProperty("expires_in\n")
     Integer expires_in
) {
}

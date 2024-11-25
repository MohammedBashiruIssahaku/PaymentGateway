package Bashiru.com.PaymentGateway.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public record accessTokenDto(
        @JsonProperty("access_token")
        String token,
        @JsonProperty("token_type")
        String token_type,
        @JsonProperty("expires_in")
        Integer expiresIn
) {}

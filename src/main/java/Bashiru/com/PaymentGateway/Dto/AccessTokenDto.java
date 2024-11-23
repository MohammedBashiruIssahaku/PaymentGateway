package Bashiru.com.PaymentGateway.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccessTokenDto
{
    @JsonProperty
    String token;
    @JsonProperty
    String token_type;
    @JsonProperty
    Integer expires_in;
}

package Bashiru.com.PaymentGateway.Client;

import Bashiru.com.PaymentGateway.Dto.AccessTokenDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        name = "CreateAccessToken",
        url = "https://sandbox.momodeveloper.mtn.com/remittance"
)
public interface MomoAuthClient
{
    @PostMapping("/token/")
     AccessTokenDto getToken(@RequestHeader("Authorization") String authorization, @RequestHeader("Ocp-Apim-Subscription-Key") String subscriptionkey);

}
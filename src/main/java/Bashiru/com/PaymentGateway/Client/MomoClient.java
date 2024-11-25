package Bashiru.com.PaymentGateway.Client;

import Bashiru.com.PaymentGateway.Config.MomoClientConfig;
import Bashiru.com.PaymentGateway.Dto.GetAccountBalanceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient
        (
        name = "momo-api",
        url = "https://sandbox.momodeveloper.mtn.com/remittance",
        configuration = MomoClientConfig.class
        )
public interface MomoClient
{
    @GetMapping("/v1_0/account/balance")
    GetAccountBalanceDto accountBalance();

}

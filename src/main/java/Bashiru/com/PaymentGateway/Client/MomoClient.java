package Bashiru.com.PaymentGateway.Client;

import Bashiru.com.PaymentGateway.Config.MomoClientConfig;
import Bashiru.com.PaymentGateway.Dto.GetAccountBalanceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient
        (
        name = "momo-api",
        url = "https://sandbox.momodeveloper.mtn.com/remittance/v1_0/",
        configuration = MomoClientConfig.class
        )
public interface MomoClient
{
    @GetMapping("account/balance")
   // GetAccountBalanceDto accountBalance();
    GetAccountBalanceDto accountBalance();

}

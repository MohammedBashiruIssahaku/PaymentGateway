package Bashiru.com.PaymentGateway.Client;

import Bashiru.com.PaymentGateway.Props.ClientProps;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;



@EnableFeignClients
@FeignClient(
        name = "X-Reference-Id",
        url = "https://sandbox.momodeveloper.mtn.com"

)
public class APIuserClient
{

   ClientProps props;

    @PostMapping("/apiuser")
    String getUserId()
    {
        return props.getUserId();
    }
}

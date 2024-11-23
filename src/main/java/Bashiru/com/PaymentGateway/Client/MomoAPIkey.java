package Bashiru.com.PaymentGateway.Client;

import Bashiru.com.PaymentGateway.Config.APIKeyGenerator;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "Api key",
        url = "https://sandbox.momodeveloper.mtn.com/v1_0/apiuser/{X-Reference-Id}/apikey",
        configuration = APIKeyGenerator.class
)
public class MomoAPIkey
{

}

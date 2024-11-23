package Bashiru.com.PaymentGateway.Service;

import Bashiru.com.PaymentGateway.Client.MomoAuthClient;
import Bashiru.com.PaymentGateway.Dto.AccessTokenDto;
import Bashiru.com.PaymentGateway.Props.ClientProps;
import lombok.extern.slf4j.Slf4j;


import java.util.Base64;
@Slf4j
public class CreateAccessToken
{
    MomoAuthClient authClient;
    ClientProps props;
    AccessTokenDto accesstoken;


    AccessTokenDto getToken()
   {
         String header = Base64.getEncoder().encodeToString(String.format ("%s , %s","0716eb7a-32f4-45d6-aa4d-6a6e33069095", "8f0ae0c9c4e94a8c935c872386786753").getBytes());

         AccessTokenDto authorization = authClient.getToken("Basic "+header,  props.getSubscription_Key());
         log.info("access token: " + authorization);
         return getToken();
   }

}

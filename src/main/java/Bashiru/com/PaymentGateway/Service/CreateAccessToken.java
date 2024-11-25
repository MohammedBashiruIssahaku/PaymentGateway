package Bashiru.com.PaymentGateway.Service;

import Bashiru.com.PaymentGateway.Client.MomoAuthClient;
import Bashiru.com.PaymentGateway.Dto.accessTokenDto;
import Bashiru.com.PaymentGateway.Props.ClientProps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Base64;
@Slf4j
@Service
public class CreateAccessToken
{
    MomoAuthClient authClient;
    ClientProps props;
    accessTokenDto access;


    public String getAccessToken()
   {
         String header = Base64.getEncoder().encodeToString(String.format ("%s:%s", props.getApiUserId(), props.getApiKey()).getBytes());

         var authorization = authClient.getAccessToken("Basic "+header,  props.getOcpApimSubscriptionKey());
         log.info("access token: {}", authorization.accessToken());
         return authorization.accessToken();

   }

}

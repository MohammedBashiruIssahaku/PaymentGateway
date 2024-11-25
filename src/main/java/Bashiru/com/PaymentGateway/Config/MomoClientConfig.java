package Bashiru.com.PaymentGateway.Config;

import Bashiru.com.PaymentGateway.Props.ClientProps;
import Bashiru.com.PaymentGateway.Service.CreateAccessToken;
import feign.RequestInterceptor;

public class MomoClientConfig
{
    ClientProps props;
    CreateAccessToken accessToken;

    RequestInterceptor requestInterceptor()
    {
        return requestTemplate -> requestTemplate
                .header("Authorization" + "Bearer "+ accessToken.getToken())
                .header("X-Target-Environment" , props.getTargetEnvironment() )
                .header("Ocp-Apim-Subscription-Key" , props.getOcpApimSubscriptionKey());

    }

}

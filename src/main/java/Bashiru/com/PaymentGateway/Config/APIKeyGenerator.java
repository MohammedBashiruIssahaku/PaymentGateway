package Bashiru.com.PaymentGateway.Config;


import Bashiru.com.PaymentGateway.Props.ClientProps;
import feign.RequestInterceptor;

public class APIKeyGenerator
{
    ClientProps props;

     RequestInterceptor generateApiKey()
    {
        return requestTemplate -> requestTemplate
                .header("X-Reference-Id" +  props.getUserId() )
                .header("Ocp-Apim-Subscription-Key" + props.getSubscription_Key());
    }
}

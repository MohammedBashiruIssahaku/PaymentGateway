package Bashiru.com.PaymentGateway.Config;

import Bashiru.com.PaymentGateway.Props.ClientProps;
import Bashiru.com.PaymentGateway.Service.CreateAccessToken;
import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MomoClientConfig
{

    private final ClientProps props;
    private final CreateAccessToken accesstoken;

    @Bean
    RequestInterceptor requestInterceptor()
    {
        return requestTemplate -> requestTemplate
                .header("Authorization" , "Bearer "+ accesstoken.getAccessToken())
                 .header("X-Target-Environment" , props.getTargetEnvironment() )
                 .header("Ocp-Apim-Subscription-Key" , props.getOcpApimSubscriptionKey());

    }

}

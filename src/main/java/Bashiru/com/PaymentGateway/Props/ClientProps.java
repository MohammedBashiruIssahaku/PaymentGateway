package Bashiru.com.PaymentGateway.Props;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ConfigurationProperties("Client.momo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientProps {

    private String targetEnvironment;
    private String  ocpApimSubscriptionKey;
    private String apiKey;
    private String apiUserId;
}

package Bashiru.com.PaymentGateway.Props;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("my.mtn-momo")
@Data
@EnableConfigurationProperties
@ConfigurationPropertiesScan
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientProps {
    private String targetEnvironment;
    private String  ocpApimSubscriptionKey;
    private String apiKey;
    private String apiUserId;
}

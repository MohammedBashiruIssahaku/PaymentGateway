package Bashiru.com.PaymentGateway.Props;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("my.mtn-momo")
@Data
@Builder
public class ClientProps {
    String userId;
    String subscription_Key;
    String targetEnvironment;
}

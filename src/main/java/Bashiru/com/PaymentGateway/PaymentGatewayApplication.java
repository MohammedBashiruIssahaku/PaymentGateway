package Bashiru.com.PaymentGateway;


import Bashiru.com.PaymentGateway.Client.MomoClient;
import Bashiru.com.PaymentGateway.Props.ClientProps;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableConfigurationProperties(ClientProps.class)
@RequiredArgsConstructor
@SpringBootApplication
@EnableFeignClients
public class PaymentGatewayApplication
{
  private final MomoClient momoClient;
  ClientProps props;

	@Bean
	ApplicationRunner application()
	{
        return args ->
		{

				var response = momoClient.accountBalance();
				log.info("Account Balance from MomoApi: {}", response);


		};
	}

	public static void main(String[] args)
	{
		SpringApplication.run(PaymentGatewayApplication.class, args);

	}

}

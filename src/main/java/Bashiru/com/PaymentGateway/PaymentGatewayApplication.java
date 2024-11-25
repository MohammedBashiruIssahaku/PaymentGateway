package Bashiru.com.PaymentGateway;


import Bashiru.com.PaymentGateway.Client.MomoClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@Slf4j
@EnableConfigurationProperties
@RequiredArgsConstructor
@SpringBootApplication
@EnableFeignClients
public class PaymentGatewayApplication
{
  private final MomoClient momoClient;

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

package Bashiru.com.PaymentGateway;

import Bashiru.com.PaymentGateway.Client.MomoAPIkey;
import Bashiru.com.PaymentGateway.Client.MomoClient;
import Bashiru.com.PaymentGateway.Dto.AccessTokenDto;
import Bashiru.com.PaymentGateway.Dto.GetAccountBalanceDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ConfigurationProperties
@RequiredArgsConstructor
@SpringBootApplication
@EnableFeignClients
public class PaymentGatewayApplication
{
  MomoClient momoClient;

	@Bean
	ApplicationRunner application()
	{
        return args ->{
			 String response = String.valueOf(momoClient.accountBalance());
			 log.info("Account Balance from MomoApi: {}", response);
		};
	}

	public static void main(String[] args)
	{
		SpringApplication.run(PaymentGatewayApplication.class, args);

	}

}

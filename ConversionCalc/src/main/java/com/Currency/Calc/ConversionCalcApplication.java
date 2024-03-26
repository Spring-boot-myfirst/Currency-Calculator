package com.Currency.Calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConversionCalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConversionCalcApplication.class, args);
	}

}

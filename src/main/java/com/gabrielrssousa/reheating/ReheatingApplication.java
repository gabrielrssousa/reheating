package com.gabrielrssousa.reheating;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReheatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReheatingApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(JsonConverter converter) throws Exception {
		return args -> {
			String json = "{\"zipCode\": \"45985-214\",\"publicArea\": \"Praça Castro Alves\",\"locality\": \"Teixeira de Freitas\"}";
			ViaZipCodeResponse response = converter.convert(json);
			System.out.println("Zip Code Data: " + response);
		};
	}

}

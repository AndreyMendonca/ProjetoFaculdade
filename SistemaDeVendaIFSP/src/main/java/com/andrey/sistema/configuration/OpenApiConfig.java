package com.andrey.sistema.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Sistema de vendas")
						.version("v1")
						.description("Sistema de vendas realizado como projeto de faculdade")
						.termsOfService("https://www.ifsp.edu.br/")
						.license(new License().name("Apache 2.0").url("https://www.ifsp.edu.br/"))
					);
	}
}

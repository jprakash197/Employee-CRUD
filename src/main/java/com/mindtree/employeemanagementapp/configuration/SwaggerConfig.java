package com.mindtree.employeemanagementapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)//<3>
	            .select()//<4>
	            .apis(RequestHandlerSelectors.any())//<5>
	            .paths(Predicates.not(PathSelectors.regex("/error.*")))//<6>, regex must be in double quotes.
	            .build();
	}

	private static final String SWAGGER_API_VERSION = "2.0";
	private static final String TITLE = "Employee Management Application";
	private static final String DESCRIPTION = "Employee Management Application API";
	private static final String LICENSE_TEXT = "License";

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(TITLE).description(DESCRIPTION).license(LICENSE_TEXT)
				.version(SWAGGER_API_VERSION).build();
	}
}

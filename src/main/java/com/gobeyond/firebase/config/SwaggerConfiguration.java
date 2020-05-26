package com.gobeyond.firebase.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	private static final String BASE_RESOURCES_PACKAGE = "com.gobeyond.firebase";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage(BASE_RESOURCES_PACKAGE)).paths(PathSelectors.any()).build()
				.apiInfo(apiInfo()).forCodeGeneration(true);
	}

	private ApiInfo apiInfo() {
		ApiInfoBuilder builder = new ApiInfoBuilder();
		return builder.title("APOLLO GROUP").description("APA GIS Integration APIs").version("1.0")
				.contact(this.getContact()).build();
	}

	

	private Contact getContact() {
		return new Contact("APA Insurance", "https://www.apainsurance.org", "apa.digital@apollo.co.ke");
	}

}
package com.example.swagger.springfox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author salted fish
 * @Date:2018年8月7日
 */
@Configuration
@EnableSwagger2
//@Profile("dev")
public class SpringfoxConfiguration {
	
	@Bean
	public Docket wap_api() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("课程相关")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.swagger.index.controller"))
				.paths(PathSelectors.ant("/**"))
				.build();
	}

	
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("小咸鱼 swagger2测试")
				.description("小咸鱼API接口")
				.termsOfServiceUrl("")
				.version("1.0")
				.build();
	}

}

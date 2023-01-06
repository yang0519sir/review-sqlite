package com.example.springbootsqlite.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author cphovo
 * create datetime 2022/6/14 0:28
 * Knife4配置
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {
    public Docket defaultApi2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .description("# swagger-bootstrap-ui-demo RESTful APIs")
                        .version("v1.0")
                        .build())
                //分组名称
                .groupName("2.X版本")
                .select()
                //指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.springbootsqlite.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}

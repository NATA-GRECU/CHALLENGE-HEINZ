package com.heinz.Heinz.SwaggerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.Collections;


@Configuration
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.heinz.Heinz.controller"))
                .paths(PathSelectors.any())
                .build()
                .servers(server())
                .apiInfo(apiInfo());
    }

    private Server server() {
        Server server = new Server("Descrição da API","http://localhost:8080/api", "",Collections.emptyList(), new ArrayList<>());
        return server;
    }

    private ApiInfo apiInfo()
    {
        return new ApiInfoBuilder()
                .title("Challenge Heinz")
                .description("Documentação de APIs da Heiz.")
                .version("1.0")
                .contact(contact())
                .build();
    }

    private Contact contact()
    {
        return new Contact("ConnectFood",
                "https://connectFood.com/",
                "suporte@connectfood.com.br");
    }

}

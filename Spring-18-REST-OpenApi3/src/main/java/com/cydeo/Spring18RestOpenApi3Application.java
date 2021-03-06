package com.cydeo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.PathItem;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring18RestOpenApi3Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring18RestOpenApi3Application.class, args);
    }

    @Bean
    public OpenAPI customOpenApi(){
        return new OpenAPI()
                //.servers()
                //.paths(new Paths("Some name", new PathItem().get("")))
                .info(new Info().title("Cinema Application OpenAPi")
                .version("v3")
                .description("Cinema application API documentations V3"));
    }
}

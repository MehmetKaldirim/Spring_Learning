package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigAny {

    @Bean
    String str(){
        return "Developer";
    }

    @Bean
    @Primary
    String str1(){
        return "Zero To Hero Developer Mehmet";
    }


    @Bean
    Integer number(){
        return 100;
    }
}

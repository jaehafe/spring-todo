package com.todo.resttodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RestTodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestTodoApplication.class, args);
    }

    @Bean
    @CrossOrigin
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("*")
//                        .allowedOrigins("http://localhost:3000")
                        .allowedOrigins("*");
            }
        };
    }
}

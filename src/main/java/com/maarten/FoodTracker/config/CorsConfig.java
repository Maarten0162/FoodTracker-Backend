package com.maarten.FoodTracker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Allow all endpoints to be accessed from your frontend
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:8081", "http://localhost:8080")  // frontend URL
                        .allowedMethods("*");                     // GET, POST, etc.
            }
        };
    }
}
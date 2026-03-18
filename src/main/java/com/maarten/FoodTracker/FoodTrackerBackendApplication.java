package com.maarten.FoodTracker;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodTrackerBackendApplication {
    public static void main(String[] args) {
        // loads .env automatically if spring-dotenv is in the classpath
        SpringApplication.run(FoodTrackerBackendApplication.class, args);
    }
}
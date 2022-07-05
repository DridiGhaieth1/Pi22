package com.example.pi22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)// disable auto configuration spring security
public class Pi22Application {

    public static void main(String[] args) {
        SpringApplication.run(Pi22Application.class, args);
    }

}

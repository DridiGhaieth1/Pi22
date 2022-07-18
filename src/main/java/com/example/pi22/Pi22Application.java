package com.example.pi22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)// disable auto configuration spring security
public class Pi22Application {

    public static void main(String[] args) {
        SpringApplication.run(Pi22Application.class, args);
    }

}

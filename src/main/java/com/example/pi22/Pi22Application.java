package com.example.pi22;

import com.example.pi22.services.AbonnementService;
import com.example.pi22.services.SendEmail;
import nonapi.io.github.classgraph.json.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.sql.SQLOutput;
import java.util.Date;

@SpringBootApplication
public class Pi22Application {
    @Autowired
    private SendEmail sendEmail;
    public static void main(String[] args) {
        SpringApplication.run(Pi22Application.class, args);
        AbonnementService abonnementService =new AbonnementService();
        Date d= new Date();
        Date x = abonnementService.CalculerDtaeFin(d,9);
        System.out.println(x);




    }
    @EventListener(ApplicationReadyEvent.class)
    public void sendmail(){
        sendEmail.sendMail("Hayder.abbassi@esprit.tn","azerrtt","azeerfvd");
    }


}

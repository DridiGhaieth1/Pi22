package com.example.pi22.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendEmail {
    @Autowired
    private JavaMailSender mailSender ;

    public void sendMail(String subjct,
                         String body, String... toEmail){

        SimpleMailMessage message =new SimpleMailMessage();
        message.setFrom("marwen.chabbouh@esprit.tn");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subjct);
        mailSender.send(message);
        System.out.println( "email send");



    }





}

package com.example.pi22.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmail {
    @Autowired
    private JavaMailSender mailSender ;

    public void sendMail(String toEmail,
                         String subjct,
                         String body){

        SimpleMailMessage message =new SimpleMailMessage();
        message.setFrom("marwen.chabbouh@esprit.tn");
        message.setTo(toEmail);
        message.setText(body);
        message.setSubject(subjct);
        mailSender.send(message);
        System.out.println( "email send");



    }





}

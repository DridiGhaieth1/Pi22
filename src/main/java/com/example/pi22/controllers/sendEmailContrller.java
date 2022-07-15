package com.example.pi22.controllers;

import com.example.pi22.services.SendEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
public class sendEmailContrller {
    @Autowired
    private SendEmail sendEmail;

    @PostMapping("/abaath/{mail}/{obj}/{text}")
    public void sendEmail(@PathVariable String mail , @PathVariable String obj , @PathVariable String text){
sendEmail.sendMail(mail,obj,text);

    }
}

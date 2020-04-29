package com.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.model.EmailMessage;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
//@RequestMapping("/index")
public class WebHookController {
	
	@Autowired
    public JavaMailSender emailSender;
	
	@PostMapping("/")
	public void getMe(@RequestBody EmailMessage input) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(input.getMail()); 
        message.setSubject("Error encountered on Gamification App"); 
        message.setText(input.getText());
        emailSender.send(message);
		log.info(input.toString());
//		return input;
	}
}

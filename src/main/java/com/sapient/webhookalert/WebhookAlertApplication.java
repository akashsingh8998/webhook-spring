package com.sapient.webhookalert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sapient")
public class WebhookAlertApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebhookAlertApplication.class, args);
	}

}

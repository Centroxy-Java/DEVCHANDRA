package com.cen;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringSecuritySsoGoogleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecuritySsoGoogleApplication.class, args);
		System.out.println("Hi I am runing!!!!");
	}

}

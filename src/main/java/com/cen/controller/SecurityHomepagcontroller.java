package com.cen.controller;

import java.security.Principal;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityHomepagcontroller {

	
//	 @RequestMapping("/homepage")  
//	    public String securedPage(Model model,  
//	                              @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,  
//	                              @AuthenticationPrincipal OAuth2User oauth2User) {  
//	        model.addAttribute("userName", oauth2User.getName());  
//	        model.addAttribute("clientName", authorizedClient.getClientRegistration().getClientName());  
//	        model.addAttribute("userAttributes", oauth2User.getAttributes());  
//	        
//	        return "homepage";  
//	    }  
	

	@GetMapping
	public String Homepage() {
		
		return "Welcome To your Application";
		
	}
	
	@GetMapping("/user")
	public Principal userfetails( Principal principal) {
		System.out.println("user"+principal.getName());
		return principal;
		
	}
}

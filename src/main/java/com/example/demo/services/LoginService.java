package com.example.demo.services;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	
	public boolean validationInput(String name, String password) {
		
		
		
		return name.equalsIgnoreCase("admin")&&password.equalsIgnoreCase("admin");
	}
	
}

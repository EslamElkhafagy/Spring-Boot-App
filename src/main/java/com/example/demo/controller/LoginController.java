package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.services.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginPage(ModelMap model ) {
		
//		
//		boolean validinput=loginService.validationInput(name, pass);
//		
//		if(!validinput) {
//			
//			model.put("errorMessage", "invalid username or password");
//			return "login";
//		}
//			
//		System.out.println("name is = "+name);
//		
//		model.put("name", name);
//		
//		System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
	return "login";
		
	}
	
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String redirectToLoginPage(@RequestParam String name,@RequestParam String password, ModelMap model ) {
		
		
		boolean validinput=loginService.validationInput(name, password);
		
		if(!validinput) {
			
			model.put("errorMessage", "invalid username or password");
			return "login";
		}
			
		System.out.println("name is = "+name);
		
		model.put("name", name);
		
//		System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
	return "welcome";
		
	}
}

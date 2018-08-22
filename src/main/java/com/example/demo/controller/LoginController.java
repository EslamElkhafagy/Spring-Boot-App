package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String redirectToLoginPage(@RequestParam String name, ModelMap model ) {
		System.out.println("name is = "+name);
		model.put("name", name);
		
//		System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
	return "login";
		
	}
}

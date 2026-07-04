package com.social.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

	@GetMapping("/")
	public String index() {
		System.out.println("NavigationController / home");
		return "index";
	}
	
	@GetMapping("/openSignUp")
	public String openSignUp(){
		System.out.println("NavigationController openSignUp home");
		return "signUp";
	}
}

package com.social.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

	@GetMapping("/")
	public String index() {
		System.out.println("NavigationController /  index");
		return "index";
	}
	
	@GetMapping("/openSignUp")
	public String openSignUp(){
		System.out.println("NavigationController openSignUp signUp");
		return "signUp";
	}
	
	@GetMapping("/openCreatePost")
	public String openCreatePost() {
		System.out.println("NavigationController openCreatePost createPost");
		return "createPost";
	}
	
}

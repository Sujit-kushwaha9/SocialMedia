package com.social.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.social.demo.Entity.User;
import com.social.demo.Service.UserService;


@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/signUp")
	public String addUser(@ModelAttribute User user) {
//		checking user exist
		String username=user.getUsername();
		String email=user.getEmail();
		boolean status=service.userExists(username, email);
		
		if(status==false) {
			service.addUser(user);
		}
		System.out.println("UserController addUser index");
		return "index";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password) {
		boolean status=service.validateUser(username, password);
		if(status) {
			System.out.println("UserController Login home");
			return "home";
		}else {
			System.out.println("UserController Login index");
			return "index";
	
		}
	}
	
}

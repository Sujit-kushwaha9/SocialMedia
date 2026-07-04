package com.social.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.demo.Entity.User;
import com.social.demo.Repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserRepository repo;

	@Override
	public boolean userExists(String username, String email) {
		User user1=repo.findByUsername(username);
		User user2=repo.findByEmail(email);
		if(user1 != null || user2 != null) {
			return true;
		}
		return false;
	}

	
	public void addUser(User user) {
		repo.save(user);	
	}


	@Override
	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		
		String dbPass=repo.findByUsername(username).getPassword();
		if(password.equals(dbPass)) {
			return true;
		}
		return false;
		
	}
	
}

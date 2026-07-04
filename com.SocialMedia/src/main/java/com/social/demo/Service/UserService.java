package com.social.demo.Service;

import com.social.demo.Entity.User;

public interface UserService {

	boolean userExists(String username, String email);

	void addUser(User user);

	boolean validateUser(String username, String password);

}

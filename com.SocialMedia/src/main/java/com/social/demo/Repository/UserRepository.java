package com.social.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.demo.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	User findByUsername(String username);

}

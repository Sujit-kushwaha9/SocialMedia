package com.social.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.demo.Entity.Post;

public interface PostRepository  extends JpaRepository<Post, Long>{

	
	
}

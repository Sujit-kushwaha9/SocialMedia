package com.social.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.demo.Entity.Post;
import com.social.demo.Repository.PostRepository;

@ Service
public class PostSeviceImpl implements PostService{

	@Autowired
	PostRepository repo;

	@Override
	public void createPost(Post post) {
		// TODO Auto-generated method stub
		repo.save(post);
	}

}

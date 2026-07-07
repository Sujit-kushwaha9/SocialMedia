package com.social.demo.Service;

import java.util.List;

import com.social.demo.Entity.Post;

public interface PostService {

	void createPost(Post post);
	
	List<Post> getAllPost();

}

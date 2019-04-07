package com.ddelfim.workshoppostgre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddelfim.workshoppostgre.domain.Post;
import com.ddelfim.workshoppostgre.repository.PostRepository;
import com.ddelfim.workshoppostgre.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	public Post findById(String id) {
		return postRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found 2 "));
	}
	
	
}

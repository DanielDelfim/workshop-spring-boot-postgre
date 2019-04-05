package com.DanielDelfim.workshoppostgre.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DanielDelfim.workshoppostgre.domain.User;
import com.DanielDelfim.workshoppostgre.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}

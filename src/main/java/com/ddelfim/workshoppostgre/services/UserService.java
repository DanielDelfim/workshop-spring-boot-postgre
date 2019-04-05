package com.ddelfim.workshoppostgre.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddelfim.workshoppostgre.domain.User;
import com.ddelfim.workshoppostgre.repository.UserRepository;
import com.ddelfim.workshoppostgre.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(String id) {
		return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found 2 "));
	}
}

package com.ddelfim.workshoppostgre.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddelfim.workshoppostgre.domain.User;
import com.ddelfim.workshoppostgre.dto.UserDTO;
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
	
	public User insert(User obj) {
		return userRepository.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		userRepository.deleteById(id); 
	}
	
	public User update(User obj) {
		User newObj = userRepository.findById(obj.getId()).orElseThrow(() -> new ObjectNotFoundException("Object not found 2 "));
		updateData(newObj, obj);
		return userRepository.save(newObj); 
	}
	
	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
	
}

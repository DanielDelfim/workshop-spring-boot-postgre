package com.ddelfim.workshoppostgre.config;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ddelfim.workshoppostgre.domain.User;
import com.ddelfim.workshoppostgre.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User maria = new User(null, "maria", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "bob", "bob@gmail.com");
		User daniel = new User(null, "daniel", "daniel@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob, daniel));
		
	}
	

}

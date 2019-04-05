package com.ddelfim.workshoppostgre.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ddelfim.workshoppostgre.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

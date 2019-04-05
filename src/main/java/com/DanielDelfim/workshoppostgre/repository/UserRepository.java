package com.DanielDelfim.workshoppostgre.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.DanielDelfim.workshoppostgre.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

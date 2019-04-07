package com.ddelfim.workshoppostgre.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ddelfim.workshoppostgre.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}

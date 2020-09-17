package com.od.crowdy.user.repository;

import com.od.crowdy.user.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface MongoUserRepository extends ReactiveMongoRepository<User, String> {
    Mono<User> findByUsername(String username);
}
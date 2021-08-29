package com.example.api.rabbitmq.repository;

import com.example.api.rabbitmq.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {
    Optional<User> findByAlias(String alias);
    Flux<User> findAll(); // 복수형으로 데이터가져옴
    Mono<User> findByUserid(String username);
}

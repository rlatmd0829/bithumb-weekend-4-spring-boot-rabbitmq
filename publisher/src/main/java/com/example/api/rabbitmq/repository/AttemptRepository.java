package com.example.api.rabbitmq.repository;

import com.example.api.rabbitmq.domain.Attempt;
import com.example.api.rabbitmq.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface AttemptRepository extends ReactiveMongoRepository<User, String> {
    Flux<Attempt> findTop5ByUserAliasOrderByIdDesc(String userAlias);

}

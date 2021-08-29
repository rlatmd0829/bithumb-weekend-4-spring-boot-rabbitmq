package com.example.api.rabbitmq.service;

import com.example.api.rabbitmq.domain.Quiz;
import reactor.core.publisher.Mono;

public interface QuizService {
    Mono<Quiz> createQuiz();
}

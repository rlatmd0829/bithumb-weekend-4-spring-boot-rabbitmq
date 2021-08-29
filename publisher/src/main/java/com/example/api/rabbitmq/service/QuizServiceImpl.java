package com.example.api.rabbitmq.service;

import com.example.api.rabbitmq.domain.Quiz;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService{

    private final GeneratorService service;

    @Override
    public Mono<Quiz> createQuiz(){
        int factorA = service.randomFactor();
        int factorB = service.randomFactor();
        Quiz quiz = new Quiz(factorA, factorB);
        return Mono.just(quiz);
    }
}

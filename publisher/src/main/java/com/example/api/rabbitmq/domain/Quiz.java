package com.example.api.rabbitmq.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Quiz { // 저장할 가치없다
    private int factorA;
    private int factorB;
    private int result;

    @Builder
    public Quiz(int factorA, int factorB){
        this.factorA = factorA;
        this.factorB = factorB;
        result = this.factorA * this.factorB;
    }
}

package com.example.api.rabbitmq.service;

import com.example.api.rabbitmq.domain.Factor;

import java.util.Random;
import java.util.function.Function;

public class GeneratorServiceImpl implements GeneratorService {
    @Override
    public int randomFactor() {
        Function<String, Integer> function = Integer::parseInt;
        int a = function.apply(Factor.MAX.toString());
        int b = function.apply(Factor.MIN.toString());
        int c = function.apply(Factor.MIN.toString());
        return new Random().nextInt(a - b + 1) + c;

    }
}

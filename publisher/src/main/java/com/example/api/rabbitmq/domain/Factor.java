package com.example.api.rabbitmq.domain;

public enum Factor {
    MAX, MIN;

    @Override
    public String toString() { // 저장할 가치없다.
        String value = "";
        switch (this){
            case MIN: value = String.valueOf(11); break;
            case MAX: value = String.valueOf(99); break;
        }
        return value;
    }
}

package com.example.api.rabbitmq.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;

@Document(collection = "users") // 저장한다.
@Getter @ToString @RequiredArgsConstructor @EqualsAndHashCode
public class User implements Serializable {
    @Id private final String username;
    private final String alias;
}

package com.spring.alone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    private final String id;

    public Customer(@Value("${test.id}") String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

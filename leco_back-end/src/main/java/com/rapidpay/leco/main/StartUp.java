package com.rapidpay.leco.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EntityScan("com.rapidpay.leco.model")
@ComponentScan("com.rapidpay.leco.controller")
@ComponentScan("com.rapidpay.leco.service")
@ComponentScan("com.rapidpay.leco.repo")
@EnableMongoRepositories("com.rapidpay.leco.repo.custom")
public class StartUp {

    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);
    }

}

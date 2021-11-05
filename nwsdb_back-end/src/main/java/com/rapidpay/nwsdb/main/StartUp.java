package com.rapidpay.nwsdb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EntityScan("com.rapidpay.nwsdb.model")
@ComponentScan("com.rapidpay.nwsdb.controller")
@ComponentScan("com.rapidpay.nwsdb.service")
@ComponentScan("com.rapidpay.nwsdb.repo")
@EnableMongoRepositories("com.rapidpay.nwsdb.repo.custom")
public class StartUp {

    public static void main(String[] args) {
        SpringApplication.run(StartUp.class, args);
    }

}

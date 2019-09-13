package com.acme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.acme.persistence"})
@EntityScan(basePackages = {"com.acme.domain"})
//@ComponentScan(basePackages = {"com.acme.persistence"})
public class MultiModuleApplication {
    public static void main (String[] args){
        SpringApplication.run(MultiModuleApplication.class);
    }
}

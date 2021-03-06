package com.ogasimov.labs.springcloud.microservices.table;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TableApp {
    public static void main(String[] args) {
        SpringApplication.run(TableApp.class, args);
    }
}

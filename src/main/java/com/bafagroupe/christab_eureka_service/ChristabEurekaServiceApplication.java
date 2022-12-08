package com.bafagroupe.christab_eureka_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ChristabEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChristabEurekaServiceApplication.class, args);
    }

}

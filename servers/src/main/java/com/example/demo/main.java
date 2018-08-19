package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Lenovo on 2018/8/11.
 */
@SpringBootApplication
@EnableEurekaServer
public class main {
    public static void main(String[] args) {
        SpringApplication.run(main.class,args);
    }
}

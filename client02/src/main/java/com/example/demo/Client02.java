package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Lenovo on 2018/8/11.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Client02 {
    public static void main(String[] args) {
        SpringApplication.run(Client02.class,args);
    }
}

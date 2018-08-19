package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by Lenovo on 2018/8/11.
 */
@EnableFeignClients //开启feignclient

@EnableDiscoveryClient //开启从euraka注册和发现服务

@SpringBootApplication
public class Client01 {
    public static void main(String[] args) {
        SpringApplication.run(Client01.class,args);
    }
}

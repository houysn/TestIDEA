package com.example.demo.client;

import com.example.api.client02.client02Api;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Lenovo on 2018/8/11.
 */
@FeignClient("xc-service-client02")
public interface Client02Api extends client02Api {
}

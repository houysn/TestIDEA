package com.example.demo.client;

import com.example.api.client01.client01Api;
import com.example.api.client02.client02Api;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by Lenovo on 2018/8/11.
 */
@FeignClient("xc-service-client01")
public interface Client01Api extends client01Api {

}

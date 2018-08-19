package com.example.demo.controller;

import com.example.api.client02.client02Api;
import com.example.demo.client.Client01Api;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenovo on 2018/8/11.
 */
@RestController
public class Client02Controller implements client02Api {



    public String test_c2_get() {
        return "c2_get执行";
    }


    public String test_c2_path(@PathVariable("id") String id) {
        return "c2_path: 执行, 参数："+id;
    }

    public String test_c2_param(String id) {
        return "c2_param: 执行, 参数："+id;
    }
}

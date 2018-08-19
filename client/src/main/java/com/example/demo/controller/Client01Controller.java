package com.example.demo.controller;

import com.example.api.client01.client01Api;
import com.example.demo.Client01;
import com.example.demo.client.Client02Api;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Lenovo on 2018/8/11.
 */
@RestController
public class Client01Controller implements client01Api {


    @Autowired
    Client02Api client02Api;

    public String test_c1_get() {
        return "c1_get执行";
    }


    public String test_c1_path(@PathVariable("id") String id) {

        System.out.println("------------------------------------"+id+"=========================");


        String c2 = client02Api.test_c2_path(id);
        System.out.println("------------------------------------"+c2+"=========================");

        return "c1_path: 执行, 参数："+id + "调用client2：传入参数：" +c2;
    }
}

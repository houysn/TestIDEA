package com.example.api.client03;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Lenovo on 2018/8/19.
 */
public interface client03Api {


    @GetMapping("test_c3_get")
    public String test_c3_get();
}

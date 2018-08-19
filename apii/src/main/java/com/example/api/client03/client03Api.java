package com.example.api.client03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by Lenovo on 2018/8/19.
 */
public interface client03Api {


    @GetMapping("test_c3_get")
    public String test_c3_get();

    @GetMapping("test_c3_post")
    public String test_c3_post();
}

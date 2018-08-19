package com.example.api.client01;

import com.example.api.entity.User;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Lenovo on 2018/8/11.
 */
@Api(value = "用户认证",description = "用户认证接口")
public interface client01Api {
    @GetMapping("test_c1_get")
    public String test_c1_get();

    @GetMapping("test_c1_path/{id}")
    public String test_c1_path(@PathVariable("id") String id);


    @PostMapping("test_c1_post")
    public String test_c1_post(@RequestParam  User user);

}

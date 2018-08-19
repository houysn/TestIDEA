package com.example.api.client02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Lenovo on 2018/8/11.
 */
public interface client02Api {
    @GetMapping("test_c2_get")
    public String test_c2_get();

    @GetMapping("test_c2_path/{id}")
    public String test_c2_path(@PathVariable("id") String id);

    @GetMapping("test_c2_param")
    public String test_c2_param(@RequestParam("id") String id);


    @GetMapping("test_c2_put")
    public String test_c2_put();

    @GetMapping("test_c2_delete")
    public String test_c2_delete();


}

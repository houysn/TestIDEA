package com.example.api.entity;

/**
 * Created by Lenovo on 2018/8/19.
 */
public class User {

    private String username;
    private Integer age;


    public User() {
    }

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

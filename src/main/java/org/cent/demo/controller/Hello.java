package org.cent.demo.controller;

import org.cent.demo.domain.User;
import org.cent.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @class: Hello
 * @description: Hello World
 * @author: cent
 * @create: 2020/3/15
 **/
@RestController
public class Hello {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    String hello() {
        return "Hello World!";
    }

    @GetMapping("/user/{id}")
    User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }
}

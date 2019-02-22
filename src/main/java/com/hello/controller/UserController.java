package com.hello.controller;

import com.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("getName")
    public String getName(){

        userService.getUserName("gesy");



        return "/getName";
    }
}

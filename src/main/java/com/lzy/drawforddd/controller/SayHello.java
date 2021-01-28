package com.lzy.drawforddd.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @version 1.0
 * @className
 * @description
 * @date
 * @e-mail cqulizhiying@foxmail.com
 **/

@CrossOrigin(value = "*", maxAge = 3600)
@RestController
public class SayHello {

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "hello!";
    }

}

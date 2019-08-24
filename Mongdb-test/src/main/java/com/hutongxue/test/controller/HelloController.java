package com.hutongxue.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By Kenson on 2019/8/22.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/guy")
    public String getMessage(){
        System.out.println("=============链接成功=============");
        return "hello";

    }
}

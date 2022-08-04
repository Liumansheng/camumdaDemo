package com.example.camumdademo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: liumansheng
 * @Data:2022/8/4 10:18
 */
@Controller
@RequestMapping
public class HelloController {

    @RequestMapping("/test")
    public String index() {
        System.out.println("hello world");
        return "test";
    }
}

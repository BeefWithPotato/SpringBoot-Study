package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alienware
 * @Description
 * @create 2023/7/3 - 13:20
 */
//@ResponseBody
//@Controller

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello() {
        return "Hello, Spring Boot 3!";
    }
}

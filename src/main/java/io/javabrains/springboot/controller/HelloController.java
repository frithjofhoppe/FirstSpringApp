package io.javabrains.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @RequestMapping("/start")
    public String sayHi()
    {
        System.out.println("start");
        return "Hi";
    }
}

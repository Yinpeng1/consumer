package com.yp.consumerwebapp.controller;

import com.yp.consumerserver.UseHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UseHello hello;

    @GetMapping("hello")
    public void hello(){
        System.out.println(hello.hello());
    }

    @GetMapping("add")
    public void add(){
        hello.add();
    }
}

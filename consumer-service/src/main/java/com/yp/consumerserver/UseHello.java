package com.yp.consumerserver;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yp.apientity.Entity.User;
import com.yp.apiservice.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class UseHello {

    @Reference
    private HelloService helloService;

    public String hello(){
         return helloService.sayHello();
    }

    public void add(){
        helloService.add();
    }

    public User getUser(String name){
        return helloService.get(name);
    }
}

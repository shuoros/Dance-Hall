package com.github.nazaninhmz.danceHall.controller;

import com.github.nazaninhmz.danceHall.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/salam")
    public String sayHello(@RequestParam("id") int id) {
        return helloService.sayHello(id);
    }

}

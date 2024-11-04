package com.genie.Greet_Microservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @Autowired
    Environment environment;
    @GetMapping("/greet")
    public String wish()
    {
        String port = environment.getProperty("server.port");

        return "Good Morning "+port+",";
    }

    @GetMapping("/test")
    public String test()
    {
        return "Test";
    }

}

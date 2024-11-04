package com.genie.Welcome_API.controller;


import com.genie.Welcome_API.repo.GreetApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {


    @Autowired
    GreetApiClient greetApiClient;

    @Autowired
    Environment environment;
    @GetMapping("/welcome")
    public String welcome()
    {
        String res = greetApiClient.invokeGreetApi();
        String port = environment.getProperty("server.port");

        return res+"CodeforSuccess";
    }
}

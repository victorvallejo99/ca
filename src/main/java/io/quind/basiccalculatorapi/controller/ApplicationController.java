package io.quind.basiccalculatorapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @Autowired
    ConfigurableApplicationContext applicationContext;

    @RequestMapping("/")
    public String index() {
        return "Hello Basic Calculator!";
    }

    @RequestMapping("/shutdown")
    public void shutdown() {
        System.out.println("Shutdown"+applicationContext);
        applicationContext.close();
    }

}

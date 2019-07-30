package io.quind.basiccalculatorapi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("io.quind.basiccalculatorapi.controller")
public class BasicCalculatorApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicCalculatorApiApplication.class, args);
    }

}

package io.quind.basiccalculatorapi.controller;

import io.quind.basiccalculatorapi.domain.Calculator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping(value = "/sum",method = RequestMethod.GET)
    public int getSum(@RequestParam int number1,@RequestParam int number2){
        Calculator calculator = new Calculator();
        return calculator.sum(number1,number2);
    }

    @RequestMapping(value = "/subtract",method = RequestMethod.GET)
    public int getSubtraction(@RequestParam int number1,@RequestParam int number2){
        Calculator calculator = new Calculator();
        return calculator.subtact(number1,number2);
    }

    @RequestMapping(value = "/multiply",method = RequestMethod.GET)
    public int getMultiplication(@RequestParam int number1,@RequestParam int number2){
        Calculator calculator = new Calculator();
        return calculator.multiply(number1,number2);
    }

    @RequestMapping(value = "/divide",method = RequestMethod.GET)
    public double getDivision(@RequestParam double number1, @RequestParam double number2){
        Calculator calculator = new Calculator();
        return calculator.divide(number1,number2);
    }
}

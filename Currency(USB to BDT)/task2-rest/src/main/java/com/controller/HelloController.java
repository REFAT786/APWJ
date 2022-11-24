package com.controller;

import com.domain.Currency;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("/sayHello")
    public String greet() {
        return "Hello Java Developers";
    }



    @RequestMapping("/currency/rate")
    public Currency rate() throws IOException {
        Currency currency = new Currency();
        currency.setRate(101.2);
        return currency;
    }

    @RequestMapping("/currency/rate/from/{from}/to/{to}")
    public Currency rate(@PathVariable("from")String from, @PathVariable("to") String to) throws IOException {
        Currency currency = new Currency();
        if(from.equals("USD") && to.equals("BDT")){
            currency.setRate(101.2);
        }
        else if (from.equals("BDT") && to.equals("USD")) {
            currency.setRate(0.12);
        }
        else{
            currency.setRate(0);

        }
        return currency;
    }


}

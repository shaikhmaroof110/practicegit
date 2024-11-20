package com.example.demo.controllers;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    private Logger  logger = LoggerFactory.getLogger(HomeController.class);
    // passing object of class for which we want to generate logs..

    @GetMapping("/home")
    public String  home()
    {
//        System.out.println("Api calling .....");

        return "Home controller called ....";
    }


    @GetMapping("/add")
    public int addition(@RequestParam(defaultValue = "default Value ", required = false) String value)
    {
        int a=1;
        int b=2;
        int sum = a+b;
        logger.error("unable to sum..{}" );
        logger.info("This is API calling ...{}", value);
        logger.debug("Debugging log");
        logger.warn("The Warning Log");
        logger.trace("The addition completed ..{}", value);
        return sum;
    }
}

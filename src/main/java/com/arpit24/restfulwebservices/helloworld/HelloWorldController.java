package com.arpit24.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld() {
        return "Hello World!!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldByBean() {
        return new HelloWorldBean("Choose Bean! OMG");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {

        return messageSource.getMessage("good.morning.message", null,"Default message", locale);
    }
}

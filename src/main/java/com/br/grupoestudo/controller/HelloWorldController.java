package com.br.grupoestudo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class HelloWorldController {

    @GetMapping
    public String sayHelloworld() {
        return "Hello World"
        +"\n"+
        "Arriégua D:";

    }

}

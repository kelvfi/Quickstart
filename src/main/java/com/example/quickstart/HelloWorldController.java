package com.example.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello") //Setzt die URL auf localhost/hello
    public  String helloWorld() {
        return "Hello Devtiro!";
    }

}

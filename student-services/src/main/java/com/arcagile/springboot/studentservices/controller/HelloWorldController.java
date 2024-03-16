package com.arcagile.springboot.studentservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //simple helloWorld URL
    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }

    //pass a parameter to GET URL using path variable
    @GetMapping("/hello/{name}")
    public String helloWithNameAsPathParam(@PathVariable String name) {
        return  "Hello, " +name;
    }

    @GetMapping("/hello")
    public String helloWithNameAsQueryParam(@RequestParam(name = "name") String name, @RequestParam(name = "age") Integer age) {
        return "Hello, " +name + ", and his age is " +age;
    }

}

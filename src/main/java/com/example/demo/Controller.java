package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/api")
    public String api(){
        return "Hello World";
    }

    @GetMapping("/sampleApi")
    public String sampleApi(){

        return "Hello I am deployed in render";
    }

}

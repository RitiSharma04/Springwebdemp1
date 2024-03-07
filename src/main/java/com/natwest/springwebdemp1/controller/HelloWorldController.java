package com.natwest.springwebdemp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    public HelloWorldController() {
    }

    @GetMapping("/displaymsg1")
    public String displayMsg(){
        return " this is spring demo";
    }
    @GetMapping("/wellcome")
    public String diplaymsg2(){
        return
                "wellcome to spring";
    }

}

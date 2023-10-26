package com.springboot.hello.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DelectController {

    @DeleteMapping("/{variable}")
    public String DelectVariable(@PathVariable String variable){
        return variable;

    }
    @DeleteMapping("/request1")
    public String getRequestParam1(@RequestParam String email){
        return " e-mail : " + email;

    }
}

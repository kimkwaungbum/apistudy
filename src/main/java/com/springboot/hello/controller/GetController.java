package com.springboot.hello.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class GetController {

    //http;//localhost:8080/api/v1/get-api/name
    @GetMapping(value = "/name")
    public String getname(){
      return "Flature";
    }

    //http;//localhost;8080/api/v1/get-api/variable1/{String 값}
    @GetMapping("/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        return variable;
    }

    //http;//localhost;8080/api/v1/get-api/variable2/{String 값}
    @GetMapping("/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var){
        return var;
    }

    //http://localhost:8080/api/v1/get-api/request1?name=value1&email=value2&organization=value3
    @GetMapping("/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization){
            return name + " " + email + " " + organization;

    }
    @GetMapping("/request2")
    public String getRequestParam2(
            @RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");

        });
        return sb.toString();
    }

}

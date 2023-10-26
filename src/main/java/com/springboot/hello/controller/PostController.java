package com.springboot.hello.controller;

import com.springboot.hello.dto.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class PostController {
  @RequestMapping(value = "/domain" , method = RequestMethod.POST)
    public String postExample(){
        return "Hello Post API";

    }

    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String , Object> postData){
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n" );
        });

        return sb.toString();

    }
    @PostMapping("/member2")
    public String postMemberDto(@RequestBody MemberDto memberDto){

        return memberDto.toString();
    }
}

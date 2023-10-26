package com.springboot.hello.controller;

import com.springboot.hello.dto.MemberDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class PutController {


    @PutMapping("/member")
    public String postMember(@RequestBody Map<String , Object> putData){
        StringBuilder sb = new StringBuilder();


        putData.entrySet().forEach(map->{
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PutMapping("/member1")
    public String postMemberDto1(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }
    @PutMapping("/member2")
    public MemberDto postMemberDto2(@RequestBody MemberDto memberDto){
        return memberDto;
    }
}

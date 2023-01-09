package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @RequestMapping(value = "/domain",method = RequestMethod.POST)
    public String postExample(){
        return "Hello Post API";
    }

    @PostMapping(value = "member")
    public String postMemeber(@RequestBody Map<String,String> postData){
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map->{
            sb.append(map.getKey() + " : "+map.getValue()+"\n");
        });

        return sb.toString();
    }

    // DTO 사용하기
    @PostMapping(value = "/member2")
    public String postMemberDto(@RequestBody UserDTO userDto){
        return userDto.toString();
    }
}

package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    @PutMapping(value = "/member")
    public String postMember(@RequestBody Map<String,String> putData){
        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach(map->{
            sb.append(map.getKey() + " : " + map.getValue());
        });
        return sb.toString();
    }

    @PutMapping(value = "/member2")
    public String postMember2(@RequestBody UserDTO userDto){
        return userDto.toString();
    }

    @PutMapping(value = "/member3")
    public UserDTO postMember3(@RequestBody UserDTO userDto){
        return userDto;
    }

    @PutMapping(value = "/member4")
    public ResponseEntity<UserDTO> postMemberDto3(@RequestBody UserDTO userDto){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(userDto);
    }
}

package com.wit.unifesta.controller;

import com.wit.unifesta.data.entity.User;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RESTController {

    // GET: SELECT
//    @GetMapping("/unifesta")
//    public User httpGet() {
//        User findUser = User.builder()
//                .id(1L)
//                .username("taeheon")
//                .password("1234")
//                .email("tae77777@naver.com")
//                .build();
//        return findUser;
//    }

    // POST: INSERT
    @PostMapping("/unifesta")
    public String httpPost(@RequestBody User user) {
        return "POST 요청 처리 입력값 : " + user.toString();
    }

    // PUT: UPDATE
    @PutMapping("/unifesta")
    public String httpPut(@RequestBody User user) {
        return "PUT 요청 처리 입력값 : " + user.toString();
    }

    // DELETE: DELETE
    @DeleteMapping("/unifesta")
    public String httpDelete(@RequestParam int id) { //unifesta?id=1zz
        return "DELETE 요청 처리 입력값 : " + id;
    }

}

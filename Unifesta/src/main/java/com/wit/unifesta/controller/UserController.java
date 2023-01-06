package com.wit.unifesta.controller;

import com.wit.unifesta.data.entity.User;
import com.wit.unifesta.exception.UnifestaException;
import com.wit.unifesta.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/unifesta")
    public @ResponseBody String getUser() {
        return "Success";
    }

    @GetMapping("/user/list")
    public @ResponseBody List<User> getUserList() {
        return userRepository.findAll();
    }

    @GetMapping("/user/page/{page}")
    public @ResponseBody Page<User> getUserListPaging(@PathVariable int page){
        // page에 해당하는 2개의 데이터 조회
        // id와 username 내림차순 정렬
        // page는 0부터 시작
        Pageable pageable = PageRequest.of(page,2, Sort.Direction.DESC, "id","username");

        return userRepository.findAll(pageable);
    }

    @PostMapping("/user")
    public @ResponseBody String insertUser(@RequestBody User user) {
        userRepository.save(user);
        return user.getUsername() + " 회원가입 성공";
    }

    @GetMapping("/user/get/{id}")
    public @ResponseBody User getUser(@PathVariable Long id) throws Throwable {
        // 특정 id(회원 번호)에 해당하는 User 객체 반환
        // 검색된 회원이 없을 경우 예외 반환
        User findUser = userRepository.findById(id).orElseThrow(() -> {
            return new UnifestaException(id + "번 회원이 없습니다.");
        });
        return findUser;
    }

    @Transactional
    @PutMapping("/user")
    public @ResponseBody String updateUser(@RequestBody User user) {
        User findUser = userRepository.findById(user.getId()).orElseThrow(()->{
            return new UnifestaException(user.getId() + "번 회원이 없습니다.");
        });
        findUser.setUsername(user.getUsername());
        findUser.setPassword(user.getPassword());
        findUser.setEmail(user.getEmail());

        // userRepository.save(findUser);
        return "회원 수정 성공";
    }

    @DeleteMapping("/user/{id}")
    public @ResponseBody String deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return "회원 삭제 성공";
    }
}

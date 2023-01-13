package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.ChangeUserNameDTO;
import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import com.wit.unifesta.data.entity.User;
import com.wit.unifesta.exception.UnifestaException;
import com.wit.unifesta.data.repository.UserRepository;
import com.wit.unifesta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<UserResponseDTO> getUser(Long id){
        UserResponseDTO userResponseDTO = userService.getUser(id);

        return ResponseEntity.status(HttpStatus.OK).body(userResponseDTO);
    }

    @PostMapping()
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserDTO userDTO){
        UserResponseDTO userResponseDTO = userService.saveUser(userDTO);

        return ResponseEntity.status(HttpStatus.OK).body(userResponseDTO);
    }

    @PutMapping()
    public ResponseEntity<UserResponseDTO> changeUserName(
            @RequestBody ChangeUserNameDTO changeUserNameDto) throws Exception{
        UserResponseDTO userResponseDTO = userService.changeUserName(
                changeUserNameDto.getId(),
                changeUserNameDto.getName());
        return ResponseEntity.status(HttpStatus.OK).body(userResponseDTO);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteUser(Long id) throws Exception{
        userService.deleteUser(id);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }
}

package com.wit.unifesta.controller;

import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://unifesta-frontend.vercel.app/")
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping() // id로 유저 조회
    public ResponseEntity<UserResponseDTO> getUser(Long id){
        UserResponseDTO userResponseDTO = userService.getUser(id);

        return ResponseEntity.status(HttpStatus.OK).body(userResponseDTO);
    }

    @PostMapping() // 유저 추가
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserDTO userDTO){
        UserResponseDTO userResponseDTO = userService.saveUser(userDTO);

        return ResponseEntity.status(HttpStatus.OK).body(userResponseDTO);
    }



    @PutMapping()// 유저 변경
    public ResponseEntity<UserResponseDTO> updateUser(@RequestBody UserDTO UserDTO) throws Exception{
        UserResponseDTO userResponseDTO = userService.updateUser(new UserDTO());
        return ResponseEntity.status(HttpStatus.OK).body(userResponseDTO);
    }

    @DeleteMapping() // 유저 삭제
    public ResponseEntity<String> deleteUser(Long id) throws Exception{
        userService.deleteUser(id);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");
    }

    @GetMapping("/schoolList") // 찜한 학교 목록
    public ResponseEntity<List<SchoolDTO>> getAllSchoolList(Long id){
        List<SchoolDTO> allSchools = userService.getAllSchools(id);
        return ResponseEntity.status(HttpStatus.OK).body(allSchools);
    }

    @PostMapping("/addSchool") // 학교 찜하기 클릭
    public ResponseEntity<String> addSchool(@RequestParam String email, @RequestParam String schoolName){
        userService.addSchool(email,schoolName);
        return ResponseEntity.status(HttpStatus.OK).body("학교 추가되었습니다.");
    }

    @PostMapping("/deleteSchool")
    public ResponseEntity<String> deleteSchool(@RequestParam String username, @RequestParam String schoolName){
        userService.deleteSchool(username,schoolName);
        return ResponseEntity.status(HttpStatus.OK).body("학교 삭제되었습니다.");
    }



}

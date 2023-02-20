package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dto.SchoolDTO;
import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import com.wit.unifesta.data.entity.School;
import com.wit.unifesta.data.entity.User;
import com.wit.unifesta.data.entity.UserSchool;
import com.wit.unifesta.data.repository.SchoolRepository;
import com.wit.unifesta.data.repository.UserRepository;
import com.wit.unifesta.data.repository.UserSchoolRepository;
import com.wit.unifesta.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;
    private final UserSchoolRepository userSchoolRepository;
    private final SchoolRepository schoolRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserSchoolRepository userSchoolRepository, SchoolRepository schoolRepository){
        this.userRepository = userRepository;
        this.userSchoolRepository = userSchoolRepository;
        this.schoolRepository = schoolRepository;
    }

    @Override
    public UserResponseDTO getUser(Long id) {
        LOGGER.info("[getUser] input id : {}",id);
        User user = userRepository.getReferenceById(id);

        LOGGER.info("[getUser] user id : {}, name : {}, email : {} ", user.getId(), user.getUsername(), user.getEmail());
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(user.getId());
        userResponseDTO.setUsername(user.getUsername());
        userResponseDTO.setPassword(user.getPassword());
        userResponseDTO.setEmail(user.getEmail());

        return userResponseDTO;
    }

    @Override
    @Transactional
    public UserResponseDTO saveUser(UserDTO userDTO) {
        LOGGER.info("[saveUser] userDTO : {}", userDTO.toString());
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        User savedUser = userRepository.save(user);
        LOGGER.info("[saveUser] savedUser : {}", savedUser.toString());
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(savedUser.getId());
        userResponseDTO.setUsername(savedUser.getUsername());
        userResponseDTO.setEmail(savedUser.getEmail());
        userResponseDTO.setPassword(savedUser.getPassword());

        return userResponseDTO;
    }

    @Override
    @Transactional
    public UserResponseDTO changeUserName(Long id, String username) throws Exception {
        User changedUser = userRepository.getReferenceById(id);

        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(changedUser.getId());
        userResponseDTO.setEmail(changedUser.getEmail());
        userResponseDTO.setPassword(changedUser.getPassword());
        userResponseDTO.setUsername(changedUser.getUsername());

        return userResponseDTO;
    }

    @Override
    @Transactional
    public UserResponseDTO updateUser(UserDTO userDTO) {
        User changeUser = userRepository.getReferenceById(userDTO.getId());
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setUsername(userDTO.getUsername());
        userResponseDTO.setEmail(userDTO.getEmail());
        userResponseDTO.setPassword(userDTO.getPassword());
        return userResponseDTO;
    }

    @Override
    @Transactional
    public void deleteUser(Long id) throws Exception {
        User user = userRepository.getReferenceById(id);
        userRepository.delete(user);
    }

    @Override
    public void addSchool(Long id, String schoolname) {
        Optional<School> school = schoolRepository.findBySchoolName(schoolname);
        UserSchool userSchool = new UserSchool();
        userSchool.setUser(userRepository.getReferenceById(id)); // 유저 얻기
        userSchool.setSchool(schoolRepository.getReferenceById(school.get().getId()));
        userSchoolRepository.save(userSchool);
    }

    @Override
    public void deleteSchool(Long id, String schoolname) {
        List<UserSchool> userSchools = userSchoolRepository.findByUser_Id(id);
        Long findUserSchoolId = 1L;
        for(int i=0;i<userSchools.size();i++){
            String tempschoolname = userSchools.get(i).getSchool().getSchoolName();
            if(tempschoolname==schoolname){
                findUserSchoolId = userSchools.get(i).getId();
                break;
            }
        }
        Optional<UserSchool> userSchool = userSchoolRepository.findById(findUserSchoolId);
        userSchoolRepository.delete(userSchool.get());

    }

    @Override
    public List<SchoolDTO> getAllSchools(Long id) {
        List<UserSchool> userSchools = userSchoolRepository.findByUser_Id(id);
        List<SchoolDTO> schoolDTOS = new ArrayList<>();
        for(int i=0;i<userSchools.size();i++){
            School school = userSchools.get(i).getSchool();
            SchoolDTO schoolDTO = new SchoolDTO(school.getId(), school.getSchoolName(), school.getFestivalDescription());
            schoolDTOS.add(schoolDTO);
        }
        return schoolDTOS;
    }
}

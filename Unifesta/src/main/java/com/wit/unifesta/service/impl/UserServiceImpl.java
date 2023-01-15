package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import com.wit.unifesta.data.entity.User;
import com.wit.unifesta.data.repository.UserRepository;
import com.wit.unifesta.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    private final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
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
    public void deleteUser(Long id) throws Exception {
        User user = userRepository.getReferenceById(id);
        userRepository.delete(user);
    }
}

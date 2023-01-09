package com.wit.unifesta.service.impl;

import com.wit.unifesta.data.dao.UserDAO;
import com.wit.unifesta.data.dto.UserDTO;
import com.wit.unifesta.data.dto.UserResponseDTO;
import com.wit.unifesta.data.entity.User;
import com.wit.unifesta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public UserResponseDTO getUser(Long id) {
        User user = userDAO.selectUser(id);

        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(user.getId());
        userResponseDTO.setPassword(user.getPassword());
        userResponseDTO.setEmail(user.getEmail());

        return userResponseDTO;
    }

    @Override
    public UserResponseDTO saveUser(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setUpdatedAt(LocalDateTime.now());

        User savedUser = userDAO.insertUser(user);
        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(savedUser.getId());
        userResponseDTO.setUsername(savedUser.getUsername());
        userResponseDTO.setEmail(savedUser.getEmail());
        userResponseDTO.setPassword(savedUser.getPassword());

        return userResponseDTO;
    }

    @Override
    public UserResponseDTO changeUserName(Long id, String username) throws Exception {
        User changedUser = userDAO.updateUserName(id,username);

        UserResponseDTO userResponseDTO = new UserResponseDTO();
        userResponseDTO.setId(changedUser.getId());
        userResponseDTO.setEmail(changedUser.getEmail());
        userResponseDTO.setPassword(changedUser.getPassword());
        userResponseDTO.setUsername(changedUser.getUsername());

        return userResponseDTO;
    }

    @Override
    public void deleteUser(Long id) throws Exception {
        userDAO.deleteUser(id);
    }
}

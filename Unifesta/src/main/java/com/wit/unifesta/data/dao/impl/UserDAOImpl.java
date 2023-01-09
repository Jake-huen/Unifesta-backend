package com.wit.unifesta.data.dao.impl;

import com.wit.unifesta.data.dao.UserDAO;
import com.wit.unifesta.data.entity.User;
import com.wit.unifesta.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class UserDAOImpl implements UserDAO {

    private final UserRepository userRepository;

    @Autowired
    public UserDAOImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User selectUser(Long number) {
        User selectedUser = userRepository.getReferenceById(number);

        return selectedUser;
    }

    @Override
    public User insertUser(User user) {
        User savedUser = userRepository.save(user);

        return savedUser;
    }

    @Override
    public User updateUserName(Long number,String username) throws Exception {
        Optional<User> selectedUser = userRepository.findById(number);
        User updatedUser;
        if(selectedUser.isPresent()){
            User user = selectedUser.get();
            user.setUsername(username);
            user.setUpdatedAt(LocalDateTime.now());

            updatedUser = userRepository.save(user);
        } else{
            throw new Exception();
        }
        return updatedUser;
    }

    @Override
    public void deleteUser(Long number) throws Exception {

    }
}

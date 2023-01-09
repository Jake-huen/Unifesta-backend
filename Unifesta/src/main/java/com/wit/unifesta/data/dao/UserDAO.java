package com.wit.unifesta.data.dao;

import com.wit.unifesta.data.entity.User;

public interface UserDAO {

    User selectUser(Long number);

    User insertUser(User user);

    User updateUserName(Long number,String username) throws Exception;

    void deleteUser(Long number) throws Exception;
}

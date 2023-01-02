package com.wit.unifesta.persistence;

import com.wit.unifesta.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserDAOTest {

    @Autowired
    private UserDAO userDAO;

    @Test
    void getUserListTest() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("test123");
        user.setEmail("tae77777@naver.com");

        int before = userDAO.getUserList().size();
        userDAO.insertUser(user);
        int after = userDAO.getUserList().size();

        assertEquals(before+1, after);
    }
}
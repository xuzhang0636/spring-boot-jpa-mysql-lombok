package com.xuzhang.springbootjpamysqllombok.repository;

import com.xuzhang.springbootjpamysqllombok.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUserRepository {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void smokeTest() {
        Assertions.assertNotNull(userRepository);
    }

    @Test
    public void insertTest() {
        User user = new User();
        user.setPassword("robert");
        user.setPhone("134xxxxxxxx");
        user.setUsername("robert");
        userRepository.save(user);

    }

    @Test
    public void selectTest() {
        Assertions.assertEquals(2, userRepository.findAll().size());
    }
}

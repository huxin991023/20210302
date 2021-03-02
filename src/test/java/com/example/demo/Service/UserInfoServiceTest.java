package com.example.demo.Service;

import com.example.demo.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserInfoServiceTest {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    void getUserDto() {
        UserDTO userDTO = userInfoService.getUserDto();
        System.out.println(userDTO);
    }
}
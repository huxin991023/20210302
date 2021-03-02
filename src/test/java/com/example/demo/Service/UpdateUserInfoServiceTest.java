package com.example.demo.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UpdateUserInfoServiceTest {

    @Autowired
    private UpdateUserInfoService updateUserInfoService;
    @Test
    void updateUserDto() throws SQLException {
        System.out.println(updateUserInfoService.updateUserDto());
    }
}
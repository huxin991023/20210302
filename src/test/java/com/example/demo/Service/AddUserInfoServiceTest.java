package com.example.demo.Service;

import com.example.demo.Db.DbUtils;
import com.example.demo.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AddUserInfoServiceTest {

    @Autowired
    private AddUserInfoService addUserInfoService;


    @Test
    void addUserDto() throws SQLException {
//        UserDTO userDTO = addUserInfoService.addUserDto();
//        System.out.println(userDTO);
    }
}
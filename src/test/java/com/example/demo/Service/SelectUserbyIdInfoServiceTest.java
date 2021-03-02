package com.example.demo.Service;

import com.example.demo.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class SelectUserbyIdInfoServiceTest {

    @Autowired
    private SelectUserbyIdInfoService selectUserbyIdInfoService;

    @Test
    void updateUserDto() throws SQLException {
        UserDTO userDTO = selectUserbyIdInfoService.selectUserDto();
        System.out.println(userDTO.getUserName());
    }
}
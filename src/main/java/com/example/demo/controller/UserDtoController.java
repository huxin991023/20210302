package com.example.demo.controller;

import com.example.demo.Service.*;
import com.example.demo.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
public class UserDtoController {
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private AddUserInfoService addUserInfoService;

    @Autowired
    private SelectUserbyIdInfoService selectUserbyIdInfoService;

    @Autowired
    private SelectAllUserInfoService selectAllUserInfoService;

    @Autowired
    private DeleteUserInfoService deleteUserInfoService;

    @Autowired
    private UpdateUserInfoService updateUserInfoService;

    private Logger log = LoggerFactory.getLogger(UserDtoController.class);

    @GetMapping("Username")
    public UserInfoService Username(){
        log.info("UserDtoController-Username");
        return userInfoService;
    }

    @GetMapping("addUser")
    public UserDTO addUser() throws SQLException {
        log.info("UserDtoController-addUserInfoService,添加用户");
        return addUserInfoService.addUserDto();
    }

    @GetMapping("selectUser")
    public UserDTO selectUser() throws SQLException {
        log.info("UserDtoController-selectUserbyIdInfoService,根据id查找用户");
        return selectUserbyIdInfoService.selectUserDto();
    }


    @GetMapping("selectAllUser")
    public List selectAllUser() throws SQLException {
        log.info("UserDtoController-selectAllUserInfoService，查找全部用户");
        return selectAllUserInfoService.selectAllUserDto();
    }

    @GetMapping("deleteUser")
    public boolean deleteUser() throws SQLException {
        log.info("UserDtoController-deleteUserInfoService，删除用户");
        return deleteUserInfoService.deleteUserDto();
    }

    @GetMapping("updateUser")
    public UserDTO updateUser() throws SQLException {
        log.info("UserDtoController-updateUserInfoService，修改用户");
        return updateUserInfoService.updateUserDto();
    }
}

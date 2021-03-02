package com.example.demo.Service;

import com.example.demo.Db.DbUtils;
import com.example.demo.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class AddUserInfoService {

    private Logger log = LoggerFactory.getLogger(AddUserInfoService.class);

    public UserDTO addUserDto() throws SQLException {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName("小飞哥");
        userDTO.setId("3");

        Connection conn = DbUtils.open();
        PreparedStatement pst = conn.prepareStatement("insert into User value(?,?)");
        pst.setString(1,userDTO.getId());
        pst.setString(2,userDTO.getUserName());
        pst.execute();

        log.info("AddUserInfoService-addUserDto");
        return userDTO;
    }
}

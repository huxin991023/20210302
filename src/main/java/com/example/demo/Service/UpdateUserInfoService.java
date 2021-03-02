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
public class UpdateUserInfoService {
    private Logger log = LoggerFactory.getLogger(AddUserInfoService.class);

    public  UserDTO updateUserDto() throws SQLException {
        UserDTO userDTO = new UserDTO();
        userDTO.setId("1");
        userDTO.setUserName("xin");
        Connection conn = DbUtils.open();
        PreparedStatement pst = conn.prepareStatement("update User set userName=? where id=?");
        pst.setString(2,userDTO.getId());
        pst.setString(1,userDTO.getUserName());
        pst.execute();
        log.info("UpdateUserInfoService-updateUserDto");
        return userDTO;
    }

}

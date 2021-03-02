package com.example.demo.Service;

import com.example.demo.Db.DbUtils;
import com.example.demo.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class SelectUserbyIdInfoService {
    private Logger log = LoggerFactory.getLogger(AddUserInfoService.class);

    public  UserDTO selectUserDto() throws SQLException {
        UserDTO userDTO = new UserDTO();
        userDTO.setId("2");
        Connection conn = DbUtils.open();
        PreparedStatement pst = conn.prepareStatement("select userName from User where id = ?");
        pst.setString(1,userDTO.getId());

        ResultSet rs = pst.executeQuery();
        String userName=null;
        if(rs.next()){
            userName = rs.getString("userName");
        }
        userDTO.setUserName(userName);


        log.info("SelectUserbyIdInfoService-selectUserDto");
        return userDTO;
    }


}

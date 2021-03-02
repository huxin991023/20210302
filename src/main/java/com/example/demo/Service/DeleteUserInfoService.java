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
public class DeleteUserInfoService {
    private Logger log = LoggerFactory.getLogger(AddUserInfoService.class);

    public  boolean deleteUserDto() throws SQLException {
        UserDTO userDTO = new UserDTO();
        userDTO.setId("1");
        Connection conn = DbUtils.open();
        PreparedStatement pst = conn.prepareStatement("delete from User where id = ?");
        pst.setString(1,userDTO.getId());

        log.info("DeleteUserInfoService-deleteUserDto");

        boolean a = pst.execute();
        if(!a){
            return true;
        }else{
            return false;
        }

    }

}

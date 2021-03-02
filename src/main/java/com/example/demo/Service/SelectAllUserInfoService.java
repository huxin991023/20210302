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
import java.util.ArrayList;
import java.util.List;

@Service
public class SelectAllUserInfoService {
    private Logger log = LoggerFactory.getLogger(AddUserInfoService.class);

    public  List selectAllUserDto() throws SQLException {
        ArrayList<UserDTO> arrayList = new ArrayList<UserDTO>();
        Connection conn = DbUtils.open();
        PreparedStatement pst = conn.prepareStatement("select id,userName from User");

        ResultSet rs = pst.executeQuery();
        String userName=null;
        while (rs.next()){
            UserDTO userDTO = new UserDTO();
            userDTO.setId(rs.getString("id")) ;
           userDTO.setUserName(rs.getString("userName"));
           arrayList.add(userDTO);
        }


        log.info("SelectAllUserInfoService-selectAllUserDto");
        return arrayList;
    }

}

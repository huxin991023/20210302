package com.example.demo.Service;

import com.example.demo.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    private Logger log = LoggerFactory.getLogger(UserInfoService.class);

    public UserDTO getUserDto(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName("小飞哥");
        userDTO.setId("1");
        log.info("UserInfoService-getUserDto");
        return userDTO;
    }
}

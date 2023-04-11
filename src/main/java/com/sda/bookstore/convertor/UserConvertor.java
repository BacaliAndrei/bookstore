package com.sda.bookstore.convertor;

import com.sda.bookstore.dto.UserCreateDTO;
import com.sda.bookstore.entity.UserEntity;

public class UserConvertor {

    public static UserEntity convertToUserEntity(UserCreateDTO userCreateDTO){
        UserEntity user=new UserEntity();
        user.setEmail(userCreateDTO.getEmail());
        user.setUserName(userCreateDTO.getUserName());
        return user;
    }

}

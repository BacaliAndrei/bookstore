package com.sda.bookstore.service;

import com.sda.bookstore.dto.UserCreateDTO;
import com.sda.bookstore.entity.UserEntity;

import javax.swing.text.html.parser.Entity;

public interface UserService {
    public UserEntity createUser (UserCreateDTO userCreateDTO);

    public UserEntity getUseByUserName(String user);
}

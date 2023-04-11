package com.sda.bookstore.service.impl;


import com.sda.bookstore.convertor.UserConvertor;
import com.sda.bookstore.dto.UserCreateDTO;
import com.sda.bookstore.entity.UserEntity;
import com.sda.bookstore.repository.UserRepository;
import com.sda.bookstore.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity createUser(UserCreateDTO userCreateDTO) {
        UserEntity userEntity= UserConvertor.convertToUserEntity(userCreateDTO);
        UserEntity user=userRepository.save(userEntity);

        return user;
    }

    @Override
    public UserEntity getUseByUserName(String userName) {
        UserEntity userEntity=userRepository.findByUserName(userName).orElseThrow();
        return userEntity;


    }
}

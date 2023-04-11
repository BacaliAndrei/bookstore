package com.sda.bookstore.controller;

import com.sda.bookstore.dto.UserCreateDTO;
import com.sda.bookstore.entity.UserEntity;
import com.sda.bookstore.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody @Valid UserCreateDTO userCreateDTO) {
        UserEntity user = userService.createUser(userCreateDTO);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/get")
    public ResponseEntity<UserEntity> getUser(@RequestParam String userName) {
        UserEntity user = userService.getUseByUserName(userName);
        return ResponseEntity.ok(user);
    }
}

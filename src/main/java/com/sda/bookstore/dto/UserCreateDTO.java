package com.sda.bookstore.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.UniqueElements;

public class UserCreateDTO {
   @Email
   @NotBlank(message = "Email is a mandatory field to fill! ")
    private String email;
   @NotBlank(message = "Chose your username!")
    private String userName;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserCreateDTO(String email, String userName) {
        this.email = email;
        this.userName = userName;
    }
}

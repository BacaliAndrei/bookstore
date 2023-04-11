package com.sda.bookstore.dto;

import com.sda.bookstore.entity.BookEntity;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AuthorsCreateDTO {
    @NotBlank(message = "name is a required field to fill")
    private String name;
    private Integer age;

    private Integer numberOfBooksWritten;
    @Email
    @NotBlank(message = "Email is a mandatory field to fill")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumberOfBooksWritten() {
        return numberOfBooksWritten;
    }

    public void setNumberOfBooksWritten(Integer numberOfBooksWritten) {
        this.numberOfBooksWritten = numberOfBooksWritten;
    }

}

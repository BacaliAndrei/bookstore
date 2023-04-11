package com.sda.bookstore.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class OrderCreateDTO {
    @NotBlank(message = "Please tell us what do you want to order")
    private String description;

    public OrderCreateDTO() {
    }

    public OrderCreateDTO(String description) {
        this.description = description;

    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

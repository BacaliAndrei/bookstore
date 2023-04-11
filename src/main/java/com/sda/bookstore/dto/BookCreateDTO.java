package com.sda.bookstore.dto;

import jakarta.persistence.Column;

public class BookCreateDTO {

    private Integer price;
    private Integer numberOfChapters;

    private String bookTitle;

    public BookCreateDTO(Integer price, Integer numberOfChapters, String bookTitle) {
        this.price = price;
        this.numberOfChapters = numberOfChapters;
        this.bookTitle = bookTitle;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNumberOfChapters() {
        return numberOfChapters;
    }

    public void setNumberOfChapters(Integer numberOfChapters) {
        this.numberOfChapters = numberOfChapters;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}

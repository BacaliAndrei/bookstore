package com.sda.bookstore.service;

import com.sda.bookstore.dto.BookCreateDTO;
import com.sda.bookstore.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface BookService {

    BookEntity createBook(BookCreateDTO bookCreateDTO);
    BookEntity findByBookTitle (String bookTitle);
}

package com.sda.bookstore.service.impl;

import com.sda.bookstore.convertor.BookConvertor;
import com.sda.bookstore.dto.BookCreateDTO;
import com.sda.bookstore.dto.UserCreateDTO;
import com.sda.bookstore.entity.BookEntity;
import com.sda.bookstore.repository.BookRepository;
import com.sda.bookstore.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(BookCreateDTO bookCreateDTO) {
        BookEntity bookEntity= BookConvertor.convertToBookEntity(bookCreateDTO);
        BookEntity book=bookRepository.save(bookEntity);
        return book;
    }

    @Override
    public BookEntity findByBookTitle(String bookTitle) {
        BookEntity book=bookRepository.findByBookTitle(bookTitle).orElseThrow();
        return book;

    }


}


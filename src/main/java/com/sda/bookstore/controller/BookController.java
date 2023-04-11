package com.sda.bookstore.controller;

import com.sda.bookstore.dto.BookCreateDTO;
import com.sda.bookstore.entity.BookEntity;
import com.sda.bookstore.service.BookService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/create")
    public ResponseEntity<BookEntity> createBook(@RequestBody @Valid BookCreateDTO bookCreateDTO) {

        BookEntity book = bookService.createBook(bookCreateDTO);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/getBook")
    public ResponseEntity<BookEntity> findByBookTitle(@RequestParam String bookTitle) {
        BookEntity book = bookService.findByBookTitle(bookTitle);
        return ResponseEntity.ok(book);
    }

}

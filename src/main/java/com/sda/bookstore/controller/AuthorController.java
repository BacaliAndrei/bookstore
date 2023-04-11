package com.sda.bookstore.controller;

import com.sda.bookstore.dto.AuthorInfoDTO;
import com.sda.bookstore.dto.AuthorsCreateDTO;
import com.sda.bookstore.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/create")
    public ResponseEntity<AuthorInfoDTO> createAuthor(@RequestBody @Valid AuthorsCreateDTO authorsCreateDTO) {
        AuthorInfoDTO authorInfoDTO = authorService.createAuthor(authorsCreateDTO);

        return ResponseEntity.ok(authorInfoDTO);
    }

    @GetMapping("/findAuthorByName")
    public ResponseEntity<AuthorInfoDTO> findAuthorByName(@RequestParam String name) {
        AuthorInfoDTO authorInfoDTO = authorService.findAuthorByName(name);
        return ResponseEntity.ok(authorInfoDTO);
    }
}

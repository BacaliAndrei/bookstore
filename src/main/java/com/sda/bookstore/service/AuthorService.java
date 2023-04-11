package com.sda.bookstore.service;

import com.sda.bookstore.dto.AuthorInfoDTO;
import com.sda.bookstore.dto.AuthorsCreateDTO;

public interface AuthorService {
    public AuthorInfoDTO createAuthor(AuthorsCreateDTO authorsCreateDTO);

    AuthorInfoDTO findAuthorByName(String name);
}

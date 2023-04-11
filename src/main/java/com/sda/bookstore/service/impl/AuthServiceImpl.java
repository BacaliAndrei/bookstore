package com.sda.bookstore.service.impl;

import com.sda.bookstore.convertor.AuthorConvertor;
import com.sda.bookstore.dto.AuthorInfoDTO;
import com.sda.bookstore.dto.AuthorsCreateDTO;
import com.sda.bookstore.entity.AuthorsEntity;
import com.sda.bookstore.exception.AuthorException;
import com.sda.bookstore.repository.AuthorRepository;
import com.sda.bookstore.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorInfoDTO createAuthor(AuthorsCreateDTO authorsCreateDTO) {
        AuthorsEntity authorsEntity = AuthorConvertor.convertAuthorEntity(authorsCreateDTO);
        AuthorsEntity response = authorRepository.save(authorsEntity);
        AuthorInfoDTO authorInfoDTO = AuthorConvertor.convertAuthorInfoDTO(response);

        return authorInfoDTO;
    }

    @Override
    public AuthorInfoDTO findAuthorByName(String name) {
        AuthorsEntity authorsEntity = authorRepository.findByName(name).orElseThrow(() -> new AuthorException("Author isn't registered!"));
        return AuthorConvertor.convertAuthorInfoDTO(authorsEntity);
    }

}

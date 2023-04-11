package com.sda.bookstore.convertor;

import com.sda.bookstore.dto.AuthorInfoDTO;
import com.sda.bookstore.dto.AuthorsCreateDTO;
import com.sda.bookstore.entity.AuthorsEntity;

public class AuthorConvertor {
    public static AuthorsEntity convertAuthorEntity(AuthorsCreateDTO authorsCreateDTO) {

        AuthorsEntity authorsEntity = new AuthorsEntity();
        authorsEntity.setAge(authorsCreateDTO.getAge());
        authorsEntity.setEmail(authorsCreateDTO.getEmail());
        authorsEntity.setName(authorsCreateDTO.getName());


        return authorsEntity;
    }
    public static AuthorInfoDTO convertAuthorInfoDTO(AuthorsEntity authorsEntity){

        AuthorInfoDTO authorInfoDTO=new AuthorInfoDTO();
        authorInfoDTO.setAge(authorsEntity.getAge());
        authorInfoDTO.setEmail(authorsEntity.getEmail());
        authorInfoDTO.setName(authorsEntity.getName());
        authorInfoDTO.setId(authorsEntity.getId());

        return authorInfoDTO;
    }
}

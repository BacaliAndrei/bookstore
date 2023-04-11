package com.sda.bookstore.repository;

import com.sda.bookstore.entity.AuthorsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthorRepository extends CrudRepository<AuthorsEntity , String> {

    Optional<AuthorsEntity> findByName(String name);
}

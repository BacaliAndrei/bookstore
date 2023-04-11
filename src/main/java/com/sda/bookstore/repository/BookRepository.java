package com.sda.bookstore.repository;

import com.sda.bookstore.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface BookRepository extends CrudRepository<BookEntity,Integer> {
    Optional<BookEntity> findByBookTitle(String bookTitle);
}

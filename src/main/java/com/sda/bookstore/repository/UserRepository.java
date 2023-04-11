package com.sda.bookstore.repository;

import com.sda.bookstore.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Integer> {

    Optional<UserEntity> findByUserName(String userName);
}

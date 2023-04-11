package com.sda.bookstore.repository;

import com.sda.bookstore.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {

}

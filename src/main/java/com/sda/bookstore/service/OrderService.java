package com.sda.bookstore.service;

import com.sda.bookstore.dto.OrderCreateDTO;
import com.sda.bookstore.entity.OrderEntity;


public interface OrderService {

    OrderEntity createOrder(OrderCreateDTO orderCreateDTO);

    OrderCreateDTO getOrder(Integer id);
}

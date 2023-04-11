package com.sda.bookstore.service.impl;

import com.sda.bookstore.convertor.OrderConverter;
import com.sda.bookstore.dto.OrderCreateDTO;
import com.sda.bookstore.entity.OrderEntity;
import com.sda.bookstore.repository.OrderRepository;
import com.sda.bookstore.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderEntity createOrder(OrderCreateDTO orderCreateDTO) {
        OrderEntity orderEntity= OrderConverter.convertToOrderEntity(orderCreateDTO);
        OrderEntity order=orderRepository.save(orderEntity);
        return order;
    }
    @Override
    public OrderCreateDTO getOrder(Integer id){
        OrderEntity order=orderRepository.findById(id).orElseThrow();
        return new OrderCreateDTO(order.getDescription()) ;
    }
}

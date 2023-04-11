package com.sda.bookstore.convertor;

import com.sda.bookstore.dto.OrderCreateDTO;
import com.sda.bookstore.entity.OrderEntity;


public class OrderConverter {

    public static OrderEntity convertToOrderEntity(OrderCreateDTO orderCreateDTO){
        OrderEntity order=new OrderEntity();
        order.setDescription(orderCreateDTO.getDescription());

        return order;
    }
}

package com.sda.bookstore.controller;

import com.sda.bookstore.dto.OrderCreateDTO;
import com.sda.bookstore.entity.OrderEntity;
import com.sda.bookstore.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ControllerAdvice
@RequestMapping("/api/v1/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public ResponseEntity<OrderEntity> createOrder(@RequestBody@Valid OrderCreateDTO orderCreateDTO) {
        OrderEntity order = orderService.createOrder(orderCreateDTO);
        return ResponseEntity.ok(order);
    }
    @GetMapping("/getOrder")
    public ResponseEntity<OrderCreateDTO> getOrderByOrderNumber(@RequestParam("id") Integer id){
        OrderCreateDTO order=orderService.getOrder(id);
        return ResponseEntity.ok(order);
    }
}

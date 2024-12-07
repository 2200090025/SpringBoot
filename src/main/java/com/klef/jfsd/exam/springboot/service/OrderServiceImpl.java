package com.klef.jfsd.exam.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.springboot.model.Order;
import com.klef.jfsd.exam.springboot.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public String addOrder(Order order) {
        if (order.getOrderId() == null || order.getOrderId().isEmpty()) {
            throw new IllegalArgumentException("Order ID must not be null or empty.");
        }
        orderRepository.save(order);
        return "Order Added Successfully";
    }

	
}

package com.klef.jfsd.exam.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klef.jfsd.exam.springboot.model.Order;
import com.klef.jfsd.exam.springboot.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	
    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    @ResponseBody
    public String createOrder(@RequestBody Order order) {
       return orderService.addOrder(order);
    }
}

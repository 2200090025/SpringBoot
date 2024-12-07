package com.klef.jfsd.exam.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.exam.springboot.model.Order;

public interface OrderRepository extends JpaRepository<Order, String> {
}

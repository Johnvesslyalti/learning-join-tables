package com.example.hello.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.entities.OrderEntity;
import com.example.hello.services.OrderService;

@RequestMapping("/orders/")
@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@GetMapping("all")
	public ArrayList<OrderEntity> getAllOrders() {
		return orderService.getAllOrders();
	}
	@GetMapping("{id}")
	public Optional<OrderEntity> getOrderById(@PathVariable int id) {
		return orderService.getOrderById(id);
	}
}

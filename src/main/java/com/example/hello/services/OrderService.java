package com.example.hello.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.entities.OrderEntity;
import com.example.hello.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	public ArrayList<OrderEntity> getAllOrders() {
		return (ArrayList<OrderEntity>) orderRepository.findAll();
	}
	public Optional<OrderEntity> getOrderById(int id) {
		return orderRepository.findById(id);
	}
}

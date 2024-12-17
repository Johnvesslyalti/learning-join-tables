package com.example.hello.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.entities.CustomerEntity;
import com.example.hello.services.CustomerService;

@RequestMapping("/customers/")
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("all")
	public ArrayList<CustomerEntity> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	@GetMapping("{id}")
	public Optional<CustomerEntity> getById(@PathVariable int id) {
		return customerService.findById(id);
	}
}

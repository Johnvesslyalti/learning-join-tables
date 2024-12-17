package com.example.hello.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.entities.CustomerEntity;
import com.example.hello.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public ArrayList<CustomerEntity> getAllCustomers() {
		return (ArrayList<CustomerEntity>) customerRepository.findAll();
	}
	public Optional<CustomerEntity> findById(int id) {
		return customerRepository.findById(id);
	}
}

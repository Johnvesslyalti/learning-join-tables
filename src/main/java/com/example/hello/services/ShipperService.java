package com.example.hello.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hello.entities.ShipperEntity;
import com.example.hello.repositories.ShipperRepository;

@Service
public class ShipperService {
	@Autowired
	ShipperRepository shipperRepository;
	
	public ArrayList<ShipperEntity> getAllShippers() {
		return (ArrayList<ShipperEntity>) shipperRepository.findAll();
	}
}

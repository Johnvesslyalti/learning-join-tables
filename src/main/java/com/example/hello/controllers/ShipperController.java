package com.example.hello.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.entities.ShipperEntity;
import com.example.hello.services.ShipperService;

@RequestMapping("/shippers/")
@RestController
public class ShipperController {
	@Autowired
	ShipperService shipperService;
	
	@GetMapping("all")
	public ArrayList<ShipperEntity> getAllShippers() {
		return shipperService.getAllShippers();
	}
}

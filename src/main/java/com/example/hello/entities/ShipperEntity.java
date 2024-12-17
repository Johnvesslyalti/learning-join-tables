package com.example.hello.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shippers")
public class ShipperEntity {
	@Id
	@Column(name="shipper_id")
	private int shipperId;
	@Column(name="shipper_name")
	private String name;
	@Column(name="phone")
	private String phone;
	
	public ShipperEntity() {
		super();
	}

	public ShipperEntity(int shipperId, String name, String phone) {
		super();
		this.shipperId = shipperId;
		this.name = name;
		this.phone = phone;
	}

	public int getShipperId() {
		return shipperId;
	}

	public void setShipperId(int shipperId) {
		this.shipperId = shipperId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}

package com.example.hello.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class OrderEntity {
	@Id
	@Column(name="order_id")
	private int orderId;
	@Column(name="customer_id")
	private int customerId;
	@Column(name="employee_id")
	private int employeeId;
	@Column(name="order_date")
	private String orderDate;
	@Column(name="shipper_id")
	private String shipperId;
	
	public OrderEntity() {
		super();
	}

	public OrderEntity(int orderId, int customerId, int employeeId, String orderDate, String shipperId) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.employeeId = employeeId;
		this.orderDate = orderDate;
		this.shipperId = shipperId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShipperId() {
		return shipperId;
	}

	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	
	
	
}

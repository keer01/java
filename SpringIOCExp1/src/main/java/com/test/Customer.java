package com.test;

import java.util.List;

public class Customer {

	private int id;
	
	private String name;
	
	private List<Address> adrs;
	
	private List<Order1> orders;
	
	public Customer() {
		
	}
	
	

	public Customer(int id, String name, List<Address> adrs, List<Order1> orders) {
		
		this.id = id;
		this.name = name;
		this.adrs = adrs;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAdrs() {
		return adrs;
	}

	public void setAdrs(List<Address> adrs) {
		this.adrs = adrs;
	}

	public List<Order1> getOrders() {
		return orders;
	}

	public void setOrders(List<Order1> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", adrs=" + adrs + ", orders=" + orders + "]";
	}
	
	
	
	
	
}

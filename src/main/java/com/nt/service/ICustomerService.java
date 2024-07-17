package com.nt.service;

import java.util.List;

import com.nt.model.Customer;

public interface ICustomerService {

	
	
	public List<Customer> getAllCustomer();
	public String registerCustomer(Customer cum);
	
}

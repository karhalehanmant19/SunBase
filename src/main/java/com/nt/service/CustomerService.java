package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.model.Customer;
import com.nt.repo.ICustmorRepo;

public class CustomerService implements ICustomerService {
	
	@Autowired
	private ICustmorRepo CustomerRepo;

	@Override
	public List<Customer> getAllCustomer() {
		if (CustomerRepo.findAll().equals(null))
			return null;
		return CustomerRepo.findAll();
	}

	@Override
	public String registerCustomer(Customer cum) {
		// TODO Auto-generated method stub
		int id = CustomerRepo.save(cum).getId();
		return "Employee Is Saved with the id value::"+id;
	}

	
}

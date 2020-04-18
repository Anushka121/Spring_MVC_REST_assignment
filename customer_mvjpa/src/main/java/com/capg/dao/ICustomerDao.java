package com.capg.dao;

import com.capg.entities.Customer;

public interface ICustomerDao {
	Customer findById(int custId);
	
	Customer updateCustomer(Customer customer);
	
	Customer register(Customer customer);
	

}

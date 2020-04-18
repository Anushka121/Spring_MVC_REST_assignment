package com.capg.service;

import com.capg.entities.Customer;

public interface ICustomerService {
Customer findById(int custId);
Customer register(Customer customer);
	
Customer updateCustomer(Customer customer);
	


}

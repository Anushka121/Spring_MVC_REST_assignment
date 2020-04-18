package org.cap.service;

import java.util.List;

import org.cap.entities.Customer;

public interface ICustomerService {
	Customer fetchById(int custId);
	
	Customer add(Customer customer);
	
	 Customer update(Customer customer);
	 
	 String delete(int custId);
	 
	 List<Customer> fetchAll();
	 
	

}

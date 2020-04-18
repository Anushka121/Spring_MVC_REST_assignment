package org.cap.dao;

import java.util.List;

import org.cap.entities.Customer;

public interface ICustomerDao {
	
	Customer fetchById(int custId);
	
	Customer add(Customer customer);
	
	Customer update(Customer customer);
	
	List<Customer> fetchAll();
	
	String delete(int custId);

}

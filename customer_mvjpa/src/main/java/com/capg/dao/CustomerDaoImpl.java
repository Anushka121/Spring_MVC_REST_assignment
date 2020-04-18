package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capg.entities.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao{
	private EntityManager entitymanager;

	public EntityManager getEntitymanager() {
		return entitymanager;
	}

	@PersistenceContext
	public void setEntitymanager(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}

	@Override
	public Customer findById(int CustId) {
		Customer customer= entitymanager.find(Customer.class, CustId);
		return customer;
	}

	

	@Override
	public Customer register(Customer customer) {
		
	return customer=getEntitymanager().merge(customer);
	}
	

	@Override
	public Customer updateCustomer(Customer customer) {
	 return customer=getEntitymanager().merge(customer);	
	}
}

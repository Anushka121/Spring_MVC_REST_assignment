package org.cap.dao;

import java.util.List;

import javax.persistence.*;

import org.cap.entities.Customer;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements ICustomerDao{
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	 @PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}




@Override
public Customer fetchById(int custId) {
	Customer customer=getEntityManager().find(Customer.class, custId);
	return customer;
}

@Override
public Customer add(Customer customer) {
	return getEntityManager().merge(customer);
	}

@Override
public Customer update(Customer customer) {
	return getEntityManager().merge(customer);
}


@Override
public List<Customer> fetchAll() {
	  String ql = "from Customer";
      TypedQuery<Customer> query = entityManager.createQuery(ql, Customer.class);
      List<Customer> custList = query.getResultList();
      return custList;
}


@Override
public String delete(int custId) {
	Customer customer=fetchById(custId);
	getEntityManager().remove(customer);
	return "Customer data deleted";
	
}
	




}

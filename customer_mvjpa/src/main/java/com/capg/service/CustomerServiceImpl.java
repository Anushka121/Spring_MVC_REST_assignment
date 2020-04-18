package com.capg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.dao.ICustomerDao;
import com.capg.entities.Customer;
@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	private ICustomerDao customerDao;
	

	public ICustomerDao getCustomerDao() {
		return customerDao;
	}

    @Autowired
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	

	@Override
	public Customer findById(int custId) {
		return customerDao.findById(custId);
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}
	
	@Override
	public Customer register(Customer customer) {
		return customerDao.register(customer);
	}

}

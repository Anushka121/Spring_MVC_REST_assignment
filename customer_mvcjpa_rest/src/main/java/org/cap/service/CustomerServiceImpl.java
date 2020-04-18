package org.cap.service;
import java.util.List;
import javax.transaction.Transactional;

import org.cap.dao.ICustomerDao;
import org.cap.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
	public Customer fetchById(int custId) {
		return customerDao.fetchById(custId);
	}

	@Override
	public Customer add(Customer customer) {
		return customerDao.add(customer);
	}

	@Override
	public Customer update(Customer customer) {
		return customerDao.update(customer);
	}

	@Override
	public String delete(int custId) {
		return customerDao.delete(custId);
		
	}

	@Override
	public List<Customer> fetchAll() {
		return customerDao.fetchAll();
	}
	
}

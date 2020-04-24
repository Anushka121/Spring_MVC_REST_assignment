package org.cap.service;

import org.cap.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminServiceImpl implements AdminDao{
	AdminDao adminDao;
	
	
	
	@Override
	public boolean credentialsCorrect(int id, String password) {
		boolean correct=adminDao.credentialsCorrect(id, password);
		return correct;
	}

}

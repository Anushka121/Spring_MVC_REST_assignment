package org.cap.service;

import org.cap.dao.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	
	private AdminDao adminDao;
	
	
	
	public AdminDao getAdminDao() {
		return adminDao;
	}


    @Autowired
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}



	@Override
	public boolean credentialsCorrect(int id, String password) {
		boolean correct=adminDao.credentialsCorrect(id, password);
		return correct;
	}

}

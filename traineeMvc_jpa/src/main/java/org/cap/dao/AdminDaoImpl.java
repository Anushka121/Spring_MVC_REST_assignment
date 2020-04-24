package org.cap.dao;

import org.cap.entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDaoImpl implements AdminDao{
	
	@Autowired
	private Admin admin;
	
	
	 @Override
	    public boolean credentialsCorrect(int adminId, String adminPassword) {
	        if (adminPassword == null || adminPassword.isEmpty()) {
	            return false;
	        }
	       
	        if (admin == null) {
	            return false;
	        }
	        return admin.getAdminPassword().equals(adminPassword);
	    }
}

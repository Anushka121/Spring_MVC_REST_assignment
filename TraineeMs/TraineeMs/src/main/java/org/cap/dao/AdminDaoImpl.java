package org.cap.dao;

import javax.persistence.PersistenceContext;

import org.cap.entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDaoImpl implements AdminDao{
	
/*	private Admin admin;
	
	
	 public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
*/

	@Autowired
	private Admin admin;
	
	@Override
	    public boolean credentialsCorrect(int adminId, String adminPassword) {
	        if (adminPassword == null || adminPassword.isEmpty()) {
	            return false;
	        }
	       
	       
			return admin.getAdminPassword().equals(adminPassword);
	    }
}

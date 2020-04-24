package org.cap.entities;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;
@Component
public class Admin {
	

	@Value("${adminId}")
	private int adminId;
	

	
	@Value("${adminPassword}")
	private String adminPassword;
	
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	
	

}

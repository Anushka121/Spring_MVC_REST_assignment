package org.cap.entities;

import org.springframework.beans.factory.annotation.Value;

public class Admin {
	

	@Value("${adminId}")
	private int adminId;
	
	@Value("${adminName}")
	private int adminName;
	
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
	public int getAdminName() {
		return adminName;
	}
	public void setAdminName(int adminName) {
		this.adminName = adminName;
	}
	
	

}

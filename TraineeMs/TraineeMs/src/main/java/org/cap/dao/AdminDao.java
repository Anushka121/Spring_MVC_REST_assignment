package org.cap.dao;

public interface AdminDao {
	
	public boolean credentialsCorrect(int adminId, String adminPassword);
}

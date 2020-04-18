package org.cap.entities;


public class Trainee {

     private int traineeId;
    private String traineeName;
    private String password;
    private String domain;
    private String location;
    public Trainee(){
    	
    }
    public Trainee(int traineeId, String traineeName, String domain, String location) {
		
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.domain = domain;
		this.location = location;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

   
}

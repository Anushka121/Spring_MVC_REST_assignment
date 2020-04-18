package org.cap.service;

import java.util.List;


import org.cap.dao.ITraineeDao;
import org.cap.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeeeServiceImpl implements ITraineeService{


    
	private ITraineeDao traineeDao;
   
	public ITraineeDao getTraineeDao() {
		return traineeDao;
	}
	
	
	@Autowired
	public void setTraineeDao(ITraineeDao traineeDao) {
		this.traineeDao = traineeDao;
	}
	
	
	
	public TraineeeeServiceImpl(){
		
    }

    public TraineeeeServiceImpl(ITraineeDao  dao){
    	
        this.traineeDao=dao;
    }
	
	
	
	
	@Override
	public Trainee addTrainee(Trainee trainee) {
		 trainee= traineeDao.addTrainee(trainee);
		return trainee;
	}
	
	
	@Override
	public Trainee updateTrainne(Trainee trainee) {
		trainee=traineeDao.updateTrainne(trainee);
	return trainee;
	}
	
	@Override
	public String removeTrainee(int traineeId) {
		return traineeDao.removeTrainee(traineeId);
	}
	@Override
	public Trainee findById(int traineeId) {
		Trainee trainee=traineeDao.findById(traineeId);
		return trainee;
	}
	@Override
	public List<Trainee> traineeList() {
		List<Trainee> list=traineeDao.traineeList();
		return list;
	}
	@Override
	public boolean credentialsCorrect(int id, String password) {
		boolean correct=traineeDao.credentialsCorrect(id, password);
		return correct;
	}

	

  
}

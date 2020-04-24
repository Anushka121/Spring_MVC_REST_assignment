package org.cap.dao;


import org.cap.entities.Trainee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TraineeDaoImpl implements ITraineeDao {
    private Map<Integer, Trainee> store = new HashMap<>();
   

 

    @Override
    public Trainee addTrainee(Trainee trainee ) {
        store.put(trainee.getTraineeId(),trainee);
        return trainee;
    }

    @Override
    public Trainee findById(int TraineeId) {
        Trainee trainee = store.get(TraineeId);
        return trainee;
    }

  

	@Override
	public Trainee updateTrainne(Trainee trainee) {
		if(store.containsKey(trainee.getTraineeId()))
		{
			store.put(trainee.getTraineeId(), trainee);
		}
		return trainee;
		
		
	}

	@Override
	public String removeTrainee(int traineeId) {
		Trainee trainee=store.get(traineeId);
		store.remove(trainee);
		return "Trainee details deleted";
		
	}

	@Override
	public List<Trainee> traineeList() {
		Collection<Trainee>trainees=store.values();
        List<Trainee> traineeList=new ArrayList<>(trainees);
        return traineeList;
		
		
	}
}

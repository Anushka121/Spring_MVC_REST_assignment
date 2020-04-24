package org.cap.dao;



import org.cap.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
public class TraineeDaoImpl implements ITraineeDao {
    private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}
	  
	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
    public Trainee addTrainee(Trainee trainee ) {
		  
	return getEntityManager().merge(trainee);
    }

    @Override
    public Trainee findById(int traineeId) {
        Trainee trainee=getEntityManager().find(Trainee.class, traineeId);
        return trainee;
    }

  

	@Override
	public Trainee updateTrainne(Trainee trainee) {
		return getEntityManager().merge(trainee);
		
		
	}

	@Override
	public String removeTrainee(int traineeId) {
		Trainee trainee=getEntityManager().find(Trainee.class, traineeId);
		entityManager.remove(trainee);
		
		return "Trainee details deleted";
		
	}

	@Override
	public List<Trainee> traineeList() {
		String operation="From Trainee";
		TypedQuery<Trainee> query=entityManager.createQuery(operation,Trainee.class);
        List<Trainee> traineeList=query.getResultList();
        return traineeList;
		
		
	}
}

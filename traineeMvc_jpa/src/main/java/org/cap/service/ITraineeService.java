package org.cap.service;

import java.util.List;


import org.cap.entities.Trainee;
import org.springframework.stereotype.Component;

public interface ITraineeService {

	Trainee addTrainee(Trainee trainee);
    Trainee updateTrainne(Trainee trainee);
    String removeTrainee(int traineeId);
    Trainee findById(int traineeId);
    List<Trainee> traineeList();
    boolean credentialsCorrect(int id, String password);

}

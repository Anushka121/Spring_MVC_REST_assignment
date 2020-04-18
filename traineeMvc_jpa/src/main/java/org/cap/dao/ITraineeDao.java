package org.cap.dao;

import java.util.List;

import org.cap.entities.Trainee;

public interface ITraineeDao{

    Trainee addTrainee(Trainee trainee);
    Trainee updateTrainne(Trainee trainee);
    String removeTrainee(int traineeId);
    Trainee findById(int traineeId);
    List<Trainee> traineeList();
    boolean credentialsCorrect(int id, String password);
}

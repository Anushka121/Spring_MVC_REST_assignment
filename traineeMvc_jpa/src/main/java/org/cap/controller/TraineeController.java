package org.cap.controller;

import java.util.List;

import org.cap.entities.Trainee;
import org.cap.service.ITraineeService;
import org.cap.session.SessionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TraineeController {

    @Autowired
    private ITraineeService traineeService;

    @Autowired
    private SessionDetails sessionDetails;


    

    @GetMapping("/processlogin")
    public ModelAndView login(@RequestParam("id")int id , @RequestParam("password") String password){
        //checking id and password is correct
        boolean correct=traineeService.credentialsCorrect(id,password);
        if(!correct){
         return new ModelAndView("/login");
        }
        sessionDetails.setId(id);
       
        ModelAndView modelAndView= new ModelAndView("homepage");
        return modelAndView;
    }
    
    
    
    @GetMapping("/find")
    public ModelAndView find() {
    	 int id=sessionDetails.getId();
         if(id==-1){
          return new ModelAndView("/login");
         }
        return new ModelAndView("findtrainee");
    }
    @GetMapping("/processfindtrainee")	//fetching trainee by id.
    public ModelAndView traineeDetails(@RequestParam("traineeid")int traineeId) {
        Trainee trainee= traineeService.findById(traineeId);
        return new ModelAndView("traineedetails", "trainee", trainee);
    }
    
    
    

    
    
    
    
    @GetMapping("/add")
    public ModelAndView add() {
    	 int id=sessionDetails.getId();
         if(id==-1){
          return new ModelAndView("/login");
         }
        return new ModelAndView("addtrainee");
    }
    
    
    
    
    @GetMapping("/processadd") //to add employee
    public ModelAndView addTrainee(@RequestParam("traineeid") int traineeId,
                                         @RequestParam("traineename") String traineeName,
                                         @RequestParam("traineedomain") String Domain, 
                                         @RequestParam("traineelocation")String location)
    {
    	Trainee trainee=new Trainee(traineeId,traineeName,Domain,location);
    	traineeService.addTrainee(trainee);
    	return new ModelAndView("traineedetails",  "trainee", trainee);
    }
    
    
   
    
    @GetMapping("/update")
    public ModelAndView update() {
    	 int id=sessionDetails.getId();
         if(id==-1){
          return new ModelAndView("/login");
         }
        return new ModelAndView("updatetrainee");
    }
    
    
    
    @GetMapping("/processupdate") //updating trainee.
    public ModelAndView updateTrainee(@RequestParam("traineeid") int traineeId,
                                         @RequestParam("traineename") String traineeName,
                                         @RequestParam("traineedomain") String Domain, 
                                         @RequestParam("traineelocation")String location)
    {
    	Trainee trainee=new Trainee();
        trainee.setTraineeId(traineeId);
        trainee.setTraineeName(traineeName);
        trainee.setDomain(Domain);
        trainee.setLocation(location);
        
        traineeService.updateTrainne(trainee);
    	return new ModelAndView("traineedetails",  "trainee", trainee);
    }
    
    
    @GetMapping("/delete")
    public ModelAndView delete() {
    	 int id=sessionDetails.getId();
         if(id==-1){
          return new ModelAndView("/login");
         }
        return new ModelAndView("deletetrainee");
    }
    @GetMapping("/processdelete") //removing trainee.
    public ModelAndView deleteTrainee(@RequestParam("traineeid")int traineeId) {
    	traineeService.removeTrainee(traineeId);
    	return new ModelAndView("afterdelete","result","Deleted");
    	
    	
    }
    
   
   @GetMapping("/view")// to view all the trainees
   public ModelAndView view() {
  	 int id=sessionDetails.getId();
       if(id==-1){
        return new ModelAndView("/login");
       }
      List<Trainee>list= traineeService.traineeList();
      ModelAndView model=new ModelAndView("alltrainee");
      model.addObject("lists",list);
  return model;
   }

    @GetMapping("/")
    public ModelAndView home(){
        return new ModelAndView("homepage");
    }

    @GetMapping("/logout")
    public ModelAndView logout(){
        sessionDetails.setId(-1);
        return new ModelAndView("/login");
        
    }


}

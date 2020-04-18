package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class EmployeeMain {

    public static void main(String[] args) {
    	
    	
    	
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
      //  registering configuration class in which configurations are kept
        Class configurationClass=JavaConfig.class;
        context.register(configurationClass);
        context.refresh();// to load with the bean object
        
        Employee employee = context.getBean(Employee.class);
        
        employee.display();
    
    
    }
    
    
}

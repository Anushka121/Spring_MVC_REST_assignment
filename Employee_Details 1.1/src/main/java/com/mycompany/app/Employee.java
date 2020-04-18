package com.mycompany.app;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	
	@Value("${id}")
private int id;
	
	@Value("${name}")
private String name;
	
	@Value("${salary}")
private int salary;
	
	@Value("${bu}")
private String bu;
	
	@Value("${age}")
private int age;
	
	
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}
public String getBu() {
	return bu;
}
public void setBu(String bu) {
	this.bu = bu;
}
public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}




public void display()
{
	System.out.println("Employee Details--------------------------");
System.out.println("Employee ID : "+this.getId()+" "+
"Employee Name :"+this.getName()+" "+"Employee Salary :"+" "+this.getSalary()+" "+"Employee BU:"+
 		    this.getBu()+" "+"Employee Age :"+this.getAge());
 	

}

}

package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Employee {
	
	private SBU sbulist;
	
	@Value("${id}")
private int id;
	
	@Value("${name}")
private String name;
	
	@Value("${salary}")
private int salary;
	
	
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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


public SBU getSbulist() {
	return sbulist;
}
//automatically sets the object dependency
@Autowired
public void setSbulist(SBU sbulist) {
	this.sbulist = sbulist;
}




public void sbuDetails()
{   System.out.print("SBU DETAILS:");
	System.out.println("["+"SBUID:"+this.getSbulist().getSbuId()+" "+"SBUNAME:"+this.getSbulist().getSbuName()+
			" "+"SBUHEAD:"+this.getSbulist().getSbuHead()+"] ]");
}


public void display()
{
	System.out.println("Employee details");
	System.out.println("--------------------------------------------------------------");
System.out.println("["+"Employee ID : "+this.getId()+" "+
"Employee Name :"+this.getName()+" "+"Employee Salary :"+" "+this.getSalary()+" "+" "+"Employee Age :"+this.getAge());
     this.sbuDetails();

}



}


package com.ss.poltmor;

public class Employee {
 private String id;
 private double salary;
 private String name;

 public Employee(String id,double salary,String name) {

	 this.id = id;
	 this.salary=salary;
	 this.name=name;
	
 }
 
 
 public String getDetail(){
	  return id+name+salary;
  }
//public String getId() {
//	return id;
//}
//public void setId(String id) {
//	this.id = id;
//}
//public double getSalary() {
//	return salary;
//}
//public void setSalary(double salary) {
//	this.salary = salary;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}  
  
}

class Manager extends Employee{
	
	private String department;
	
	public Manager(String id, double salary, String name,String department) {
		super(id, salary, name);
		this.department = department;
	}

	@Override
	public String getDetail() {	
		return super.getDetail()+" - " +department;
	}
	
//	public String getDepartment() {
//		return department;
//	}
//	public void setDepartment(String department) {
//		this.department = department;
//	}
	
}

class Programmer extends Employee{
	
	private String faculty;
	
	
	public Programmer(String id, double salary, String name,String faculty) {
		super(id, salary, name);
		this.faculty = faculty;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	@Override
	public String getDetail() {
	
		return super.getDetail()+faculty;
	}
}


class Sectary extends Employee{
	private String gender;
	
	
	public Sectary(String id, double salary, String name,String gender) {
		super(id, salary, name);
		this.gender=gender;
	}


	@Override
	public String getDetail() {
		return super.getDetail()+"-"+gender;
	}
}
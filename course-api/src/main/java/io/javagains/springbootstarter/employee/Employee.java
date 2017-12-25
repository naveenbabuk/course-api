package io.javagains.springbootstarter.employee;


public class Employee {
	
	private String empid;
	private String empname;
	private String salary;
	
	public Employee(String empname, String salary) {
		super();
		this.empname = empname;
		this.salary = salary;
	}
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	
	
}

package com.pojoPackage;

public class Employee {
	
	private int eid;
	private String pname;
	private String designation;
	private String department;
	private int salary;
	private String email;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", pname=" + pname + ", designation=" + designation + ", department="
				+ department + ", salary=" + salary + ", email=" + email + "]";
	}
	
	
	public Employee(int eid, String pname, String designation, String department, int salary, String email) {
		super();
		this.eid = eid;
		this.pname = pname;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
		this.email = email;
	}
	
	
	public Employee() {
		
	}
	
	

}

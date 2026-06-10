package com.pojo;

public class EmployeePOJO {

	private int employee_id;
	private String employee_name;
	private int salary;
	private String department;
	private String location;

	//  getters and setter methods 
	
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "EmployeePOJO [employee_id=" + employee_id + ", employee_name=" + employee_name + ", salary=" + salary
				+ ", department=" + department + ", location=" + location + "]";
	}

	public EmployeePOJO(int employee_id, String employee_name, int salary, String department, String location) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.salary = salary;
		this.department = department;
		this.location = location;
	} // constructor ends here
	
	

	public EmployeePOJO(String employee_name, int salary, String department, String location) {
		this.employee_name = employee_name;
		this.salary = salary;
		this.department = department;
		this.location = location;
	} // constructor ends here

}

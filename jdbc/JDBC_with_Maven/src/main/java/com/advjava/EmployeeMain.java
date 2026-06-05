package com.advjava;

public class EmployeeMain {

	public static void main(String[] args) {

		try {

			Employee emp = new Employee();

//			emp.insertData();
//			emp.deleteData();
			emp.updateData();

		} catch (Exception e) {
			
			e.printStackTrace();	
			
		}
	}
}
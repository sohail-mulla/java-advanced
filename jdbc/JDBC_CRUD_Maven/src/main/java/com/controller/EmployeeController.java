package com.controller;

import com.service.EmployeeService;


//jdbc with maven - modular approach - all CRUD operations performed 

public class EmployeeController {

	public static void main(String[] args) {

		try {

			EmployeeService es = new EmployeeService();

//			es.insertData();
//			es.deleteData();
//			es.updateData();
			es.getAllRecord();

		} catch (Exception e) {
			
			e.printStackTrace();	
			
		}
	}
}
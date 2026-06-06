package com.service;

import com.dao.EmployeeDAO;

//jdbc with maven - modular approach - all CRUD operations performed 

public class EmployeeService {


	public void insertData() throws Exception {
		EmployeeDAO ed = new EmployeeDAO();
		ed.insertData();
	}

	public void deleteData() throws Exception {
		EmployeeDAO ed = new EmployeeDAO();
		ed.deleteData();
	}

	public void updateData() throws Exception {
		EmployeeDAO ed = new EmployeeDAO();
		ed.updateData();
	}

	public void getAllRecord() throws Exception {
		EmployeeDAO ed = new EmployeeDAO();
		ed.getAllRecord();
	
	}

}
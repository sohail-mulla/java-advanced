package com.service;

import com.dao.EmployeeDAO;
import com.pojo.EmployeePOJO;

//jdbc with maven - dynamic approach (User Input) - CRUD operations performed

public class EmployeeService {

	EmployeeDAO ed = new EmployeeDAO();

	public void insertData(EmployeePOJO ep) throws Exception {

		ed.insertData(ep);
	}

	public void getAllRecord() throws Exception {

		ed.getAllRecord();
	}

	public void getRecordByID(int searchID) throws Exception {

		ed.getRecordByID(searchID);

	}

	public void deleteData(int deleteID) throws Exception {

		ed.deleteData(deleteID);
	}

	public void updateData(int updateID, EmployeePOJO ep2) throws Exception {

		ed.updateData(updateID, ep2);
	}


}































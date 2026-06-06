package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

			// jdbc with maven - modular approach - all CRUD operations performed with --> Prepared Statement 

public class EmployeeDAO {

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");

		PreparedStatement st = con.prepareStatement("insert into employee(employee_name, salary, department, hire_date, location)"
				+ "values(?, ?, ?, ?, ?)");
		
		st.setString(1, "Walker");
		st.setInt(2, 34300);
		st.setString(3, "Security");
		st.setString(4, "2023-09-10");
		st.setString(5, "Dehradun");

		
		int checked = st.executeUpdate();
		if (checked > 0) {
			System.out.println("Data inserted ......!");
		} else {

			System.out.println("Data NOT inserted ......!");
		}

		con.close();

	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");

		PreparedStatement st = con.prepareStatement("DELETE FROM employee WHERE employee_id = ?");
		
		st.setInt(1, 10);

		int checked = st.executeUpdate();

		if (checked > 0) {
			System.out.println("Data deleted ......!");
		} else {

			System.out.println("Data NOT deleted ......!");
		}

		con.close();

	}

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");

		PreparedStatement st = con.prepareStatement(" UPDATE employee SET employee_name = ? WHERE employee_id = ? ");
		
		st.setString(1, "Kunal");
		st.setInt(2, 8);
		

		int checked = st.executeUpdate();

		if (checked > 0) {
			System.out.println("Data updated ......!");
		} else {

			System.out.println("Could not update ......!");
		}

		con.close();

	}

	public void getAllRecord() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");

		PreparedStatement st = con.prepareStatement("select * FROM Employee");

		ResultSet rs = st.executeQuery();

		while(rs.next()) {
			
			System.out.printf("%-8d    %-10s    %-10d    %-10s    %-6s    %-8s%n" , rs.getInt(1), rs.getString(2),  rs.getInt(3), rs.getString(4)
			
			,rs.getString(5), rs.getString(6));
			
		
		}
		con.close();

	}

}

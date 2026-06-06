package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

			// jdbc with maven - modular approach - all CRUD operations performed 

public class EmployeeDAO {

	public void insertData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");

		Statement st = con.createStatement();

		int checked = st.executeUpdate("insert into employee(employee_name, salary, department, hire_date, location)"
				+ "values('Alan', 20000, 'HR', '2023-09-12', 'Hyderabad')");

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

		Statement st = con.createStatement();

		int checked = st.executeUpdate("DELETE FROM employee WHERE employee_id = 9");

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

		Statement st = con.createStatement();

		int checked = st.executeUpdate("UPDATE employee SET employee_name = 'Sumit' WHERE employee_id = '5'");

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

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * FROM Employee");

		while(rs.next()) {
			
			System.out.printf("%-8d    %-10s    %-10d    %-10s    %-6s    %-8s%n" , rs.getInt(1), rs.getString(2),  rs.getInt(3), rs.getString(4)
			
			,rs.getString(5), rs.getString(6));
			
		
		}
		con.close();

	}

}

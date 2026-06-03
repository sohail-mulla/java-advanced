
package com.advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) {

	  try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println(" Driver class loaded successfully ! ");

			
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root","root"); 
				 Statement st = con.createStatement()) 

			{
				
				int checked = st.executeUpdate(
						"insert into employee(employee_name,salary,department,hire_date,location) values ('sagar',29000,'HR','2026-04-19','Remote')");

				if (checked > 0) {
					System.out.println("Data inserted ! ");
				} else {
					System.out.println("Data NOT inserted ! ");
				}

			} 

		} catch (ClassNotFoundException e) {
			System.out.println("Class not found exception occured ! ");
			e.printStackTrace();
		} 
	      catch (SQLException e) {
			System.out.println("Database error occurred!");
			e.printStackTrace();
		}

	}
}

package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.pojo.EmployeePOJO;

//jdbc with maven - dynamic approach (User Input) - CRUD operations performed

public class EmployeeDAO {

	public void insertData(EmployeePOJO employee) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");

				PreparedStatement st = con
						.prepareStatement("INSERT INTO EMPLOYEE_NEW (EMPLOYEE_ID, EMPLOYEE_NAME, SALARY,"
								+ " DEPARTMENT , LOCATION) VALUES (?,?,?,?,?)");) {
			st.setInt(1, employee.getEmployee_id());
			st.setString(2, employee.getEmployee_name());
			st.setInt(3, employee.getSalary());
			st.setString(4, employee.getDepartment());
			st.setString(5, employee.getLocation());

			int checked = st.executeUpdate();
			if (checked > 0) {
				System.out.println("Data inserted ......!");
			} else {

				System.out.println("Data NOT inserted ......!");
			}

		}

	} // insertData() ended --------------------------------------------------

	public void getAllRecord() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");

				Statement st = con.createStatement();) {
			ResultSet rs = st.executeQuery("select * FROM Employee_new");

			while (rs.next()) {

				System.out.printf("%-8d    %-10s    %-10d    %-10s    %-6s%n", rs.getInt(1), rs.getString(2),
						rs.getInt(3), rs.getString(4), rs.getString(5));
				System.out.printf( "---------------------------------------------------------------------------------------%n");

			}
		}

	} // getAllRecord() Ended --------------------------------------------------

	public void getRecordByID(int searchID) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");

				PreparedStatement st = con.prepareStatement("SELECT * FROM Employee_new WHERE EMPLOYEE_ID = ?");) {
			st.setInt(1, searchID);

			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				System.out.printf( "║  ID         : %-22d║%n", rs.getInt(1));
			    System.out.printf( "║  Name       : %-22s║%n", rs.getString(2));
			    System.out.printf( "║  Salary     : %-22d║%n", rs.getInt(3));
			    System.out.printf( "║  Department : %-22s║%n", rs.getString(4));
			    System.out.printf( "║  Location   : %-22s║%n", rs.getString(5));
			    System.out.printf( "-----------------------------------------------------------------------------");
			    

			} else {

				System.out.println("ID not found , please try again ! ");
			}

		}

	} // getRecordByID() ended --------------------------------------------------

	public void deleteData(int deleteID) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");

				PreparedStatement ps = con.prepareStatement("DELETE FROM EMPLOYEE_NEW WHERE EMPLOYEE_ID = ?");) {
			ps.setInt(1, deleteID);

			int checked = ps.executeUpdate();

			if (checked > 0) {
				System.out.println("Employee deleted successfully!");
			} else {
				System.out.println("No employee found with ID: " + deleteID);
			}

		}

	} // deleteData() ended --------------------------------------------------

	public void updateData(int ID, EmployeePOJO employee) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root");

				PreparedStatement st = con.prepareStatement(
						"UPDATE EMPLOYEE_NEW SET EMPLOYEE_NAME = ?, SALARY = ?, DEPARTMENT  = ?, LOCATION = ? WHERE EMPLOYEE_ID = ?");) {
			st.setString(1, employee.getEmployee_name());
			st.setInt(2, employee.getSalary());
			st.setString(3, employee.getDepartment());
			st.setString(4, employee.getLocation());
			st.setInt(5, ID);

			int checked = st.executeUpdate();

			if (checked > 0) {
				System.out.println(" Updated successfully!");
			} else {
				System.out.println("Something went wrong !");
			}
		}

	}

} // updateData() ended --------------------------------------------------

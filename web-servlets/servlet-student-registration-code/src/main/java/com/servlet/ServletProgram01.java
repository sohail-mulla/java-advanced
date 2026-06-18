package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class ServletProgram01 extends HttpServlet {

	@Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
			resp.setContentType("text/html");
		
			PrintWriter out = resp.getWriter(); 
		
	        String firstName = req.getParameter("first_name");
	        String lastName = req.getParameter("last_name");
	        String dob = req.getParameter("dob");
	        String gender = req.getParameter("gender");
	        String email = req.getParameter("email");
	        String phone = req.getParameter("phone");
	        String course = req.getParameter("course");
	        String password = req.getParameter("password");
	        String confirmPassword = req.getParameter("confirm_password");


	        
	        if (!password.equals(confirmPassword)) {
	            resp.getWriter().println("Error: Passwords do not match!");
	            return;
	        }
	        
	        System.out.println(firstName);
	        System.out.println(lastName);
	        System.out.println(dob);
	        System.out.println(gender);
	        System.out.println(email);
	        System.out.println(phone);
	        System.out.println(course);	
	        System.out.println(password);
	        System.out.println(confirmPassword);
	        
	        try {
	            
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            
	            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db", "root", "root");
	                 PreparedStatement ps = con.prepareStatement("INSERT INTO students (first_name, last_name, dob, gender, email, phone, course, password_hash)"
	                 		+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?)");){

	               
	                ps.setString(1, firstName);
	                ps.setString(2, lastName);
	                ps.setString(3, dob);
	                ps.setString(4, gender);
	                ps.setString(5, email);
	                ps.setString(6, phone);
	                ps.setString(7, course);
	                ps.setString(8, confirmPassword);

	                int checked = ps.executeUpdate();

	                if (checked > 0) {
	                    out.println("<h1 style = 'color:green'>"+ "Registration Successful!"+ "</h1>");
	                }
	            }
	        } catch (Exception e) {
	            out.println("Something went wrong ..!" + e.getMessage());
	            e.printStackTrace();
	        }
	    }

         
    
      
//	        out.println(firstName);
//	        out.println(lastName);
//	        out.println(dob);
//	        out.println(gender);
//	        out.println(email);
//	        out.println(phone);
//	        out.println(course);
//	        out.println(password);
//	        out.println(confirmPassword);
//	        
	    
 }



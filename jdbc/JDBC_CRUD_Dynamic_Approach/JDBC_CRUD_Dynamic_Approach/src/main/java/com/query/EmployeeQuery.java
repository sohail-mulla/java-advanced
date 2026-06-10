package com.query;


	// just added a new class for reference 
public class EmployeeQuery {


    public static String insertEmployeeQuery() {
        return "INSERT INTO EMPLOYEE_NEW (EMPLOYEE_ID, EMPLOYEE_NAME, SALARY, DEPARTMENT , LOCATION) VALUES (?,?,?,?,?)";
    }

    public static String selectAllEmployeeQuery() {
        return "SELECT * FROM EMPLOEE_NEW";
    }

    public static String selectEmployeeById(int employeeId) {
        return "SELECT * FROM EMPLOEE_NEW WHERE EMPLOYEE_ID = " + employeeId;
    }

    public static String deleteEmployeeById(int employeeId) {
        return "DELETE FROM EMPLOEE_NEW WHERE EMPLOYEE_ID = " + employeeId;
    }

    public static String updateEmployeeQuery(int employeeId) {
        return "UPDATE EMPLOEE_NEW SET EMPLOYEE_NAME = ?, SALARY = ?, DEPARTMENT  = ?, LOCATION = ? WHERE EMPLOYEE_ID = "
                + employeeId;
    }
}
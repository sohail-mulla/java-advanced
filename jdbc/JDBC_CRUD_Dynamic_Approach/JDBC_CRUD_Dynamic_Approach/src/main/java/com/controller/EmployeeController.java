package com.controller;

import com.pojo.EmployeePOJO;
import com.service.EmployeeService;
import java.util.Scanner;

//jdbc with maven - dynamic approach (User Input) - CRUD operations performed

public class EmployeeController {

	public static void main(String[] args) {

		EmployeeService es = new EmployeeService();

		try (Scanner scanner = new Scanner(System.in)) {

			boolean isRunning = true;

			while (isRunning) {

				System.out.println(" Please select an option ");
				System.out.println("1. Insert ");
				System.out.println("2. Show all data ");
				System.out.println("3. Select employee data by an id");
				System.out.println("4. Delete employee ");
				System.out.println("5. Update employee ");
				System.out.println("6. Exit");
				System.out.println();

				int option = Integer.parseInt(scanner.nextLine());

				switch (option) {

				case 1:

					System.out.println("Please enter 'NEW' employee_id, employee_name, salary, department and location"
							+ " ('PRESS ENTER AFTER EVERY ENTRY') ");
					EmployeePOJO ep = new EmployeePOJO(Integer.parseInt(scanner.nextLine()), scanner.nextLine(),
							Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextLine());
					es.insertData(ep);
					break;

				case 2:

					System.out.println();
					es.getAllRecord();
					break;

				case 3:

					System.out.println("Enter the ID");
					int searchID = Integer.parseInt(scanner.nextLine());
					es.getRecordByID(searchID);
					break;

				case 4:
					System.out.println("Enter the ID");
					int deleteID = Integer.parseInt(scanner.nextLine());
					es.deleteData(deleteID);

					break;

				case 5:
					System.out.println("Enter the ID");
					int updateID = (Integer.parseInt(scanner.nextLine()));
					System.out.println("Please enter 'NEW' employee_name, salary, department and location "
							+ "('PRESS ENTER AFTER EVERY ENTRY')");
					EmployeePOJO ep2 = new EmployeePOJO(scanner.nextLine(), Integer.parseInt(scanner.nextLine()),
							scanner.nextLine(), scanner.nextLine());
					es.updateData(updateID, ep2);

					break;

				case 6:
					System.out.println("Thankyou , visit again ! ");
					isRunning = false;
					break;

				default:
					System.out.println("Incorrect option selected, try again ! ");
					break;
				}
			}
		} catch (Exception e) {

			System.out.println(" Something went wrong ! ");
		}
	}
}
package com.controller;

import java.util.List;
import java.util.Scanner;

import com.dao.StudentDAO;
import com.entity.StudentEntity;
import com.util.HibernateUtil;

public class StudentController {

	public static void main(String[] args) {

		System.out.println(" \n \n Welcome to Student Management Dashboard\n\n\n ");

		try (Scanner scanner = new Scanner(System.in)) {
			StudentController sc = new StudentController();
			StudentEntity student = new StudentEntity();
			StudentDAO dao = new StudentDAO();

			boolean isRunning = true;

			while (isRunning) {

				System.out.println(
						"\n-----------------------------------Select an Option-----------------------------------\n");
				System.out.println("1. Insert new Student data ");
				System.out.println("2. Show all student data ");
				System.out.println("3. Select student data by an id");
				System.out.println("4. Delete student ");
				System.out.println("5. Update student ");
				System.out.println("6. Exit");
				System.out.println();

				int input = Integer.parseInt(scanner.nextLine());

				switch (input) {

				case 1:

					System.out.print("Enter Student ID : ");
					int id = Integer.parseInt(scanner.nextLine());

					System.out.print("Enter Student Name : ");
					String name = scanner.nextLine();

					System.out.print("Enter Student City : ");
					String city = scanner.nextLine();

					System.out.print("Enter Student Course : ");
					String course = scanner.nextLine();

					student.setstudentID(id);
					student.setstudentName(name);
					student.setCity(city);
					student.setCourse(course);

					dao.insertStudent(student);

					System.out.print("Student data inserted sucessfully");

					break;

				// ------------------------------------------------------------------------------------------------------------------------

				case 2:

					List<StudentEntity> displaystudents = dao.getAllStudents();

					if (displaystudents.isEmpty()) {

						System.out.println("No student records found.");

					} else {

						for (StudentEntity std : displaystudents) {

							System.out.println(std);
						}
					}

					break;

				// --------------------------------------------------------------------------------------------------------------------

				case 3:

					System.out.print("Enter Student ID: ");

					int id2 = Integer.parseInt(scanner.nextLine());

					student = dao.getStudentById(id2);

					if (student != null) {

						System.out.println(student);

					} else {

						System.out.println("Student not found.");

					}
					break;
				// ------------------------------------------------------------------------------------------------------------------------

				case 4:

					System.out.print("Enter the student ID :");
					int id3 = Integer.parseInt(scanner.nextLine());
					dao.deleteStudent(id3);
					System.out.println(" Student ID has deleted successfully ");

					break;

				// ------------------------------------------------------------------------------------------------------------------------

				case 5:

					System.out.print("Enter Student ID: ");
					int id5 = Integer.parseInt(scanner.nextLine());

					student = dao.getStudentById(id5);

					if (student != null) {

						System.out.print("Enter new Name: ");
						student.setstudentName(scanner.nextLine());

						System.out.print("Enter new City: ");
						student.setCity(scanner.nextLine());

						System.out.print("Enter new Course: ");
						student.setCourse(scanner.nextLine());

						dao.updateStudent(student);

						System.out.println("Student updated successfully.");

					} else {

						System.out.println("Student not found.");

					}

					break;

				// ------------------------------------------------------------------------------------------------------------------------

				case 6:
					System.out.println("Dashboard Exited  ! ");
					isRunning = false;
					break;
				// ------------------------------------------------------------------------------------------------------------------------

				default:
					System.out.println("Incorrect option selected, try again ! ");
					break;

				}

			}
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(" Something went wrong , please try again after some time !");
		} finally {
			HibernateUtil.closeSessionFactory();
		}

	}
}

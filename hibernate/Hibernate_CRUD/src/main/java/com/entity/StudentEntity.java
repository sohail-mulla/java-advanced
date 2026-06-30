package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// contains all POJO fields  
@Entity
@Table(name ="Students_table")
public class StudentEntity {

	@Id
	int studentID;
	String studentName;
	String city;
	String course;

	public StudentEntity() {

	}

	public StudentEntity(int studentID, String studentName, String city, String course) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.city = city;
		this.course = course;
	}

	public int getstudentID() {
		return studentID;
	}

	public String getstudentName() {
		return studentName;
	}

	public String getCity() {
		return city;
	}

	public void setstudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentEntity [studentID=" + studentID + ", studentName=" + studentName + ", city=" + city + ", course="
				+ course + "]";
	}

}

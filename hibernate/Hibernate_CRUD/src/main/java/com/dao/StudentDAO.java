package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.entity.StudentEntity;
import com.util.HibernateUtil;

public class StudentDAO {

	public void insertStudent(StudentEntity student) {

		Session ss = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = ss.beginTransaction();
		ss.persist(student);
		tr.commit();
		ss.close();

	}

	public List<StudentEntity> getAllStudents() {

		Session session = HibernateUtil.getSessionFactory().openSession();

		// here we have used HQL query to get all the students

		List<StudentEntity> students = session.createQuery("FROM StudentEntity", StudentEntity.class).list();

		session.close();

		return students;
	}

	public StudentEntity getStudentById(int id) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		StudentEntity student = session.get(StudentEntity.class, id);

		session.close();

		return student;
	}

	public void deleteStudent(int id) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();

		StudentEntity student = session.get(StudentEntity.class, id);

		if (student != null) {

			session.remove(student);
			tr.commit();
			System.out.println("Student deleted successfully.");

		} else {

			System.out.println("Student not found.");
		}

		session.close();
	}

	public void updateStudent(StudentEntity student) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();

		session.merge(student);

		tr.commit();
		session.close();
	}

}

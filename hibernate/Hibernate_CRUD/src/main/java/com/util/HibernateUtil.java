package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.entity.StudentEntity;

public class HibernateUtil {

	// instead of writing 'SessionFactory sf= cfg.buildSessionFactory();' in method
	// we declare it as global as this is needed for whole application

	private static SessionFactory sf;

	static {

		// static block executes once so we put this in static block to build the
		// connection once and can be used multiple times

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(StudentEntity.class);

		sf = cfg.buildSessionFactory();
	}

	
	
	public static SessionFactory getSessionFactory() {

		return sf;
	}

	public static void closeSessionFactory() {
		if (sf != null) {

			sf.close();
		}

	}

}

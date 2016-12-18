package com.test.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonManager {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
	
		Student p=new Student();
p.setId(4);
p.setName("vipendra");
p.setPersonType("Student");

Employee e=new Employee();
e.setId(5);
e.setName("pal");
e.setPersonType("Employee");
	
	session.save(p);
	session.save(e);
	tx.commit();
		
		session.close();
	}
}

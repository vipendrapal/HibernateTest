package com.test.hiber;



import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manager1 {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		SQLQuery query=session.createSQLQuery("SELECT c.cname, s.statename FROM city c LEFT JOIN state s ON c.stateForeignId=s.stateid");
		List list=query.list();
		for(Object obj:list){
			System.out.println(obj);
		}
		session.close();
	}
	
	
}

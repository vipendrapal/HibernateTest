package com.test.hiber;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ClientForSave {

	
		 
		public static void main(String[] args) 
		{
		
	 
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml"); 
	 
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			Transaction tx=session.beginTransaction();
		
		States s=new States();
		s.setId(11);
		s.setName("mp");
		//Set set=new HashSet();
		City c=new City();
		c.setCityId(63);
		c.setCityName("indore");
		c.setState(s);
		//set.add(c);
		City c1=new City();
		c1.setCityId(87);
		c1.setCityName("indore");
		//set.add(c1);
		//s.setCity(set);
		
		session.save(c);
		tx.commit();
			
			session.close();
		
			
		}
	 
}

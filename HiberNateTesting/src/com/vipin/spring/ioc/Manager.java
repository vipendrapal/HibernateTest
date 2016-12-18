package com.vipin.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manager {
public static void main(String[] args) {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
	Student s=(Student) ctx.getBean("student");
	System.out.println(s.getAddress().getCity());
}
}

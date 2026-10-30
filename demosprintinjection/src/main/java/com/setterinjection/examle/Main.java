package com.setterinjection.examle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		ApplicationContext ac1;
		ac1=new ClassPathXmlApplicationContext("application.xml");
		Employee e=ac1.getBean(Employee.class);
		e.display();
	}

}

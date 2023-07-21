package com;

import com.model.Student;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {	
		System.out.println("THE LIFE IS HARD, HA?");
		AbstractApplicationContext applicationContext = new FileSystemXmlApplicationContext("spring.xml");
		Student student = applicationContext.getBean("stud1",Student.class);
		System.out.println("Students name is: "+ student.getName());
		applicationContext.close();
	}
}

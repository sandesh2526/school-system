package com;

import java.util.Arrays;

import com.model.ClassOfStudents;
import com.model.School;
import com.model.Student;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("THE LIFE IS HARD, HA?");

		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		School school = applicationContext.getBean("school", School.class);
		Student student = applicationContext.getBean("stud1", Student.class);
		ClassOfStudents classOfStudents = applicationContext.getBean("classOfStuds", ClassOfStudents.class);
		school.addClass(classOfStudents);
		
		String geek = "Glorious-Glory-comes-with-a-price";
		String[] geekStrings = geek.split("-");
		System.out.println("The String is : " + Arrays.toString(geekStrings));
		classOfStudents.addStudent(student);
		student.getName();
		applicationContext.close();
	} 
}

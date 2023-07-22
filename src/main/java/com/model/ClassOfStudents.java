package com.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class ClassOfStudents {
	private List<Student> studentsInClass;
	private char className;
	
	public void addStudent(Student student) {
		System.out.println(student);
		studentsInClass.add(student);
	}

	public ClassOfStudents(char nameOfClass) {
		studentsInClass = new ArrayList<>();
		this.className = nameOfClass;
	}	
}

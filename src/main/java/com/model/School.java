package com.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class School {
	private List<ClassOfStudents> classes;
	
	public School() {
		classes = new ArrayList<>();
	}
	
	public void addClass(ClassOfStudents classOfStudents) {
		classes.add(classOfStudents);
	}
}

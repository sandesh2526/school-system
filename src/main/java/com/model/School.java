package com.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class School {
	private List<ClassOfStudents> classes;
	
	public School() {
		classes = new ArrayList<>();
	}
}

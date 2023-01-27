package com.example.service;

import com.example.model.Gpa;

public interface GPAService {
	//which calculates student�s average GPA across all courses
	Gpa getGPA();
	Gpa getClassGPA();

}

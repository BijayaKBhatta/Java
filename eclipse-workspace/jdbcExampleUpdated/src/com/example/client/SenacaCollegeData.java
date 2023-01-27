package com.example.client;


import com.example.model.Result;
import com.example.model.Student;
import com.example.service.StudentService;
import com.example.service.impl.StudentServiceImpl;

public class SenacaCollegeData {

	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		//this method saves Student's Result into DB
		Result result = new Result();
		result.setCourseName("ACC180");
		result.setStudentId(1);
		result.setLetterGrade("ADV");
		result.setTerm("6Sem");
		result.setYear("2021/2022");
		studentService.saveResult(result);
		
		Result studentResult = new Result();
		
		Student student = new Student();
		student.setId(1);
		student.setName("sabdulwahab");
		studentResult = studentService.printResults(student);
			
		}

	}



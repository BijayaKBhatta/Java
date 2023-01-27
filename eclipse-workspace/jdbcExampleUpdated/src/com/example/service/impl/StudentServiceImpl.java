package com.example.service.impl;
import java.sql.SQLException;
import java.util.List;

import com.example.dao.StudentDao;
import com.example.dao.impl.StudentDaoImpl;
import com.example.model.Result;
import com.example.model.Student;
import com.example.service.StudentService;


public class StudentServiceImpl implements StudentService{
	StudentDao studentdao = new StudentDaoImpl();
	

	@Override
	public void saveResult(Result result) {
		int response = studentdao.save(result);
		if(response ==1) {
			System.out.println("Result saved Successfully");
		}
		else {
			System.out.println("Error While Saving");
			
		}
		
	}


	@Override
	public Result printResults(Student student)  {
		
		try {
			return studentdao.printResult(student);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}



	
	

}

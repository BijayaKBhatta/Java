package com.example.dao;

import java.sql.SQLException;

import com.example.model.Result;
import com.example.model.Student;

public interface StudentDao {
	int save(Result result);
	Result printResult(Student student) throws ClassNotFoundException, SQLException;

}

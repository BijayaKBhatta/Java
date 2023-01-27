package com.example.service;

import java.sql.SQLException;
import java.util.List;

import com.example.model.Result;
import com.example.model.Student;

public interface StudentService {

	Result printResults(Student student);

	void saveResult(Result result);

}

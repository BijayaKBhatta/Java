package com.example.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.constant.AppConstant;
import com.example.dao.StudentDao;
import com.example.model.Result;
import com.example.model.Student;
import com.example.util.DBConnectionUtil;

public class StudentDaoImpl implements StudentDao {
	
	AppConstant appConstant;
	Connection con;
	Statement stmt;
	int resultData;
	
	
	@Override
	public int save(Result result) {
		 try {
			 con = DBConnectionUtil.getConnetion();
			
				 String sql = "insert into Resul values('"+result.getStudentId()+"',"+result.getCourseName()+",'"+result.getLetterGrade()+"','"+result.getTerm()+"','"+result.getYear()+"')";
				try {
					stmt = con.createStatement();
					resultData = stmt.executeUpdate(sql);
	
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		 finally {
			 try {
				con.close();
				stmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		 }
		return resultData;
		
	}


	@Override
	public Result printResult(Student student) throws ClassNotFoundException, SQLException {
		
		 ResultSet rs;
		 Result result = new Result();
		con = DBConnectionUtil.getConnetion();
		String sql = appConstant.GETRESULT +
                " WHERE studentid ="+student.getId();
		 rs = stmt.executeQuery(sql);
		 while(rs.next()){
	         //Retrieve by column name
			
			 result.setStudentId(rs.getInt("studentid"));
			 result.setCourseName(rs.getString("coursename"));
			 result.setLetterGrade(rs.getString("lettergrade"));
			 result.setTerm(rs.getString("term"));
			 result.setYear(rs.getString("year"));
	      }
		return result;
	}

}

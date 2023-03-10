package com.example.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnectionUtil {
	
	public static Connection getConnetion() throws ClassNotFoundException {
	
			Properties props = new Properties();
			FileInputStream fis = null;
			Connection con = null;
			try {
				fis = new FileInputStream("db.properties");
				props.load(fis);

				// load the Driver Class
				Class.forName(props.getProperty("DB_DRIVER_CLASS"));
				System.out.println(props.getProperty("DB_DRIVER_CLASS"));

				// create the connection now
				con = DriverManager.getConnection(props.getProperty("DB_URL"),
						props.getProperty("DB_USERNAME"),
						props.getProperty("DB_PASSWORD"));
			} catch ( SQLException e) {
				e.printStackTrace();
				
			}
			catch ( IOException e) {
			
				e.printStackTrace();
			}
			finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return con;
		}
	
	}



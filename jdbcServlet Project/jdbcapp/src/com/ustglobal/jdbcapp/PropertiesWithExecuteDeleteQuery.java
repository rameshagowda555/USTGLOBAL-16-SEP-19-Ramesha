package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class PropertiesWithExecuteDeleteQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//Step 1 Load the Driver
			
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			//Step2 Get the Connection
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//Step 3 Issue SQL Query
			String sql = prop.getProperty("execute-delete-query");
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//Step 4 Read the result
			
			System.out.println(count+" Row(s) Deleted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		Step 5 Close all the JDBC Objects
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					conn.close();
				}if(reader!=null) {
					reader.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

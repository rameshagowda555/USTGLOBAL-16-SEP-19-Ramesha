package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class MyFirstJDBCWithProperties {
	public static void main(String[] args) {
		
		Connection conn = null;//interface
		Statement stmt = null;//interface
		ResultSet rs = null;//interface
		FileReader reader = null;
		
		try {
			
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//Step ss1 --> Load the Driver
//			Driver driver = new Driver();
//			DriverManager.deregisterDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			
			//Step 2-->Get the Connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//we use like this also
//			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
//			conn = DriverManager.getConnection(url, "root", "root");
			
			//Step 3--> Issue SQL Query
			stmt = conn.createStatement();
			String sql = prop.getProperty("select-query");
			rs = stmt.executeQuery(sql);
			
			//Step 4 Read the Result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);
				System.out.println("********************************************");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			//Step 5 Close all JDBC Object
			try {
				if(conn!= null) {
					conn.close();
				}
				if(stmt!= null) {
					stmt.close();
				}
				if(rs!= null) {
					rs.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}//end of main
}

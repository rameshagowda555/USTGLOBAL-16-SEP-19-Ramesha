package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class PropertiesWithDynamicSelectQuery {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//Step 1 Load the Driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			
			//Step 2 Get the Connection
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);

			//Step 3 Issue the SQL Query
			String sql =prop.getProperty("dynamic-select-query");
			pstmt = conn.prepareStatement(sql);

			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();
			//Step4 Read the Results
			if(rs.next()) {
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				System.out.println("Id: "+emp_id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gender: "+gender);

			}


		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}if(rs!=null) {
					rs.close();
				}if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

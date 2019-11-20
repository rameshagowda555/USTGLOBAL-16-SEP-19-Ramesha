package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class PropertiesWithDynamicDeleteQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
			reader= new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//Step 1 Load the Driver
			
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			
			//Step2 Get the Connection
			
			String url =prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//Step 3 Issue SQL Query
			String sql = prop.getProperty("delete-query");
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			int count = pstmt.executeUpdate();
			
			//Step 4 Read the result
			
			System.out.println(count+" Row(s) Dynamically Deleted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	//	Step 5 Close all the JDBC Objects
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}if(reader!=null) {
					reader.close();
				}
			}catch(Exception e){
				e.printStackTrace();
				
			}
		}
	}//end main method
}

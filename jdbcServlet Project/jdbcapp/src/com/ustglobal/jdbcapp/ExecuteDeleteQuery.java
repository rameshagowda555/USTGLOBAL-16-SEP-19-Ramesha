package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//Step 1 Load the Driver
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step2 Get the Connection
			
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue SQL Query
			String sql = " delete from employee_info where id = 6";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//Step 4 Read the result
			
			System.out.println(count+" Row(s) Deleted");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
//		Step 5 Close all the JDBC Objects
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					conn.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}

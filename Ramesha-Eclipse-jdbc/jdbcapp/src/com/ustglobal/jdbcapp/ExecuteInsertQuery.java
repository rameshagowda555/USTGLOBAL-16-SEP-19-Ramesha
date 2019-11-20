package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try {
			//Step 1 Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//Step 2 Get the Connection
			String url = "jdbc:mysql://Localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue Sql query
			String sql = " insert into employee_info values(8,'Sanmathi',10000,'F') ";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//Step 4 Read the Result
			System.out.println(count + " Row(s) Inserted ");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//Step 5 Close all JDBC Objects
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}//end of main
}//end of ExecuteInsertQuery

package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class DynamInsertQuery {
public static void main(String[] args) {
		
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//Step 1 Load the Driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Step 2 Get the Connection
			String url = "jdbc:mysql://Localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue Sql query
			String sql = " insert into employee_info values(?,?,?,?)";
			//stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			
			//Step 4 Read the Result
			System.out.println(count + " Row(s) PreparedStatement Dynamically Insert ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Step 5 Close all JDBC Objects
		finally {
			try {
				if(conn!=null) {
					conn.close();
				}
//				if(stmt!=null) {
//					stmt.close();
//				}
				if(pstmt!=null) {
					pstmt.close();
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}//end of main
}//end of ExecuteInsertQuery


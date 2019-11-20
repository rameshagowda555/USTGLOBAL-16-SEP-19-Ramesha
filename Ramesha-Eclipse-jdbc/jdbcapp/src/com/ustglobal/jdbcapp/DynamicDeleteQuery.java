package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {
	public static void main(String[] args) {
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//Step 1 Load the Driver
			
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step2 Get the Connection
			
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue SQL Query
			String sql = " delete from employee_info where id = ?";
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
				}
			}catch(SQLException e){
				e.printStackTrace();
				
			}
		}
	}//end main method
}//end dynamic delete query

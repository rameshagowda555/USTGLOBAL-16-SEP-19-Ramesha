package com.ustglobal.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeDetails extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = "jdbc:mysql://Localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id=?";
		
		String eid = req.getParameter("empid");
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step 2 Get the Connection
			conn = DriverManager.getConnection(url);

			//Step 3 Issue the SQL Query
			pstmt = conn.prepareStatement(sql);
			
			int empid = Integer.parseInt(eid);
			pstmt.setInt(1, empid);

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
				
				PrintWriter out = resp.getWriter();
				
				out.println("<html>");
				out.println("<body>");
				out.println("<table align='center' border='1'>");
				
				out.println("<tr>");
				out.println("<th>Id</th>");
				out.println("<th>Name</th>");
				out.println("<th>Salary</th>");
				out.println("<th>Gender</th>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td>"+emp_id+"</td>");
				out.println("<td>"+name+"</td>");
				out.println("<td>"+sal+"</td>");
				out.println("<td>"+gender+"</td>");
				out.println("</tr>");
				
				out.println("<table>");
				out.println("</body>");
				out.println("</html>");

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
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

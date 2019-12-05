package com.ustglobal.appdevelopment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.appdevelopment.dto.PhoneSimulatorBean;

public class PhoneSimulatorDaoImpl implements PhoneSimulatorDao {

	@Override
	public List<PhoneSimulatorBean> showAllContacts() {
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "select * from contact";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<PhoneSimulatorBean> result = new ArrayList<PhoneSimulatorBean>();
			while(rs.next()) {
				PhoneSimulatorBean bean = new PhoneSimulatorBean();

				String name = rs.getString("Name");
				bean.setName(name);

				long number = rs.getLong("Number");
				bean.setNumber(number);

				String groupName = rs.getString("GroupName");
				bean.setGroupName(groupName);

				result.add(bean);
			}
			return result;

		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(stmt!=null) {
					stmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}

		}//end of try-catch-finally
	}//end of showAllContacts()
	//******************************************************************************
	@Override
	public PhoneSimulatorBean searchForContact(String name) {
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "select * from contact where name =?";
		Scanner scn = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				PhoneSimulatorBean bean = new PhoneSimulatorBean();
				bean.setName(rs.getString("name"));
				bean.setNumber(rs.getLong("number"));
				bean.setGroupName(rs.getString("groupname"));
				return bean;
			}else {
				return null;
			}

		}catch (Exception e) {
			e.printStackTrace();
			return null;
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
			}catch(Exception e) {
				e.printStackTrace();
			}//end of try-catch-finally
		}



	}//end of searchForContact()
	//**************************************************************************
	@Override
	public int addContact(PhoneSimulatorBean bean) {
		String url = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql = "insert into contact values(?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Name");
			String name = scn.next();
			pstmt.setString(1, name);

			System.out.println("Enter Number");
			long number = scn.nextLong();
			pstmt.setLong(2, number);

			System.out.println("Enter GroupName");
			String groupName = scn.next();
			pstmt.setString(3, groupName);

			int count = pstmt.executeUpdate();
			return count;

		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}

		}//end of try-catch-finally
	}
	//*********************************************************************************************
	@Override
	public int deleteContact(PhoneSimulatorBean bean) {
		String url1 = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql1 = "delete from contact where name = ?";
		Connection conn1 = null;
		PreparedStatement pstmt1 = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn1 = DriverManager.getConnection(url1);
			pstmt1 = conn1.prepareStatement(sql1);
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Name to Delete a Contact");
			String name = scn.next();
			pstmt1.setString(1, name);

			int count = pstmt1.executeUpdate();
			return count;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		finally {
			try {
				if(conn1!=null) {
					conn1.close();
				}if(pstmt1!=null) {
					pstmt1.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public int editContact(PhoneSimulatorBean bean) {
		String url2 = "jdbc:mysql://localhost:3306/contactfile?user=root&password=root";
		String sql2 = "update contact set number=?,groupname=? where name =?";
		Connection conn2 = null;
		PreparedStatement pstmt2 = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn2 = DriverManager.getConnection(url2);
			pstmt2 = conn2.prepareStatement(sql2);
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Name");
			String name = scn.next();
			pstmt2.setString(3, name);

			System.out.println("Enter Number");
			long number = scn.nextLong();
			pstmt2.setLong(1, number);

			System.out.println("Enter GroupName");
			String groupName = scn.next();
			pstmt2.setString(2, groupName);

			int count = pstmt2.executeUpdate();
			return count;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			try {
				if(conn2!=null) {
					conn2.close();
				}if(pstmt2!=null) {
					pstmt2.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
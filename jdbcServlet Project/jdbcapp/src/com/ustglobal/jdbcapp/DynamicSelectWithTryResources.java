package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DynamicSelectWithTryResources {
	public static void main(String[] args) {
		try (FileReader reader = new FileReader("db.properties")) {

			Properties prop = new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driver-class-name"));
			String url = prop.getProperty("url");
			String sql = prop.getProperty("dynamic-select-query");

			try (Connection conn = DriverManager.getConnection(url, prop);
					PreparedStatement pstmt = conn.prepareStatement(sql)) {

				String empid = args[0];
				int id = Integer.parseInt(empid);
				pstmt.setInt(1, id);

				try (ResultSet rs = pstmt.executeQuery()) {
					if (rs.next()) {
						System.out.println("Id : " + rs.getInt("id"));
						System.out.println("Name : " + rs.getString("name"));
						System.out.println("Salary : " + rs.getInt("sal"));
						System.out.println("Gender : " + rs.getString("gender"));
					}
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.ustglobal.empwebapp.util;

import com.ustglobal.empwebapp.dao.EmployeeDAO;
import com.ustglobal.empwebapp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDAOManager {
	private EmployeeDAOManager() {
		
	}
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}
}

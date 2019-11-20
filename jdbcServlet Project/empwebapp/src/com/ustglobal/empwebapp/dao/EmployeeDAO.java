package com.ustglobal.empwebapp.dao;

import com.ustglobal.empwebapp.dto.EmployeeInfo;
import com.ustglobal.empwebapp.util.EmployeeDAOManager;

public interface EmployeeDAO {
	//db operations
	public EmployeeInfo auth(int id,String password);//select
	public EmployeeInfo searchEmployee(int id);//dynamic select
	public boolean changePassword(int id,String password);//update
	public boolean registerEmployee(EmployeeInfo info);//insert
	
	
}//end of EmployeeDAO 

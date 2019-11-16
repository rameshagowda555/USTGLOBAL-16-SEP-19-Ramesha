package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import com.ustglobal.librarymanagementsystem.dto.UserBean;

public interface AdminService {

	public boolean registerUser(UserBean bean);

	public UserBean userLogin(int userId, String userPassword);

	public boolean addStudent(UserBean bean);

	public boolean removeStudent(int userId);

	public UserBean searchUser(int userId);

	public boolean updateStudent(UserBean bean);

	public List<UserBean> searchAllUser();

	public boolean addLibrarian(UserBean bean);

	public boolean removeLibrarian(int userId);

	public boolean updateLibrarian(UserBean bean);

}

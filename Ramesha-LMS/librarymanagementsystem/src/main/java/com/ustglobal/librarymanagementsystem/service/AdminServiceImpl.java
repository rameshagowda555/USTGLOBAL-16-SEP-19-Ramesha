package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagementsystem.dao.AdminDAO;
import com.ustglobal.librarymanagementsystem.dto.UserBean;
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDAO dao;
	@Override
	public UserBean userLogin(int userId, String userPassword) {
		UserBean bean = new UserBean();
		if(userId!=0||userPassword!=null) {
			return dao.userLogin(userId, userPassword); 
		}else if(userPassword.length()>=8) {
			return dao.userLogin(userId, userPassword);
		}
		return null;
	}

	@Override
	public boolean addStudent(UserBean bean) {
		if(bean!=null) {
			return dao.addStudent(bean);
		}else {
			return false;
		}
	}

	@Override
	public boolean removeStudent(int userId) {
		if(userId!=0) {
			return dao.removeStudent(userId);
		}else {
			return false;
		}
	}

	@Override
	public boolean updateStudent(UserBean bean) {
		if(bean!=null) {
			return dao.updateStudent(bean);
		}else {
			return false;
		}
		
	}

	@Override
	public List<UserBean> searchAllUser() {
		return dao.searchAllUser();
	}

	@Override
	public boolean addLibrarian(UserBean bean) {
		if(bean!=null) {
			return dao.addLibrarian(bean);
		}else {
			return false;
		}
	}

	@Override
	public boolean removeLibrarian(int librarianId) {
		if(librarianId!=0) {
			return dao.removeLibrarian(librarianId);
		}else {
			return false;
		}
	}

	@Override
	public boolean updateLibrarian(UserBean bean) {
		if(bean!=null) {
			return dao.updateLibrarian(bean);
		}else {
			return false;
		}
	}

	@Override
	public UserBean searchUser(int userId) {
		if(userId!=0) {
			return dao.searchUser(userId);
		}else {
			return null;
		}
	}

	@Override
	public boolean registerUser(UserBean bean) {
		return dao.registerUser(bean);
	}

}

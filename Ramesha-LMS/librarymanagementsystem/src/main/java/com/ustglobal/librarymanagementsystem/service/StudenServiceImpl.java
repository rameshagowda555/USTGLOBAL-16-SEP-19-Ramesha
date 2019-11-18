package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagementsystem.dao.StudentDAO;
import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BooksRegistration;

@Service
public class StudenServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;
	//	@Override
	//	public StudentBean studentLogin(int studentId, String studentPassword) {
	//		StudentBean bean = new StudentBean();
	//		if(studentId!=0||studentPassword!=null) {
	//			return dao.studentLogin(studentId, studentPassword); 
	//		}else if(studentPassword.length()>=8) {
	//			return dao.studentLogin(studentId, studentPassword);
	//		}
	//		return null;
	//
	//	}
	@Override
	public BookBean searchBookByName(String bookName) {
		if(bookName!=null) {
			return dao.searchBookByName(bookName);
		}else {
			return null;
		}

	}

	@Override
	public List<BookBean> searchAllBooks() {
		return dao.searchAllBooks();
	}
	@Override
	public boolean requestBook(BooksRegistration bean) {
		if(bean!=null) {
			return dao.requestBook(bean);
		}else {
			return false;
		}

	}
	@Override
	public boolean cancelRequest(int registrationId) {
		if(registrationId!=0) {
			return dao.cancelRequest(registrationId);
		}else {
			return false;
		}

	}

}

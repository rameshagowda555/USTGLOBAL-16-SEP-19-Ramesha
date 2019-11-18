package com.ustglobal.librarymanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagementsystem.dao.LibrarianDAO;
import com.ustglobal.librarymanagementsystem.dto.BookBean;
import com.ustglobal.librarymanagementsystem.dto.BooksRegistration;
import com.ustglobal.librarymanagementsystem.dto.IssuedBookDetails;

@Service
public class LibrarianServiceImpl implements LibrarianService {

	@Autowired
	private LibrarianDAO dao;

	@Override
	public boolean addBook(BookBean bean) {
		return dao.addBook(bean);
	}
	@Override
	public BookBean searchBook(String bookName) {
		if(bookName!=null) {
			return dao.searchBook(bookName);
		}else {
			return null;
		}
	}
	@Override
	public List<BookBean> searchAllBooks() {
		return dao.searchAllBooks();
	}
	@Override
	public boolean removeBook(int bookId) {
		return dao.removeBook(bookId);
	}
	@Override
	public boolean acceptRequest(int registrationId) {
		return dao.acceptRequest(registrationId);
	}
	@Override
	public boolean issueBook(int studentId, int bookId) {
		return dao.issueBook(studentId, bookId);
	}

	@Override
	public List<BooksRegistration> showAllRequest() {
		return dao.showAllRequest();
	}

	@Override
	public List<IssuedBookDetails> showAllIssuedBooks() {
		return dao.showAllIssuedBooks();
	}

}

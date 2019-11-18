package com.ustglobal.librarymanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="book")
public class BookBean {
	@Id
	@Column
	private int bookId;
	@Column
	private String bookName;
	@Column
	private String author;
	@Column
	private int noOfCopies;

}

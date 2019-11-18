package com.ustglobal.librarymanagementsystem.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="user")
public class UserBean {
	@Id
	@Column
	private int userId;
	@Column
	private String userName;
	@Column
	private String userType;
	@Column(unique = true)
	private String userEmail;
	@Column
	private String userPassword;
	@Column
	private String userGender;
	@Column
	private long userMobileNo;

}

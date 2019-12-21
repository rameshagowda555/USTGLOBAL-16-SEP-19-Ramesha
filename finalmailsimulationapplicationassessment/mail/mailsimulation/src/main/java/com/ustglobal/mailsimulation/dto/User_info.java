package com.ustglobal.mailsimulation.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user_info")
public class User_info {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String user_name;
	@Column(unique = true)
	private String email;
	@Column
	private String password;
}

package com.ustglobal.mailsimulation.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "mail_info")
public class Mail_info {
	@Id
	@Column
	@GeneratedValue
	private int mid;
	@Column
	private String subject;
	@Column
	private String message;
	@Column
	private String status;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "from_id",nullable = false)
	private User_info user;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "to_id",nullable = false)
	private User_info user_info;

}

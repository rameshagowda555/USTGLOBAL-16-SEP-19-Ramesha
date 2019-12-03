package com.ustglobal.springmvcassessment.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "product")
public class ProductBean {
	@Id
	@Column
	@GeneratedValue
	private int pid;
	@Column
	private String pname;

	private int price; 

 


}

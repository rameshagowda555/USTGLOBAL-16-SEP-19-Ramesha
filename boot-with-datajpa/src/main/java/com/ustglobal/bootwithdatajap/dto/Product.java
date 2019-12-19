package com.ustglobal.bootwithdatajap.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product_info")
public class Product {
	@Id
	@Column
	private int id;
	@Column(unique = true)
	private String name;
	@Column
	private String catagory;
	@Column
	private int quantity;
	@Column
	private double price;
}

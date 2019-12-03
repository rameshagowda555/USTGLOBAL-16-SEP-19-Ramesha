package com.ustglobal.springmvcassessment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name = "retorder")
public class OrderBean {
	@Id
	@Column
	@GeneratedValue
	private int oid;
	@Column
	private int quantity;
	@Column
	private int amount;
	
	
	@Exclude
	//passing foreign key
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private RetailerBean retailerBean;
	
	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pid" , nullable = false)
	private ProductBean productBean;

}

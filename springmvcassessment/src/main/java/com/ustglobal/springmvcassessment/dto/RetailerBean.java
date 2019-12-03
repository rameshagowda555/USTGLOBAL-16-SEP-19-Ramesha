package com.ustglobal.springmvcassessment.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
@Data
@Entity
@Table(name = "retailer")
public class RetailerBean {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column(unique = true)
	private String email; 
	@Column
	private String password;
	
	
    
	





}

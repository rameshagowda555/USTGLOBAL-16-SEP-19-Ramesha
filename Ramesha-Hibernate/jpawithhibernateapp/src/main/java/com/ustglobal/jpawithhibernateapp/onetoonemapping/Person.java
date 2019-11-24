package com.ustglobal.jpawithhibernateapp.onetoonemapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="person")
public class Person {
	@Id
	@Column
	private int pid;
	@Column
	private String name;
	@OneToOne(cascade = CascadeType.ALL)//one to one mapping and perform all the Operation
	@JoinColumn(name = "vid")//it establish a relation and it make coloumn as foreign key and here we pass primary Key
	private VoterCard voterCard;
	
}

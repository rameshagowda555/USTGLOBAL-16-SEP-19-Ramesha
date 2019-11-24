package com.ustglobal.jpawithhibernateapp.onetoonemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="voterCard")
public class VoterCard {
	@Id
	@Column
	private int vid;
	@Column
	private String vname;
	@Exclude
	@OneToOne(mappedBy ="voterCard")//Bi-directioinal one to one mapping
	private Person person;
}

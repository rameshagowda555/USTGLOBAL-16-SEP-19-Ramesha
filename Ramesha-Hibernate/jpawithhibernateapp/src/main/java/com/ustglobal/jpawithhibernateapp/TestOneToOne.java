package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoonemapping.Person;
import com.ustglobal.jpawithhibernateapp.onetoonemapping.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {
		
		VoterCard vc = new VoterCard();
		vc.setVid(1);
		vc.setVname("Ram");
		
		Person person = new Person();
		person.setPid(1);
		person.setName("Ram");
		person.setVoterCard(vc);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			VoterCard vCard = entityManager.find(VoterCard.class,1);//bidirectional from vid we are getting pid
			System.out.println("personId by passing voterId"+vCard.getPerson().getPid());
		//	entityManager.persist(person);
			System.out.println("Record Saved Successfully");
			entityTransaction.commit();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}

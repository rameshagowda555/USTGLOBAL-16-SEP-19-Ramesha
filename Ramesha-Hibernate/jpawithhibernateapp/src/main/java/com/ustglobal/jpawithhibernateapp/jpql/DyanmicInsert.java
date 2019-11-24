package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DyanmicInsert {
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction =null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "insert into Product values(:pid,:pname,:quantity)";
			Query query = entityManager.createNativeQuery(jpql);
			query.setParameter("pid", 104);
			query.setParameter("pname", "Pencil");
			query.setParameter("quantity", 05);
			int count = query.executeUpdate();
			System.out.println(count+"Row(s) Inserted");
			entityTransaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}
}

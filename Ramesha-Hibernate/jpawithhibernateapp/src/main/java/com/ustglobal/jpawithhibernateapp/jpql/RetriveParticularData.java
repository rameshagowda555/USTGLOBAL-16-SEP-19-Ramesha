package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class RetriveParticularData {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "select pname from Product";//jpql query
		Query query = entityManager.createQuery(jpql);//it return list of results
		List<String> list = query.getResultList();//get list of values
		for(String p:list) {
			System.out.println("Product Name : "+p);
			System.out.println("********************************");
		}//end of forEach
		entityManager.close();
	}//end of main()
}//end of RetriveParticularData

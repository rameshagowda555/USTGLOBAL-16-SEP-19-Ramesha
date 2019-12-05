package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class RetriveDemo {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from Product";//jpql query
		Query query = entityManager.createQuery(jpql);//it return list of results
		List<Product> list = query.getResultList();//get list of values
		for(Product p:list) {
			System.out.println("Product id : "+p.getPid());
			System.out.println("Product Name : "+p.getPname());
			System.out.println("Product Quantity : "+p.getQuantity());
			System.out.println("********************************");
		}//end of forEach
		entityManager.close();
	}//end of main()
}//end of RetriveDemo
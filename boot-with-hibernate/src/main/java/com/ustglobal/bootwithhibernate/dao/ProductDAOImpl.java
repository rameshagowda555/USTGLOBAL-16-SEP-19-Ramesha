package com.ustglobal.bootwithhibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.bootwithhibernate.dto.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean updateProduct(Product product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product p = manager.find(Product.class, product.getId());
			p.setId(product.getId());
			p.setName(product.getName());
			p.setPrice(product.getPrice());
			p.setCatagory(product.getCatagory());
			p.setQuantity(product.getQuantity());
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean deleteProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Product p = manager.find(Product.class, id);
			manager.remove(p);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = "from Product where name=:name";
			TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
			typedQuery.setParameter("name", name);
			Product product = typedQuery.getSingleResult();
			manager.remove(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteProductByCatagory(String catagory) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = "from Product where catagory=:catagory";
			TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
			typedQuery.setParameter("catagory", catagory);
			List<Product> products = typedQuery.getResultList();
			for (Product product : products) {
				manager.remove(product);
				;
			}
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Product getProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Product.class, id);
	}

	@Override
	public Product getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from Product where name=:name";
			TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
			typedQuery.setParameter("name", name);
			Product product = typedQuery.getSingleResult();
			return product;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Product> getProductByCatagory(String catagory) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product where catagory=:catagory";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		typedQuery.setParameter("catagory", catagory);
		return typedQuery.getResultList();
	}

	@Override
	public List<Product> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from Product";
		TypedQuery<Product> typedQuery = manager.createQuery(jpql, Product.class);
		return typedQuery.getResultList();
	}

}

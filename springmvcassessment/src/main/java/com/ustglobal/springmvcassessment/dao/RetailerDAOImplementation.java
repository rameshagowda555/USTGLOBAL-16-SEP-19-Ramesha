package com.ustglobal.springmvcassessment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import com.ustglobal.springmvcassessment.dto.OrderBean;
import com.ustglobal.springmvcassessment.dto.ProductBean;
import com.ustglobal.springmvcassessment.dto.RetailerBean;

@Repository
public class RetailerDAOImplementation implements RetailerDAO{

	/*
	 * private EntityManagerFactory factory =
	 * Persistence.createEntityManagerFactory("Retailer-unit");
	 */
	@PersistenceUnit
	private EntityManagerFactory factory;//Automatically bean creates Object of factory

	@Override
	public RetailerBean login(int id, String password) {
		String jpql = "from RetailerBean where id =:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		//Query query = manager.createQuery(jpql);
		TypedQuery<RetailerBean> query = manager.createQuery(jpql,RetailerBean.class);//to avoid downcasting
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
			RetailerBean bean = query.getSingleResult();
			return bean;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public int register(RetailerBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	@Override
	public boolean deleteRetailer(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			RetailerBean bean = manager.find(RetailerBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ProductBean searchRetailer(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		return manager.find(ProductBean.class, id);


	}



	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			RetailerBean retBean = manager.find(RetailerBean.class, id);
			retBean.setPassword(password);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public int makeOrder(OrderBean obean) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ProductBean productbean;
		try {
			
			manager.persist(obean);
			transaction.commit();
			return obean.getOid();
		}catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public OrderBean viewOrder(int id) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		return manager.find(OrderBean.class, id);
	}

}

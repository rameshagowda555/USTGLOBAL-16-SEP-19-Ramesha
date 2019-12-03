package com.ustglobal.springmvcassesment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springmvcassesment.dto.OrderBean;
import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.RetailerBean;

@Repository
public class RetailerDaoImpl implements RetailerDao {

	@PersistenceUnit
	EntityManagerFactory factory;// = Persistence.createEntityManagerFactory("test");
	// **************************************************************************

	@Override
	public int registerRetailer(RetailerBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	// ***************************************************************************
	@Override
	public RetailerBean login(int id, String password) {
		String jpql = "from RetailerBean where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<RetailerBean> query = manager.createQuery(jpql, RetailerBean.class);// it accept generic query
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			RetailerBean bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// ***************************************************************************
	@Override
	public ProductBean searchProduct(int productid) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(ProductBean.class, productid);
	}

	// **************************************************************************
	@Override
	public boolean updateRetailer(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction entitytransaction = manager.getTransaction();
		entitytransaction.begin();
		RetailerBean bean1 = manager.find(RetailerBean.class, id);
		bean1.setPassword(password);
		entitytransaction.commit();
		return true;
	}

	// **************************************************************************
//	@Override
//	public OrderBean totalAmountPayable(OrderBean bean) {
//	
//		EntityManager entityManager = factory.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
//		transaction.begin();
//		String jpql = "select priceperunit,quantity from OrderBean where orderid=:id";//jpql query
//		Query query = entityManager.createQuery(jpql);//it return list of results
//		query.setParameter("id","orderid");
//		List<OrderBean> list = query.getResultList();//get list of values
//		for(OrderBean ans:list) {
//			System.out.println("Product price per unit : "+ans.getPriceperunit());
//			System.out.println("Product Quantity : "+ans.getQuantity());
//			System.out.println("********************************");
//		}
		
//		String jpql = "select priceperunit,quantity from OrderBean";
//		TypedQuery<OrderBean> query = entityManager.createQuery(jpql, OrderBean.class);// it accept generic query
//		query.
//		OrderBean value = query.getSingleResult();
//		OrderBean obean = entityManager.find(OrderBean.class, bean.getOrderid());
//		double price = obean.getPriceperunit();
//		int quant = obean.getQuantity();
//		double totalprice = price*quant;
		
//		obean.setAmountpayable(totalprice);
//		obean.setAmountpayable(value.getPriceperunit()*obean.getQuantity());
//		int quants = obean.getQuantity();
//		transaction.commit();
//		return totalprice;
//		return bean;
//	}

	// ***************************************************************************
	@Override
	public OrderBean retriveOrder(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(OrderBean.class, id);
	}
	// **************************************************************************

	@Override
	public OrderBean orderDetails(int orderid) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(OrderBean.class, orderid);
	}
}

package com.ustglobal.springmvcassessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.springmvcassessment.dao.RetailerDAO;
import com.ustglobal.springmvcassessment.dto.OrderBean;
import com.ustglobal.springmvcassessment.dto.ProductBean;
import com.ustglobal.springmvcassessment.dto.RetailerBean;

@Service
public class RetailerServiceImpl implements RetailerService{
	@Autowired
	private RetailerDAO dao;
	
	@Override
	public RetailerBean login(int id, String password) {
		return dao.login(id, password);
	
	}

	@Override
	public int register(RetailerBean bean) {
		//logic to check email and password
		return dao.register(bean);
		
	}

	@Override
	public boolean deleteRetailer(int id) {
		return dao.deleteRetailer(id);
	}

	@Override
	public ProductBean searchRetailer(int id) {
	
		return dao.searchRetailer(id);
	}



	@Override
	public boolean changePassword(int id, String password) {
		
		return dao.changePassword(id, password);
	}

	@Override
	public int makeOrder(OrderBean bean) {
		return dao.makeOrder(bean);
		
	}

	@Override
	public OrderBean viewOrder(int id) {
		return dao.viewOrder(id);
	}
	

}

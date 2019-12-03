package com.ustglobal.springmvcassessment.dao;

import com.ustglobal.springmvcassessment.dto.OrderBean;
import com.ustglobal.springmvcassessment.dto.ProductBean;
import com.ustglobal.springmvcassessment.dto.RetailerBean;

public interface RetailerDAO {
	public RetailerBean login(int id,String password);
	public int register(RetailerBean bean);
	public boolean deleteRetailer(int id);
	public ProductBean searchRetailer(int id);
	public boolean changePassword(int id,String password);
	public int makeOrder(OrderBean bean);
	public OrderBean viewOrder(int id);
}

package com.ustglobal.stockmanagementsystem.dao;

import java.util.List;

import com.ustglobal.stockmanagementsystem.dto.Order_info;
import com.ustglobal.stockmanagementsystem.dto.Products_Info;

public interface ProductDAO {

	public Products_Info getProductByName(String name);

	public List<Products_Info> getProductByCategory(String category);
	
	public List<Products_Info> getProductByCompany(String company);

	public boolean addProduct(Products_Info product);

	public boolean updateProduct(Products_Info product);

	public boolean deleteProductById(int id);
	
	public List<Products_Info> showAllProducts();
	
	public boolean orderProduct(Order_info order,int quantity,int id);
}

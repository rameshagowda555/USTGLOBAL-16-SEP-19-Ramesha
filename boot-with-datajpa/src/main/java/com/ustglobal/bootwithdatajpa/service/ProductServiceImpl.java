package com.ustglobal.bootwithdatajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.bootwithdatajap.dto.Product;
import com.ustglobal.bootwithdatajpa.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repo;

	@Override
	public boolean addProduct(Product product) {
		repo.save(product);
		return true;
	}

	@Override
	public boolean updateProduct(Product product) {
		repo.update(product.getId(), product.getName(), product.getCatagory(), product.getQuantity(),
				product.getPrice());
		return true;
	}

	@Override
	public boolean deleteProductById(int id) {
		repo.deleteById(id);
		return true;
	}

	@Override
	public boolean deleteProductByName(String name) {
		repo.deleteByName(name);
		return true;
	}

	@Override
	public boolean deleteProductByCatagory(String catagory) {
		repo.deleteByCatagory(catagory);
		return true;
	}

	@Override
	public Product getProductById(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Product getProductByName(String name) {
		return repo.findByName(name);
	}

	@Override
	public List<Product> getProductByCatagory(String catagory) {
		return repo.findByCatagory(catagory);
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();
	}

}

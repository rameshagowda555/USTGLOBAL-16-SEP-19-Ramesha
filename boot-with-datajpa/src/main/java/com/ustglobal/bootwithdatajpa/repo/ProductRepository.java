package com.ustglobal.bootwithdatajpa.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ustglobal.bootwithdatajap.dto.Product;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {
	@Modifying
	@Query("update Product set name=:name, catagory=:catagory, price=:p, quantity=:quantity where id=:id")
	void update(@Param("id") int id, @Param("name") String name, @Param("catagory") String catagory,
			@Param("quantity") int quantity, @Param("p") double price);

	void deleteByName(String name);

	void deleteByCatagory(String catagory);

	Product findByName(String name);

	List<Product> findByCatagory(String catagory);

}

package com.ustglobal.springmvcassesment.dto;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import net.bytebuddy.build.ToStringPlugin.Exclude;




@Entity
public class OrderBean {
	@Id
	@Column
	@GeneratedValue
	private int orderid;
	@Column
	private String productname;
	@Column
	private double priceperunit;
	@Column
	private int quantity;
	@Column
	private double amountpayable;
	@Column
	private int retailerId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="productid", nullable=false)
	private ProductBean productBean;
	
	@Exclude
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id",nullable=false)
	private RetailerBean retailerBean;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getPriceperunit() {
		return priceperunit;
	}

	public void setPriceperunit(double priceperunit) {
		this.priceperunit = priceperunit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAmountpayable() {
		return amountpayable;
	}

	public void setAmountpayable(double amountpayable) {
		this.amountpayable = amountpayable;
	}

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public ProductBean getProductBean() {
		return productBean;
	}

	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}

	public RetailerBean getRetailerBean() {
		return retailerBean;
	}

	public void setRetailerBean(RetailerBean retailerBean) {
		this.retailerBean = retailerBean;
	}

	@Override
	public String toString() {
		return "OrderBean [orderid=" + orderid + ", productname=" + productname + ", priceperunit=" + priceperunit
				+ ", quantity=" + quantity + ", amountpayable=" + priceperunit*quantity + ", retailerId=" + retailerId +"]";
	}


	
}

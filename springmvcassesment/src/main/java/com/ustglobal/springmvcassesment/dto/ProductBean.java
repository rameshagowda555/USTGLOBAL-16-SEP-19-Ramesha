package com.ustglobal.springmvcassesment.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="Product")
public class ProductBean {
	@Id
	@Column
	@GeneratedValue
	private int productid;
	@Column
	private String productname;
	@Exclude
	@OneToMany(mappedBy = "productBean")
	private List<OrderBean> orderBean;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public List<OrderBean> getOrderBean() {
		return orderBean;
	}
	public void setOrderBean(List<OrderBean> orderBean) {
		this.orderBean = orderBean;
	}


}

package com.cg.capstoreapp.beans;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class MerchantBean {


	private String emailId;
	
	private String merchantName;
	
	private String phoneNo;
	
	private String type;
	
	private List<OrderBean> order;
	private List<ProductBean> product;

	private String password;
	
	private List<CouponsBean> coupons;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<OrderBean> getOrder() {
		return order;
	}
	public void setOrder(List<OrderBean> order) {
		this.order = order;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<CouponsBean> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<CouponsBean> coupons) {
		this.coupons = coupons;
	}
	
	public List<ProductBean> getProduct() {
		return product;
	}
	public void setProduct(List<ProductBean> product) {
		this.product = product;
	}
	public MerchantBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MerchantBean(String emailId, String merchantName, String phoneNo, String type, List<OrderBean> order,
			List<ProductBean> product, String password, List<CouponsBean> coupons) {
		super();
		this.emailId = emailId;
		this.merchantName = merchantName;
		this.phoneNo = phoneNo;
		this.type = type;
		this.order = order;
		this.product = product;
		this.password = password;
		this.coupons = coupons;
	}
	@Override
	public String toString() {
		return "MerchantBean [emailId=" + emailId + ", merchantName=" + merchantName + ", phoneNo=" + phoneNo
				+ ", type=" + type + ", order=" + order + ", product=" + product + ", password=" + password
				+ ", coupons=" + coupons + "]";
	}
	
	
}

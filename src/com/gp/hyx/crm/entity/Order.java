package com.gp.hyx.crm.entity;

import java.util.Date;

/**
 * 订单实体
 * @author Ethan_Han
 *
 */
public class Order {

	private Integer id; // 编号
	private Customer customer; // 所属客户
	private String orderNo; // 订单号
	private Date orderDate; // 订购日期
	private String address; // 送货地址
	private Integer state; // 状态 0 未回款 2 已回款
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
	
}

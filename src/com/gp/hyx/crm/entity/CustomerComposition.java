package com.gp.hyx.crm.entity;

/**
 * 客户构成分析实体
 * @author Ethan_Han
 *
 */
public class CustomerComposition {

	private String customerLevel; // 客户等级
	private int customerNum; // 客户数量
	
	public String getCustomerLevel() {
		return customerLevel;
	}
	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}
	public int getCustomerNum() {
		return customerNum;
	}
	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}
	
	
}

package com.gp.hyx.crm.entity;
/**
 * 客户贡献分析实体
 * @author Ethan_Han
 *
 */

public class CustomerContribution {

	private String name; // 客户名称
	private float contribution; // 贡献总金额
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getContribution() {
		return contribution;
	}
	public void setContribution(float contribution) {
		this.contribution = contribution;
	}
	
	
}

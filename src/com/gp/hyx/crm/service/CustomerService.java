package com.gp.hyx.crm.service;

import java.util.List;
import java.util.Map;

import com.gp.hyx.crm.entity.Customer;
import com.gp.hyx.crm.entity.CustomerComposition;
import com.gp.hyx.crm.entity.CustomerContribution;
import com.gp.hyx.crm.entity.CustomerServiceAnalysis;

/**
 * 客户Service接口
 * @author Ethan_Han
 *
 */
public interface CustomerService {

	/**
	 * 查询客户集合
	 * @param map
	 * @return
	 */
	public List<Customer> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 添加客户
	 * @param customer
	 * @return
	 */
	public int add(Customer customer);
	
	/**
	 * 修改客户
	 * @param customer
	 * @return
	 */
	public int update(Customer customer);
	
	/**
	 * 删除客户
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * 通过Id查找实体
	 * @param id
	 * @return
	 */
	public Customer findById(Integer id);
	
	/**
	 * 查找流失客户，并且添加到流失客户表里
	 */
	public void checkCustomerLoss();
	
	/**
	 * 查询客户贡献
	 * @param map
	 * @return
	 */
	public List<CustomerContribution> findCustomerContribution(Map<String,Object> map);
	
	/**
	 * 查询客户贡献记录数
	 * @param map
	 * @return
	 */
	public Long getTotalCustomerContribution(Map<String,Object> map);
	
	/**
	 * 查询客户构成
	 * @return
	 */
	public List<CustomerComposition> findCustomerComposition();
	
	/**
	 * 查询客户服务分析
	 * @return
	 */
	public List<CustomerServiceAnalysis> findCustomerServiceAnalysis();



}

package com.gp.hyx.crm.service;

import java.util.List;
import java.util.Map;

import com.gp.hyx.crm.entity.CustomerLoss;


/**
 * 客户流失Service接口
 * @author Ethan_Han
 *
 */

public interface CustomerLossService {

	/**
	 * 查询客户流失集合
	 * @param map
	 * @return
	 */
	public List<CustomerLoss> find(Map<String,Object> map);
	
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 通过Id查找实体
	 * @param id
	 * @return
	 */
	public CustomerLoss findById(Integer id);
	
	/**
	 * 修改客户流失记录
	 * @param customerLoss
	 * @return
	 */
	public int update(CustomerLoss customerLoss);
	
	
}

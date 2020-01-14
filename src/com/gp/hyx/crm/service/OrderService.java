package com.gp.hyx.crm.service;

import java.util.List;
import java.util.Map;

import com.gp.hyx.crm.entity.Order;


/**
 * 订单Service接口
 * @author Ethan_Han
 *
 */

public interface OrderService {

	/**
	 * 查询订单集合
	 * @param map
	 * @return
	 */
	public List<Order> find(Map<String,Object> map);
	
	
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
	public Order findById(Integer id);
	
	
}

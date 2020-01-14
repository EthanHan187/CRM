package com.gp.hyx.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gp.hyx.crm.dao.OrderDao;
import com.gp.hyx.crm.entity.Order;
import com.gp.hyx.crm.service.OrderService;


/**
 * 订单Service实现类
 * @author Ethan_Han
 *
 */

@Service("orderService")
public class OrderServiceImpl implements OrderService{

	@Resource
	private OrderDao orderDao;
	
	@Override
	public List<Order> find(Map<String, Object> map) {
		return orderDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return orderDao.getTotal(map);
	}

	@Override
	public Order findById(Integer id) {
		return orderDao.findById(id);
	}

}

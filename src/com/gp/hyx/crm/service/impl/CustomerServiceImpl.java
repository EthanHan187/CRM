package com.gp.hyx.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gp.hyx.crm.dao.CustomerDao;
import com.gp.hyx.crm.dao.CustomerLossDao;
import com.gp.hyx.crm.dao.OrderDao;
import com.gp.hyx.crm.entity.Customer;
import com.gp.hyx.crm.entity.CustomerComposition;
import com.gp.hyx.crm.entity.CustomerContribution;
import com.gp.hyx.crm.entity.CustomerLoss;
import com.gp.hyx.crm.entity.CustomerServiceAnalysis;
import com.gp.hyx.crm.entity.Order;
import com.gp.hyx.crm.service.CustomerService;



/**
 * 客户Service接口
 * @author Ethan_Han
 *
 */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Resource
	private CustomerDao customerDao;
	
	@Resource
	private CustomerLossDao customerLossDao;
	
	@Resource
	private OrderDao orderDao;
	
	@Override
	public List<Customer> find(Map<String, Object> map) {
		return customerDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerDao.getTotal(map);
	}

	@Override
	public int add(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.add(customer);
	}

	@Override
	public int update(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.update(customer);
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.delete(id);
	}

	@Override
	public Customer findById(Integer id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id);
	}

	@Override
	public void checkCustomerLoss() {
		List<Customer> customerList=customerDao.findLossCustomer(); // 查找流失客户
		for(Customer c:customerList){
			CustomerLoss customerLoss=new CustomerLoss(); // 实例化客户流失实体
			customerLoss.setCusNo(c.getKhno()); // 客户编号
			customerLoss.setCusName(c.getName()); // 客户名称
			customerLoss.setCusManager(c.getCusManager()); // 客户经理
			Order order=orderDao.findLastOrderByCusId(c.getId()); // 查找指定客户最近的订单
			if(order==null){
				customerLoss.setLastOrderTime(null);
			}else{
				customerLoss.setLastOrderTime(order.getOrderDate()); // 设置最近的下单日期				
			}
			customerLossDao.add(customerLoss); // 添加到客户流失表
			c.setState(1); // 客户状态修改成1 流失状态
			customerDao.update(c); 
		}
	}

	@Override
	public List<CustomerContribution> findCustomerContribution(
			Map<String, Object> map) {
		// TODO Auto-generated method stub
		return customerDao.findCustomerContribution(map);
	}

	@Override
	public Long getTotalCustomerContribution(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return customerDao.getTotalCustomerContribution(map);
	}

	@Override
	public List<CustomerComposition> findCustomerComposition() {
		// TODO Auto-generated method stub
		return customerDao.findCustomerComposition();
	}

	@Override
	public List<CustomerServiceAnalysis> findCustomerServiceAnalysis() {
		// TODO Auto-generated method stub
		return customerDao.findCustomerServiceAnalysis();
	}

}

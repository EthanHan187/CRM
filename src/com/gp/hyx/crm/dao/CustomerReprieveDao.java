package com.gp.hyx.crm.dao;

import java.util.List;
import java.util.Map;

import com.gp.hyx.crm.entity.CustomerReprieve;

/**
 * 客户流失暂缓措施Dao接口
 * @author Administrator
 *
 */
public interface CustomerReprieveDao {

	
	/**
	 * 查询客户流失暂缓措施集合
	 * @param map
	 * @return
	 */
	public List<CustomerReprieve> find(Map<String,Object> map);
	
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 修改客户流失暂缓措施
	 * @param customerReprieve
	 * @return
	 */
	public int update(CustomerReprieve customerReprieve);
	
	/**
	 * 添加客户流失暂缓措施
	 * @param customerReprieve
	 * @return
	 */
	public int add(CustomerReprieve customerReprieve);
	
	/**
	 * 删除客户流失暂缓措施
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
}

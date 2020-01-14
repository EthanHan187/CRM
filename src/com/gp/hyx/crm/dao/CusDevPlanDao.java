package com.gp.hyx.crm.dao;

import java.util.List;
import java.util.Map;

import com.gp.hyx.crm.entity.CusDevPlan;

/**
 * 客户开发计划Dao接口
 * @author Ethan_Han
 *
 */
public interface CusDevPlanDao {

	
	/**
	 * 查询客户开发计划集合
	 * @param map
	 * @return
	 */
	public List<CusDevPlan> find(Map<String,Object> map);
	
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 修改客户开发计划
	 * @param cusDevPlan
	 * @return
	 */
	public int update(CusDevPlan cusDevPlan);
	
	/**
	 * 添加客户开发计划
	 * @param cusDevPlan
	 * @return
	 */
	public int add(CusDevPlan cusDevPlan);
	
	/**
	 * 删除客户开发计划
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
}

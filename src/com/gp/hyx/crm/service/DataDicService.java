package com.gp.hyx.crm.service;

import java.util.List;
import java.util.Map;

import com.gp.hyx.crm.entity.DataDic;

/**
 * DataDic Service
 * @author Ethan_Han
 *
 */
public interface DataDicService {

	//查询数据字典集合
	public List<DataDic> find(Map<String,Object> map);
	
	//查询所有的数据字典名称集合
	public List<DataDic> findAll();
	
	//获取总记录数
	public Long getTotal(Map<String,Object> map);
	
	//修改数据字典
	public int update(DataDic dataDic);
	
	//添加数据字典
	public int add(DataDic dataDic);
	
	// 删除数据字典
	public int delete(Integer id);
}

package com.gp.hyx.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gp.hyx.crm.dao.DataDicDao;
import com.gp.hyx.crm.entity.DataDic;
import com.gp.hyx.crm.service.DataDicService;



/**
 * DataDicService 实现类
 * @author Ethan_Han
 *
 */
@Service("dataDicService")
public class DataDicServiceImpl implements DataDicService{

	@Resource
	private DataDicDao dataDicDao;
	
	@Override
	public List<DataDic> find(Map<String, Object> map) {
		return dataDicDao.find(map);
	}

	@Override
	public List<DataDic> findAll() {
		return dataDicDao.findAll();
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return dataDicDao.getTotal(map);
	}

	@Override
	public int update(DataDic dataDic) {
		return dataDicDao.update(dataDic);
	}

	@Override
	public int add(DataDic dataDic) {
		return dataDicDao.add(dataDic);
	}

	@Override
	public int delete(Integer id) {
		return dataDicDao.delete(id);
	}


}

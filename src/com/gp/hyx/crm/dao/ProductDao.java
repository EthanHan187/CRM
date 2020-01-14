package com.gp.hyx.crm.dao;

import java.util.List;
import java.util.Map;

import com.gp.hyx.crm.entity.Product;

/**
 * Product Dao
 * @author Ethan_Han
 *
 */
public interface ProductDao {

	

	public List<Product> find(Map<String,Object> map);
	

	public Long getTotal(Map<String,Object> map);

}

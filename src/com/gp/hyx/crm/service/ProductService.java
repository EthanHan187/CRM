package com.gp.hyx.crm.service;

import java.util.List;
import java.util.Map;

import com.gp.hyx.crm.entity.Product;

/**
 * Product Service
 * @author Ethan_Han
 *
 */
public interface ProductService {


	public List<Product> find(Map<String,Object> map);
	

	public Long getTotal(Map<String,Object> map);
}

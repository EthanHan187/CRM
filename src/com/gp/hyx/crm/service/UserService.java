package com.gp.hyx.crm.service;

import java.util.List;
import java.util.Map;

import com.gp.hyx.crm.entity.User;

/**
 * UserService接口
 * @author Ethan_Han
 *
 */
public interface UserService {
	/**
	 * 用户登录
	 */
		public User login(User user);

		//查询用户集合
		public List<User> find(Map<String,Object> map);
		
		//获取总记录数
		public Long getTotal(Map<String,Object> map);
		
		//修改用户
		public int update(User user);
		
		//添加用户
		public int add(User user);
		
		//删除用户
		public int delete(Integer id);

}

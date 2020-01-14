package com.gp.hyx.crm.quartz;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.gp.hyx.crm.service.CustomerService;

/**
 *  查找流失客户 定时任务
 * @author Ethan_Han
 *
 */

@Component
public class FindLossCustomerJob {

	@Resource
	private CustomerService customerService; // 客户Service
	
	/**
	 * 每天凌晨2点定期执行
	 */
	@Scheduled(cron="0 0 2 * * ?")
	//@Scheduled(cron="0 0/1 * * * ?")
	public void work(){
		customerService.checkCustomerLoss();
	}
}

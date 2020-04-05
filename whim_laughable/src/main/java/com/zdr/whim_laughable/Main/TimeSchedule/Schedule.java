package com.zdr.whim_laughable.Main.TimeSchedule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *消息队列
 */
@Component
public class Schedule {
	private static final Logger logger = LogManager.getLogger(Schedule.class.getName());

	@Scheduled(fixedDelay = 1000) // 每一秒运行一次
	public void Date1() {
	}

	@Scheduled(cron = "0 0/30 9-20 * * ?") // 每半小时执行一次
	public void Date2() {

	}
	
	@Scheduled(cron = "0 0 8-22/2 * * ? ") // 每天早8点到晚22点 每半小时执行一次
	public void Date3() {

	}
}

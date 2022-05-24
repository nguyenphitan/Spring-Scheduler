package com.nguyenphitan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
//@EnableAsync
public class ScheduledTasks {
	private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
	
	@Scheduled(cron = "* 20,40 * * * ?", zone = "UTC")
	public void scheduleTaskWithCronExpression() {
    	logger.info("Run cron.");
    }

//	@Async
//	@Scheduled(fixedRateString = "${test.fixedRate}")
//    public void scheduleTaskWithFixedRate() {
//    	logger.info("Run Fixed Rate.");
//    }

//	@Scheduled(fixedDelay = 2000)
//    public void scheduleTaskWithFixedDelay() {
//		try {
//			Thread.sleep(4000);
//		} catch (Exception e) {
//			
//		}
//		logger.info("Run Fixed Delay.");
//    }

//	@Scheduled(fixedRate = 1000 ,initialDelay = 10000)
//    public void scheduleTaskWithInitialDelay() {
//		logger.info("Run after initialDelay = 10000ms");
//    }
//
//	@Scheduled(cron = "15 * * * * ?", zone = "UTC")			// (cron = "giây phút giờ ngày tháng" , zone = "Múi giờ")
//	public void scheduleTaskWithCronExpression() {
//    	logger.info("15");
//    }
	
}

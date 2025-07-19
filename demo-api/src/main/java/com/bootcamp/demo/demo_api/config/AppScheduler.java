package com.bootcamp.demo.demo_api.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// ! @EnableScheduling -> Spring Manager find a bean with @Scheduled method
@Component
public class AppScheduler {
  @Scheduled(fixedDelay = 5000) // 5000ms = 5seconds
  public void sayHello() throws InterruptedException {
    long startTime = System.currentTimeMillis(); // unix time
    Thread.sleep(3000L);
    System.out.println("Hello world!!! startTime:" + startTime);
  }
  
  @Scheduled(fixedRate = 2000) // 5000ms = 5seconds
  public void sayGoodbye() throws InterruptedException {
    long startTime = System.currentTimeMillis(); // unix time
    Thread.sleep(3000L);
    System.out.println("Hello world!!! startTime:" + startTime);
  }

  @Scheduled(cron = "0 40 21 * * MON-FRI") // Run every weekday at 12PM and 6PM.
  public void runTask() {
    System.out.println("Testing cron job");
  }
}

package com.vfinance.dubbox.consumer;

import com.vfinance.dubbox.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by weichunhe on 2017/7/3.
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:consumer.xml"})
@EnableScheduling
public class ConsumerAPP {
    static int i = 0;

    @Autowired
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerAPP.class);
    }

    @Scheduled(fixedDelay = 5000, initialDelay = 0)
    public void testHello() {
        System.out.println(demoService.sayHello(i++ + ""));
    }
}

package com.vfinance.dubbox.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by weichunhe on 2017/7/3.
 */
@SpringBootApplication
@ImportResource("classpath:provider.xml")
public class ProviderAPP {
    public static void main(String[] args) {
        SpringApplication.run(ProviderAPP.class);
    }
}

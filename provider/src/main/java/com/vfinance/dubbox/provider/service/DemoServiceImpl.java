package com.vfinance.dubbox.provider.service;

import com.vfinance.dubbox.api.DemoService;

/**
 * Created by weichunhe on 2017/7/3.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {

        System.out.println(name);
        return "Hello " + name;
    }
}

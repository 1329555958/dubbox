package com.vfinance.dubbox.consumer;

import com.vfinance.dubbox.api.DemoService;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by weichunhe on 2017/7/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemoTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void hello() {
        System.out.println(demoService.sayHello("dubbox"));
    }
}

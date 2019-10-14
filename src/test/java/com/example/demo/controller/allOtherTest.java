package com.example.demo.controller;


import com.example.demo.configuration.AppConfig;
import org.apache.catalina.core.StandardContext;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DecimalFormat;
import java.text.NumberFormat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class allOtherTest {

    @Autowired
    private org.springframework.context.ApplicationContext context;

    @Test
    public void test() {

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("Number of bean definition >> " + beanDefinitionNames.length);

        for (String s: beanDefinitionNames) {
            System.out.println(s);
        }
        NumberFormat getCurrency = context.getBean("getCurrency", NumberFormat.class);
        System.out.println(getCurrency.format(34134.4134134));

        NumberFormat g = context.getBean("getKoreaCurrency", NumberFormat.class);
        System.out.println(g.format(34134.4134134));

        NumberFormat one = context.getBean("getCurrency", NumberFormat.class);
        NumberFormat two = context.getBean("getCurrency", NumberFormat.class);

        Assert.assertNotSame(one,two);







    }
}

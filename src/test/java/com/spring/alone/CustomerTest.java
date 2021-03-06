package com.spring.alone;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = AppConfiguration.class)
public class CustomerTest {

    @Autowired
    private Customer customer;

    @Test
    public void test() {
        Assert.assertEquals("abcde", customer.getId());
    }
}
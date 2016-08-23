package me.bukp.test;

import me.bukp.smart.model.Customer;
import me.bukp.smart.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bukp on 2016/6/25.
 */
public class CustomerServiceTest {


    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() {
        // TODO 初始化数据库
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> list = customerService.getCustomerList(null);
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void getCustomerTest() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("name", "bukp100");
        fieldMap.put("contact", "linchao");
        fieldMap.put("telephone", "18525232121");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("contact", "linchao100");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}

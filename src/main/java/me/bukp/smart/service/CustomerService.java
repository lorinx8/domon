package me.bukp.smart.service;

import me.bukp.smart.model.Customer;

import java.util.List;
import java.util.Map;


/**
 * Created by bukp on 2016/6/25.
 */
public class CustomerService {

    private static final String DRIVER;

    private static final String URL;

    private static final String USERNAME;

    private static final String PASSWORD;

    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword) {
        //TODO
        return null;
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        return false;
    }

}

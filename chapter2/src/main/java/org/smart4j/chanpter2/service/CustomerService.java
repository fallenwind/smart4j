package org.smart4j.chanpter2.service;

import org.smart4j.chanpter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务，衔接控制层与数据库
 */
public class CustomerService {
    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList()
    {
        // TODO: 2018/8/8
        return null;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id)
    {
        // TODO: 2018/8/8
        return null;
    }

    /**
     * 创建客户
     */
    public  boolean createCustomer(Map<String, Object> fieldMap)
    {
        // TODO: 2018/8/8
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap)
    {
        // TODO: 2018/8/8
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id)
    {
        // TODO: 2018/8/8
        return false;
    }
}

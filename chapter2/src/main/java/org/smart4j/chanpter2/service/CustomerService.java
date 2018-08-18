package org.smart4j.chanpter2.service;


import org.apache.log4j.PropertyConfigurator;
import org.smart4j.chanpter2.helper.DatabaseHelper;
import org.smart4j.chanpter2.model.Customer;
import org.smart4j.chanpter2.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;




/**
 * 提供客户数据服务，衔接控制层与数据库
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger("CustomerService.class");


    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList()
    {
        String sql = "SELECT * FROM customer";

        return  DatabaseHelper.queryEntityList(Customer.class,sql);
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id)
    {
        String sql = "SELECT * FROM customer WHERE id=?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    /**
     * 创建客户
     */
    public  boolean createCustomer(Map<String, Object> fieldMap)
    {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap)
    {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}

package com.mtsmda.springCore.jdbc;

import com.mtsmda.springCore.Customer;
import com.mtsmda.springCore.jdbc.dao.CustomerJDAO;
import com.mtsmda.springCore.jdbc.dao.imlp.JDBCTemplateCustomerJDAO;
import com.mtsmda.springCore.jdbc.model.CustomerJ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 19.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc/springBeans.xml");

        //simple jdbc
        CustomerJDAO customerJDAO = applicationContext.getBean("customerJDAO", CustomerJDAO.class);

        CustomerJ customerJ = new CustomerJ();
        customerJ.setAge(24);
        customerJ.setName("Vasile");

        customerJDAO.insertCustomerJ(customerJ);

        customerJ = new CustomerJ();
        customerJ.setAge(15);
        customerJ.setName("Ion");

        customerJDAO.insertCustomerJ(customerJ);

        CustomerJ customerJById = customerJDAO.getCustomerJById(1);
        System.out.println(customerJById);

        jdbcTemplateE(applicationContext);
        jdbcDaoSupport(applicationContext);
        applicationContext.close();
    }

    private static void jdbcTemplateE(ApplicationContext applicationContext) {
        System.out.println("************************************************");
        JDBCTemplateCustomerJDAO jdbcTemplateCustomerJDAO = applicationContext.getBean("JDBCTemplateCustomerJDAO", JDBCTemplateCustomerJDAO.class);
        CustomerJ customerJ = new CustomerJ();
        customerJ.setAge(95);
        customerJ.setName("Yasha");
        jdbcTemplateCustomerJDAO.insertCustomerJ(customerJ);

        CustomerJ customerJById = jdbcTemplateCustomerJDAO.getCustomerJById(20);
        System.out.println(customerJById);
        customerJById.setName("David");
        customerJById.setAge(100);

        System.out.println("update #" + customerJById.getCustomerId() + " - " + jdbcTemplateCustomerJDAO.updateCustomerJ(customerJById));

        System.out.println("_________");
        for (CustomerJ customerJCurrent : jdbcTemplateCustomerJDAO.getCustomerJs()) {
            System.out.println(customerJCurrent);
        }
        System.out.println("_________");

        System.out.println(jdbcTemplateCustomerJDAO.findNameById(25));

        List<CustomerJ> customerJs = new ArrayList<>();
        CustomerJ customerJ1 = new CustomerJ("Man1", 10);
        CustomerJ customerJ2 = new CustomerJ("Man2", 11);
        CustomerJ customerJ3 = new CustomerJ("Man3", 12);
        CustomerJ customerJ4 = new CustomerJ("Man4", 13);
        CustomerJ customerJ5 = new CustomerJ("Man5", 14);
        customerJs.add(customerJ1);
        customerJs.add(customerJ2);
        customerJs.add(customerJ3);
        customerJs.add(customerJ4);
        customerJs.add(customerJ5);

        jdbcTemplateCustomerJDAO.insertBatch1(customerJs);

        jdbcTemplateCustomerJDAO.insertBatch2("INSERT INTO customerj(name, age) VALUES('Djordj', 29);");

    }

    public static void jdbcDaoSupport(ApplicationContext applicationContext) {
        System.out.println("************************************************");
        CustomerJDAO jdbcDaoSupportCustomerJDAO = applicationContext.getBean("jdbcDaoSupportCustomerJDAO", CustomerJDAO.class);
        CustomerJ customerJ = new CustomerJ();
        customerJ.setAge(35);
        customerJ.setName("Grisha");
        jdbcDaoSupportCustomerJDAO.insertCustomerJ(customerJ);

        System.out.println(jdbcDaoSupportCustomerJDAO.getCustomerJById(9));
        System.out.println("Total - " + jdbcDaoSupportCustomerJDAO.findTotalCustomerJs());

        System.out.println("Name is " + jdbcDaoSupportCustomerJDAO.findNameById(9));
    }

}
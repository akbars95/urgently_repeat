package com.mtsmda.springCore.hibernate;

import com.mtsmda.springCore.hibernate.bisinessObject.StockBO;
import com.mtsmda.springCore.hibernate.model.Stock;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MTSMDA on 19.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("hibernate/springBeansHibernate.xml");
        StockBO stockBO = configurableApplicationContext.getBean("stockBO", StockBO.class);
        Stock stock = new Stock("stock1", "StockName1");
        stockBO.insert(stock);
    }

}
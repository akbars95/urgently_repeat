package com.mtsmda.springCore.jdbc.dao;

import com.mtsmda.springCore.jdbc.model.CustomerJ;

import java.util.List;

/**
 * Created by MTSMDA on 18.12.2015.
 */
public interface CustomerJDAO {

    public boolean insertCustomerJ(CustomerJ customerJ);

    public boolean updateCustomerJ(CustomerJ customerJ);

    public boolean deleteCustomerJ(CustomerJ customerJ);

    public CustomerJ getCustomerJById(Integer id);

    public List<CustomerJ> getCustomerJs();

    public String findNameById(Integer id);

    public int findTotalCustomerJs();

}
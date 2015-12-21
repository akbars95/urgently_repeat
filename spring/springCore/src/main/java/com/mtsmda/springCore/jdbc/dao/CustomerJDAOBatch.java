package com.mtsmda.springCore.jdbc.dao;

import com.mtsmda.springCore.jdbc.model.CustomerJ;

import java.util.List;

/**
 * Created by MTSMDA on 19.12.2015.
 */
public interface CustomerJDAOBatch {

    void insertBatch1(List<CustomerJ> customerJs);

    void insertBatch2(String query);

}
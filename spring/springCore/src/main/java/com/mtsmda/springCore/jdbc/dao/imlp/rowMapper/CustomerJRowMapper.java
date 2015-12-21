package com.mtsmda.springCore.jdbc.dao.imlp.rowMapper;


import com.mtsmda.springCore.jdbc.model.CustomerJ;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MTSMDA on 19.12.2015.
 */
public class CustomerJRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        CustomerJ customerJ = new CustomerJ();
        customerJ.setCustomerId(resultSet.getInt("id"));
        customerJ.setName(resultSet.getString("name"));
        customerJ.setAge(resultSet.getInt("age"));
        return customerJ;
    }
}
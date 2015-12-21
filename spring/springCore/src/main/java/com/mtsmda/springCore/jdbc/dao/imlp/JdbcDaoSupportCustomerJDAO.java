package com.mtsmda.springCore.jdbc.dao.imlp;

import com.mtsmda.springCore.jdbc.dao.CustomerJDAO;
import com.mtsmda.springCore.jdbc.dao.imlp.rowMapper.CustomerJRowMapper;
import com.mtsmda.springCore.jdbc.model.CustomerJ;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MTSMDA on 19.12.2015.
 */
public class JdbcDaoSupportCustomerJDAO extends JdbcDaoSupport implements CustomerJDAO {

    @Override
    public boolean insertCustomerJ(CustomerJ customerJ) {
        String sql = "INSERT INTO customerj(name, age) VALUES(?, ?);";
        getJdbcTemplate().update(sql, new Object[]{
                customerJ.getName(), customerJ.getAge()
        });
        return true;
    }

    @Override
    public boolean updateCustomerJ(CustomerJ customerJ) {
        return false;
    }

    @Override
    public boolean deleteCustomerJ(CustomerJ customerJ) {
        return false;
    }

    @Override
    public CustomerJ getCustomerJById(Integer id) {
        String sql = "SELECT * FROM customerj WHERE id = ?";
        Object o = getJdbcTemplate().queryForObject(sql, new Object[]{id}, new CustomerJRowMapper());
        return ((CustomerJ) o);
    }

    @Override
    public List<CustomerJ> getCustomerJs() {
        return null;
    }

    @Override
    public String findNameById(Integer id) {
        /*String sql = "SELECT name FROM customerj WHERE id = :id";
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("id", id);
        getJdbcTemplate().queryForObject(sql, parameters);*/
        return null;
    }

    @Override
    public int findTotalCustomerJs() {
        String sql = "SELECT COUNT(*) FROM customerj;";
        return getJdbcTemplate().queryForObject(sql, Integer.class);
    }
}
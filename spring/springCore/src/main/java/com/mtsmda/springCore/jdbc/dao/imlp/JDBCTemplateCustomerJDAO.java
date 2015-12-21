package com.mtsmda.springCore.jdbc.dao.imlp;

import com.mtsmda.springCore.jdbc.dao.CustomerJDAO;
import com.mtsmda.springCore.jdbc.dao.CustomerJDAOBatch;
import com.mtsmda.springCore.jdbc.dao.imlp.rowMapper.CustomerJRowMapper;
import com.mtsmda.springCore.jdbc.model.CustomerJ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by MTSMDA on 19.12.2015.
 */
@Repository(value = "JDBCTemplateCustomerJDAO")
public class JDBCTemplateCustomerJDAO implements CustomerJDAO, CustomerJDAOBatch {

    @Autowired
    @Qualifier(value = "dataSource")
    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean insertCustomerJ(CustomerJ customerJ) {
        try {
            String sql = "INSERT INTO customerj(name, age) VALUES(?, ?);";
            this.jdbcTemplate = new JdbcTemplate(dataSource);

            jdbcTemplate.update(sql, new Object[]{
                    customerJ.getName(), customerJ.getAge()
            });
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    public boolean updateCustomerJ(CustomerJ customerJ) {
//        String sql = "UPDATE customerj SET name = ?, age = ? WHERE id = ?;";
        String sql = "UPDATE customerj SET name = '" + customerJ.getName() + "', age = '" + customerJ.getAge() + "' WHERE id = " + customerJ.getCustomerId() + ";";
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        int update = jdbcTemplate.update(sql/*, new Object[]{customerJ.getName(), customerJ.getAge(), customerJ.getCustomerId()}*/);
        if (update > 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCustomerJ(CustomerJ customerJ) {
        return false;
    }

    @Override
    public CustomerJ getCustomerJById(Integer id) {
        String sql = "SELECT * FROM customerj WHERE id = ?";

        jdbcTemplate = new JdbcTemplate(dataSource);

        Object o = jdbcTemplate.queryForObject(sql, new Object[]{
                id
        }, new CustomerJRowMapper());

        return ((CustomerJ) o);
    }

    @Override
    public List<CustomerJ> getCustomerJs() {
        String sql = "SELECT * FROM customerj";
        List<CustomerJ> customerJs = new ArrayList<>();

        jdbcTemplate = new JdbcTemplate(dataSource);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> row : maps) {
            CustomerJ customerJ = new CustomerJ();
            customerJ.setCustomerId(Integer.valueOf(row.get("id").toString()));
            customerJ.setName(row.get("name").toString());
            customerJ.setAge(Integer.valueOf(row.get("id").toString()));
            customerJs.add(customerJ);
        }

        return customerJs;
    }

    @Override
    public String findNameById(Integer id) {
        String sql = "SELECT name FROM customerj WHERE id = ?";
        jdbcTemplate = new JdbcTemplate(dataSource);
        String name = jdbcTemplate.queryForObject(sql, new Object[]{id}, String.class);
        return name;
    }

    @Override
    public int findTotalCustomerJs() {
        return 0;
    }

    @Override
    public void insertBatch1(final List<CustomerJ> customerJs) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "INSERT INTO customerj(name, age) VALUES(?, ?);";
        jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                CustomerJ customerJ = customerJs.get(i);
                preparedStatement.setString(1, customerJ.getName());
                preparedStatement.setInt(2, customerJ.getAge());
            }

            @Override
            public int getBatchSize() {
                return customerJs.size();
            }
        });
    }

    @Override
    public void insertBatch2(String query) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.batchUpdate(new String[]{query});
    }
}
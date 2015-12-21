package com.mtsmda.springCore.jdbc.dao.imlp;

import com.mtsmda.springCore.jdbc.dao.CustomerJDAO;
import com.mtsmda.springCore.jdbc.model.CustomerJ;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by MTSMDA on 18.12.2015.
 */
public class JDBCCustomerJDAO implements CustomerJDAO {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public boolean insertCustomerJ(CustomerJ customerJ) {
        String sql = "INSERT INTO customerj(name, age) VALUES(?, ?);";
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, customerJ.getName());
            preparedStatement.setInt(2, customerJ.getAge());
            int i = preparedStatement.executeUpdate();
            preparedStatement.close();
            if (i > 0) {
                return true;
            }
        } catch (Exception e) {
            return false;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    connection = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
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
        try (Connection connection = dataSource.getConnection();) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                CustomerJ customerJ = new CustomerJ();
                customerJ.setCustomerId(resultSet.getInt("id"));
                customerJ.setName(resultSet.getString("name"));
                customerJ.setAge(resultSet.getInt("age"));
                return customerJ;
            }
        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public List<CustomerJ> getCustomerJs() {
        return null;
    }

    @Override
    public String findNameById(Integer id) {
        return null;
    }

    @Override
    public int findTotalCustomerJs() {
        return 0;
    }
}